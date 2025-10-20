package io.intino.tara.model.rules.custom;


import io.intino.tara.model.Rule;

import java.util.List;

public class Url implements Rule<List<String>> {
	private static final long serialVersionUID = 1L;
	private String REGEX = "^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";



	@Override
	public boolean accept(List<String> values) {
		for (String value : values)
			if (!value.isEmpty() && !value.matches(REGEX)) return false;
		return true;
	}

	@Override
	public String errorMessage() {
		return "URL does not have valid pattern";
	}
}
