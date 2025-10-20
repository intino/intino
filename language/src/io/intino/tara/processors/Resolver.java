package io.intino.tara.processors;

import io.intino.tara.Language;
import io.intino.tara.language.semantics.Constraint;
import io.intino.tara.language.semantics.Constraint.Component;
import io.intino.tara.language.semantics.Constraint.OneOf;
import io.intino.tara.language.semantics.Constraint.Property;
import io.intino.tara.model.*;
import io.intino.tara.processors.dependencyresolution.ReferenceManager;

import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Resolver {
	private final Language language;

	public Resolver(Language language) {
		this.language = language;
	}

	public static String shortType(String absoluteType) {
		return absoluteType.contains(".") ? absoluteType.substring(absoluteType.lastIndexOf('.') + 1) : absoluteType;
	}

	public void resolve(ElementContainer m) {
		if (container(m) == null) return;
		resolveMogramContainer(m);
	}

	private void resolveMogramContainer(ElementContainer m) {
		resolve(container(m));
		List<Constraint> constraints = containerConstraints(m);
		if (constraints == null) return;
		for (Constraint constraint : components(constraints))
			if (resolveComponentConstraint((Mogram) m, constraint)) return;
		for (Constraint constraint : facetInstantiations(constraints))
			if (resolveFacetInstantiationConstraint((Mogram) m, (Constraint.FacetInstantiation) constraint)) return;
	}

	private List<Constraint> containerConstraints(ElementContainer mogram) {
		if (mogram == null || language == null || mogram instanceof MogramRoot) return Collections.emptyList();
		final ElementContainer container = container(mogram);
		if (container instanceof MogramRoot) return language.constraints("");
		List<Constraint> constraints = (container instanceof Mogram m) && mainType(m) != null ? language.constraints(mainType(m)) : null;
		if (constraints != null && (isComponent(constraints, mogram) || isFacetInstance(constraints, mogram)))
			return constraints;
		return findInFacets(mogram);
	}

	private boolean isComponent(List<Constraint> constraints, ElementContainer mogram) {
		return constraints.stream().anyMatch(c -> c instanceof Component &&
				(shortType(((Component) c).type()).equals(mainType(mogram)) ||
						((Component) c).type().equals(mainType(mogram)) ||
						isOneOf((Component) c, mainType(mogram))));
	}

	private boolean isFacetInstance(List<Constraint> constraints, ElementContainer mogram) {
		String mainType = mainType(mogram);
		return constraints.stream().anyMatch(c -> c instanceof Constraint.FacetInstantiation f &&
				(f.types().stream().map(Resolver::shortType).anyMatch(t -> t.equals(mainType)) ||
						f.types().contains(mainType)));
	}

	private List<Constraint.FacetInstantiation> facetInstantiations(List<Constraint> cs) {
		return cs.stream().filter(c -> c instanceof Constraint.FacetInstantiation).map(c -> (Constraint.FacetInstantiation) c).collect(toList());
	}

	private List<Component> components(List<Constraint> cs) {
		return cs.stream().filter(c -> c instanceof Component).map(c -> (Component) c).collect(toList());
	}

	private boolean isOneOf(Component allow, String type) {
		if (!(allow instanceof OneOf)) return false;
		return ((OneOf) allow).components().stream()
				.anyMatch(one -> one.type().endsWith("." + type) || one.type().equals(type));
	}

	private List<Constraint> findInFacets(ElementContainer mogram) {
		final ElementContainer container = container(mogram);
		if (container instanceof Mogram m) {
			for (Facet facet : m.appliedFacets()) {
				List<Constraint> constraints = language.constraints(facet.fullType());
				if (constraints != null && isComponent(constraints, mogram)) return constraints;
			}
		}
		return List.of();
	}

	private boolean resolveComponentConstraint(Mogram mogram, Constraint constraint) {
		if (!(constraint instanceof Component)) return false;
		if (constraint instanceof OneOf) return checkOneOf(mogram, constraint);
		return resolveComponent(mogram, (Component) constraint);
	}

	private boolean checkOneOf(Mogram mogram, Constraint c) {
		return ((OneOf) c).components().stream().anyMatch(one -> resolveComponent(mogram, one));
	}

	private boolean resolveComponent(Mogram mogram, Component component) {
		String absoluteType = component.type();
		if (mainType(mogram) != null && shortType(mainType(mogram)).equals(shortType(absoluteType))) {
			mogram.type(absoluteType);
			assume(mogram);
			Mogram mogramDefinition = findMogramDefinition(absoluteType, language.model());
			if (mogramDefinition != null) mogram.addMetaMogram(mogramDefinition);
			resolveDescriptiveProperties(mogram);
			resolveFacets(mogram);
			return true;
		}
		return false;
	}

	private boolean resolveFacetInstantiationConstraint(Mogram mogram, Constraint.FacetInstantiation constraint) {
		List<String> shortTypes = constraint.types().stream().map(Resolver::shortType).toList();
		String type = mainType(mogram);
		if (type != null && shortTypes.contains(type)) {
			mogram.type(constraint.types().get(0));
			assume(mogram);
			Mogram mogramDefinition = findMogramDefinition(constraint.types().get(0), language.model());
			if (mogramDefinition != null) mogram.addMetaMogram(mogramDefinition);
			resolveFacets(mogram);
			resolveDescriptiveProperties(mogram);
			return true;
		}
		return false;
	}

	private void assume(Mogram mogram) {
		if (mogram == null || language == null) return;
		Level level = language.level(mainType(mogram));
		if (level != null) mogram.level(level);
		mogram.types().stream()
				.map(t -> Optional.ofNullable(language.assumptions(t)))
				.filter(Optional::isPresent)
				.flatMap(Optional::stream)
				.forEach(as -> as.forEach(a -> a.assume(mogram)));
	}

	private String simpleType(Constraint.Facet facet) {
		return facet.type().contains(".") ? facet.type().substring(facet.type().lastIndexOf(".") + 1) : facet.type();
	}

	public static String mainType(ElementContainer e) {
		return (e instanceof Mogram m) ? m.types().get(0) : "";
	}

	private void resolveFacets(Mogram mogram) {
		for (Facet facet : mogram.appliedFacets()) {
			Constraint.Facet constraint = facetConstraint(mogram, facet);
			if (constraint != null) {
				facet.fullType(constraint.type());
				Mogram metamogram = findMogramDefinition(constraint.type(), language.model());
				if (metamogram != null) {
					mogram.addMetaMogram(metamogram);
					facet.definition().referent(metamogram);
				}
				List<Property> parameterConstraints = constraint.constraints().stream().filter(c -> c instanceof Property).map(c -> (Property) c).collect(toList());
				resolveDescriptiveProperties(mogram.parameters(), parameterConstraints, metamogram);
			}
		}
	}

	private void resolveDescriptiveProperties(Mogram mogram) {
		resolveDescriptiveProperties(mogram.parameters(), descriptivePropConstraints(mogram), metaMogram(mogram));
	}

	private void resolveDescriptiveProperties(List<PropertyDescription> props, List<Property> constraints, Mogram metamogram) {
		for (PropertyDescription prop : props) {
			Property constraint = findPropConstraint(constraints, prop);
			if (constraint == null) continue;
			prop.name(constraint.name());
			prop.type(constraint.type());
			prop.facet(constraint.facet());
			prop.definition(findDefinition(prop, metamogram));
			if (prop.rules().isEmpty()) constraint.rules().forEach(prop::add);
		}
	}

	private Constraint.Facet facetConstraint(Mogram mogram, Facet facet) {
		return (Constraint.Facet) language.constraints(mainType(mogram)).stream().
				filter(c -> c instanceof Constraint.Facet && simpleType((Constraint.Facet) c).equals(facet.type()))
				.findFirst().orElse(null);
	}

	private List<Property> descriptivePropConstraints(Mogram mogram) {
		return language.constraints(mainType(mogram)).stream()
				.filter(c -> c instanceof Property)
				.map(c -> (Property) c)
				.collect(toList());
	}

	private static Property findPropConstraint(List<Property> constraints, PropertyDescription prop) {
		return constraints.stream()
				.filter(c -> prop.facet().isEmpty() || c.facet().equals(prop.facet()))
				.filter(c -> c.name().equals(prop.name()) || (prop.name() == null || prop.name().isEmpty()) && c.position() == prop.position())
				.findFirst().orElse(findAll(constraints, prop));
	}

	private static Property findAll(List<Property> constraints, PropertyDescription prop) {
		return constraints.stream()
				.filter(constraint -> constraint.name().equals(prop.name()) && hasFacet(constraint.facet(), prop.container().appliedFacets())).findFirst().orElse(null);
	}

	private static boolean hasFacet(String requiredFacet, List<io.intino.tara.model.Facet> facets) {
		return requiredFacet.isEmpty() || facets.stream().anyMatch(facet -> facet.type().equals(requiredFacet));
	}

	public ElementContainer container(ElementContainer mogram) {
		return mogram == null ? null : mogram.container();
	}

	private io.intino.tara.model.Property findDefinition(PropertyDescription prop, Mogram mogram) {
		return effectiveProperties(mogram).filter(p -> p.name().equals(prop.name())).findFirst().orElse(null);
	}

	private Mogram findMogramDefinition(String absoluteType, MogramRoot model) {
		if (model == null) return null;
		String[] path = absoluteType.split("\\.");
		Mogram root = model.components().stream().filter(m -> m.name().equals(path[0])).findFirst().orElse(null);
		if (root == null) return null;
		if (path.length == 1) return root;
		return ReferenceManager.resolvePathInMogram(path, root);
	}

	protected Stream<io.intino.tara.model.Property> effectiveProperties(Mogram mogram) {
		if (mogram == null) return Stream.empty();
		Map<String, io.intino.tara.model.Property> properties = new LinkedHashMap<>();
		mogram.properties().forEach(p -> properties.put(p.name(), p));
		Mogram current = mogram.parent() != null ? mogram.parent().get() : null;
		while (current != null) {
			current.properties().forEach(p -> properties.put(p.name(), p));
			current = current.parent() != null ? current.parent().get() : null;
		}
		return properties.values().stream();
	}

	private boolean areNamesake(Mogram mogram, String name) {
		return name.equals(mogram.name());
	}

	private static Mogram metaMogram(Mogram mogram) {
		return mogram.metaMograms().isEmpty() ? null : mogram.metaMograms().get(0);
	}
}