package io.intino.tara.processors.parser.antlr;

import io.intino.tara.Source;
import io.intino.tara.language.grammar.SyntaxException;
import io.intino.tara.language.grammar.TaraGrammar.*;
import io.intino.tara.language.grammar.TaraGrammarBaseListener;
import io.intino.tara.model.*;
import io.intino.tara.model.Element.TextRange;
import io.intino.tara.model.rules.Size;
import io.intino.tara.model.rules.composition.ConstraintRule;
import io.intino.tara.model.rules.property.*;
import io.intino.tara.processors.model.*;
import io.intino.tara.processors.utils.Format;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.*;
import java.util.stream.Collectors;

import static io.intino.tara.model.Annotation.Generalization;
import static io.intino.tara.model.Primitive.*;
import static io.intino.tara.model.Primitive.RESOURCE;
import static io.intino.tara.model.Primitive.STRING;
import static io.intino.tara.model.Primitive.WORD;
import static io.intino.tara.processors.utils.Format.firstUpperCase;
import static java.util.Collections.emptyList;
import static java.util.stream.Collectors.toList;

public class ModelGenerator extends TaraGrammarBaseListener {
	private final Deque<ElementContainer> deque = new ArrayDeque<>();
	private final Set<String> uses = new HashSet<>();
	private final Model model;
	private final List<SyntaxException> errors = new ArrayList<>();
	private final String fileContent;
	private final Source source;

	public ModelGenerator(Source source) {
		this.source = source;
		try (InputStream content = source.content()) {
			deque.add(model = new Model(source.uri()));
			this.fileContent = new String(content.readAllBytes(), source.charset());
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void enterAnImport(AnImportContext ctx) {
		uses.add(ctx.headerReference().getText());
	}

	@Override
	public void enterDslDeclaration(DslDeclarationContext ctx) {
		if (ctx.headerReference() != null) {
			final String langName = ctx.headerReference().getText();
			if (langName.isEmpty()) addError("Language " + langName + " not found", ctx);
		} else addError("Language not found", ctx);
	}

	private static ParserRuleContext nextSibling(ParserRuleContext ctx) {
		if (ctx == null || ctx.parent == null) return null;
		int index = ctx.getParent().children.indexOf(ctx);
		while (index < ctx.getParent().children.size() - 1) {
			ParseTree child = ctx.parent.getChild(++index);
			if (child instanceof ParserRuleContext p) return p;
		}
		return null;
	}

	@Override
	public void enterMogram(MogramContext ctx) {
		if (!errors.isEmpty()) return;
		try {
			int startIndex = ctx.getStart().getStartIndex();
			ParserRuleContext nextMogram = nextSibling(ctx);
			int endIndex = nextMogram != null ? nextMogram.getStart().getStartIndex() : ctx.getParent().getStop().getStopIndex();
			MogramImpl mogram = new MogramImpl(fileContent.substring(startIndex, endIndex), source.uri(), ctx.getStart().getLine(), textRange(ctx, nextMogram));
			String hashCodeName = calculateName(ctx);
			if (ctx.signature().IDENTIFIER() != null) {
				mogram.name(ctx.signature().IDENTIFIER().getText());
				mogram.anonymous(false);
			} else mogram.name(hashCodeName);
			mogram.setHashCode(hashCodeName);
			mogram.languageName(model.languageName());
			mogram.setSub(ctx.signature().SUB() != null);
			ElementContainer container = resolveContainer(mogram);
			mogram.container(container);
			container.add(mogram, rulesOf(mogramRules(ctx.signature().mogramConstraint())));
			facetTarget(ctx, mogram);
			if (!errors.isEmpty()) return;
			mogram.type(type(ctx, mogram));
			resolveParent(ctx, mogram);
			addAnnotations(ctx.signature().annotations(), mogram);
			mogram.addUses(new ArrayList<>(uses));
			deque.push(mogram);
		} catch (Exception e) {
			errors.add(new SyntaxException("Syntax error. Unexpected tokens.", e, source.uri(), ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), ctx.getStop().getLine(), ctx.getStop().getCharPositionInLine()));
		}
	}

	private void facetTarget(MogramContext ctx, MogramImpl mogram) {
		if (ctx.signature().SUB() != null) {
			Mogram container = (Mogram) deque.peek();
			if (container.facetPrescription() != null && container.facetPrescription().resolved()) {
				mogram.facetPrescription(container.facetPrescription().get());
				mogram.facetPrescription().get().addApplicableFacet(mogram);
			} else if (container.facetPrescription() != null) {
				mogram.facetPrescription(container.facetPrescription().reference());
				mogram.facetPrescription().get().addApplicableFacet(mogram);
			}
		} else if (ctx.signature().FACET() != null) {
			ElementContainer container = mogram.container();
			if (container instanceof Model) {
				errors.add(new SyntaxException("'facet' declaration cannot be root", source.uri(), ctx.signature().getStart().getLine(), ctx.signature().getStart().getCharPositionInLine(), "Concept"));
				return;
			}
			if (ctx.signature().IDENTIFIER() == null) {
				errors.add(new SyntaxException("'facet' declaration must have name", source.uri(), ctx.signature().getStart().getLine(), ctx.signature().getStart().getCharPositionInLine(), ""));
				return;
			}
			mogram.facetPrescription((Mogram) container);
			mogram.facetPrescription().get().addApplicableFacet(mogram);
		} else if (ctx.signature().facetTarget() != null)
			mogram.facetPrescription(ctx.signature().facetTarget().identifierReference().getText());
	}

	private String type(MogramContext ctx, MogramImpl mogram) {
		if (mogram.isSub()) return ((Mogram) deque.peek()).types().getFirst();
		if (mogram.facetPrescription() != null && ctx.signature().FACET() != null)
			return mogram.facetPrescription().get().types().getFirst();
		return ctx.signature().metaidentifier().getText();
	}

	private String calculateName(MogramContext ctx) {
		int hashCode = ctx.getText().replace(" ", "").hashCode();
		String name = new File(source.uri().getPath()).getName();
		return (name.contains(".") ? name.substring(0, name.lastIndexOf(".")) : name) + "_" +
				ctx.getStart().getLine() + "_" + ctx.getStart().getCharPositionInLine() + "_" +
				(hashCode > 0 ? "0" + hashCode : "1" + Math.abs(hashCode));
	}

	private List<MogramConstraintContext> mogramRules(List<MogramConstraintContext> container) {
		List<MogramConstraintContext> contexts = new ArrayList<>();
		if (container.isEmpty()) return emptyList();
		if (container.size() == 1) contexts.add(container.getFirst());
		else return container;
		return contexts;
	}

	private List<Rule<?>> rulesOf(List<MogramConstraintContext> mogramConstraint) {
		if (mogramConstraint == null || mogramConstraint.isEmpty()) return List.of(Size.MULTIPLE());
		List<Rule<?>> collect = mogramConstraint.stream().map(context -> createRule(context.ruleValue())).collect(toList());
		if (collect.stream().noneMatch(r -> r instanceof Size)) collect.addFirst(Size.MULTIPLE());
		return collect;
	}

	private Rule<?> createRule(RuleValueContext rule) {
		if (isCustom(rule)) {
			if (isBundledRule(rule.getText())) {
				return bundledRule(rule.getText());
			}
			return new ConstraintRule(new NamedReference<>(rule.getText()));
		}
		return processLambdaRule(rule);
	}

	private boolean isCustom(RuleValueContext isRule) {
		return isRule != null && isRule.LEFT_CURLY() == null;
	}

	private void addAnnotations(AnnotationsContext ctx, Mogram mogram) {
		if (ctx != null) {
			Annotation[] annotations = resolveAnnotations(ctx);
			if (annotations.length == 0)
				errors.add(new SyntaxException("Expected an annotation", source.uri(), ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), ctx.getStop().getLine(), ctx.getStop().getCharPositionInLine(),
						Arrays.stream(Annotation.values()).map(Enum::name).collect(Collectors.joining(","))));
			mogram.addAnnotations(annotations);
		}
	}

	private ElementContainer resolveContainer(Mogram mogram) {
		ElementContainer context = deque.peek();
		return mogram.isSub() ? context.container() : context;
	}

	private void resolveParent(MogramContext ctx, MogramImpl mogram) {
		if (mogram.isSub()) {
			Mogram peek = (Mogram) deque.peek();
			if (peek != null && !peek.is(Generalization) && !peek.annotations().contains(Generalization))
				peek.addAnnotations(Generalization);
			mogram.parent(peek);
			peek.addChild(mogram);
		} else {
			String parent = getParent(ctx);
			if (parent != null) mogram.parent(parent);
		}
	}

	private String getParent(MogramContext ctx) {
		if (ctx.signature().parent() == null) return null;
		IdentifierReferenceContext identifierReference = ctx.signature().parent().identifierReference();
		return identifierReference != null ? identifierReference.getText() : null;
	}

	@Override
	public void exitMogram(MogramContext ctx) {
		if (!errors.isEmpty()) return;
		deque.pop();
	}

	@Override
	public void enterWith(WithContext ctx) {
		try {
			if (deque.peek() == null) {
				addError("Unavailable constraint 'with' in context " + deque.peek().getClass().getInterfaces()[0].getSimpleName(), ctx);
				return;
			}
			MogramImpl peek = (MogramImpl) deque.peek();
			peek.facetConstraints(collectConstrains(ctx.identifierReference()).stream().map(r -> new FacetConstraint(r, false, peek.source(), textRange(ctx))).collect(Collectors.toList()));
			super.enterWith(ctx);
		} catch (Exception e) {
			errors.add(new SyntaxException("Syntax error. Unexpected tokens.", e, source.uri(), ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), ctx.getStop().getLine(), ctx.getStop().getCharPositionInLine()));
		}
	}

	private List<String> collectConstrains(List<IdentifierReferenceContext> contexts) {
		return contexts.stream().map(IdentifierReferenceContext::getText).collect(toList());
	}

	@Override
	public void enterFacet(FacetContext ctx) {
		if (!errors.isEmpty()) return;
		if (deque.peek() == null) {
			addError("Unavailable component facet apply in context " + deque.peek().getClass().getInterfaces()[0].getSimpleName(), ctx);
			return;
		}
		try {
			Mogram current = (Mogram) deque.peek();
			FacetImpl facet = new FacetImpl(ctx.metaidentifier().getText(), current, source.uri(), ctx.getStart().getLine(), textRange(ctx));
			facet.languageName(model.languageName());
			current.applyFacet(facet);
		} catch (Exception e) {
			errors.add(new SyntaxException("Syntax error. Unexpected tokens.", e, source.uri(), ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), ctx.getStop().getLine(), ctx.getStop().getCharPositionInLine()));
		}
	}

	@Override
	public void enterDoc(DocContext ctx) {
		if (!errors.isEmpty()) return;
		String doc = ctx.DOC().stream().map(d -> d.getText().substring(2)).collect(Collectors.joining()).trim();
		deque.peek().doc(doc);
	}

	@Override
	public void enterSignatureProperty(SignaturePropertyContext ctx) {
		if (!errors.isEmpty()) return;
		try {
			int position = ((SignaturePropertiesContext) ctx.getParent()).signatureProperty().indexOf(ctx);
			String metric = ctx.value().measureUnit() != null ? ctx.value().measureUnit().getText() : null;
			addParameter(ctx.IDENTIFIER() != null ? ctx.IDENTIFIER().getText() : "", facetOf(ctx), position, metric, resolveValue(ctx.value()), textRange(ctx));
		} catch (Exception e) {
			errors.add(new SyntaxException("Syntax error. Unexpected tokens.", e, source.uri(), ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), ctx.getStop().getLine(), ctx.getStop().getCharPositionInLine()));
		}
	}

	private String facetOf(SignaturePropertyContext ctx) {
		return ctx.getParent().getParent() instanceof FacetContext ? ((FacetContext) ctx.getParent().getParent()).metaidentifier().getText() : "";
	}

	private void addParameter(String name, String facet, int position, String measureValue, List<Object> values, TextRange range) {
		((Mogram) deque.peek()).addParameter(name, facet, position, measureValue, range, values);
	}

	@Override
	public void enterMogramReference(MogramReferenceContext ctx) {
		if (!errors.isEmpty()) return;
		try {
			Mogram container = (Mogram) deque.peek();
			HasMogram mogramRef = new HasMogram(ctx.identifierReference().getText(), container.source(), ctx.getStart().getLine(), textRange(ctx));
			mogramRef.languageName(model.languageName());
			if (ctx.annotations() != null) mogramRef.addAnnotations(resolveAnnotations(ctx.annotations()));
			mogramRef.container(container);
			container.add(mogramRef, rulesOf(ctx.mogramConstraint() != null ? mogramRules(ctx.mogramConstraint()) : emptyList()));
		} catch (Exception e) {
			errors.add(new SyntaxException("Syntax error. Unexpected tokens.", e, source.uri(), ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), ctx.getStop().getLine(), ctx.getStop().getCharPositionInLine()));
		}
	}

	private Annotation[] resolveAnnotations(AnnotationsContext annotations) {
		return annotations == null ?
				new Annotation[0] :
				annotations.annotation().stream().map(a -> Annotation.valueOf(Format.capitalize(a.getText()))).toArray(Annotation[]::new);
	}

	@Override
	public void enterProperty(PropertyContext ctx) {
		if (!errors.isEmpty()) return;
		try {
			Mogram container = (Mogram) deque.peek();
			PropertyImpl property = createProperty(ctx, container);
			property.languageName(model.languageName());
			addValue(property, ctx);
			Size size = createSize(ctx);
			if (!property.values().isEmpty()) size = new Size(0, size.max());
			property.add(size);
			if (ctx.value() != null && ctx.value().measureUnit() != null)
				property.metric(ctx.value().measureUnit().getText());
			property.add(new TypeRule());
			if (ctx.mogramConstraint() != null) property.add(createRule(property, ctx.mogramConstraint().ruleValue()));
			Rule<?> rule = property.type().defaultRule();
			if (rule != null) property.add(rule);
			property.addAnnotations(resolveAnnotations(ctx.annotations()));
			container.add(property, property.rules());
		} catch (Exception e) {
			errors.add(new SyntaxException("Syntax error. Unexpected tokens.", e, source.uri(), ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine()));
		}
	}

	private Size createSize(PropertyContext context) {
		final SizeContext sizeContext = context.size();
		if (sizeContext == null) return Size.SINGLE_REQUIRED();
		final SizeRangeContext rangeContext = sizeContext.sizeRange();
		if (rangeContext == null) return new Size(1, Integer.MAX_VALUE);
		final ListRangeContext listRange = rangeContext.listRange();
		if (listRange != null)
			return new Size(Integer.parseInt(listRange.children.getFirst().getText()), Integer.parseInt(listRange.children.getLast().getText()));
		final int minMax = Integer.parseInt(rangeContext.getText());
		return new Size(minMax, minMax);
	}

	private Rule<?> createRule(Property prop, RuleValueContext rule) {
		if (isCustom(rule)) {
			if (FUNCTION.equals(prop.type())) return new FunctionRule(rule.getText());
			else if (OBJECT.equals(prop.type())) return new NativeObjectRule(rule.getText());
			else return isBundledRule(rule.identifierReference().getText()) ?
						bundledRule(rule.identifierReference().getText()) :
						new PropertyCustomRule(rule.getText());
		} else return processLambdaRule(prop, rule);
	}

	private boolean isBundledRule(String text) {
		try {
			Class.forName("io.intino.tara.model.rules.custom." + firstUpperCase(text));
			return true;
		} catch (ClassNotFoundException e) {
			return false;
		}
	}

	private Rule<?> bundledRule(String rule) {
		try {
			return (Rule<?>) Class.forName("io.intino.tara.model.rules.custom." + firstUpperCase(rule)).getDeclaredConstructor().newInstance();
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException |
				 InvocationTargetException e) {
			return null;
		}
	}

	private Rule<?> processLambdaRule(Property var, RuleValueContext rule) {
		List<ParseTree> params = rule.children.subList(1, rule.children.size() - 1);
		if (DOUBLE.equals(var.type())) return new DoubleRule(minOf(params), maxOf(params), metric(params));
		else if (INTEGER.equals(var.type()))
			return new IntegerRule(minOf(params).intValue(), maxOf(params).intValue(), metric(params));
		else if (LONG.equals(var.type()))
			return new LongRule(minOf(params).longValue(), maxOf(params).longValue(), metric(params));
		else if (STRING.equals(var.type())) createStringProperty(var, params);
		else if (RESOURCE.equals(var.type())) return new ResourceRule(valuesOf(params));
		else if (FUNCTION.equals(var.type())) return new FunctionRule(params.getFirst().getText());
		else if (WORD.equals(var.type())) return new WordRule(valuesOf(params));
		else if (DATE.equals(var.type())) return new DateRule();
		else if (OBJECT.equals(var.type())) return new NativeObjectRule(classFrom(params.getFirst().getText()));
		return null;
	}

	private String classFrom(String text) {
		return text.startsWith("\"") ? text.substring(1, text.length() - 1) : text;
	}

	private Rule<?> processLambdaRule(RuleValueContext isRule) {
		return isRule == null ? null : createMogramRule(isRule);
	}

	private Size createMogramRule(RuleValueContext rule) {
		List<ParseTree> params = rule.children.subList(1, rule.children.size() - 1);
		final int min = minOf(params).intValue();
		if (min < 0) addError("Array size cannot be negative", rule);
		return new Size(min, maxOf(params).intValue());
	}

	private void createStringProperty(Property property, List<ParseTree> parameters) {
		final String value = valueOf(parameters, StringValueContext.class);
		if (value.isEmpty()) {
			addError("Expected pattern rule", (ParserRuleContext) parameters.getFirst().getParent());
			return;
		}
		property.add(new StringRule(value.substring(1, value.length() - 1)));
	}

	private String metric(List<ParseTree> parameters) {
		for (ParseTree parameter : parameters)
			if (parameter instanceof TerminalNode || parameter instanceof MeasureUnitContext)
				return parameter.getText();
		return "";
	}

	private List<String> valuesOf(List<ParseTree> parameters) {
		return parameters.stream().map(ParseTree::getText).collect(toList());
	}

	private String valueOf(List<ParseTree> parameters, Class<? extends ParserRuleContext> aClass) {
		ParseTree value = parameters.stream().filter(aClass::isInstance).findFirst().orElse(null);
		return value == null ? "" : value.getText();
	}

	private Double minOf(List<ParseTree> parameters) {
		RangeContext range = (RangeContext) parameters.stream().filter(RangeContext.class::isInstance).findFirst().orElse(null);
		if (range == null) return Double.NEGATIVE_INFINITY;
		final String min = range.children.getFirst().getText();
		return min.equals("*") ? Double.NEGATIVE_INFINITY : Double.parseDouble(min);
	}

	private Double maxOf(List<ParseTree> parameters) {
		RangeContext range = (RangeContext) parameters.stream().filter(RangeContext.class::isInstance).findFirst().orElse(null);
		if (range == null) return Double.POSITIVE_INFINITY;
		final String max = range.children.getLast().getText();
		return max.equals("*") ? Double.POSITIVE_INFINITY : Double.parseDouble(max);
	}

	private PropertyImpl createProperty(PropertyContext ctx, Mogram container) {
		PropertyTypeContext propType = ctx.propertyType();
		return propType.identifierReference() != null ?
				new ReferenceProperty(container, propType.getText(), ctx.IDENTIFIER().getText(), ctx.getStart().getLine(), textRange(ctx)) :
				new PropertyImpl(container, value(propType.getText()), ctx.IDENTIFIER().getText(), ctx.getStart().getLine(), textRange(ctx));
	}

	private void addValue(Property prop, PropertyContext ctx) {
		if (ctx.value() == null && ctx.bodyValue() == null) return;
		List<Object> values = ctx.bodyValue() != null ? resolveValue(ctx.bodyValue()) : resolveValue(ctx.value());
		if (prop.type().equals(DOUBLE) && !values.isEmpty() && values.getFirst() instanceof Integer)
			values = values.stream().map(v -> Double.valueOf((Integer) v)).collect(toList());
		prop.values(values);
		if (ctx.value() != null && ctx.value().measureUnit() != null)
			prop.metric(ctx.value().measureUnit().getText());
	}

	@Override
	public void enterPropertyDescriptive(PropertyDescriptiveContext ctx) {
		if (!errors.isEmpty()) return;
		String extension = ctx.value() != null && ctx.value().measureUnit() != null ? ctx.value().measureUnit().getText() : null;
		addParameter(ctx.IDENTIFIER().getText(), "", -1, extension, ctx.bodyValue() != null ? resolveValue(ctx.bodyValue()) : resolveValue(ctx.value()), textRange(ctx));
	}

	private List<Object> resolveValue(ValueContext ctx) {
		List<Object> values = new ArrayList<>();
		if (!ctx.booleanValue().isEmpty())
			values.addAll(ctx.booleanValue().stream().
					map(context -> BOOLEAN.convert(context.getText()).getFirst()).toList());
		else if (!ctx.integerValue().isEmpty())
			values.addAll(ctx.integerValue().stream().
					map(context -> {
						try {
							return INTEGER.convert(context.getText()).getFirst();
						} catch (NumberFormatException e) {
							return LONG.convert(context.getText()).getFirst();
						}
					}).toList());
		else if (!ctx.doubleValue().isEmpty())
			values.addAll(ctx.doubleValue().stream().
					map(context -> DOUBLE.convert(context.getText()).getFirst()).toList());
		else if (!ctx.tupleValue().isEmpty())
			values.addAll(ctx.tupleValue().stream().
					map(context -> new AbstractMap.SimpleEntry<>(context.stringValue().getText(), DOUBLE.convert(context.doubleValue().getText()).getFirst())).toList());
		else if (!ctx.stringValue().isEmpty())
			values.addAll(ctx.stringValue().stream().
					map(context -> formatString(context.getText())).toList());
		else if (!ctx.identifierReference().isEmpty())
			values.addAll(ctx.identifierReference().stream().map(context -> new Reference(context.getText())).toList());
		else if (!ctx.methodReference().isEmpty())
			values.addAll(ctx.methodReference().stream().map(context -> new MethodReference(context.getText().substring(1))).toList());
		else if (!ctx.expression().isEmpty())
			values.addAll(ctx.expression().stream().map(context -> new Expression(formatExpression(context.getText()).trim())).toList());
		else if (ctx.EMPTY() != null) values.add(new Reference(new EmptyMogram()));
		return values;
	}

	private List<Object> resolveValue(BodyValueContext ctx) {
		List<Object> values = new ArrayList<>();
		if (ctx.stringValue() != null) values.add(formatString(ctx.stringValue().getText()));
		else if (ctx.expression() != null)
			values.add(new Expression(formatExpression(ctx.expression().getText()).trim()));
		return values;
	}

	private String formatExpression(String value) {
		if (!value.trim().startsWith("--")) return value.substring(1, value.length() - 1).replace("\\\"", "\"");
		return format(value.trim().replaceAll("--(-*)\\n", "").replaceAll("--(-*)", ""));
	}

	private String formatString(String text) {
		String value = text.replace("\r", "");
		if (!value.trim().startsWith("\"\"\"")) return value.substring(1, value.length() - 1).replace("\\\"", "\"");
		return format(value.trim().replaceAll("\"\"(\"*)\\n", "").replaceAll("\"\"(\"*)", ""));
	}

	private String format(String text) {
		String pattern = pattern(text);
		StringBuilder result = new StringBuilder();
		for (String line : text.split("\\n")) result.append(line.replaceFirst(pattern, "")).append("\n");
		while (result.toString().endsWith("\n")) result = new StringBuilder(result.substring(0, result.length() - 1));
		return result.toString();
	}

	private String pattern(String text) {
		if (!text.contains("\n")) return text;
		final String replace = text.substring(0, text.indexOf("\n"));
		return replace.replace(replace.trim(), "");
	}

	public Model getModel() {
		model.setUses(new ArrayList<>(uses));
		return model;
	}

	public List<SyntaxException> getErrors() {
		return errors;
	}

	private void addError(String message, ParserRuleContext ctx) {
		errors.add(new SyntaxException(message, source.uri(), ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), ""));
	}

	private TextRange textRange(ParserRuleContext ctx) {
		int startIndex = ctx.getStart().getStartIndex();
		int endIndex = ctx.getStop().getStopIndex() + 1;
		return new TextRange(startIndex, endIndex, ctx.getStart().getLine(), firstLineLength(ctx), ctx.getStart().getCharPositionInLine(), ctx.getStop().getLine(), ctx.getStop().getCharPositionInLine() + ctx.getStop().getText().length());
	}

	private TextRange textRange(MogramContext ctx, ParserRuleContext nextMogram) {
		int startIndex = ctx.getStart().getStartIndex();
		int endIndex = nextMogram != null ? nextMogram.getStart().getStartIndex() : ctx.getParent().getStop().getStopIndex() + 1;
		int endLine = nextMogram != null ? nextMogram.getStart().getLine() : ctx.getParent().getStop().getLine();
		int endColumn = nextMogram != null ? nextMogram.getStart().getCharPositionInLine() : ctx.getParent().getStop().getCharPositionInLine();
		return new TextRange(startIndex, endIndex, ctx.getStart().getLine(), firstLineLength(ctx), ctx.getStart().getCharPositionInLine(), endLine, endColumn);
	}

	private static int firstLineLength(ParserRuleContext ctx) {
		return ctx.getStop().getCharPositionInLine() + ctx.getStop().getText().length();
	}

	private static int firstLineLength(MogramContext ctx) {
		return ctx.signature().getStop().getCharPositionInLine() + ctx.signature().getStop().getText().length();
	}
}