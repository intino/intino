package io.intino.tara.model;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;

import static io.intino.tara.model.Primitive.DOUBLE;
import static io.intino.tara.model.Primitive.RESOURCE;

public interface Valued extends Element, Sized {

	default List<Object> makeUp(File resourcesRoot, Primitive type, List<Object> values) {
		if (!values.isEmpty() && values.get(0) instanceof Primitive.Expression) return values;
		if (type != null && type.equals(RESOURCE) && isAcceptedValue(values))
			return values.stream().
					map(o -> o instanceof EmptyMogram ? null : new File(resourcesRoot, o.toString())).
					collect(Collectors.toList());
		if (type != null && type.equals(DOUBLE))
			return values.stream().map(o -> o instanceof Integer ? ((Integer) o).doubleValue() : o).collect(Collectors.toList());
		return values;
	}

	default boolean isAcceptedValue(List<Object> values) {
		return values.isEmpty() || values.get(0) instanceof String;
	}

	String name();

	Primitive type();

	List<Rule<?>> rules();

	default <T> T rule(Class<T> aClass) {
		return (T) rules().stream().filter(aClass::isInstance).findFirst().orElse(null);
	}

	void add(Rule<?> rule);

	Mogram container();

	List<Object> values();

	@Override
	default int size() {
		return values().size();
	}

	String metric();

	default List<Object> originalValues() {
		return values();
	}

	boolean isMultiple();

	void values(List<Object> objects);
}