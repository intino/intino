package io.intino.tara.processors;

import io.intino.tara.Language;
import io.intino.tara.language.semantics.Constraint;
import io.intino.tara.language.semantics.errorcollector.SemanticException;
import io.intino.tara.language.semantics.errorcollector.SemanticFatalException;
import io.intino.tara.language.semantics.errorcollector.SemanticIssue;
import io.intino.tara.model.Element;
import io.intino.tara.model.ElementContainer;
import io.intino.tara.model.Mogram;
import io.intino.tara.model.rules.Size;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static io.intino.tara.language.semantics.constraints.FacetConstraint.findFacet;
import static io.intino.tara.language.semantics.errorcollector.SemanticIssue.Level.ERROR;
import static io.intino.tara.processors.Resolver.mainType;
import static java.util.Collections.singletonList;

public class Checker {
	private final Language language;
	private final List<SemanticException> exceptions = new ArrayList<>();

	public Checker(Language language) {
		this.language = language;
	}

	public void check(ElementContainer mogram) throws SemanticFatalException {
		exceptions.clear();
		checkConstraints(mogram);
		if (!exceptions.isEmpty()) {
			recoverErrors();
			if (!exceptions.isEmpty()) throw new SemanticFatalException(exceptions);
		}
	}

	private void recoverErrors() {
		exceptions.removeAll(exceptions.stream().filter(e -> e.getIssue().key().equals("required.parameter.in.context") && isParameterNotFoundRecoverable(e.getIssue().origin()[0], e.getIssue().parameters().get(0).toString(), e.getIssue().parameters().get(1).toString())).toList());
	}

	private boolean isParameterNotFoundRecoverable(Element element, String name, String type) {
		final Mogram mogram = (Mogram) element;
		if (language == null || mogram == null || mainType(mogram) == null) return false;
		final List<Constraint.Facet> facets = language.constraints(mainType(mogram)).stream().filter(c -> sameFacet(mogram, c)).map(c -> (Constraint.Facet) c).toList();
		for (Constraint.Facet facet : facets)
			for (Constraint.Property c : facet.constraints().stream().filter(c -> c instanceof Constraint.Property).map(p -> (Constraint.Property) p).toList())
				if (c.type().name().equalsIgnoreCase(type) && c.name().equals(name) && !size(c).isRequired())
					return true;
		return false;
	}

	private Size size(Constraint.Property c) {
		return c.rules().stream().filter(r -> r instanceof Size).map(r -> (Size) r).findFirst().orElse(null);
	}

	private boolean sameFacet(Mogram mogram, Constraint c) {
		return c instanceof Constraint.Facet && findFacet(mogram, ((Constraint.Facet) c).type()) != null;
	}

	private void checkConstraints(ElementContainer m) throws SemanticFatalException {
		if (m == null) throw new SemanticFatalException(new SemanticIssue(ERROR, "Mogram is null", (Element) null));
		checkMogramConstrains(m);
	}

	private void checkMogramConstrains(ElementContainer elementContainer) throws SemanticFatalException {
		Collection<Constraint> constraints = language.constraints(mainType(elementContainer));
		if (constraints == null)
			throw new SemanticFatalException(new SemanticIssue(ERROR, "reject.type.not.exists", elementContainer, singletonList(presentableType(mainType(elementContainer)))));
		else for (Constraint constraint : constraints)
			try {
				constraint.check(elementContainer);
			} catch (SemanticException e) {
				exceptions.add(e);
			}
	}

	private String presentableType(String type) {
		return type.replaceFirst(":", " on ");
	}
}