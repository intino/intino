package io.intino.tara.processors.model;

import io.intino.tara.model.*;

import java.io.Serializable;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

public class PropertyImpl implements Property, Serializable {
	private static final long serialVersionUID = 1L;
	private static final Logger LOG = Logger.getGlobal();
	private final String name;
	private final List<Object> defaultValues = new ArrayList<>();
	private final List<Annotation> annotations = new ArrayList<>();
	private final TextRange range;
	private final List<Rule<?>> rules = new ArrayList<>();
	private Mogram container;
	private Primitive type;
	private String doc;
	private String metric;
	private Property overridden;
	private Property overrides;
	private String uid;

	public PropertyImpl(Mogram container, Primitive type, String name, int line, TextRange range) {
		this.container = container;
		this.name = name;
		this.type = type;
		this.range = range;
	}

	@Override
	public Primitive type() {
		return type;
	}

	@Override
	public boolean isReference() {
		return false;
	}

	@Override
	public void type(Primitive type) {
		this.type = type;
	}

	@Override
	public String name() {
		return name;
	}

	@Override
	public Mogram container() {
		return container;
	}

	@Override
	public void container(Mogram container) {
		this.container = container;
	}

	@Override
	public List<Annotation> annotations() {
		return annotations;
	}

	@Override
	public void addAnnotations(Annotation... flags) {
		Collections.addAll(this.annotations, flags);
	}

	@Override
	public List<Rule<?>> rules() {
		return this.rules;
	}

	@Override
	public void add(Rule<?> rule) {
		this.rules.add(rule);
	}

	@Override
	public void values(List<Object> values) {
		this.defaultValues.clear();
		this.defaultValues.addAll(values);
	}

	@Override
	public List<Object> values() {
		return Collections.unmodifiableList(makeUp(model().resourcesRoot(), type(), defaultValues));
	}

	private MogramRoot model() {
		ElementContainer container = container();
		while (!(container instanceof MogramRoot))
			container = container.container();
		return (MogramRoot) container;
	}

	@Override
	public String metric() {
		return metric;
	}

	@Override
	public void metric(String metric) {
		this.metric = metric;
	}

	@Override
	public String getUID() {
		if (uid == null) uid = NativeCounter.next(this.container(), name()) + "";
		return uid;
	}

	@Override
	public URI source() {
		return container.source();
	}

	@Override
	public int line() {
		return range.startLine();
	}

	@Override
	public TextRange textRange() {
		return this.range;
	}

	@Override
	public String doc() {
		return this.doc;
	}

	public void setDoc(String doc) {
		this.doc = doc;
	}

	@Override
	public Property clone() throws CloneNotSupportedException {
		super.clone();
		PropertyImpl clone = new PropertyImpl(container, type, name, line(), range);
		clone.source(source());
		clone.metric(metric);
		rules.forEach(clone::add);
		annotations.forEach(clone::addAnnotations);
		clone.values(defaultValues);
		return clone;
	}

	@Override
	public Property cloneIt(Mogram container) {
		try {
			Property clone = this.clone();
			clone.container(container);
			return clone;
		} catch (CloneNotSupportedException ignored) {
			LOG.severe("Error cloning variable: " + name());
			return null;
		}
	}

	@Override
	public String toString() {
		return type + ":" + name;
	}

	@Override
	public Property overriden() {
		return overridden;
	}

	@Override
	public Property overrides() {
		return overrides;
	}

	@Override
	public void overriden(Property childrenProp) {
		this.overridden = childrenProp;
	}

	@Override
	public void overrides(Property superProp) {
		this.overrides = superProp;
	}
}