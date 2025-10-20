package io.intino.tara.model;

import java.util.List;

public interface Parametrized {
	List<PropertyDescription> parameters();

	default void addParameter(String name, String facet, int position, String extension, Element.TextRange range, List<Object> values) {
	}
}