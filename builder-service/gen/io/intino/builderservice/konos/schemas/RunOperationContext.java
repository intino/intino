package io.intino.builderservice.konos.schemas;

import io.intino.builderservice.konos.schemas.*;

public class RunOperationContext implements java.io.Serializable {

	private String imageURL;
	private String operation;
	private String projectGroup;
	private String projectName;
	private String projectVersion;
	private String languageGroup;
	private String languageName;
	private String languageVersion;
	private String languagePath;
	private String generationPackage;

	public String imageURL() {
		return this.imageURL;
	}

	public String operation() {
		return this.operation;
	}

	public String projectGroup() {
		return this.projectGroup;
	}

	public String projectName() {
		return this.projectName;
	}

	public String projectVersion() {
		return this.projectVersion;
	}

	public String languageGroup() {
		return this.languageGroup;
	}

	public String languageName() {
		return this.languageName;
	}

	public String languageVersion() {
		return this.languageVersion;
	}

	public String languagePath() {
		return this.languagePath;
	}

	public String generationPackage() {
		return this.generationPackage;
	}

	public RunOperationContext imageURL(String imageURL) {
		this.imageURL = imageURL;
		return this;
	}

	public RunOperationContext operation(String operation) {
		this.operation = operation;
		return this;
	}

	public RunOperationContext projectGroup(String projectGroup) {
		this.projectGroup = projectGroup;
		return this;
	}

	public RunOperationContext projectName(String projectName) {
		this.projectName = projectName;
		return this;
	}

	public RunOperationContext projectVersion(String projectVersion) {
		this.projectVersion = projectVersion;
		return this;
	}

	public RunOperationContext languageGroup(String languageGroup) {
		this.languageGroup = languageGroup;
		return this;
	}

	public RunOperationContext languageName(String languageName) {
		this.languageName = languageName;
		return this;
	}

	public RunOperationContext languageVersion(String languageVersion) {
		this.languageVersion = languageVersion;
		return this;
	}

	public RunOperationContext languagePath(String languagePath) {
		this.languagePath = languagePath;
		return this;
	}

	public RunOperationContext generationPackage(String generationPackage) {
		this.generationPackage = generationPackage;
		return this;
	}
}