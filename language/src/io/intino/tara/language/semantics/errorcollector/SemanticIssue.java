package io.intino.tara.language.semantics.errorcollector;

import io.intino.tara.model.Element;

import java.util.Collections;
import java.util.List;

public class SemanticIssue {
	public enum Level {INFO, WARNING, RECOVERABLE_ERROR, ERROR}
	private final Level level;
	private final String tag;
	private final List<?> parameters;
	private final Element[] origin;

	public SemanticIssue(Level level, String tag, Element origin) {
		this(level, tag, origin, Collections.emptyList());
	}

	public SemanticIssue(Level level, String tag, Element origin, List<?> parameters) {
		this.level = level;
		this.tag = tag;
		this.origin = new Element[]{origin};
		this.parameters = parameters;
	}

	public SemanticIssue(Level level, String tag, Element[] origin) {
		this(level, tag, origin, Collections.emptyList());
	}

	public SemanticIssue(Level level, String tag, Element[] origin, List<?> parameters) {
		this.level = level;
		this.tag = tag;
		this.origin = origin;
		this.parameters = parameters;
	}

	public Level level() {
		return level;
	}

	public String key() {
		return tag;
	}

	public List<?> parameters() {
		return parameters;
	}

	public Element[] origin() {
		return origin;
	}
}