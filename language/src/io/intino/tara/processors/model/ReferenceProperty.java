package io.intino.tara.processors.model;

import io.intino.tara.model.Mogram;
import io.intino.tara.model.MogramReference;
import io.intino.tara.model.NamedReference;
import io.intino.tara.model.Property;

import java.io.Serializable;

import static io.intino.tara.model.Primitive.REFERENCE;

public class ReferenceProperty extends PropertyImpl implements MogramReference, Serializable {
	private static final long serialVersionUID = 1L;
	private final NamedReference<Mogram> target;
	private String doc;

	public ReferenceProperty(Mogram container, String type, String name, int line, TextRange range) {
		super(container, REFERENCE, name, line, range);
		this.target = new NamedReference<>(type);
	}

	public NamedReference<Mogram> target() {
		return target;
	}

	@Override
	public boolean isReference() {
		return true;
	}

	@Override
	public Property cloneIt(Mogram container) {
		ReferenceProperty prop = new ReferenceProperty(container, target.reference(), name(), line(), textRange());
		prop.metric(metric());
		this.rules().forEach(prop::add);
		this.annotations().forEach(prop::addAnnotations);
		prop.values(this.values());
		return prop;
	}
}