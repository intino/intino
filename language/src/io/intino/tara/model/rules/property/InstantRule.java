package io.intino.tara.model.rules.property;

import io.intino.tara.model.Primitive;
import io.intino.tara.model.Rule;
import io.intino.tara.model.Valued;

import java.time.Instant;
import java.util.stream.Stream;

public class InstantRule implements Rule<Valued> {
	private static final long serialVersionUID = 1L;
	@Override
	public boolean accept(Valued valued) {
		return values(valued).allMatch(v -> {
			try {
				Instant.parse(v);
			} catch (Exception e) {
				return false;
			}
			return true;
		});
	}

	private Stream<String> values(Valued value) {
		return value.values().stream()
				.filter(v -> !(v instanceof Primitive.Reference r) || !r.isEmpty())
				.map(Object::toString);
	}

	@Override
	public String errorMessage() {
		return "Instant value must have ISO_INSTANT format";
	}
}