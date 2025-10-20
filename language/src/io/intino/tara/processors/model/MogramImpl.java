package io.intino.tara.processors.model;

import io.intino.tara.model.*;

import java.io.Serializable;
import java.net.URI;
import java.util.*;
import java.util.stream.Collectors;

import static io.intino.tara.processors.utils.Format.firstUpperCase;
import static java.util.Collections.*;

public class MogramImpl implements Mogram, Serializable {
	private static final long serialVersionUID = 1L;
	private URI source;
	private final TextRange range;
	private final String text;
	private int line;
	private ElementContainer container;
	private String mainType;
	private String doc;
	private boolean sub;
	private String name;
	private NamedReference<Mogram> parent;
	private NamedReference<Mogram> overrides;
	private NamedReference<Mogram> overriden;
	private boolean anonymous = true;
	private String hashCode;
	private String language;
	private final Map<Element, List<Rule<?>>> elements = new LinkedHashMap<>();
	private final Set<Annotation> annotations = new HashSet<>();
	private final List<PropertyDescription> propertyDescriptions = new ArrayList<>();
	private final List<Facet> facetsApplied = new ArrayList<>();
	private final List<NamedReference<Mogram>> applicableFacets = new ArrayList<>();
	private final List<Mogram> children = new ArrayList<>();
	private final Set<Mogram> metaMograms = new HashSet<>();
	private List<FacetConstraint> facetConstraints;
	private Level level;
	private NamedReference<Mogram> facetTarget;

	public MogramImpl(String text, URI source, int line, TextRange range) {
		this.text = text;
		this.source = source;
		this.line = line;
		this.range = range;
	}

	@Override
	public String name() {
		return name;
	}

	@Override
	public void name(String name) {
		this.name = name;
	}

	public void anonymous(boolean anonymous) {
		this.anonymous = anonymous;
	}

	@Override
	public Level level() {
		return this.level;
	}

	@Override
	public void level(Level level) {
		this.level = level;
	}

	@Override
	public boolean isSub() {
		return sub;
	}

	@Override
	public List<NamedReference<Mogram>> applicableFacets() {
		return applicableFacets;
	}

	@Override
	public void addApplicableFacet(Mogram mogram) {
		applicableFacets.add(new NamedReference<>(mogram, mogram.qualifiedName()));
	}

	public void setSub(boolean sub) {
		this.sub = sub;
	}

	@Override
	public URI source() {
		return source;
	}

	public void source(URI source) {
		this.source = source;
	}

	@Override
	public String languageName() {
		return language;
	}

	@Override
	public void languageName(String language) {
		this.language = language;
	}

	@Override
	public int line() {
		return line;
	}

	@Override
	public void line(int line) {
		this.line = line;
	}

	@Override
	public TextRange textRange() {
		return this.range;
	}

	@Override
	public String doc() {
		return doc;
	}

	public void doc(String doc) {
		this.doc = this.doc == null ? doc : this.doc + "\\n" + doc.trim();
	}

	@Override
	public List<Mogram> subs() {
		List<Mogram> mograms = new ArrayList<>();
		children().stream().filter(Mogram::isSub).forEach(c -> {
			mograms.add(c);
			mograms.addAll(c.subs());
		});
		return unmodifiableList(mograms);
	}

	@Override
	public List<Mogram> facets() {
		return elements.keySet().stream()
				.filter(e -> e instanceof Mogram m && m.facetPrescription() != null)
				.map(e -> (Mogram) e).toList();
	}

	@Override
	public ElementContainer container() {
		return container;
	}

	public void container(ElementContainer container) {
		this.container = container;
	}

	public NamedReference<Mogram> facetPrescription() {
		return this.facetTarget;
	}

	@Override
	public void facetPrescription(String target) {
		this.facetTarget = new NamedReference<>(target);
	}

	@Override
	public void facetPrescription(Mogram target) {
		this.facetTarget = new NamedReference<>(target, target.name());
	}

	@Override
	public List<FacetConstraint> facetConstraints() {
		return facetConstraints == null ? emptyList() : facetConstraints;
	}

	public void facetConstraints(List<FacetConstraint> constraints) {
		this.facetConstraints = constraints;
	}

	public boolean is(Annotation annotation) {
		return annotations.contains(annotation);
	}

	@Override
	public List<Annotation> annotations() {
		return List.copyOf(annotations);
	}

	@Override
	public void addAnnotations(Annotation... annotations) {
		addAll(this.annotations, annotations);
	}

	@Override
	public NamedReference<Mogram> parent() {
		return parent;
	}

	public void parent(Mogram parent) {
		if (this.parent == null) this.parent = new NamedReference<>(parent, parent.qualifiedName());
		else this.parent.referent(parent);
	}

	public void parent(String parent) {
		if (this.parent == null && parent != null) this.parent = new NamedReference<>(parent);
	}

	@Override
	public Mogram overrides() {
		return this.overrides == null ? null : overrides.get();
	}

	@Override
	public void overrides(Mogram mogram) {
		this.overrides = new NamedReference<>(mogram, mogram.qualifiedName());
	}

	@Override
	public void overridenBy(Mogram mogram) {
		this.overriden = new NamedReference<>(mogram, mogram.qualifiedName());
	}

	@Override
	public boolean isAnonymous() {
		return anonymous;
	}

	@Override
	public List<Mogram> metaMograms() {
		return List.copyOf(metaMograms);
	}

	@Override
	public void addMetaMogram(Mogram mogram) {
		metaMograms.add(mogram);
	}

	@Override
	public String qualifiedName() {
		String containerQN = (container instanceof Mogram m) ? m.qualifiedName() : "";
		String name = level == null || level == Level.M1 || isAnonymous() ? name() : firstUpperCase(name());
		return (containerQN.isEmpty() ? "" : containerQN + ".") + (name == null ? "[" + ANONYMOUS + shortType() + "]" : name);
	}

	public void type(String type) {
		this.mainType = type;
	}

	public String shortType() {
		return mainType.contains(".") ? mainType.substring(mainType.lastIndexOf(".") + 1) : mainType;
	}

	@Override
	public List<String> types() {
		List<String> types = new ArrayList<>(secondaryTypes());
		types.addFirst(mainType);
		return types;
	}

	public List<String> secondaryTypes() {
		Set<String> types = appliedFacets().stream().map(facet -> facet.fullType() != null ? facet.fullType() : facet.type()).collect(Collectors.toSet());
		if (parent != null && parent.resolved()) types.addAll(parent.get().types());
		return List.copyOf(types);
	}

	@Override
	public List<PropertyDescription> parameters() {
		return Collections.unmodifiableList(propertyDescriptions);
	}

	@Override
	public void addParameter(String name, String facet, int position, String extension, TextRange range, List<Object> values) {
		PropertyDescriptionImpl property = new PropertyDescriptionImpl(name, position, extension, values, range);
		property.facet(facet);
		property.owner(this);
		propertyDescriptions.add(property);
	}

	public void add(PropertyDescription parameter) {
		propertyDescriptions.add(parameter);
	}

	@Override
	public List<Mogram> siblings() {
		List<Mogram> siblings = new ArrayList<>(container().mograms());
		siblings.remove(this);
		return unmodifiableList(siblings);
	}

	@Override
	public List<Element> elements() {
		return List.copyOf(elements.keySet());
	}

	@Override
	public List<Mogram> components() {
		return elements.keySet().stream()
				.filter(e -> e instanceof Mogram m && m.facetPrescription() == null)
				.map(e -> (Mogram) e).toList();
	}

	@Override
	public List<Mogram> mograms() {
		return elements.keySet().stream()
				.filter(e -> e instanceof Mogram)
				.map(e -> (Mogram) e).toList();
	}

	@Override
	public List<Rule<?>> rulesOf(Element component) {
		return this.elements.get(component);
	}

	@Override
	public boolean contains(Mogram mogramContainer) {
		return mogramContainer != null && elements.containsKey(mogramContainer);
	}

	@Override
	public List<Property> properties() {
		return elements.keySet().stream().filter(e -> e instanceof Property).map(e -> (Property) e).toList();
	}

	public void add(Element element, List<Rule<?>> rules) {
		this.elements.put(element, rules == null ? new ArrayList<>() : new ArrayList<>(rules));
	}

	@Override
	public void add(Property... properties) {
		Arrays.stream(properties).forEach(property -> elements.put(property, new ArrayList<>()));
	}

	@Override
	public void remove(Mogram mogram) {
		if (mogram != null) elements.remove(mogram);
	}

	@Override
	public List<MogramReference> referenceComponents() {
		return elements.keySet().stream()
				.filter(e -> e instanceof MogramReference && !(e instanceof Property))
				.map(e -> (MogramReference) e)
				.toList();
	}

	@Override
	public List<Mogram> children() {
		return unmodifiableList(this.children);
	}

	@Override
	public void addChild(Mogram mogram) {
		children.add(mogram);
	}

	@Override
	public List<Facet> appliedFacets() {
		return unmodifiableList(facetsApplied);
	}

	@Override
	public void applyFacet(Facet facet) {
		Collections.addAll(this.facetsApplied, facet);
	}

	@Override
	public String toString() {
		return mainType + " " + qualifiedName();
	}

	public String text() {
		return this.text;
	}

	public void setHashCode(String hashCode) {
		this.hashCode = hashCode;
	}

	public String getHashCode() {
		return hashCode;
	}
}
