package io.intino.tara;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.charset.Charset;

public interface Source {
	URI uri();

	Charset charset();

	InputStream content() throws IOException;

	boolean dirty();

	class StringSource implements Source {
		private final String name;
		private final String content;

		public StringSource(String name, String content) {
			this.name = name;
			this.content = content;
		}

		@Override
		public URI uri() {
			return URI.create(name);
		}

		@Override
		public Charset charset() {
			return Charset.defaultCharset();
		}

		@Override
		public InputStream content() {
			return new ByteArrayInputStream(content.getBytes());
		}

		public String stringContent() {
			return content;
		}

		@Override
		public boolean dirty() {
			return false;
		}
	}

}