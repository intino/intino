package io.intino.builderservice.konos;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class BuilderServiceConfiguration extends io.intino.alexandria.core.BoxConfiguration {

	public BuilderServiceConfiguration(String[] args) {
		super(args);
	}

	public String port() {
		return get("port");
	}

	public String languageRepository() {
		return get("language-repository");
	}

	public String dockerUrl() {
		return get("docker-url");
	}

	public File dockerhubAuthFile() {
		return get("dockerhub-auth-file") == null ? null : new File(get("dockerhub-auth-file"));
	}

	public java.io.File home() {
		return new java.io.File(args.getOrDefault("home", System.getProperty("user.home")));
	}
}