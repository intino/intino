package io.intino.tara.model.rules.property;

import java.util.Collections;
import java.util.List;

public class NativeReferenceRule extends FunctionRule {
	private static final long serialVersionUID = 1L;
	private final List<String> allowedReferences;

	public NativeReferenceRule(List<String> allowedReferences) {
		super("", "", Collections.emptyList());
		this.allowedReferences = allowedReferences;
	}

	public List<String> allowedTypes() {
		return allowedReferences;
	}

	@Override
	public String toString() {
		return "NativeReferenceRule{" + String.join(",", allowedReferences) + '}';
	}
}
