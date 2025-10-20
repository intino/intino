package io.intino.tara.model.rules.property;

import io.intino.tara.model.Rule;
import io.intino.tara.model.Valued;

import java.util.stream.Stream;

public class DateRule implements Rule<Valued> {
	private static final long serialVersionUID = 1L;
	@Override
	public boolean accept(Valued value) {
		return values(value).allMatch(v -> v.isEmpty() || Date.parse(v) != null);
	}

	private Stream<String> values(Valued value) {
		return value.values().stream().map(Object::toString);
	}
}