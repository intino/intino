package io.intino.tara.model.rules.property;

import io.intino.tara.model.Rule;

import java.util.Collections;
import java.util.List;

public class StringRule implements Rule<String> {
	private static final long serialVersionUID = 1L;
	private final String regex;

	public StringRule(String regex) {
		this.regex = regex;
	}

	@Override
	public boolean accept(String value) {
		return value.matches(regex);
	}

	@Override
	public String errorMessage() {
		return "reject.parameter.string.value.not.matches.regex";
	}

	@Override
	public List<Object> errorParameters() {
		return Collections.singletonList(regex);
	}
}
