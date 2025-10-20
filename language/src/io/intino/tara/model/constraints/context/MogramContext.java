package io.intino.tara.model.constraints.context;

import io.intino.tara.model.Mogram;
import io.intino.tara.model.Primitive;
import io.intino.tara.model.PropertyDescription;

import java.util.List;

public class MogramContext implements EvaluationContext {
	private final Mogram mogram;

	public MogramContext(Mogram mogram) {
		this.mogram = mogram;
	}

	@Override
	public Object getProperty(String name) {
		PropertyDescription parameter = mogram.parameters().stream().filter(p -> p.name().equals(name)).findFirst().orElse(null);//change by parameters
		if (parameter != null) {
			List<Object> values = parameter.values();
			if (values.isEmpty()) return null;
			if (values.size() == 1) return mapPropertyValue(values.getFirst(), parameter);
			return values.stream().map(v -> mapPropertyValue(v, parameter)).toList();
		} else if (name.equals("self")) {
			return mogram;
		} else if (!mogram.component(name).isEmpty())
			return mogram.component(name);
		return mogram.appliedFacets().stream().filter(f -> f.type().equals(name)).findFirst().orElse(null);
	}

	private static Object mapPropertyValue(Object value, PropertyDescription property) {
		if (value instanceof Primitive.Reference reference) {
			if (reference.isEmpty()) return null;
			return property.type() == null || property.type().equals(Primitive.WORD) ? reference.get().reference() : reference.get().get();
		}
		return value;
	}

}
