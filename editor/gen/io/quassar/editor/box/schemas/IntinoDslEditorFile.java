package io.quassar.editor.box.schemas;

import io.quassar.editor.box.schemas.*;

public class IntinoDslEditorFile implements java.io.Serializable {

	private String name;
	private String model;
	private String uri;
	private String content;
	private String language;
	private String extension;
	private Boolean active = false;
	private IntinoDslEditorFilePosition position;

	public String name() {
		return this.name;
	}

	public String model() {
		return this.model;
	}

	public String uri() {
		return this.uri;
	}

	public String content() {
		return this.content;
	}

	public String language() {
		return this.language;
	}

	public String extension() {
		return this.extension;
	}

	public Boolean active() {
		return this.active;
	}

	public IntinoDslEditorFilePosition position() {
		return this.position;
	}

	public IntinoDslEditorFile name(String name) {
		this.name = name;
		return this;
	}

	public IntinoDslEditorFile model(String model) {
		this.model = model;
		return this;
	}

	public IntinoDslEditorFile uri(String uri) {
		this.uri = uri;
		return this;
	}

	public IntinoDslEditorFile content(String content) {
		this.content = content;
		return this;
	}

	public IntinoDslEditorFile language(String language) {
		this.language = language;
		return this;
	}

	public IntinoDslEditorFile extension(String extension) {
		this.extension = extension;
		return this;
	}

	public IntinoDslEditorFile active(Boolean active) {
		this.active = active;
		return this;
	}

	public IntinoDslEditorFile position(IntinoDslEditorFilePosition position) {
		this.position = position;
		return this;
	}
}