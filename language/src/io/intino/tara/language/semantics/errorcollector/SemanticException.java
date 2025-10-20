package io.intino.tara.language.semantics.errorcollector;

import io.intino.tara.language.semantics.MessageProvider;
import io.intino.tara.model.Element;

import java.util.Objects;

public class SemanticException extends Exception {
	private final transient SemanticIssue issue;

	public SemanticException(SemanticIssue notification) {
		this.issue = notification;
	}

	public SemanticIssue getIssue() {
		return issue;
	}

	@Override
	public String getMessage() {
		if (issue.key() == null) return "";
		return MessageProvider.message(issue.key(), issue.parameters().toArray());
	}

	public String[] getParameters() {
		return issue.parameters().stream().filter(Objects::nonNull).map(Object::toString).toArray(String[]::new);
	}

	public boolean isFatal() {
		return level().equals(SemanticIssue.Level.ERROR);
	}

	public SemanticIssue.Level level() {
		return issue.level();
	}

	public String key() {
		return issue.key();
	}

	public Element[] origin() {
		return issue.origin();
	}
}