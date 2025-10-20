package io.intino.tara.model.rules.property;

import java.util.Collections;
import java.util.List;

public class NativeWordRule extends FunctionRule {
	private static final long serialVersionUID = 1L;
	private final List<String> words;

	public NativeWordRule(List<String> words) {
		super("", "", Collections.emptyList());
		this.words = words;
	}

	public List<String> words() {
		return words;
	}


	@Override
	public String toString() {
		return "NativeWordRule{" + String.join(",", words) + '}';
	}
}
