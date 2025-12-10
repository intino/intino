package io.quassar.editor.box.schemas;

import io.quassar.editor.box.schemas.*;

public class IntinoFileBrowserItem implements java.io.Serializable {

	private int id = 0;
	private String name;
	private String uri;
	private Type type;

	public enum Type {
		Folder, File
	}

	private Boolean isRoot = false;
	private java.util.List<String> parents = new java.util.ArrayList<>();
	private java.util.List<String> children = new java.util.ArrayList<>();

	public int id() {
		return this.id;
	}

	public String name() {
		return this.name;
	}

	public String uri() {
		return this.uri;
	}

	public Type type() {
		return type;
	}

	public Boolean isRoot() {
		return this.isRoot;
	}

	public java.util.List<String> parents() {
		return this.parents;
	}

	public java.util.List<String> children() {
		return this.children;
	}

	public IntinoFileBrowserItem id(int id) {
		this.id = id;
		return this;
	}

	public IntinoFileBrowserItem name(String name) {
		this.name = name;
		return this;
	}

	public IntinoFileBrowserItem uri(String uri) {
		this.uri = uri;
		return this;
	}

	public IntinoFileBrowserItem type(Type type) {
		this.type = type;
		return this;
	}

	public IntinoFileBrowserItem isRoot(Boolean isRoot) {
		this.isRoot = isRoot;
		return this;
	}

	public IntinoFileBrowserItem parents(java.util.List<String> parents) {
		this.parents = parents;
		return this;
	}

	public IntinoFileBrowserItem children(java.util.List<String> children) {
		this.children = children;
		return this;
	}
}