package io.intino.tara.language.semantics.constraints;

import io.intino.tara.language.semantics.Constraint;
import io.intino.tara.language.semantics.errorcollector.SemanticException;
import io.intino.tara.language.semantics.errorcollector.SemanticIssue;
import io.intino.tara.model.Element;
import io.intino.tara.model.Mogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static io.intino.tara.language.semantics.errorcollector.SemanticIssue.Level.ERROR;
import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;

public class FacetConstraint implements Constraint.Facet {
	private final String type;
	private final boolean terminal;
	private final boolean required;
	private final String[] with;
	private final String[] withOut;
	private final List<Constraint> constraints;

	FacetConstraint(String type, boolean terminal, boolean required, String[] with, String[] withOut) {
		this.type = type;
		this.terminal = terminal;
		this.required = required;
		this.with = with.clone();
		this.withOut = withOut.clone();
		constraints = new ArrayList<>();
	}

	@Override
	public String type() {
		return type;
	}

	@Override
	public String[] with() {
		return with;
	}

	@Override
	public boolean isRequired() {
		return required;
	}

	@Override
	public String[] withOut() {
		return withOut;
	}

	public boolean terminal() {
		return terminal;
	}

	@Override
	public List<Constraint> constraints() {
		return constraints;
	}

	@Override
	public Constraint.Facet has(Constraint... requires) {
		this.constraints.addAll(asList(requires));
		return this;
	}

	@Override
	public void check(Element element) throws SemanticException {
		Mogram mogram = (Mogram) element;
		io.intino.tara.model.Facet facet = findFacet(mogram, this.type);
		if (facet == null && required)
			throw new SemanticException(new SemanticIssue(ERROR, "reject.mogram.with.required.facet.not.found", mogram, singletonList(this.type)));
		if (facet == null) return;
		final boolean hasType = is(mogram.types(), with);
		final boolean hasIncompatibles = isAny(mogram.types(), withOut);
		if (!hasType || hasIncompatibles || !checkFacetConstrains(mogram)) {
			if (!hasType)
				throw new SemanticException(new SemanticIssue(ERROR, "reject.facet.with.no.constrains.in.context", facet, Arrays.asList(this.with)));
			else if (hasIncompatibles)
				throw new SemanticException(new SemanticIssue(ERROR, "reject.incompatible.facets.in.context", facet, singletonList(String.join(", ", Arrays.asList(this.withOut)))));
		}
	}

	public static io.intino.tara.model.Facet findFacet(Mogram mogram, String type) {
		return mogram.appliedFacets().stream().filter(facet -> type.equals(facet.fullType())).findFirst().orElse(null);
	}

	private boolean is(List<String> nodeTypes, String[] constraints) {
		List<String> types = nodeTypes.stream().map(s -> s.split(":")[0]).toList();
		return constraints == null || Arrays.stream(constraints).allMatch(types::contains);
	}

	private boolean isAny(List<String> nodeTypes, String[] constraints) {
		List<String> types = nodeTypes.stream().map(s -> s.split(":")[0]).toList();
		return constraints != null && Arrays.stream(constraints).anyMatch(aType -> types.contains(aType) && !aType.equals(this.type));
	}

	private boolean checkFacetConstrains(Mogram mogram) throws SemanticException {
		List<SemanticException> messages = new ArrayList<>();
		for (Constraint c : constraints)
			try {
				c.check(mogram);
			} catch (SemanticException e) {
				if (e.level() == ERROR) throw e;
				else messages.add(e);
			}
		if (!messages.isEmpty()) throw messages.get(0);
		return true;
	}

	@Override
	public String toString() {
		return "Facet " + type;
	}
}
