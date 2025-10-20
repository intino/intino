package io.intino.tara.processors.model;

import io.intino.tara.model.*;

import java.io.Serializable;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PropertyDescriptionImpl implements PropertyDescription, Serializable {
	private static final long serialVersionUID = 1L;
	private final List<Object> values = new ArrayList<>();
	private final List<Object> originalValues = new ArrayList<>();
	private Property definition;
	private final int position;
	private String name;
	private String scope;
	private final TextRange range;
	private String metric;
	private Primitive inferredType;
	private boolean multiple;
	private final List<Rule<?>> rules = new ArrayList<>();
	private Mogram container;
	private String uid;
	private String facet;

	public PropertyDescriptionImpl(String name, int position, String metric, List<Object> values, TextRange range) {
		this.name = name;
		this.position = position;
		this.metric = (metric == null ? "" : metric);
		this.range = range;
		addOriginalValues(values);
		addValues(values);
	}

	public PropertyDescriptionImpl(int position, String metric, List<Object> values, TextRange range) {
		this("", position, metric, values, range);
	}

	@Override
	public Mogram container() {
		return container;
	}

	public void owner(Mogram owner) {
		this.container = owner;
	}

	@Override
	public Primitive type() {
		return inferredType;
	}

	@Override
	public void type(Primitive type) {
		this.inferredType = type;
	}

	@Override
	public String facet() {
		return this.facet;
	}

	public void facet(String facet) {
		this.facet = facet;
	}

	@Override
	public Property definition() {
		return this.definition;
	}

	@Override
	public void definition(Property property) {
		this.definition = property;
	}

	@Override
	public boolean isMultiple() {
		return multiple;
	}

	@Override
	public void multiple(boolean multiple) {
		this.multiple = multiple;
	}

	@Override
	public String name() {
		return name;
	}

	@Override
	public void name(String name) {
		this.name = name;
	}

	@Override
	public int position() {
		return position;
	}

	@Override
	public List<Object> values() {
		return Collections.unmodifiableList(makeUp(model().resourcesRoot(), inferredType, values));
	}

	public List<Object> originalValues() {
		return originalValues;
	}

	private MogramRoot model() {
		ElementContainer container = this.container;
		while (!(container instanceof MogramRoot))
			container = container.container();
		return (MogramRoot) container;
	}

	@Override
	public void values(List<Object> objects) {
		addValues(objects);
	}

	@Override
	public List<Rule<?>> rules() {
		return rules;
	}

	@Override
	public void add(Rule<?> rule) {
		this.rules.add(rule);
	}

	@Override
	public void scope(String scope) {
		this.scope = scope;
	}

	@Override
	public String scope() {
		return this.scope;
	}

	@Override
	public URI source() {
		return container().source();
	}

	@Override
	public int line() {
		return textRange().startLine();
	}

	@Override
	public TextRange textRange() {
		return this.range;
	}

	@Override
	public String doc() {
		return "";
	}

	@Override
	public String metric() {
		return metric;
	}

	@Override
	public void metric(String metric) {
		this.metric = (metric == null ? "" : metric);
	}

	@Override
	public String toString() {
		return name + ":" + position + ":" + values;
	}

	@Override
	public void substituteValues(List<?> newValues) {
		addValues((List<Object>) newValues);
	}

	@Override
	public String getUID() {
		if (uid == null) uid = Property.NativeCounter.next(this.container(), name()) + "";
		return uid;
	}

	private void addValues(List<Object> values) {
		this.values.clear();
		this.values.addAll(values);
	}

	private void addOriginalValues(List<Object> values) {
		this.originalValues.clear();
		this.originalValues.addAll(values);
	}
}