package io.quassar.editor.box.schemas;

import io.quassar.editor.box.schemas.*;

public class IntinoFileBrowserOperation implements java.io.Serializable {

	private String name;
	private IntinoFileBrowserOperationShortcut shortcut;
	private Boolean enabled = false;

	public String name() {
		return this.name;
	}

	public IntinoFileBrowserOperationShortcut shortcut() {
		return this.shortcut;
	}

	public Boolean enabled() {
		return this.enabled;
	}

	public IntinoFileBrowserOperation name(String name) {
		this.name = name;
		return this;
	}

	public IntinoFileBrowserOperation shortcut(IntinoFileBrowserOperationShortcut shortcut) {
		this.shortcut = shortcut;
		return this;
	}

	public IntinoFileBrowserOperation enabled(Boolean enabled) {
		this.enabled = enabled;
		return this;
	}
}