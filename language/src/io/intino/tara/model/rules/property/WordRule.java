package io.intino.tara.model.rules.property;

import io.intino.tara.model.Primitive;
import io.intino.tara.model.Rule;
import io.intino.tara.model.Valued;

import java.util.Collections;
import java.util.List;

public class WordRule implements Rule<Valued> {
	private static final long serialVersionUID = 1L;
	private static final String REJECT_INVALID_WORD_VALUES = "reject.invalid.word.values";
	private final List<Object> parameters;
	private final List<String> words;
	private final String aClass;
	private String errorMessage;

	public WordRule(List<String> words) {
		this.words = words;
		this.aClass = null;
		this.parameters = Collections.singletonList(String.join(", ", words));
	}

	public WordRule(List<String> words, String aClass) {
		this.words = words;
		this.aClass = aClass;
		this.parameters = Collections.singletonList(String.join(", ", words));
	}

	public List<String> words() {
		return words;
	}

	public boolean isCustom() {
		return aClass != null;
	}

	public String externalClass() {
		return aClass;
	}

	@Override
	public boolean accept(Valued valued) {
		List<Object> values = valued.values();
		if (hasExpressionValue(values)) return true;
		if (!values.stream().map(v -> ((Primitive.Reference) v)).allMatch(r -> r.isEmpty() || words.contains(r.get().reference()))) {
			errorMessage = REJECT_INVALID_WORD_VALUES;
			return false;
		} else if (valued.name().equals(valued.container().name())) {
			errorMessage = "reject.invalid.word.name";
			return false;
		} else if (words().isEmpty()) {
			errorMessage = "reject.invalid.word.names";
			return false;
		}
		return true;
	}

	@Override
	public String errorMessage() {
		return errorMessage;
	}

	@Override
	public List<Object> errorParameters() {
		return parameters;
	}

	private boolean hasExpressionValue(List<Object> values) {
		return !values.isEmpty() && (values.get(0) instanceof Primitive.Expression || values.get(0) instanceof Primitive.MethodReference);
	}
}