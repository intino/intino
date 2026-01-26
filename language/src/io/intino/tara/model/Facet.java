package io.intino.tara.model;

public interface Facet extends Parametrized, Element {

	String type();

	NamedReference<Mogram> definition();//TODO merge with type

	void fullType(String s);

	String fullType();

	NamedReference<Mogram> target();
}
