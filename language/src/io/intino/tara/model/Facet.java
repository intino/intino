package io.intino.tara.model;

import java.util.List;

public interface Facet extends Parametrized, Element {

	String type();

	NamedReference<Mogram> definition();//TODO merge with type

	void fullType(String s);

	String fullType();

	List<PropertyDescription> parameters();

	NamedReference<Mogram> target();
}
