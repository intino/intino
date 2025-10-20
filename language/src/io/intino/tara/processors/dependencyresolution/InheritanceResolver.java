package io.intino.tara.processors.dependencyresolution;

import io.intino.tara.model.*;
import io.intino.tara.model.rules.Size;
import io.intino.tara.model.rules.composition.ConstraintRule;
import io.intino.tara.processors.model.HasMogram;
import io.intino.tara.processors.model.Model;
import io.intino.tara.processors.model.MogramImpl;

import java.util.*;
import java.util.function.Predicate;

import static io.intino.tara.model.Annotation.Generalization;
import static io.intino.tara.processors.Resolver.mainType;

public class InheritanceResolver {
	private final Model model;

	public InheritanceResolver(Model model) {
		this.model = model;
	}

	public void resolve() throws DependencyException {
		List<Mogram> mograms = sort(new ArrayList<>(collectMograms(model, node -> !node.children().isEmpty())));
		for (Mogram mogram : mograms) resolve(mogram);
	}

	private void resolve(Mogram mogram) throws DependencyException {
		List<Mogram> children = getChildrenSorted(mogram);
		if (!mogram.is(Generalization) && !mogram.subs().isEmpty() && !mogram.annotations().contains(Generalization))
			mogram.addAnnotations(Generalization);
		for (Mogram child : children) resolve(mogram, child);
	}

	private void resolve(Mogram mogram, Mogram child) throws DependencyException {
		resolveComponents(mogram, child);
		resolveProperties(mogram, child);
		resolveAnnotations(mogram, child);
		resolveAllowedFacets(mogram, child);
		resolveAppliedFacets(mogram, child);
		resolveMogramRules(mogram, child);
		resolve(child);
	}

	private void resolveMogramRules(Mogram parent, Mogram child) {
		List<Rule<?>> parentRules = parent.container().rulesOf(parent);
		List<Rule<?>> childRules = child.container().rulesOf(child);
		Size size = child.container().sizeOf(child);
		for (Rule<?> rule : parentRules)
			if (!(rule instanceof Size)) {
				if (!alreadyAdded(childRules, rule)) childRules.add(rule);
			} else if (isMoreRestrictiveThan((Size) rule, size)) {
				childRules.remove(size);
				childRules.add(rule);
			}
	}

	private boolean alreadyAdded(List<Rule<?>> childRules, Rule<?> rule) {
		if (rule instanceof ConstraintRule nr)
			return childRules.stream().filter(r -> r instanceof ConstraintRule)
					.anyMatch(r -> ((ConstraintRule) r).reference().reference().equals((nr.reference().reference())));
		return false;
	}

	private boolean isMoreRestrictiveThan(Size parent, Size child) {
		return parent.min() > child.min() || parent.max() < child.max();
	}

	private void resolveAllowedFacets(Mogram parent, Mogram child) {
	}

	private void resolveAppliedFacets(Mogram parent, Mogram child) {
		parent.appliedFacets().stream().filter(facet -> !isOverridden(child, facet)).forEach(child::applyFacet);
	}

	private boolean isOverridden(Mogram child, Facet facet) {
		return child.appliedFacets().stream().anyMatch(childFacet -> childFacet.type().equals(facet.type()));
	}

	private Collection<Mogram> collectMograms(Model model, Predicate<Mogram> condition) {
		Set<Mogram> collection = new HashSet<>();
		for (Mogram mogram : model.components()) {
			if (condition.test(mogram)) collection.add(mogram);
			collect(mogram, collection, condition);
		}
		return collection;
	}

	private void collect(Mogram mogram, Set<Mogram> collection, Predicate<Mogram> condition) {
		if (!(mogram instanceof MogramImpl)) return;
		if (condition.test(mogram)) collection.add(mogram);
		for (Mogram component : mogram.components()) collect(component, collection, condition);
	}

	private void resolveComponents(Mogram parent, Mogram child) {
		parent.components().stream().filter(component -> isOverridden(child, component))
				.forEach(c -> {
					child.overrides(c);
					c.overridenBy(child);
				});
	}

	private void resolveAnnotations(Mogram parent, Mogram child) {
		parent.annotations().stream()
				.filter(a -> !a.equals(Generalization) && !child.annotations().contains(a))
				.forEach(child::addAnnotations);
	}

	private void resolveProperties(Mogram parent, Mogram child) {
		for (Property prop : parent.properties())
			if (isOverridden(child, prop)) {
				final Property childrenProp = findProperty(child, prop.name());
				if (childrenProp != null) {
					prop.overriden(childrenProp);
					childrenProp.overrides(prop);
				}
			}
	}

	private Property findProperty(Mogram child, String name) {
		for (Property variable : child.properties()) if (variable.name().equals(name)) return variable;
		return null;
	}

	private boolean isOverridden(ElementContainer child, Mogram mogram) {
		for (Mogram c : child.components())
			if (!isHasReference(c) && areNamesake(mogram, c) && mainType(c).equals(mainType(mogram))) {
				if (c instanceof MogramImpl && !c.parent().resolved()) ((MogramImpl) c).parent(mogram);
				return true;
			}
		return false;
	}

	private boolean isHasReference(Mogram component) {
		return component instanceof HasMogram && ((HasMogram) component).isHas();
	}

	private boolean isOverridden(Mogram child, Property prop) {
		return child.properties().stream()
				.anyMatch(ch -> ch.name().equals(prop.name()) && ch.type().equals(prop.type()));
	}

	private boolean areNamesake(Mogram mogram, Mogram c) {
		return c.name() != null && c.name().equals(mogram.name());
	}

	private List<Mogram> getChildrenSorted(Mogram parent) {
		List<Mogram> children = new ArrayList<>(parent.children());
		sort(children);
		return children;
	}

	private List<Mogram> sort(List<Mogram> mograms) {
		if (mograms.isEmpty()) return mograms;
		mograms.sort(inheritanceComparator());
		Collections.reverse(mograms);
		return mograms;
	}

	private Comparator<Mogram> inheritanceComparator() {
		return new Comparator<>() {
			@Override
			public int compare(Mogram o1, Mogram o2) {
				return maxLevel(o1) - maxLevel(o2);
			}

			private int maxLevel(Mogram mogram) {
				List<Integer> levels = new ArrayList<>(Collections.singletonList(0));
				levels.addAll(mogram.children().stream().map(this::maxLevel).toList());
				levels.sort(Collections.reverseOrder());
				return 1 + levels.get(0);
			}

			@Override
			public boolean equals(Object obj) {
				return false;
			}

			@Override
			public int hashCode() {
				return super.hashCode();
			}
		};
	}
}
