package io.intino.tara.processors.model;

import io.intino.tara.model.Element;
import io.intino.tara.model.Mogram;
import io.intino.tara.model.MogramRoot;
import io.intino.tara.model.Rule;
import io.intino.tara.model.constraints.Constraint;

import java.io.File;
import java.io.Serializable;
import java.net.URI;
import java.util.*;

import static java.util.List.copyOf;

public class Model implements MogramRoot, Serializable {
	private static final long serialVersionUID = 1L;
	private final URI uri;
	private List<String> uses;
	private transient File resourcesRoot;
	private final Map<Mogram, List<Rule<?>>> elements = new LinkedHashMap<>();
	private List<Constraint> constraints = new ArrayList<>();
	private final Map<String, File> rules = new HashMap<>();
	private String language;

	public Model(URI uri) {
		this.uri = uri;
	}

	@Override
	public URI source() {
		return uri;
	}

	@Override
	public TextRange textRange() {
		return new TextRange(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE, Integer.MAX_VALUE);
	}

	@Override
	public List<String> uses() {
		return uses;
	}

	@Override
	public boolean contains(Mogram mogram) {
		return elements.containsKey(mogram);
	}

	@Override
	public void remove(Mogram mogram) {
		if (mogram != null) elements.remove(mogram);
	}

	@Override
	public String name() {
		return new File(uri.getPath()).getName();
	}

	@Override
	public List<Element> elements() {
		return copyOf(elements.keySet());
	}

	@Override
	public List<Mogram> components() {
		return elements.keySet().stream()
				.filter(e -> e.facetPrescription() == null)
				.toList();
	}

	@Override
	public List<Mogram> mograms() {
		return copyOf(elements.keySet());
	}

	public void add(Element element, List<Rule<?>> rule) {
		if (!(element instanceof Mogram)) return;
		this.elements.put((Mogram) element, new ArrayList<>(rule));
	}

	@Override
	public List<Rule<?>> rulesOf(Element component) {
		return !(component instanceof Mogram) ? List.of() : this.elements.get(component);
	}

	@Override
	public String languageName() {
		return language != null ? language : "";
	}

	public void languageName(String language) {
		this.language = language;
	}

	@Override
	public String doc() {
		return "";
	}

	public void setUses(List<String> uses) {
		this.uses = uses;
	}

	public void addRule(String name, File rule) {
		this.rules.put(name, rule);
	}

	public Map<String, File> rules() {
		return rules;
	}

	public void constraints(List<Constraint> constraints) {
		this.constraints = constraints;
	}

	public void setResourcesRoot(File resourceRoot) {
		this.resourcesRoot = resourceRoot;
	}

	public File resourcesRoot() {
		return resourcesRoot;
	}

	@Override
	public List<Constraint> constraints() {
		return this.constraints;
	}

	@Override
	public Constraint constraint(String name) {
		return this.constraints.stream().filter(c -> c.name().equals(name)).findFirst().orElse(null);
	}
}