package io.intino.tara.model;

import java.util.Collections;
import java.util.List;

public interface Mogram extends Parametrized, ElementContainer {
	String ANONYMOUS = "anonymous@";

	String name();

	void name(String name);

	Level level();

	void level(Level level);

	List<String> types();

	void type(String type);

	String qualifiedName();

	ElementContainer container();

	boolean isSub();

	List<NamedReference<Mogram>> applicableFacets();

	void addApplicableFacet(Mogram mogram);

	NamedReference<Mogram> facetPrescription();

	void facetPrescription(String reference);

	void facetPrescription(Mogram mogram);

	default List<FacetConstraint> facetConstraints() {
		return Collections.emptyList();
	}

	List<Facet> appliedFacets();

	boolean is(Annotation annotation);

	List<Annotation> annotations();

	void addAnnotations(Annotation... annotations);

	NamedReference<Mogram> parent();

	Mogram overrides();

	void overrides(Mogram component);

	void overridenBy(Mogram child);

	boolean isAnonymous();

	List<Mogram> metaMograms();

	void addMetaMogram(Mogram mogram);

	List<Property> properties();

	List<Mogram> children();

	List<Mogram> subs();

	List<Mogram> facets();

	default void addUses(List<String> imports) {
	}

	default <T extends Mogram> void addChild(T node) {
	}

	default void applyFacet(Facet facet) {
	}

	@Override
	String toString();

	@Override
	boolean equals(Object obj);

	@Override
	int hashCode();

	default String shortType() {
		return types().get(0).contains(".") ? types().get(0).substring(types().get(0).lastIndexOf(".")) : types().get(0);
	}

	interface FacetConstraint extends MogramReference {
		NamedReference<Mogram> target();

		boolean negated();
	}
}