package io.intino.tara.model;

import io.intino.tara.model.rules.Size;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface Property extends Valued, Cloneable {

	String name();

	Primitive type();

	boolean isReference();

	Mogram container();

	default void container(Mogram container) {
	}

	@Override
	default boolean isMultiple() {
		return sizeRule().max() > 1;
	}

	private Size sizeRule() {
		return (Size) rules().stream().filter(r -> r instanceof Size).findFirst().get();
	}

	void type(Primitive type);

	void addAnnotations(Annotation... flags);

	List<Annotation> annotations();

	Property overriden();

	Property overrides();

	void overriden(Property childProp);

	void overrides(Property superProp);

	default void values(List<Object> values) {
	}

	String metric();

	void metric(String defaultMetric);

	String getUID();

	default String language() {
		return container() == null ? null : container().languageName();
	}

	default Property cloneIt(Mogram container) {
		return null;
	}

	class NativeCounter {
		private static final Map<String, Integer> map = new HashMap<>();

		public synchronized static int next(ElementContainer container, String name) {
			final String key = calculatePackage(container) + "." + name;
			map.put(key, map.containsKey(key) ? map.get(key) + 1 : 0);
			return map.get(key);
		}

		private static String calculatePackage(ElementContainer container) {
			final Mogram mogramContainer = (Mogram) firstNamedContainer(container);
			return mogramContainer == null ? "" : mogramContainer.qualifiedName().replace("$", ".").replace("#", ".").toLowerCase();
		}

		private static ElementContainer firstNamedContainer(ElementContainer container) {
			List<ElementContainer> containers = collectStructure(container);
			ElementContainer candidate = null;
			for (ElementContainer mogramContainer : containers) {
				if (mogramContainer instanceof Mogram && !((Mogram) mogramContainer).isAnonymous())
					candidate = mogramContainer;
				else if (mogramContainer instanceof Mogram) break;
				else candidate = mogramContainer;
			}
			return candidate;
		}

		private static List<ElementContainer> collectStructure(ElementContainer container) {
			List<ElementContainer> containers = new ArrayList<>();
			ElementContainer current = container;
			while (current != null && !(current instanceof MogramRoot)) {
				containers.add(0, current);
				current = current.container();
			}
			return containers;
		}

	}


}
