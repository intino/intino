package io.intino.tara.builder;

import io.intino.tara.Source;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileSourceProvider implements SourceProvider {
	private final List<Source> sources;

	public FileSourceProvider(Map<URI, Boolean> sources) {
		this.sources = mapSources(sources);
	}

	@Override
	public Stream<Source> all() {
		return sources.stream();
	}

	@Override
	public Source get(URI uri) {
		return sources.stream().filter(u -> u.uri().equals(uri)).findFirst().orElse(null);
	}

	private static List<Source> mapSources(Map<URI, Boolean> sources) {
		return sources.entrySet().stream().map(e -> new Source() {
			@Override
			public URI uri() {
				return e.getKey();
			}

			@Override
			public Charset charset() {
				return Charset.defaultCharset();
			}

			@Override
			public InputStream content() throws IOException {
				return e.getKey().toURL().openStream();
			}

			@Override
			public boolean dirty() {
				return e.getValue();
			}
		}).collect(Collectors.toList());
	}
}