package io.intino.builderservice.konos.schemas;

import io.intino.builderservice.konos.schemas.*;

public class BuilderInfo implements java.io.Serializable {

	private String imageURL;
	private java.util.List<String> operations = new java.util.ArrayList<>();
	private java.util.List<String> targetLanguages = new java.util.ArrayList<>();
	private String creationDate;
	private java.util.Map<String, String> properties = new java.util.HashMap<>();

	public String imageURL() {
		return this.imageURL;
	}

	public java.util.List<String> operations() {
		return this.operations;
	}

	public java.util.List<String> targetLanguages() {
		return this.targetLanguages;
	}

	public String creationDate() {
		return this.creationDate;
	}

	public java.util.Map<String, String> properties() {
		return this.properties;
	}

	public BuilderInfo imageURL(String imageURL) {
		this.imageURL = imageURL;
		return this;
	}

	public BuilderInfo operations(java.util.List<String> operations) {
		this.operations = operations;
		return this;
	}

	public BuilderInfo targetLanguages(java.util.List<String> targetLanguages) {
		this.targetLanguages = targetLanguages;
		return this;
	}

	public BuilderInfo creationDate(String creationDate) {
		this.creationDate = creationDate;
		return this;
	}

	public BuilderInfo properties(java.util.Map<String, String> properties) {
		this.properties = properties;
		return this;
	}
}