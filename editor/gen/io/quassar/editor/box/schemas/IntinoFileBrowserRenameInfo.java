package io.quassar.editor.box.schemas;

import io.quassar.editor.box.schemas.*;

public class IntinoFileBrowserRenameInfo implements java.io.Serializable {

	private int id = 0;
	private String newName;

	public int id() {
		return this.id;
	}

	public String newName() {
		return this.newName;
	}

	public IntinoFileBrowserRenameInfo id(int id) {
		this.id = id;
		return this;
	}

	public IntinoFileBrowserRenameInfo newName(String newName) {
		this.newName = newName;
		return this;
	}
}