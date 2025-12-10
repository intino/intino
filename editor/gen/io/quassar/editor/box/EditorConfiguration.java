package io.quassar.editor.box;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class EditorConfiguration extends io.intino.alexandria.core.BoxConfiguration {

	public EditorConfiguration(String[] args) {
		super(args);
	}

	public String port() {
		return get("port");
	}

	public String federationUrl() {
		return get("federation-url");
	}

	public String url() {
		return get("url");
	}

	public String title() {
		return get("title");
	}

	public String languageArtifactory() {
		return get("language-artifactory");
	}

	public String languageRepository() {
		return get("language-repository");
	}

	public String builderServiceUrl() {
		return get("builder-service-url");
	}

	public String taraBuilder() {
		return get("tara-builder");
	}

	public String quassarBuilder() {
		return get("quassar-builder");
	}

	public String googleClientId() {
		return get("google-client-id");
	}

	public String newUserLicenseTime() {
		return get("new-user-license-time");
	}

	public String enterpriseLicenseTimeDuration() {
		return get("enterprise-license-time-duration");
	}

	public String renewLicenseTimeDuration() {
		return get("renew-license-time-duration");
	}

	public String collectionCollaboratorsCount() {
		return get("collection-collaborators-count");
	}

	public String debugMode() {
		return get("debug-mode");
	}

	public java.io.File home() {
		return new java.io.File(args.getOrDefault("home", System.getProperty("user.home")));
	}
}