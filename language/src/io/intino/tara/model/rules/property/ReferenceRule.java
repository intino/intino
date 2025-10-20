package io.intino.tara.model.rules.property;

import io.intino.tara.model.*;
import io.intino.tara.processors.model.ReferenceProperty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ReferenceRule implements Rule<Valued> {
	private static final long serialVersionUID = 1L;
	private final List<String> allowedTypes = new ArrayList<>();
	private String errorMessage = "reject.property.reference";

	public ReferenceRule(Collection<String> allowedTypes) {
		for (String ref : allowedTypes) {
			if (!this.allowedTypes.contains(ref)) this.allowedTypes.add(ref);
			Arrays.stream(ref.split(":")).filter(r -> !this.allowedTypes.contains(r)).forEach(this.allowedTypes::add);
		}
	}

	@Override
	public boolean accept(Valued valued) {
		var values = valued.values().stream().filter(v -> v instanceof Primitive.Reference).map(v -> ((Primitive.Reference) v)).toList();
		if (values.isEmpty() && !valued.values().isEmpty()) return false;
		if (values.stream().allMatch(Primitive.Reference::isEmpty)) return true;
		if (valued instanceof Property p) {
			if (hasCorrectReferenceValues(p)) {
				this.errorMessage = "reject.default.value.reference.property";
				return false;
			}
			if (valued instanceof ReferenceProperty r && r.target().resolved() && r.target().get().level() == Level.M1) {
				errorMessage = "reject.default.value.reference.to.m1.mogram";
				return false;
			}
		}
		boolean b = values.stream()
				.map(Primitive.Reference::get)
				.filter(NamedReference::resolved)
				.flatMap(target -> target.get().types().stream())
				.anyMatch(type -> allowedTypes.contains(type) ||
						allowedTypes.contains(type.split(":")[0]));
		return b;
	}


	private boolean hasCorrectReferenceValues(Property prop) {
		return prop.values().stream()
				.allMatch(value -> value instanceof EmptyMogram || hasM1Value(prop.values()) || hasExpressionValue(prop.values()));
	}


	private boolean hasM1Value(List<Object> values) {
		return !values.isEmpty() && asPrimitiveReference(values) || asMogram(values);
	}

	private boolean asMogram(List<Object> values) {
		return values.get(0) instanceof Mogram && (((Mogram) values.get(0)).level() == Level.M1);
	}

	private boolean asPrimitiveReference(List<Object> values) {
		return values.get(0) instanceof Primitive.Reference && (((Primitive.Reference) values.get(0)).get().referent().level() == Level.M1);
	}

	private boolean hasExpressionValue(List<Object> values) {
		return !values.isEmpty() && (values.get(0) instanceof Primitive.Expression || values.get(0) instanceof Primitive.MethodReference);
	}

	public List<String> allowedReferences() {
		return new ArrayList<>(allowedTypes);
	}

	public void setAllowedTypes(List<String> allowedTypes) {
		this.allowedTypes.clear();
		this.allowedTypes.addAll(allowedTypes);
	}

	@Override
	public String toString() {
		return String.join(", ", allowedTypes);
	}

	@Override
	public List<Object> errorParameters() {
		return List.of(toString());
	}

	@Override
	public String errorMessage() {
		return errorMessage;
	}
}
