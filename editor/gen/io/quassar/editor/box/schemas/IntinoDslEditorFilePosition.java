package io.quassar.editor.box.schemas;

import io.quassar.editor.box.schemas.*;

public class IntinoDslEditorFilePosition implements java.io.Serializable {

	private int line = 0;
	private int column = 0;

	public int line() {
		return this.line;
	}

	public int column() {
		return this.column;
	}

	public IntinoDslEditorFilePosition line(int line) {
		this.line = line;
		return this;
	}

	public IntinoDslEditorFilePosition column(int column) {
		this.column = column;
		return this;
	}
}