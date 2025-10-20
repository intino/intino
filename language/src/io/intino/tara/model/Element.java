package io.intino.tara.model;

import java.io.Serializable;
import java.net.URI;

public interface Element extends Serializable {

	URI source();

	default void source(URI uri) {
		throw new UnsupportedOperationException();
	}

	int line();

	default void line(int line) {
		throw new UnsupportedOperationException();
	}

	TextRange textRange();

	default String languageName() {
		return null;
	}

	default void languageName(String language) {
	}

	record TextRange(int start, int end, int startLine, int startLineLength, int startColumn, int endLine,
					 int endColumn) implements Serializable {
	}

	String doc();

	default void doc(String doc) {
	}

}
