package io.quassar.editor.box.schemas;

import io.quassar.editor.box.schemas.*;

public class IntinoDslEditorSetup implements java.io.Serializable {

	private String dslName;
	private String modelName;
	private String modelRelease;
	private String fileAddress;
	private Boolean readonly = false;
	private java.util.List<IntinoDslEditorFile> files = new java.util.ArrayList<>();

	public String dslName() {
		return this.dslName;
	}

	public String modelName() {
		return this.modelName;
	}

	public String modelRelease() {
		return this.modelRelease;
	}

	public String fileAddress() {
		return this.fileAddress;
	}

	public Boolean readonly() {
		return this.readonly;
	}

	public java.util.List<IntinoDslEditorFile> files() {
		return this.files;
	}

	public IntinoDslEditorSetup dslName(String dslName) {
		this.dslName = dslName;
		return this;
	}

	public IntinoDslEditorSetup modelName(String modelName) {
		this.modelName = modelName;
		return this;
	}

	public IntinoDslEditorSetup modelRelease(String modelRelease) {
		this.modelRelease = modelRelease;
		return this;
	}

	public IntinoDslEditorSetup fileAddress(String fileAddress) {
		this.fileAddress = fileAddress;
		return this;
	}

	public IntinoDslEditorSetup readonly(Boolean readonly) {
		this.readonly = readonly;
		return this;
	}

	public IntinoDslEditorSetup files(java.util.List<IntinoDslEditorFile> files) {
		this.files = files;
		return this;
	}
}