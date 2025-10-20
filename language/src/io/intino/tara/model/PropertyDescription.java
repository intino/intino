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

	boolean isMultiple();

	void multiple(boolean multiple);

	int position();

	List<Rule<?>> rules();

	void add(Rule<?> rule);

	void scope(String scope);

	String scope();

	String metric();

	void metric(String metric);

	void substituteValues(List<?> newValues);

	String getUID();
}
