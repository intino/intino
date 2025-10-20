package io.intino.ls;

import io.intino.alexandria.logger.Logger;
import io.intino.ls.IntinoSemanticTokens.SemanticToken;
import io.intino.ls.codeinsight.DiagnosticContextInfo;
import io.intino.ls.codeinsight.DiagnosticService;
import io.intino.ls.codeinsight.ReferenceResolver;
import io.intino.ls.codeinsight.completion.CompletionContext;
import io.intino.ls.codeinsight.completion.CompletionService;
import io.intino.ls.codeinsight.completion.TreeUtils;
import io.intino.ls.codeinsight.fix.FixFactory;
import io.intino.ls.document.DocumentManager;
import io.intino.ls.document.DocumentSourceProvider;
import io.intino.ls.parsing.ParsingService;
import io.intino.tara.Language;
import io.intino.tara.Source.StringSource;
import io.intino.tara.language.grammar.HighlightTaraLexer;
import io.intino.tara.language.grammar.TaraGrammar;
import io.intino.tara.language.grammar.TaraGrammar.IdentifierKeyContext;
import io.intino.tara.language.grammar.TaraGrammar.IdentifierReferenceContext;
import io.intino.tara.language.semantics.Constraint;
import io.intino.tara.model.Element;
import io.intino.tara.model.Mogram;
import io.intino.tara.model.Primitive;
import io.intino.tara.model.rules.Size;
import io.intino.tara.model.rules.property.ReferenceRule;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.eclipse.lsp4j.*;
import org.eclipse.lsp4j.jsonrpc.messages.Either;
import org.eclipse.lsp4j.services.LanguageClient;
import org.eclipse.lsp4j.services.TextDocumentService;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import static io.intino.ls.codeinsight.completion.CompletionService.completionContextOf;
import static io.intino.ls.codeinsight.completion.TreeUtils.getMogramContainerOn;
import static java.util.concurrent.CompletableFuture.completedFuture;
import static org.antlr.v4.runtime.CharStreams.fromPath;
import static org.antlr.v4.runtime.CharStreams.fromString;

public class IntinoDocumentService implements TextDocumentService {
	private final Language language;
	private final DocumentManager workspaceManager;
	private final DocumentSourceProvider documentSourceProvider;
	private final DiagnosticService diagnosticService;
	private final Map<URI, ModelUnit> models;
	private final AtomicReference<LanguageClient> client;
	private final ParsingService parsingService;
	private final CompletionService completionService;
	private final List<Consumer<URI>> changeListener = new ArrayList<>();

	public IntinoDocumentService(Language language, DocumentManager documentManager, DiagnosticService diagnosticService, Map<URI, ModelUnit> models, AtomicReference<LanguageClient> client) {
		this.language = language;
		this.workspaceManager = documentManager;
		this.documentSourceProvider = new DocumentSourceProvider(documentManager);
		this.diagnosticService = diagnosticService;
		this.parsingService = new ParsingService(models);
		this.completionService = new CompletionService(language, models);
		this.models = models;
		this.client = client;
		loadModels();
		documentManager.onChange(e -> {
			if (e.getType().equals(FileChangeType.Deleted))
				models.remove(URI.create(normalize(e.getUri())));
			else if (e.getType().equals(FileChangeType.Created))
				didCreate(e);
		});
	}

	private void didCreate(FileEvent e) {
		try {
			URI uri = URI.create(normalize(e.getUri()));
			String content = new String(workspaceManager.getDocumentText(uri).readAllBytes());
			parsingService.updateModel(new StringSource(uri.getPath(), content));
		} catch (IOException ex) {
			throw new RuntimeException(ex);
		}
	}

	public void onChange(Consumer<URI> listener) {
		this.changeListener.add(listener);
	}

	private void loadModels() {
		documentSourceProvider.all().filter(s -> isTaraModel(s.uri().getPath())).forEach(u -> {
			try {
				parsingService.updateModel(new StringSource(u.uri().getPath(), new String(u.content().readAllBytes())));
			} catch (IOException e) {
				Logger.error(e);
			}
		});
	}

	private boolean isTaraModel(String path) {
		return new File(path).getName().endsWith(".tara");
	}

	@Override
	public void didOpen(DidOpenTextDocumentParams params) {
		URI uri = URI.create(normalize(params.getTextDocument().getUri()));
		parsingService.updateModel(new StringSource(uri.getPath(), params.getTextDocument().getText()));
		notifyDiagnostics(uri, params.getTextDocument().getVersion());
	}

	@Override
	public void didChange(DidChangeTextDocumentParams params) {
		try {
			URI uri = URI.create(normalize(params.getTextDocument().getUri()));
			InputStream doc = workspaceManager.getDocumentText(uri);
			String content = applyChanges(doc != null ? new String(doc.readAllBytes()) : "", params.getContentChanges());
			if (content.isEmpty()) content = "dsl " + language.languageName() + "\n\n";
			workspaceManager.upsertDocument(uri, language.languageName(), content == null ? "" : content);
			parsingService.updateModel(new StringSource(uri.getPath(), content));
			notifyDiagnostics(uri, params.getTextDocument().getVersion());
			if (changeListener != null) changeListener.forEach(l -> l.accept(uri));
		} catch (Throwable e) {
			Logger.error(e);
		}
	}

	private void notifyDiagnostics(URI uri, int version) {
		List<Diagnostic> diagnostics = diagnosticService.analyzeWorkspace().stream().filter(d -> d.getSource().equals(uri.getPath())).toList();
		client.get().publishDiagnostics(new PublishDiagnosticsParams(uri.getPath(), diagnostics, version));
	}

	@Override
	public void didClose(DidCloseTextDocumentParams params) {
	}

	@Override
	public void didSave(DidSaveTextDocumentParams params) {
		String uri = normalize(params.getTextDocument().getUri());
		workspaceManager.upsertDocument(URI.create(uri), language.languageName(), params.getText());
	}

	@Override
	public CompletableFuture<List<FoldingRange>> foldingRange(FoldingRangeRequestParams params) {
		URI uri = URI.create(normalize(params.getTextDocument().getUri()));
		ModelUnit modelUnit = models.get(uri);
		if (modelUnit == null) completedFuture(List.of());
		return completedFuture(ranges(modelUnit));
	}

	private static List<FoldingRange> ranges(ModelUnit modelUnit) {
		List<FoldingRange> ranges = new ArrayList<>();
		if (modelUnit == null || modelUnit.model() == null) return ranges;
		List<Mogram> mograms = modelUnit.model().mograms();
		append(mograms, ranges);
		return ranges.stream().filter(r -> r != null).toList();
	}

	private static void append(List<Mogram> mograms, List<FoldingRange> ranges) {
		for (Mogram mogram : mograms) {
			ranges.add(range(mogram));
			append(mogram.mograms(), ranges);
		}
	}

	private static FoldingRange range(Mogram m) {
		if (m.textRange().startLine() == m.textRange().endLine() || m.elements().isEmpty()) return null;
		FoldingRange foldingRange = new FoldingRange(m.textRange().startLine() - 1, m.textRange().endLine() - 1);
		foldingRange.setKind(FoldingRangeKind.Region);
		return foldingRange;
	}

	private String applyChanges(String content, List<TextDocumentContentChangeEvent> contentChanges) {
		StringBuilder sb = new StringBuilder(content);
		for (TextDocumentContentChangeEvent change : contentChanges) {
			if (change.getRange() != null) {
				int startOffset = getOffset(change.getRange().getStart(), content);
				int endOffset = getOffset(change.getRange().getEnd(), content);
				sb.replace(startOffset, endOffset, change.getText());
			} else sb = new StringBuilder(change.getText());
		}
		return sb.toString();
	}

	@Override
	public CompletableFuture<DocumentDiagnosticReport> diagnostic(DocumentDiagnosticParams params) {
		try {
			return completedFuture(new DocumentDiagnosticReport(new RelatedFullDocumentDiagnosticReport(diagnosticService.analyzeWorkspace())));
		} catch (Exception e) {
			Logger.error(e);
			return completedFuture(null);
		}
	}

	private int getOffset(Position position, String content) {
		int offset = 0;
		int line = 0;
		int column = 0;
		for (char c : content.toCharArray()) {
			if (line == position.getLine() && column == position.getCharacter()) break;
			if (c == '\n') {
				line++;
				column = 0;
			} else column++;
			offset++;
		}
		return offset;
	}

	@Override
	public CompletableFuture<SemanticTokens> semanticTokensFull(SemanticTokensParams params) {
		try {
			String uri = params.getTextDocument().getUri();
			if (uri == null) {
				Logger.error("Semantic tokens URI is null: " + params.getTextDocument().getUri());
				return completedFuture(null);
			}
			SemanticTokens tokens = semanticTokens(URI.create(normalize(uri)));
			return completedFuture(tokens);
		} catch (Throwable e) {
			Logger.error(e);
		}
		return completedFuture(new SemanticTokens());
	}

	private SemanticTokens semanticTokens(URI uri) throws IOException {
		List<SemanticToken> tokens = new ArrayList<>();
		try {
			var lexer = new HighlightTaraLexer(fromString(new String(workspaceManager.getDocumentText(uri).readAllBytes()), uri.getPath()));
			lexer.reset();
			CommonTokenStream tokenStream = new CommonTokenStream(lexer);
			tokenStream.fill();
			tokens.addAll(new IntinoSemanticTokens(List.of(language.lexicon())).semanticTokens(tokenStream));
		} catch (Throwable e) {
			Logger.error(e);
		}
		return new SemanticTokens(tokens.stream().flatMap(s -> s.raw().stream()).toList());
	}

	@Override
	public CompletableFuture<Either<List<CompletionItem>, CompletionList>> completion(CompletionParams params) {
		URI uri = URI.create(normalize(params.getTextDocument().getUri()));
		String textDoc = contentOf(uri);
		StringSource source = new StringSource("model", textDoc);
		CompletionContext context = completionContextOf(params, language, source);
		if (context == null) return completedFuture(Either.forRight(new CompletionList()));
		List<CompletionItem> items = completionService.propose(context);
		return completedFuture(Either.forRight(new CompletionList(false, items)));
	}

	private String contentOf(URI uri) {
		try {
			return new String(workspaceManager.getDocumentText(uri).readAllBytes());
		} catch (IOException e) {
			return null;
		}
	}

	@Override
	public CompletableFuture<Hover> hover(HoverParams params) {
		return completedFuture(new Hover());
	}

	@Override
	public CompletableFuture<SignatureHelp> signatureHelp(SignatureHelpParams params) {
		URI uri = URI.create(normalize(params.getTextDocument().getUri()));
		ModelUnit modelUnit = models.get(uri);
		Position position = fixPosition(params.getPosition());
		Token token = TreeUtils.findToken(modelUnit.tokens(), position.getLine(), position.getCharacter());
		ParserRuleContext ctx = token == null ? null : TreeUtils.findRuleContainingToken(modelUnit.tree(), token);
		Mogram container = getMogramContainerOn(modelUnit.model(), position);
		String facet = facet(params, container, ctx);
		List<Constraint> constraints = language.constraints(container.types().getFirst());
		return completedFuture(map(facet == null ? container.types().getFirst() : facet, collectParameterConstraints(constraints, facet)));
	}

	private SignatureHelp map(String mogram, List<Constraint.Property> constraints) {
		SignatureInformation information = new SignatureInformation(mogram);
		information.setParameters(constraints.stream().map(c -> new ParameterInformation(c.name(), parameterInfo(c))).toList());
		information.setActiveParameter(0);
		SignatureHelp help = new SignatureHelp(List.of(information), 0, 0);
		return help;
	}

	private String parameterInfo(Constraint.Property constraint) {
		return Primitive.REFERENCE.equals(constraint.type()) ?
				asReferenceParameter(constraint) :
				asWordParameter(constraint);
	}

	private String asWordParameter(Constraint.Property constraint) {
		return constraint.type().getName().toLowerCase() + (size(constraint)) + constraint.name();
	}

	private String asReferenceParameter(Constraint.Property constraint) {
		return referenceTypes((constraint)) + size(constraint) + constraint.name();
	}

	private String referenceTypes(Constraint.Property constraint) {
		ReferenceRule rule = constraint.rule(ReferenceRule.class);
		if (rule == null) return "Reference";
		return rule.allowedReferences().size() > 1 ? "{" + String.join(", ", rule.allowedReferences()) + "}" : rule.allowedReferences().getFirst();
	}

	private String size(Constraint.Property constraint) {
		Size size = constraint.rule(Size.class);
		return "[" + size.min() + ".." + (size.max() == Integer.MAX_VALUE ? "*" : size.max()) + "] ";
	}

	private List<Constraint.Property> collectParameterConstraints(List<Constraint> coreConstraints, String facet) {
		List<Constraint> scopeConstraints = coreConstraints;
		if (facet != null) scopeConstraints = collectFacetParameterConstraints(coreConstraints, facet);
		return scopeConstraints == null ? List.of() : scopeConstraints.stream().
				filter(constraint -> constraint instanceof Constraint.Property).
				map(constraint -> (Constraint.Property) constraint).toList();
	}

	private String facet(SignatureHelpParams params, Mogram container, ParserRuleContext ctx) {
		TaraGrammar.FacetContext facetContext = TreeUtils.contextByType(ctx, TaraGrammar.FacetContext.class);
		if (facetContext == null) return null;
		String facetType = facetContext.metaidentifier().getText();
		return container.appliedFacets().stream()
				.filter(f -> f.type().equals(facetType))
				.map(f -> f.fullType())
				.findFirst().orElse(null);
	}

	private List<Constraint> collectFacetParameterConstraints(List<Constraint> constraints, String type) {
		return constraints.stream()
				.filter(c -> (c instanceof Constraint.Facet) && ((Constraint.Facet) c).type().equals(type))
				.map(c -> ((Constraint.Facet) c).constraints())
				.findFirst()
				.orElse(List.of());
	}

	@Override
	public CompletableFuture<Either<List<? extends Location>, List<? extends LocationLink>>> declaration(DeclarationParams params) {
		URI uri = URI.create(normalize(params.getTextDocument().getUri()));
		ModelUnit modelUnit = models.get(uri);
		Position position = fixPosition(params.getPosition());
		Element element = new ReferenceResolver(models, modelUnit, language).resolveToDeclaration(uri, position);
		return completedFuture(Either.forRight(List.of(new LocationLink())));
	}

	@Override
	public CompletableFuture<Either<List<? extends Location>, List<? extends LocationLink>>> definition(DefinitionParams params) {
		URI uri = URI.create(normalize(params.getTextDocument().getUri()));
		ModelUnit modelUnit = models.get(uri);
		Position position = fixPosition(params.getPosition());
		Token token = TreeUtils.findToken(modelUnit.tokens(), position.getLine(), position.getCharacter());
		ParserRuleContext ctx = token == null ? null : TreeUtils.findRuleContainingToken(modelUnit.tree(), token);
		if (!(ctx instanceof IdentifierKeyContext)) return completedFuture(Either.forLeft(List.of()));
		Mogram container = getMogramContainerOn(modelUnit.model(), position);
		List<IdentifierKeyContext> path = path((IdentifierKeyContext) ctx);
		if (path.isEmpty()) return completedFuture(Either.forLeft(List.of()));
		Element element = new ReferenceResolver(models, modelUnit, language).resolve(container, path);
		if (element == null) return completedFuture(Either.forLeft(List.of()));
		Range targetRange = rangeOf(element);
		return completedFuture(Either.forLeft(List.of(new Location(element.source().getPath(), targetRange))));
	}

	private List<IdentifierKeyContext> path(IdentifierKeyContext ctx) {
		IdentifierReferenceContext reference = TreeUtils.contextByType(ctx, IdentifierReferenceContext.class);
		if (reference == null) return List.of();
		List<IdentifierKeyContext> identifiers = reference.hierarchy().stream().map(h -> h.identifierKey()).collect(Collectors.toList());
		identifiers.add(reference.identifierKey());
		return identifiers.subList(0, identifiers.indexOf(ctx) + 1);
	}

	private static Position fixPosition(Position position) {
		position.setLine(position.getLine() + 1);
		return position;
	}

	private Range rangeOf(Element element) {
		Element.TextRange textRange = element.textRange();
		return new Range(new Position(element.textRange().startLine() - 1, textRange.startColumn()),
				new Position(textRange.endLine() - 1, textRange.endColumn()));
	}

	private Range rangeOf(Token element) {
		return new Range(new Position(element.getLine() - 1, element.getCharPositionInLine()),
				new Position(element.getLine() - 1, element.getCharPositionInLine() + element.getText().length()));
	}

	@Override
	public CompletableFuture<List<? extends Location>> references(ReferenceParams params) {
		return TextDocumentService.super.references(params);
	}

	@Override
	public CompletableFuture<List<Either<Command, CodeAction>>> codeAction(CodeActionParams params) {
		URI uri = URI.create(normalize(params.getTextDocument().getUri()));
		List<Either<Command, CodeAction>> actions = new ArrayList<>();
		for (Diagnostic diagnostic : params.getContext().getDiagnostics()) {
			DiagnosticContextInfo info = getInfo(uri, diagnostic);
			if (info == null) continue;
			List<CodeAction> codeActions = FixFactory.get(info);
			actions.addAll(codeActions.stream().map(e -> Either.<Command, CodeAction>forRight(e)).toList());
		}
		return completedFuture(actions);
	}

	private DiagnosticContextInfo getInfo(URI uri, Diagnostic diagnostic) {
		ModelUnit modelUnit = models.get(uri);
		Position position = fixPosition(diagnostic.getRange().getStart());
		Token token = TreeUtils.findToken(modelUnit.tokens(), position.getLine(), position.getCharacter());
		ParserRuleContext ctx = token == null || modelUnit.tree() == null ? null : TreeUtils.findRuleContainingToken(modelUnit.tree(), token);
		Mogram container = getMogramContainerOn(modelUnit.model(), position);
		return new DiagnosticContextInfo(uri,
				diagnostic.getData() != null ? diagnostic.getData().toString().replace("\"", "") : null, new String[]{},
				language,
				position,
				container,
				TreeUtils.elementOnPosition(container, ctx, position),
				token,
				ctx);
	}

	@Override
	public CompletableFuture<CodeAction> resolveCodeAction(CodeAction unresolved) {
		return TextDocumentService.super.resolveCodeAction(unresolved);
	}

	@Override
	public CompletableFuture<WorkspaceEdit> rename(RenameParams params) {
		URI uri = URI.create(normalize(params.getTextDocument().getUri()));
		Position position = fixPosition(params.getPosition());
		ModelUnit modelUnit = models.get(uri);
		Token token = TreeUtils.findToken(modelUnit.tokens(), position.getLine(), position.getCharacter());
		Mogram container = getMogramContainerOn(modelUnit.model(), position);
		String newName = params.getNewName();
		return completedFuture(new WorkspaceEdit(Map.of()));//TODO
	}

	@Override
	public CompletableFuture<List<InlayHint>> inlayHint(InlayHintParams params) {
		return TextDocumentService.super.inlayHint(params);//TODO nombres de parametros
	}

	@Override
	public CompletableFuture<InlayHint> resolveInlayHint(InlayHint unresolved) {
		return TextDocumentService.super.resolveInlayHint(unresolved);
	}

	@Override
	public CompletableFuture<List<InlineValue>> inlineValue(InlineValueParams params) {
		return TextDocumentService.super.inlineValue(params);
	}

	public void setTrace(SetTraceParams params) {
	}

	public static String normalize(String uri) {
		return uri.replace("file:///", "");
	}
}