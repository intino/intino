package io.intino.tara.processors.model;

import io.intino.tara.model.Annotation;
import io.intino.tara.model.Mogram;
import io.intino.tara.model.MogramReference;
import io.intino.tara.model.NamedReference;

import java.io.Serializable;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.unmodifiableList;

public class HasMogram implements MogramReference, Serializable {
	private static final long serialVersionUID = 1L;
	private final TextRange textRange;
	private final List<Annotation> annotations = new ArrayList<>();
	private final URI source;
	private final NamedReference<Mogram> target;
	private int line;
	private Mogram container;
	private String doc;
	private boolean has;

	public HasMogram(String reference, URI source, int line, TextRange textRange) {
		this.target = new NamedReference<>(reference);
		this.source = source;
		this.line = line;
		this.textRange = textRange;
	}

	public HasMogram(MogramImpl target, URI source, TextRange textRange) {
		this.source = source;
		this.textRange = textRange;
		this.target = new NamedReference<>(target, target.name());
	}

	public NamedReference<Mogram> target() {
		return target;
	}

	public void target(Mogram target) {
		this.target.referent(target);
	}

	public boolean isHas() {
		return has;
	}

	public void setHas(boolean has) {
		this.has = has;
	}

	public Mogram container() {
		return container;
	}

	public HasMogram container(Mogram container) {
		this.container = container;
		return this;
	}

	public List<Annotation> annotations() {
		List<Annotation> all = new ArrayList<>();
		annotations.stream().filter(a -> !all.contains(a)).forEach(all::add);
		if (isHas()) all.addAll(target.get().annotations());
		return unmodifiableList(all);
	}

	public void addAnnotations(Annotation... annotations) {
		Collections.addAll(this.annotations, annotations);
	}

	public String qualifiedName() {
		return container.qualifiedName() + "." + target.get().name();
	}

	public String doc() {
		return doc;
	}

	public void doc(String doc) {
		this.doc = doc;
	}

	@Override
	public URI source() {
		return this.source;
	}

	@Override
	public int line() {
		return line;
	}

	@Override
	public TextRange textRange() {
		return this.textRange;
	}

	public String toString() {
		return target.resolved() ? qualifiedName() : target.reference();
	}
}