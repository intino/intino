package io.intino.ls.codeinsight.completion;

import io.intino.ls.ModelUnit;
import io.intino.ls.codeinsight.ReferenceResolver;
import io.intino.tara.Language;
import io.intino.tara.language.grammar.TaraGrammar;
import io.intino.tara.language.grammar.TaraGrammar.IdentifierKeyContext;
import io.intino.tara.language.grammar.TaraGrammar.IdentifierReferenceContext;
import io.intino.tara.language.grammar.TaraGrammar.PropertyDescriptiveContext;
import io.intino.tara.language.semantics.Constraint;
import io.intino.tara.language.semantics.Constraint.Property;
import io.intino.tara.model.Element;
import io.intino.tara.model.Mogram;
import io.intino.tara.model.Primitive;
import io.intino.tara.model.PropertyDescription;
import io.intino.tara.model.rules.property.ReferenceRule;
import io.intino.tara.processors.Resolver;
import io.intino.tara.processors.model.Model;
import org.antlr.v4.runtime.ParserRuleContext;

import java.net.URI;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static io.intino.ls.codeinsight.completion.CompletionService.TARA_FAKE_TOKEN;
import static io.intino.tara.model.Annotation.Component;
import static io.intino.tara.model.Annotation.Feature;
import static java.util.Collections.emptyList;

class VariantsManager {
	private final Set<Mogram> variants = new LinkedHashSet<>();
	private final Language language;
	private final Map<URI, ModelUnit> models;
	private final ModelUnit modelUnit;
	private final IdentifierKeyContext myElement;
	private final Mogram mogram;
	private final List<IdentifierKeyContext> context;

	VariantsManager(Language language, Map<URI, ModelUnit> models, ModelUnit modelUnit, IdentifierKeyContext myElement, Mogram mogram) {
		this.language = language;
		this.models = models;
		this.modelUnit = modelUnit;
		this.myElement = myElement;
		this.mogram = mogram;
		this.context = solveIdentifierContext();
	}

	Set<Mogram> resolveVariants() {
		if (hasContext()) addContextVariants();
		else addInModelVariants();
		if (mogram == null || mogram.types().isEmpty()) return variants;
		if (isParentReference((IdentifierReferenceContext) myElement.getParent()))
			return variants;
		else if (isParameterContext(myElement) && isReferenceParameter(myElement))
			return variants;
		return Set.of();
	}

	private boolean isReferenceParameter(ParserRuleContext element) {
		new Resolver(language).resolve(mogram);
		final List<Constraint> constraints = constraintsOf(mogram);
		ParserRuleContext parameterRule = propertyDescriptionContext(element);
		if (parameterRule == null) parameterRule = signaturePropertyContext(element);
		if (constraints == null || parameterRule == null) return false;
		PropertyDescription parameter = propertyDescription(mogram, parameterRule);
		if (parameter == null) return false;
		Property constraint = findConstraint(constraints, parameter);
		if (constraint == null && !mogram.appliedFacets().isEmpty())
			constraint = searchInFacets(mogram, constraints, parameterRule);
		return constraint != null;
	}

	private static PropertyDescriptiveContext propertyDescriptionContext(ParserRuleContext element) {
		return TreeUtils.contextByType(element, PropertyDescriptiveContext.class);
	}

	private PropertyDescription propertyDescription(Mogram mogram, ParserRuleContext parameterRule) {
		return mogram.parameters().stream()
				.filter(p -> p.values().stream().anyMatch(v -> v.toString().contains(TARA_FAKE_TOKEN)))
				.findFirst()
				.orElse(null);
	}

	private ReferenceRule referenceRule(Property constraint) {
		return (ReferenceRule) constraint.rules().stream().filter(c -> c instanceof ReferenceRule).findFirst().orElse(null);
	}

	private Property searchInFacets(Mogram mogram, List<Constraint> constraints, ParserRuleContext parameter) {
		for (Constraint c : constraints)
			if (c instanceof Constraint.Facet && facetOf((Constraint.Facet) c, mogram.appliedFacets()) != null)
				return findConstraint(((Constraint.Facet) c).constraints(), propertyDescription(mogram, parameter));
		return null;
	}

	private io.intino.tara.model.Facet facetOf(Constraint.Facet c, List<io.intino.tara.model.Facet> facets) {
		for (io.intino.tara.model.Facet facet : facets)
			if (facet.type().equals(c.type())) return facet;
		return null;
	}

	private Property findConstraint(List<Constraint> constraints, PropertyDescription parameter) {
		return (Property) constraints.stream()
				.filter(c -> (c instanceof Property p) && p.type().equals(Primitive.REFERENCE) && isConstraintOf(parameter, (Property) c))
				.findFirst().orElse(null);
	}

	private boolean isConstraintOf(PropertyDescription parameter, Property constraint) {
		return constraint.name().equals(parameter.name()) || match(constraint, parameter);
	}

	public boolean match(Property c, PropertyDescription parameter) {
		io.intino.tara.model.PropertyDescription expected = TreeUtils.findPropertyDescription(parameter.container().parameters(), c.facet(), c.name(), c.position());
		return parameter.equals(expected);
	}

	private boolean isParameterContext(ParserRuleContext element) {
		return propertyDescriptionContext(element) != null ||
				signaturePropertyContext(element) != null;
	}

	private static TaraGrammar.SignaturePropertyContext signaturePropertyContext(ParserRuleContext element) {
		return TreeUtils.contextByType(element, TaraGrammar.SignaturePropertyContext.class);
	}

	private List<Mogram> collectUnacceptableMograms(List<String> expectedTypes) {
		if (expectedTypes.isEmpty()) return emptyList();
		return variants.stream().
				filter(variant -> {
					return !variant.types().isEmpty() && variant.types().stream().noneMatch(t -> expectedTypes.contains(t.split(":")[0]));
				}).toList();
	}

	private boolean hasContext() {
		return !getContext().isEmpty();
	}

	private List<IdentifierKeyContext> getContext() {
		return ((IdentifierReferenceContext) myElement.getParent()).hierarchy().stream().map(e -> e.identifierKey()).collect(Collectors.toList());
	}

	private void addContextVariants() {
		final List<IdentifierKeyContext> aContext = getContext();
		if (mogram == null) return;
		Element target = new ReferenceResolver(models, modelUnit, language).resolve(mogram, aContext);
		if (target instanceof Mogram m) variants.addAll(m.components());
	}

	private void addInModelVariants() {
		if (modelUnit == null || modelUnit.model() == null) return;
		modelUnit.model().components().stream()
				.filter(m -> !m.isAnonymous())
				.filter(mogram -> !mogram.equals(this.mogram))
				.forEach(mogram -> resolvePathFor(mogram, context));
		addMainConcepts(modelUnit.model());
	}

	private void addMainConcepts(Model model) {
		model.mograms().stream()
				.filter(m -> !m.isAnonymous())
				.filter(mogram -> !variants.contains(mogram) && !mogram.is(Component) && !mogram.is(Feature))
				.forEach(mogram -> resolvePathFor(mogram, context));
	}

	private void resolvePathFor(Mogram mogram, List<IdentifierKeyContext> path) {
		List<Mogram> components = mogram.components();
		if (mogram.types().isEmpty()) return;
		if (path.isEmpty()) variants.add(mogram);
		else if (path.get(0).getText().equals(mogram.name()))
			for (Mogram child : components)
				resolvePathFor(child, path.subList(1, path.size()));
	}

	private List<IdentifierKeyContext> solveIdentifierContext() {
		return ((IdentifierReferenceContext) myElement.getParent()).hierarchy().stream().map(e -> e.identifierKey()).collect(Collectors.toList());
	}

	private boolean isParentReference(IdentifierReferenceContext reference) {
		return reference.getParent() instanceof TaraGrammar.SignatureContext;
	}

	public List<Constraint> constraintsOf(Mogram mogram) {
		if (language == null) return null;
		return language.constraints(mogram.types().getFirst());
	}

}