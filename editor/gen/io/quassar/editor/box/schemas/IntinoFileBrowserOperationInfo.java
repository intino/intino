package io.quassar.editor.box.schemas;

import io.quassar.editor.box.schemas.*;

public class IntinoFileBrowserOperationInfo implements java.io.Serializable {

	private String operation;
	private int target = 0;

	public String operation() {
		return this.operation;
	}

	public int target() {
		return this.target;
	}

	public IntinoFileBrowserOperationInfo operation(String operation) {
		this.operation = operation;
		return this;
	}

	public IntinoFileBrowserOperationInfo target(int target) {
		this.target = target;
		return this;
	}
}