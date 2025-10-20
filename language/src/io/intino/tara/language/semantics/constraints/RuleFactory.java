package io.intino.tara.language.semantics.constraints;

import io.intino.tara.language.semantics.Assumption;
import io.intino.tara.language.semantics.Constraint;
import io.intino.tara.language.semantics.constraints.component.Component;
import io.intino.tara.language.semantics.constraints.component.OneOf;
import io.intino.tara.language.semantics.constraints.property.DescriptiveProperty;
import io.intino.tara.language.semantics.errorcollector.SemanticException;
import io.intino.tara.language.semantics.errorcollector.SemanticIssue;
import io.intino.tara.model.*;
import io.intino.tara.processors.Resolver;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

import static io.intino.tara.language.semantics.errorcollector.SemanticIssue.Level.ERROR;
import static io.intino.tara.processors.Resolver.mainType;
import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;

public class RuleFactory {
	private RuleFactory() {
	}

	public static Constraint.Component component(final String type, List<Rule<?>> rules, final Annotation... flags) {
		return new Component(type, rules, asList(flags));
	}

	@Deprecated
	public static Constraint.Component component(final String type, Rule<?> rule, final Annotation... flags) {
		return new Component(type, singletonList(rule), asList(flags));
	}

	public static Constraint.OneOf oneOf(List<Rule<?>> rules, final Constraint.Component... components) {
		return new OneOf(asList(components), rules);
	}

	public static Constraint.Property property(final String name, final Primitive type, String facet, final int position, Level level, List<Rule> rules, Annotation... annotations) {
		return new DescriptiveProperty(name, type, facet, position, level, rules, asList(annotations));
	}

	public static Constraint.Facet facet(final String type, boolean terminal, String[] with, String[] without) {
		return facet(type, terminal, false, with, without);
	}

	public static Constraint.Facet facet(final String type, boolean terminal, boolean required, String[] with, String[] without) {
		return new FacetConstraint(type, terminal, required, with, without);
	}

	public static Constraint.FacetInstantiation facetInstantiation(final String... types) {
		return new FacetInstantiationConstraint(types);
	}

	public static Constraint.RejectOtherComponents rejectOtherComponents(List<String> types) {
		return new Constraint.RejectOtherComponents() {

			@Override
			public void check(Element element) throws SemanticException {
				ElementContainer mogram = (ElementContainer) element;
				for (Mogram component : mogram.components())
					if (!areCompatibles(component, types))
						throw new SemanticException(new SemanticIssue(ERROR, "reject.type.not.exists", component, singletonList(mainType(component).replace(":", ""))));
			}
		};
	}

	private static boolean areCompatibles(Mogram mogram, List<String> allowedTypes) {
		return mogram.types().stream()
				.filter(Objects::nonNull)
				.anyMatch(type -> allowedTypes.contains(type) ||
						mogram.container() != null && fromFacet(containerFacets(mogram), type, allowedTypes))
				|| checkFacet(mogram, allowedTypes)
				|| checkFacetInstance(mogram);
	}

	private static boolean checkFacetInstance(Mogram mogram) {
		return mogram.metaMograms().stream().anyMatch(m ->
				mogram.container() instanceof Mogram mm &&
						mm.types().contains(m.facetPrescription().get().qualifiedName()));
	}

	public static Constraint.RejectOtherParameters rejectOtherParameters(List<Constraint.Property> parameters) {
		return new Constraint.RejectOtherParameters() {
			@Override
			public void check(Element element) throws SemanticException {
				if (!(element instanceof Parametrized parametrized)) return;
				for (PropertyDescription parameter : parametrized.parameters())
					if (!isAcceptable(parameter, parameters))
						throw new SemanticException(new SemanticIssue(ERROR, "reject.other.parameter.in.context", parameter, singletonList(parameter.name().isEmpty() ? anchorName(parameter) : parameter.name())));
			}

			private boolean isAcceptable(PropertyDescription parameter, List<Property> constraints) {
				return constraints.stream()
						.anyMatch(constraint -> constraint.name().equals(parameter.name()) && hasFacet(constraint.facet(), parameter.container().appliedFacets()));
			}

			private boolean hasFacet(String requiredFacet, List<io.intino.tara.model.Facet> facets) {
				return requiredFacet.isEmpty() || facets.stream().anyMatch(facet -> facet.type().equals(requiredFacet));
			}
		};
	}

	private static String anchorName(PropertyDescription parameter) {
		return parameter.values().isEmpty() ? "0" : parameter.values().get(0).toString();
	}

	public static Constraint.RejectOtherFacets rejectOtherFacets(List<Constraint.Facet> facets) {
		return new Constraint.RejectOtherFacets() {
			@Override
			public void check(Element element) throws SemanticException {
				if (!(element instanceof Mogram mogram)) return;
				for (io.intino.tara.model.Facet facet : mogram.appliedFacets()) {
					if (!isAcceptable(facets, facet))
						throw new SemanticException(new SemanticIssue(ERROR, "reject.other.facet.in.context", facet, singletonList(facet.type())));
				}
			}

			private boolean isAcceptable(List<Facet> facets, io.intino.tara.model.Facet facet) {
				return facets.stream().anyMatch(a -> a.type().equals(facet.fullType()));
			}
		};
	}

	private static List<Facet> containerFacets(Mogram mogram) {
		ElementContainer container = mogram.container();
		return container instanceof Mogram m ? m.appliedFacets() : List.of();
	}

	private static boolean fromFacet(List<Facet> facets, String nodeType, List<String> types) {
		return facetComponent(facets, nodeType, types) || asFacet(facets, nodeType.split(":")[0]);
	}

	private static boolean facetComponent(List<Facet> facets, String nodeType, List<String> types) {
		return facets.stream().anyMatch(facet -> types.contains(nodeType));
	}

	private static boolean asFacet(List<Facet> facets, String facet) {
		return facets.stream().anyMatch(a -> a.type().equals(facet));
	}

	private static boolean checkFacet(Mogram mogram, List<String> types) {
		List<String> shortTypes = types.stream().map(Resolver::shortType).toList();
		return mogram.appliedFacets().stream().anyMatch(facet -> shortTypes.contains(facet.type()));
	}

	public static Constraint name() {
		return new Constraint.Name() {
			@Override
			public void check(Element element) throws SemanticException {
				if (!(element instanceof Mogram mogram)) return;
				if (mogram.name().isEmpty())
					throw new SemanticException(new SemanticIssue(ERROR, "required.name", element, Collections.emptyList()));
			}
		};
	}

	public static Assumption isFeature() {
		return new Assumption.Feature() {
			@Override
			public void assume(Mogram mogram) {
				if (!mogram.annotations().contains(Annotation.Feature)) mogram.addAnnotations(Annotation.Feature);
				propagateAnnotations(mogram, Annotation.Feature);
			}
		};
	}

	public static Assumption isComponent() {
		return new Assumption.Component() {
			@Override
			public void assume(Mogram mogram) {
			}
		};
	}

	private static void propagateAnnotations(Mogram mogram, Annotation tag) {
		for (Mogram component : mogram.components()) {
			if (!component.annotations().contains(tag)) {
				component.addAnnotations(tag);
				if (!component.equals(mogram)) propagateAnnotations(component, tag);
			}
		}
	}

}
