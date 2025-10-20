package io.intino.tara.language.semantics;

import io.intino.tara.model.Annotation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static io.intino.tara.model.Annotation.*;

public class Annotations {

	private Annotations() {
	}

	public static String[] all() {
		return Arrays.stream(values()).map(Enum::name).toArray(String[]::new);
	}

	public static List<Annotation> forRootMogram() {
		return Arrays.asList(Generalization, Final, Feature, Component, Decorable, Required);
	}

	public static List<Annotation> forMogramReference() {
		return Collections.singletonList(Final);
	}

	public static List<Annotation> forMogramComponent() {
		return Arrays.asList(Generalization, Final, Feature, Component, Decorable);
	}

	public static List<Annotation> forProperty() {
		return Arrays.asList(Final, Private, Reactive);
	}
}
