package io.intino.tara.model;

import java.io.Serializable;

public class NamedReference<T> implements Serializable {
	private static final long serialVersionUID = 1L;
	private final String reference;
	private transient T referent;

	public NamedReference(T referent, String reference) {
		this.referent = referent;
		this.reference = reference;
	}

	public NamedReference(String reference) {
		this.reference = reference;
	}

	public String reference() {
		return referent instanceof EmptyMogram ? "empty" : reference;
	}

	public boolean resolved() {
		return referent != null;
	}

	public T referent() {
		return referent;
	}

	public T get() {
		return referent;
	}

	public void referent(T referent) {
		this.referent = referent;
	}
}