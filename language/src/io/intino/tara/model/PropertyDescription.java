package io.intino.tara.model;


import java.util.List;

public interface PropertyDescription extends Valued {

	String name();

	void name(String name);

	void type(Primitive type);

	String facet();

	void facet(String facet);

	Property definition();

	void definition(Property property);


	int position();

	void scope(String scope);

	String scope();

	void metric(String metric);

	void substituteValues(List<?> newValues);

	String getUID();
}
