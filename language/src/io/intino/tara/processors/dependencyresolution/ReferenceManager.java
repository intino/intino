package io.intino.tara.processors.dependencyresolution;

import io.intino.tara.model.*;
import io.intino.tara.model.constraints.Constraint;
import io.intino.tara.processors.model.HasMogram;
import io.intino.tara.processors.model.MogramImpl;
import io.intino.tara.processors.model.ReferenceProperty;

import java.io.File;
import java.net.URI;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ReferenceManager {
	private final MogramRoot model;

	ReferenceManager(MogramRoot model) {
		this.model = model;
	}

	public Mogram resolve(HasMogram reference) {
		return resolve(reference.target(), reference.container());
	}

	Mogram resolve(ReferenceProperty property, Mogram container) {
		Mogram result = resolve(property.target(), container);
		return result instanceof HasMogram ? ((HasMogram) result).target().get() : (MogramImpl) result;
	}

	Mogram resolvePropReference(Primitive.Reference value, Mogram mogram) {
		String[] path = value.get().reference().split("\\.");
		List<Mogram> roots = findRoots(mogram, path).stream().filter(n -> !n.equals(mogram)).collect(Collectors.toList());
		return selectFromOptions(mogram, path, roots);
	}

	Mogram resolve(NamedReference<Mogram> reference, Mogram context) {
		String[] path = reference.reference().split("\\.");
		Collection<Mogram> roots = findRoots(context, path);
		return selectFromOptions(context, path, roots);
	}

	Constraint resolve(NamedReference<Constraint> reference) {
		return model.constraints().stream().filter(c -> c.name().equals(reference.reference())).findFirst().orElse(null);
	}

	Mogram resolveParent(String reference, ElementContainer mogram) {
		return resolve(reference.split("\\."), searchPossibleRoots(mogram, reference.split("\\.")[0], true));
	}

	private Mogram selectFromOptions(Mogram mogram, String[] path, Collection<Mogram> roots) {
		return resolve(path, sortRootsByFile(roots, mogram.source()));
	}

	private Collection<Mogram> sortRootsByFile(Collection<Mogram> roots, URI uri) {
		List<Mogram> mograms = roots.stream().filter(node -> node.source().equals(uri)).collect(Collectors.toList());
		roots.stream().filter(root -> !mograms.contains(root)).forEach(mograms::add);
		return mograms;
	}

	private Collection<Mogram> findRoots(Mogram mogram, String[] path) {
		Collection<Mogram> roots = searchPossibleRoots(mogram, path[0], false);
		if (!roots.isEmpty()) return roots;
		for (Mogram root : model.mograms())
			if (getNameWithoutExtension(new File(root.source().getPath()).getName()).equals(path[0])) {
				if (path.length == 1) continue;
				roots = searchPossibleRoots(root, path[1], false);
				break;
			}
		return roots;
	}

	private Mogram resolve(String[] path, Collection<Mogram> roots) {
		if (roots.isEmpty()) return null;
		if (roots.size() == 1 && path.length == 1) return roots.iterator().next();
		for (Mogram root : roots) {
			Mogram candidate = resolvePathInMogram(path, root);
			if (candidate != null) return candidate;
		}
		return null;
	}

	public static Mogram resolvePathInMogram(String[] path, Mogram mogram) {
		Mogram reference = null;
		for (String name : path) {
			if (reference == null) {
				reference = areNamesake(mogram, name) ? mogram : null;
				continue;
			}
			final List<Mogram> containedMograms = reference.mograms().stream().filter(m -> m.name().equals(name)).toList();
			if (containedMograms.isEmpty() && reference.parent() != null)
				reference = reference.parent().get().mograms().stream().filter(m -> m.name().equals(name)).findFirst().orElse(null);
			else reference = containedMograms.isEmpty() ? null : containedMograms.get(0);
			if (reference == null) return null;
		}
		return reference;
	}

	private Collection<Mogram> searchPossibleRoots(ElementContainer mogram, String name, boolean parent) {
		Set<Mogram> set = new LinkedHashSet<>();
		if (mogram instanceof MogramImpl && areNamesake((Mogram) mogram, name)) set.add((Mogram) mogram);
		addInContext(name, set, mogram, parent);
		addMogramSiblings(name, mogram, set);
		addRoots(name, set);
		return set;
	}

	private void addRoots(String name, Set<Mogram> set) {
		set.addAll(model.mograms().stream().
				filter(node -> areNamesake(node, name)).
				toList());
	}

	private void addMogramSiblings(String identifier, ElementContainer container, Set<Mogram> set) {
		if (container == null) return;
		set.addAll(container.mograms().stream().filter(node -> areNamesake(node, identifier)).toList());
	}

	private void addInContext(String name, Set<Mogram> set, ElementContainer mogram, boolean parent) {
		checkSiblings(name, set, mogram);
		ElementContainer container = mogram.container();
		while (container != null) {
			if (container instanceof MogramImpl && areNamesake((Mogram) container, name)) set.add((Mogram) container);
			checkSiblings(name, set, container);
			container = container.container();
			if (parent && (mogram instanceof Mogram m)) {
				final NamedReference<Mogram> parentMogram = m.parent();
				if (parentMogram != null && parentMogram.resolved())
					collectParentElements(name, set, container, parentMogram.get());
			}
		}
	}

	private void checkSiblings(String name, Set<Mogram> set, ElementContainer container) {
		container.siblings().stream()
				.filter(sibling -> sibling instanceof MogramImpl && areNamesake(sibling, name))
				.forEach(set::add);
	}

	private void collectParentElements(String identifier, Set<Mogram> set, ElementContainer container, Mogram parent) {
		set.addAll(parent.mograms().stream().
				filter(sibling -> areNamesake(sibling, identifier) && !sibling.equals(container)).
				toList());
	}

	public static String getNameWithoutExtension(String name) {
		int i = name.lastIndexOf('.');
		if (i != -1) name = name.substring(0, i);
		return name;
	}

	private static boolean areNamesake(Mogram mogram, String name) {
		return name.equals(mogram.name());
	}
}