package io.quassar.editor.box.schemas;

import io.quassar.editor.box.schemas.*;

public class IntinoFileBrowserMoveInfo implements java.io.Serializable {

	private int file = 0;
	private String directory;

	public int file() {
		return this.file;
	}

	public String directory() {
		return this.directory;
	}

	public IntinoFileBrowserMoveInfo file(int file) {
		this.file = file;
		return this;
	}

	public IntinoFileBrowserMoveInfo directory(String directory) {
		this.directory = directory;
		return this;
	}
}