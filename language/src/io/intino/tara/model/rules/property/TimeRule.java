package io.intino.tara.model.rules.property;

import io.intino.tara.model.Rule;
import io.intino.tara.model.Valued;

import java.time.LocalTime;
import java.util.stream.Stream;

public class TimeRule implements Rule<Valued> {
	private static final long serialVersionUID = 1L;
	@Override
	public boolean accept(Valued valued) {
		return values(valued).allMatch(time -> {
			if (time.isEmpty()) return true;
			try {
				LocalTime.parse(time);
			} catch (Exception e) {
				return false;
			}
			return true;
		});
	}

	private Stream<String> values(Valued value) {
		return value.values().stream().map(Object::toString);
	}

	@Override
	public String errorMessage() {
		return "Time must match ISO pattern";
	}
}
