package io.intino.tara.processors.model;


import io.intino.tara.model.*;

import java.io.Serializable;
import java.net.URI;
import java.util.Collections;
import java.util.List;

public class FacetImpl implements Facet, MogramReference, Serializable {
	private static final long serialVersionUID = 1L;
	private final NamedReference<Mogram> metaMogram;
	private final NamedReference<Mogram> target;
	private final URI source;
	private final int line;
	private final TextRange range;
	private String fullType;

	public FacetImpl(String type, Mogram target, URI source, int line, TextRange range) {
		this.metaMogram = new NamedReference<>(type);
		this.target = new NamedReference<>(target, target.name());
		this.source = source;
		this.line = line;
		this.range = range;
	}

	public FacetImpl(String type, String target, URI source, int line, TextRange range) {
		this.metaMogram = new NamedReference<>(type);
		this.target = new NamedReference<>(target);
		this.source = source;
		this.line = line;
		this.range = range;
	}

	@Override
	public String type() {
		return metaMogram.reference();
	}

	@Override
	public NamedReference<Mogram> target() {
		return target;
	}

	@Override
	public NamedReference<Mogram> definition() {
		return metaMogram;
	}

	@Override
	public void fullType(String type) {
		this.fullType = type;
	}

	@Override
	public String fullType() {
		return fullType;
	}

	@Override
	public List<PropertyDescription> parameters() {
		return Collections.emptyList();
	}

	@Override
	public URI source() {
		return source;
	}

	@Override
	public int line() {
		return line;
	}

	@Override
	public TextRange textRange() {
		return range;
	}

	@Override
	public String toString() {
		return type();
	}

	@Override
	public String doc() {
		return "";
	}
}