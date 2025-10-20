package io.intino.tara.model;

import io.intino.tara.model.rules.Size;

import java.util.List;
import java.util.stream.Collectors;

public interface ElementContainer extends Element {

	String name();

	ElementContainer container();

	default void container(ElementContainer container) {
	}

	default MogramRoot root() {
		return this instanceof MogramRoot ? (MogramRoot) this : container().root();
	}

	List<Element> elements();

	List<Mogram> components();

	List<Mogram> mograms();

	List<Mogram> siblings();

	List<MogramReference> referenceComponents();

	default void add(Element element, List<Rule<?>> rule) {

	}

	default List<Mogram> component(String type) {
		return components().stream().filter(component -> type.equals(component.types().get(0)) || type.equals(component.shortType())).collect(Collectors.toList());
	}

	List<Rule<?>> rulesOf(Element component);


	default Size sizeOf(Element component) {
		return (Size) rulesOf(component).stream().filter(r -> r instanceof Size).findAny().orElse(Size.MULTIPLE());
	}

	<T extends Mogram> boolean contains(T mogram);

	default <T extends Mogram> void remove(T mogram) {
	}

	default <T extends Property> void add(T... property) {
	}
}