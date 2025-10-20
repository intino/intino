package io.intino.tara.builder;

import io.intino.tara.Source;

import java.net.URI;
import java.util.stream.Stream;

public interface SourceProvider {
	Stream<Source> all();

	Source get(URI uri);
}
