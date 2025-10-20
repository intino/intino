package io.intino.tara.model;

import io.intino.tara.language.semantics.errorcollector.SemanticIssue.Level;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

public interface Rule<T> extends Serializable {

	boolean accept(T value);

	default String errorMessage() {
		return "This element is not compliant with the rule " + this.getClass().getSimpleName();
	}

	default List<Object> errorParameters() {
		return Collections.emptyList();
	}

	default Level level() {
		return Level.ERROR;
	}
}
