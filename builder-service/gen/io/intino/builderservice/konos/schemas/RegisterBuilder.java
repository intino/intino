package io.intino.builderservice.konos.schemas;

import io.intino.builderservice.konos.schemas.*;

public class RegisterBuilder implements java.io.Serializable {

	private String imageURL;
	private String registryToken;

	public String imageURL() {
		return this.imageURL;
	}

	public String registryToken() {
		return this.registryToken;
	}

	public RegisterBuilder imageURL(String imageURL) {
		this.imageURL = imageURL;
		return this;
	}

	public RegisterBuilder registryToken(String registryToken) {
		this.registryToken = registryToken;
		return this;
	}
}