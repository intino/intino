package io.intino.ls.codeinsight;

import io.intino.ls.ModelUnit;
import io.intino.ls.document.DocumentManager;
import io.intino.tara.Language;
import io.intino.tara.language.grammar.SyntaxException;
import io.intino.tara.language.semantics.errorcollector.SemanticException;
import io.intino.tara.language.semantics.errorcollector.SemanticFatalException;
import io.intino.tara.model.Element;
import io.intino.tara.model.Mogram;
import io.intino.tara.processors.SemanticAnalyzer;
import io.intino.tara.processors.dependencyresolution.DependencyException;
import io.intino.tara.processors.dependencyresolution.DependencyResolver;
import io.intino.tara.processors.model.Model;
import org.eclipse.lsp4j.*;

import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static io.intino.tara.language.semantics.errorcollector.SemanticIssue.Level.ERROR;
import static io.intino.tara.language.semantics.errorcollector.SemanticIssue.Level.RECOVERABLE_ERROR;
import static org.eclipse.lsp4j.DiagnosticSeverity.Warning;

public class DiagnosticService {
	private final DocumentManager documentManager;
	private final Language language;
	private final Map<URI, ModelUnit> models;

	public DiagnosticService(DocumentManager documentManager, Language language, Map<URI, ModelUnit> models) {
		this.documentManager = documentManager;
		this.language = language;
		this.models = models;
	}

	public record Statistics(Map<String, Integer> mogramsPerUnit) {
	}

	public Statistics statistics() {
		return new Statistics(models.values().stream()
				.collect(Collectors.toMap(m -> m.model().name(), m -> m.syntaxErrors().isEmpty() ? m.model().mograms().size() : 0)));
	}

	public List<Diagnostic> analyzeWorkspace() {
		ModelUnit model = merge(new ArrayList<>(models.values()));
		if (model == null) return List.of();
		analyzeWorkspace(model);
		List<Diagnostic> diagnostics = new ArrayList<>();
		model.syntaxErrors().stream().filter(d -> d.getLine() > 0).map(DiagnosticService::diagnosticOf).distinct().forEach(diagnostics::add);
		model.dependencyErrors().stream().map(DiagnosticService::diagnosticOf).forEach(diagnostics::add);
		model.semanticErrors().stream().map(this::diagnosticOf).forEach(diagnostics::add);
		return diagnostics;
	}

	private ModelUnit merge(List<ModelUnit> units) {
		if (units.isEmpty()) return null;
		Model model = new Model(new File(documentManager.root().getPath()).getParentFile().toURI());
		ModelUnit reference = units.get(0);
		if (reference.model() == null)
			return new ModelUnit(model, reference.tokens(), reference.tree(), reference.syntaxErrors(), reference.dependencyErrors(), reference.semanticErrors());
		model.languageName(reference.model().languageName());
		model.constraints(units.stream().filter(u -> u.model() != null).flatMap(u -> u.model().constraints().stream()).collect(Collectors.toList()));
		units.stream().filter(u -> u.model() != null).forEach(unit -> unit.model().mograms()
				.forEach(c -> model.add(c, unit.model().rulesOf(c))));
		for (Mogram mogram : model.mograms()) mogram.container(model);
		return new ModelUnit(model, null, null,
				units.stream().flatMap(u -> u.syntaxErrors().stream()).collect(Collectors.toList()),
				units.stream().flatMap(u -> u.dependencyErrors().stream()).collect(Collectors.toList()),
				units.stream().flatMap(u -> u.semanticErrors().stream()).collect(Collectors.toList()));
	}

	private void analyzeWorkspace(ModelUnit context) {
		try {
			DependencyResolver dependencyResolver = dependencyResolver(context.model(), this.language);
			dependencyResolver.resolve();
			for (DependencyException e : dependencyResolver.rulesNotLoaded()) context.dependencyErrors().add(e);
			new SemanticAnalyzer(context.model(), language).analyze();
		} catch (DependencyException e) {
			context.dependencyErrors().add(e);
		} catch (SemanticFatalException e) {
			context.semanticErrors().addAll(e.exceptions());
		}
	}

	private static Diagnostic diagnosticOf(SyntaxException e) {
		return new Diagnostic(new Range(new Position(e.getLine() - 1, e.getStartColumn()), new Position(e.getEndLine() - 1, e.getEndColumn())), e.getOriginalMessage(), DiagnosticSeverity.Error, e.getUri().getPath());
	}

	private static Diagnostic diagnosticOf(DependencyException e) {
		return new Diagnostic(range(e.getElement()), e.getMessage().substring(0, e.getMessage().indexOf("@") - 1), DiagnosticSeverity.Error, e.getElement().source().getPath());
	}

	private Diagnostic diagnosticOf(SemanticException e) {
		DiagnosticSeverity level = e.level() == ERROR || e.level() == RECOVERABLE_ERROR ? DiagnosticSeverity.Error : Warning;
		Element element = e.getIssue().origin()[0];
		String uri = element.source().getPath();
		Diagnostic diagnostic = new Diagnostic(range(e.origin()[0]), e.getMessage(), level, uri);
		diagnostic.setData(e.getIssue().key());
		return diagnostic;
	}

	private static Range range(Element e) {
		Element.TextRange textRange = e.textRange();
		return new Range(new Position(textRange.startLine() - 1, textRange.startColumn()), new Position(textRange.startLine() - 1, textRange.startLine() == textRange.endLine() ? textRange.endColumn() : textRange.startLineLength()));
	}

	private DependencyResolver dependencyResolver(Model model, Language language) {
		return new DependencyResolver(model, language, "io.intino.test", new File("temp/src/io/intino/test/model/rules"), new File(Language.class.getProtectionDomain().getCodeSource().getLocation().getFile()), new File("temp"));
	}
}