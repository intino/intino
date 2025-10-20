package io.intino.tara.model.rules.custom;

import io.intino.tara.model.rules.Size;

public class Required extends Size {
	private static final long serialVersionUID = 1L;
	public Required() {
		super(1, Integer.MAX_VALUE);
	}
}
