package io.intino.tara.model.rules.custom;

import io.intino.tara.model.Mogram;
import io.intino.tara.model.rules.MogramRule;

public class Anonymous implements MogramRule {
	private static final long serialVersionUID = 1L;
	@Override
	public boolean accept(Mogram value) {
		return value.isAnonymous();
	}

	@Override
	public String errorMessage() {
		return "Mogram must have name";
	}
}
