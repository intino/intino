package io.intino.tara.language.semantics.constraints;

import io.intino.tara.language.semantics.Annotations;
import io.intino.tara.language.semantics.Constraint;
import io.intino.tara.language.semantics.constraints.annotations.AnnotationChecker;
import io.intino.tara.language.semantics.errorcollector.SemanticException;
import io.intino.tara.language.semantics.errorcollector.SemanticIssue;
import io.intino.tara.model.*;
import io.intino.tara.model.rules.CustomRule;
import io.intino.tara.model.rules.property.PropertyCustomRule;
import io.intino.tara.model.rules.property.WordRule;
import io.intino.tara.processors.model.Model;

import java.net.URI;
import java.util.*;

import static io.intino.tara.language.semantics.constraints.annotations.AnnotationCoherenceCheckerFactory.get;
import static io.intino.tara.language.semantics.errorcollector.SemanticIssue.Level.WARNING;
import static io.intino.tara.model.Annotation.*;
import static io.intino.tara.model.Level.M1;
import static io.intino.tara.model.Primitive.WORD;
import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;

public class GlobalConstraints {

	public GlobalConstraints() {
	}

	private static boolean isOverridden(Property prop, Property parentProp) {
		return parentProp.type() != null &&
				parentProp.type().equals(prop.type()) && parentProp.name() != null &&
				parentProp.name().equals(prop.name());
	}

	private static void error(String message, Element element, List<?> parameters) throws SemanticException {
		throw new SemanticException(new SemanticIssue(SemanticIssue.Level.ERROR, message, element, parameters));
	}

	private static void error(String message, Element element) throws SemanticException {
		throw new SemanticException(new SemanticIssue(SemanticIssue.Level.ERROR, message, element));
	}

	public Constraint[] all() {
		return new Constraint[]{
				parentConstraint(),
				referencesInInstances(),
				invalidMogramAnnotations(),
				duplicatedAnnotations(),
				duplicatedInstances(),
				annotationCoherence(),
				checkProperties(),
				mogramName(),
				duplicatedFacets()
		};
	}

	private Constraint parentConstraint() {
		return element -> {
			if (!(element instanceof Mogram mogram)) return;
			final NamedReference<Mogram> parent = mogram.parent();
			if (parent == null || !parent.resolved()) return;
			String type = mainType(mogram);
			String parentType = mainType(parent.get());
			if (!parentType.equals(type.split(":")[0]) && !parentType.equals(type))
				error("reject.parent.different.type", mogram, asList(parentType, type));
			if (parent.get().level() == M1) error("reject.sub.of.instance", mogram);
		};
	}

	private static String mainType(Mogram mogram) {
		return mogram.types().get(0);
	}

	private Constraint referencesInInstances() {
		return element -> {
			if (!(element instanceof Mogram mogram)) return;
			if (!(mogram.level() == M1)) return;
			final MogramReference reference = mogram.referenceComponents().stream().findFirst().orElse(null);
			if (reference != null)
				error("reject.reference.in.m1.mograms", mogram, Collections.emptyList());
		};
	}

	private Constraint duplicatedInstances() {
		return element -> {
			if (!(element instanceof Mogram mogram)) return;
			if (!(mogram.level() == M1) || mogram.isAnonymous()) return;
			for (Mogram sibling : mogram.siblings())
				if (mogram.name().equals(sibling.name()))
					error("reject.duplicate.entries", mogram, List.of(mogram.name(), mogram.container() instanceof Model ? getName(mogram.source()) : mogram.container().name()));
		};
	}

	private Constraint duplicatedAnnotations() {
		return element -> {
			if (!(element instanceof Mogram mogram)) return;
			Set<String> tags = new HashSet<>();
			for (Annotation annotation : mogram.annotations()) {
				if (tags.add(annotation.name())) continue;
				error("reject.duplicate.annotation", mogram, asList(annotation, mainType(mogram)));
			}
			tags.clear();
			for (Annotation flag : mogram.annotations())
				if (!tags.add(flag.name()))
					error("reject.duplicate.annotation", mogram, asList(flag, mainType(mogram) + " " + mogram.name()));
		};
	}

	private Constraint invalidMogramAnnotations() {
		return element -> {
			if (!(element instanceof Mogram mogram)) return;
			if (mogram.annotations().isEmpty()) return;
			List<Annotation> availableAnnotations;
			if (mogram.container() instanceof MogramRoot) {
				availableAnnotations = new ArrayList<>(Annotations.forRootMogram());
				if (mogram.facetPrescription() != null) availableAnnotations.remove(Required);
			} else availableAnnotations = Annotations.forMogramComponent();
			for (Annotation tag : mogram.annotations())
				if (!availableAnnotations.contains(tag))
					error("reject.invalid.annotation", mogram, asList(tag.name(), mainType(mogram)));
		};
	}

	private static String getName(URI source) {
		String path = source.getPath();
		return path.substring(path.lastIndexOf('/') + 1);
	}

	private Constraint annotationCoherence() {
		return element -> {
			if (!(element instanceof Mogram mogram)) return;//TODO MogramHas
			for (Annotation a : mogram.annotations()) checkAnnotationConstrains(a.name(), mogram);
		};
	}

	private void checkAnnotationConstrains(String annotation, Mogram mogram) throws SemanticException {
		AnnotationChecker aClass = get(annotation.toLowerCase());
		if (aClass != null) aClass.check(mogram);
	}

	private Constraint checkProperties() {
		return element -> {
			if (!(element instanceof Mogram mogram)) return;
			checkDuplicatesBetween(mogram.components(), mogram.properties());
			checkDuplicatesBetween(mogram.referenceComponents().stream().map(m -> m.target().get()).filter(Objects::nonNull).toList(), mogram.properties());
			checkDuplicates(mogram.properties());
			checkDuplicates(mogram.parameters());
			for (Property variable : mogram.properties()) checkProperty(variable);
		};
	}

	private void checkDuplicatesBetween(List<Mogram> components, List<Property> variables) throws SemanticException {
		if (variables == null) return;
		for (Property var : variables)
			if (components.stream().anyMatch(c -> var.name() != null && var.name().equals(c.name())))
				error("reject.duplicated.name.between.properties.and.components", var, Collections.singletonList(var.name()));
	}

	private void checkDuplicates(List<? extends Valued> values) throws SemanticException {
		Set<String> names = new LinkedHashSet<>();
		for (Valued valued : values)
			if (valued.name() != null && !valued.name().isEmpty() && !names.add(valued.name()))
				error("reject.duplicated.valued", valued, List.of((valued.getClass().getSimpleName().contains("Parameter") ? "parameter" : "property"), valued.name()));
	}

	private void checkProperty(Property prop) throws SemanticException {
		final List<Object> values = prop.values();
		if (prop.container().level() == M1) error("reject.property.in.m1.mogram", prop);
		else if (Primitive.FUNCTION.equals(prop.type()) && prop.rules() == null)
			error("reject.nonexistent.property.rule", prop, singletonList(prop.type().javaName()));
		else if (!values.isEmpty() && !(values.get(0) instanceof EmptyMogram) && !hasExpressionValue(values)) {
			Rule<?> notAccepted = prop.rules().stream().filter(r -> !((Rule) r).accept(prop)).findFirst().orElse(null);
			if (notAccepted != null) {
				final String message = notAccepted.errorMessage();
				error(message == null || message.isEmpty() ? "custom.rule.class.not.comply" : message, prop, notAccepted.errorParameters());
			}
		}
		if (prop.type().equals(WORD) && prop.rule(WordRule.class) == null && prop.rule(CustomRule.class) == null)
			error("reject.invalid.word.names", prop);
		checkAnnotations(prop);
		if (prop.name() != null && Character.isUpperCase(prop.name().charAt(0)))
			warning("warning.property.name.starts.uppercase", prop);
	}

	private void checkAnnotations(Property prop) throws SemanticException {
		if (prop.annotations().contains(Private) && !isInGeneralization(prop) && prop.values().isEmpty())
			error("reject.private.property.without.default.value", prop, singletonList(prop.name()));
		if (prop.annotations().contains(Reactive) && prop.type().equals(Primitive.FUNCTION))
			error("reject.invalid.annotation", prop, asList(Reactive.name(), prop.name()));
		if (!WORD.equals(prop.type()) && prop.annotations().contains(Reactive) && prop.rules() != null && (prop.rules() instanceof PropertyCustomRule)) {
			if (prop.values().isEmpty() || hasExpressionValue(prop))
				error("reject.reactive.property.with.rules", prop, asList(Reactive.name(), prop.name()));
			else if (prop.rules() instanceof PropertyCustomRule || !hasExpressionValue(prop))
				error("reject.reactive.with.no.expression.value", prop, asList(Reactive.name(), prop.name()));
		}
		Property parentVariable = findParentVariable(prop);
		if (parentVariable != null) checkParentVariables(prop, parentVariable);
	}

	private boolean hasExpressionValue(Property variable) {
		return variable.values().get(0) instanceof Primitive.Expression || variable.values().get(0) instanceof Primitive.MethodReference;
	}

	private void checkParentVariables(Property variable, Property parentVariable) throws SemanticException {
		if (parentVariable.annotations().contains(Reactive) != variable.annotations().contains(Reactive))
			error("reject.parent.property.annotations", variable);
	}

	private Property findParentVariable(Property variable) {
		Mogram mogram = variable.container();
		if (mogram == null) return null;
		NamedReference<Mogram> parent = mogram.parent();
		if (parent == null) return null;
		while (parent != null && parent.resolved()) {
			for (Property parentVar : parent.get().properties())
				if (isOverridden(variable, parentVar))
					return parentVar;
			parent = parent.get().parent();
		}
		return null;
	}

	private boolean isInGeneralization(Property variable) {
		return variable.container() != null && variable.container().is(Generalization);
	}

	private boolean hasExpressionValue(List<Object> values) {
		return !values.isEmpty() && (values.get(0) instanceof Primitive.Expression || values.get(0) instanceof Primitive.MethodReference);
	}

	private Constraint mogramName() {
		return element -> {
			if (!(element instanceof Mogram mogram)) return;
			if (!(mogram.level() == M1) && mogram.isAnonymous()) error("concept.with.no.name", mogram);
			else if (mogram.level() == M1) return;
			if (mogram.container() != null && mogram.container() != null && !mogram.isAnonymous() && mogram.name().equals(mogram.container().name()))
				error("reject.container.and.component.namesake", mogram);
		};
	}

	private Constraint duplicatedFacets() {
		return element -> {
			if (!(element instanceof Mogram mogram)) return;
			Set<String> facets = new HashSet<>();
			for (Facet facet : mogram.appliedFacets())
				if (!facets.add(facet.type())) error("reject.duplicated.facet", facet);
		};
	}

	private void warning(String message, Element element) throws SemanticException {
		throw new SemanticException(new SemanticIssue(WARNING, message, element));
	}
}