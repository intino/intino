package io.quassar.editor.box.schemas;

import io.quassar.editor.box.schemas.*;

public class IntinoFileBrowserOperationShortcut implements java.io.Serializable {

	private Boolean ctrlKey = false;
	private Boolean shiftKey = false;
	private Boolean altKey = false;
	private String key;

	public Boolean ctrlKey() {
		return this.ctrlKey;
	}

	public Boolean shiftKey() {
		return this.shiftKey;
	}

	public Boolean altKey() {
		return this.altKey;
	}

	public String key() {
		return this.key;
	}

	public IntinoFileBrowserOperationShortcut ctrlKey(Boolean ctrlKey) {
		this.ctrlKey = ctrlKey;
		return this;
	}

	public IntinoFileBrowserOperationShortcut shiftKey(Boolean shiftKey) {
		this.shiftKey = shiftKey;
		return this;
	}

	public IntinoFileBrowserOperationShortcut altKey(Boolean altKey) {
		this.altKey = altKey;
		return this;
	}

	public IntinoFileBrowserOperationShortcut key(String key) {
		this.key = key;
		return this;
	}
}