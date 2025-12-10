package io.quassar.editor.box.schemas;

import io.quassar.editor.box.schemas.*;

public class IntinoDslEditorFileContent implements java.io.Serializable {

	private String file;
	private String content;

	public String file() {
		return this.file;
	}

	public String content() {
		return this.content;
	}

	public IntinoDslEditorFileContent file(String file) {
		this.file = file;
		return this;
	}

	public IntinoDslEditorFileContent content(String content) {
		this.content = content;
		return this;
	}
}