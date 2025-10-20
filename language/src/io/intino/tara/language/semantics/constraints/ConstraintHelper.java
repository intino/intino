package io.intino.tara.language.semantics.constraints;

import io.intino.tara.language.semantics.Constraint;

import java.util.*;
import java.util.stream.Collectors;

public class ConstraintHelper {


	public static List<String> componentConstrains(List<Constraint> constraints) {
		Set<String> types = new HashSet<>();
		if (constraints == null) return Collections.emptyList();
		types.addAll(components(constraints));
		for (List<Constraint.Component> components : componentsOfOneOf(constraints))
			types.addAll(components.stream().map(Constraint.Component::type).collect(Collectors.toList()));
		for (Constraint.Facet facet : constraints.stream().filter(c -> c instanceof Constraint.Facet).map(c -> (Constraint.Facet) c).collect(Collectors.toList())) {
			types.addAll(facetComponents(facet.constraints()));
			for (List<Constraint.Component> components : componentsOfOneOf(facet.constraints())) types.addAll(typesOf((components)));
		}
		return new ArrayList<>(types);
	}

	private static List<List<Constraint.Component>> componentsOfOneOf(List<Constraint> constraints) {
		return constraints.stream().filter(c -> c instanceof Constraint.OneOf).map(constraint -> ((Constraint.OneOf) constraint).components()).collect(Collectors.toList());
	}

	private static List<String> components(List<Constraint> constraints) {
		return constraints.stream().filter(c -> c instanceof Constraint.Component && !((Constraint.Component) c).type().isEmpty()).map(c -> ((Constraint.Component) c).type()).collect(Collectors.toList());
	}

	private static List<String> facetComponents(List<Constraint> constraints) {
		return constraints.stream().filter(c -> c instanceof Constraint.Component && !((Constraint.Component) c).type().isEmpty()).map(c -> ((Constraint.Component) c).type()).collect(Collectors.toList());
	}

	private static List<String> typesOf(List<Constraint.Component> constraints) {
		return constraints.stream().filter(c -> c != null && !c.type().isEmpty()).map(Constraint.Component::type).collect(Collectors.toList());
	}

	public static List<Constraint.Property> parameterConstrains(List<Constraint> constraints) {
		final List<Constraint.Property> parameters = filterParameters(constraints);
		for (Constraint.Facet facet : facetConstrains(constraints))
			parameters.addAll(filterParameters(facet.constraints()));
		return parameters;
	}

	private static List<Constraint.Property> filterParameters(List<Constraint> constraints) {
		return constraints.stream().filter(c -> c instanceof Constraint.Property).map(c -> (Constraint.Property) c).collect(Collectors.toList());
	}

	public static List<Constraint.Facet> facetConstrains(List<Constraint> constraints) {
		return constraints.stream().filter(c -> c instanceof Constraint.Facet).map(c -> (Constraint.Facet) c).collect(Collectors.toList());
	}
}
