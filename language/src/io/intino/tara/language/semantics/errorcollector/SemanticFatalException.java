package io.intino.tara.language.semantics.errorcollector;

import java.util.Collections;
import java.util.List;

public class SemanticFatalException extends Exception {

	private final List<SemanticException> exceptions;

	public SemanticFatalException(List<SemanticException> exceptions) {
		this.exceptions = exceptions;
	}

	public SemanticFatalException(SemanticIssue notification) {
		this.exceptions = Collections.singletonList(new SemanticException(notification));
	}

	public List<SemanticException> exceptions() {
		return exceptions;
	}
}
