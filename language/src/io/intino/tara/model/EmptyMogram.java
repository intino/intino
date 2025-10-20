package io.intino.tara.model;

import java.io.Serializable;
import java.net.URI;
import java.util.Collections;
import java.util.List;

public class EmptyMogram implements Mogram, Serializable {
	private static final long serialVersionUID = 1L;
	private Level level;

	@Override
	public String name() {
		return null;
	}

	@Override
	public void name(String name) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Level level() {
		return level;
	}

	@Override
	public void level(Level level) {
		this.level = level;
	}

	@Override
	public void languageName(String language) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String doc() {
		return null;
	}

	@Override
	public void doc(String doc) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean isSub() {
		return false;
	}

	@Override
	public List<NamedReference<Mogram>> applicableFacets() {
		return List.of();
	}

	@Override
	public void addApplicableFacet(Mogram mogram) {

	}

	@Override
	public NamedReference<Mogram> facetPrescription() {
		return null;
	}

	@Override
	public void facetPrescription(String reference) {

	}

	@Override
	public void facetPrescription(Mogram mogram) {

	}


	@Override
	public List<Mogram> subs() {
		return Collections.emptyList();
	}

	@Override
	public List<Mogram> facets() {
		return List.of();
	}

	@Override
	public boolean is(Annotation annotation) {
		return false;
	}

	@Override
	public List<Annotation> annotations() {
		return Collections.emptyList();
	}

	@Override
	public void addAnnotations(Annotation... annotations) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void addUses(List<String> imports) {
		throw new UnsupportedOperationException();
	}

	@Override
	public NamedReference<Mogram> parent() {
		return null;
	}

	@Override
	public Mogram overrides() {
		return null;
	}

	@Override
	public void overrides(Mogram component) {

	}

	@Override
	public void overridenBy(Mogram child) {

	}

	@Override
	public boolean isAnonymous() {
		return false;
	}

	@Override
	public List<Mogram> metaMograms() {
		return List.of();
	}

	@Override
	public void addMetaMogram(Mogram mogram) {

	}

	@Override
	public List<Mogram> components() {
		return Collections.emptyList();
	}

	@Override
	public List<Mogram> mograms() {
		return List.of();
	}

	@Override
	public List<Mogram> component(String type) {
		return Collections.emptyList();
	}

	@Override
	public List<Rule<?>> rulesOf(Element component) {
		return List.of();
	}

	@Override
	public boolean contains(Mogram mogram) {
		return false;
	}

	@Override
	public List<Mogram> siblings() {
		return Collections.emptyList();
	}

	@Override
	public List<MogramReference> referenceComponents() {
		return List.of();
	}

	@Override
	public List<Property> properties() {
		return Collections.emptyList();
	}

	@Override
	public void add(Property... variables) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Mogram container() {
		return null;
	}

	@Override
	public void container(ElementContainer container) {
		throw new UnsupportedOperationException();
	}

	@Override
	public List<Element> elements() {
		return List.of();
	}

	@Override
	public String qualifiedName() {
		return null;
	}

	@Override
	public List<String> types() {
		return Collections.emptyList();
	}

	@Override
	public void type(String type) {

	}

	@Override
	public List<Mogram> children() {
		return Collections.emptyList();
	}

	@Override
	public void addChild(Mogram mogram) {
		throw new UnsupportedOperationException();
	}

	@Override
	public List<Facet> appliedFacets() {
		return Collections.emptyList();
	}

	@Override
	public URI source() {
		return null;
	}

	@Override
	public int line() {
		return 0;
	}

	@Override
	public TextRange textRange() {
		return null;
	}

	@Override
	public List<PropertyDescription> parameters() {
		return Collections.emptyList();
	}

	@Override
	public String toString() {
		return "empty";
	}
}
