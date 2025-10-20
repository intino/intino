package io.intino.tara.processors.model;

import io.intino.tara.model.Mogram;
import io.intino.tara.model.NamedReference;

import java.io.Serializable;
import java.net.URI;

public class FacetConstraint implements Mogram.FacetConstraint, Cloneable, Serializable {
	private static final long serialVersionUID = 1L;
	private final boolean negated;
	private final URI source;
	private final TextRange range;
	private final NamedReference<Mogram> reference;

	public FacetConstraint(String reference, boolean negated, URI source, TextRange range) {
		this.reference = new NamedReference<>(reference);
		this.negated = negated;
		this.source = source;
		this.range = range;
	}

	@Override
	public URI source() {
		return source;
	}

	@Override
	public int line() {
		return 0;
	}

	@Override
	public TextRange textRange() {
		return this.range;
	}

	@Override
	public String doc() {
		return "";
	}

	public NamedReference<Mogram> target() {
		return this.reference;
	}

	public boolean negated() {
		return negated;
	}

	@Override
	public FacetConstraint clone() throws CloneNotSupportedException {
		return (FacetConstraint) super.clone();
	}

	public String toString() {
		return "with " + target().reference();
	}
}
