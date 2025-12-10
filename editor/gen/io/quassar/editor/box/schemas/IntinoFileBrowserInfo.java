package io.quassar.editor.box.schemas;

import io.quassar.editor.box.schemas.*;

public class IntinoFileBrowserInfo implements java.io.Serializable {

	private String itemAddress;
	private String rootItem;
	private Boolean hideExtension = false;
	private Boolean historyEnabled = false;
	private java.util.List<IntinoFileBrowserItem> items = new java.util.ArrayList<>();
	private java.util.List<IntinoFileBrowserOperation> operations = new java.util.ArrayList<>();

	public String itemAddress() {
		return this.itemAddress;
	}

	public String rootItem() {
		return this.rootItem;
	}

	public Boolean hideExtension() {
		return this.hideExtension;
	}

	public Boolean historyEnabled() {
		return this.historyEnabled;
	}

	public java.util.List<IntinoFileBrowserItem> items() {
		return this.items;
	}

	public java.util.List<IntinoFileBrowserOperation> operations() {
		return this.operations;
	}

	public IntinoFileBrowserInfo itemAddress(String itemAddress) {
		this.itemAddress = itemAddress;
		return this;
	}

	public IntinoFileBrowserInfo rootItem(String rootItem) {
		this.rootItem = rootItem;
		return this;
	}

	public IntinoFileBrowserInfo hideExtension(Boolean hideExtension) {
		this.hideExtension = hideExtension;
		return this;
	}

	public IntinoFileBrowserInfo historyEnabled(Boolean historyEnabled) {
		this.historyEnabled = historyEnabled;
		return this;
	}

	public IntinoFileBrowserInfo items(java.util.List<IntinoFileBrowserItem> items) {
		this.items = items;
		return this;
	}

	public IntinoFileBrowserInfo operations(java.util.List<IntinoFileBrowserOperation> operations) {
		this.operations = operations;
		return this;
	}
}