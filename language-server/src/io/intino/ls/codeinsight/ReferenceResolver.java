package io.intino.ls.codeinsight;

import io.intino.ls.ModelUnit;
import io.intino.ls.codeinsight.completion.TreeUtils;
import io.intino.tara.Language;
import io.intino.tara.language.grammar.TaraGrammar;
import io.intino.tara.model.*;
import io.intino.tara.processors.model.MogramImpl;
import org.eclipse.lsp4j.Position;

import java.io.File;
import java.net.URI;
import java.util.*;
import java.util.stream.Collectors;

public class ReferenceResolver {
	private final Map<URI, ModelUnit> models;
	private final Language language;
	private final ModelUnit source;

	public ReferenceResolver(Map<URI, ModelUnit> models, ModelUnit source, Language language) {
		this.source = source;
		this.models = models;
		this.language = language;
	}

	public ReferenceResolver(Map<URI, ModelUnit> models, Language language) {
		this.models = models;
		this.source = models.isEmpty() ? null : models.values().iterator().next();
		this.language = language;
	}

	public Element resolve(Mogram mogram, List<TaraGrammar.IdentifierKeyContext> identifiers) {
		if (TreeUtils.contextByType(identifiers.getFirst(), TaraGrammar.RuleValueContext.class) != null)
			return models.values().stream().flatMap(m -> m.model().constraints().stream()).filter(c -> c.name().equals(identifiers.getFirst().getText())).findFirst().orElse(null);
		return resolve(mogram, identifiers.stream().map(p -> p.getText()).toArray(String[]::new));
	}

	public Mogram resolve(Mogram mogram, String[] path) {
		return selectFromOptions(mogram, path, findRoots(mogram, path));
	}

	private Mogram selectFromOptions(Mogram mogram, String[] path, Collection<Mogram> roots) {
		return resolve(path, sortRootsByFile(roots, mogram.source()));
	}

	private Collection<Mogram> sortRootsByFile(Collection<Mogram> roots, URI uri) {
		List<Mogram> mograms = roots.stream().filter(node -> node.source().equals(uri)).collect(Collectors.toList());
		roots.stream().filter(root -> !mograms.contains(root)).forEach(mograms::add);
		return mograms;
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

	private Mogram resolvePathInMogram(String[] path, Mogram mogram) {
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

	public Element resolveToDeclaration(URI referenceUri, Position referencePosition) {
		ModelUnit modelUnit = models.get(referenceUri);
		if (modelUnit == null) return null;
		Element rerefenceElement = findMogramContainingToken(modelUnit.model(), referencePosition);
		if (rerefenceElement == null) return null;
		if (rerefenceElement instanceof MogramReference m) {
			if (m.target().resolved()) return m.target().get();
		}
		return null;
	}

	public static Element findMogramContainingToken(Element element, Position position) {
		if (isInRange(element, position)) {
			if (element instanceof ElementContainer ec)
				for (Element e : ec.elements()) {
					Element result = findMogramContainingToken(e, position);
					if (result != null) return result;
				}
			if (element instanceof MogramReference mr) return element;
		}
		return null;
	}

	private static boolean isInRange(Element mogram, Position position) {
		return mogram != null && mogram.textRange().startLine() <= position.getLine() && position.getLine() <= mogram.textRange().endLine();
	}

	private Collection<Mogram> findRoots(Mogram mogram, String[] path) {
		Collection<Mogram> roots = searchPossibleRoots(mogram, path[0], false);
		if (!roots.isEmpty()) return roots;
		for (Mogram root : source.model().mograms())
			if (getNameWithoutExtension(new File(root.source().getPath()).getName()).equals(path[0])) {
				if (path.length == 1) continue;
				roots = searchPossibleRoots(root, path[1], false);
				break;
			}
		return roots;
	}

	private Collection<Mogram> searchPossibleRoots(ElementContainer mogram, String name, boolean parent) {
		Set<Mogram> set = new LinkedHashSet<>();
		if (mogram instanceof MogramImpl && areNamesake((Mogram) mogram, name)) set.add((Mogram) mogram);
		addInContext(name, set, mogram, parent);
		addMogramSiblings(name, mogram, set);
		addRoots(name, set);
		return set;
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

	private void addRoots(String name, Set<Mogram> set) {
		if (source.model() == null) return;
		set.addAll(source.model().mograms().stream().
				filter(node -> areNamesake(node, name)).
				toList());
	}

	private void addMogramSiblings(String identifier, ElementContainer container, Set<Mogram> set) {
		if (container == null) return;
		set.addAll(container.mograms().stream().filter(node -> areNamesake(node, identifier)).toList());
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

	private boolean areNamesake(Mogram mogram, String name) {
		return name.equals(mogram.name());
	}
}