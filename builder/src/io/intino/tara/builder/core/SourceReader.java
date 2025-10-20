package io.intino.tara.builder.core;

import io.intino.tara.Source;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.logging.Logger;

public class SourceReader extends AbstractReaderSource {
	private static final Logger LOG = Logger.getGlobal();
	private static final Charset UTF8 = StandardCharsets.UTF_8;
	private final Source source;

	SourceReader(Source source, String encoding) {
		super(encoding);
		this.source = source;
	}

	public String content() throws IOException {
		Charset cs = Charset.forName(this.encoding);
		InputStream in = new BufferedInputStream(source.content());
		return new String(in.readAllBytes(), cs);
	}

	public Source getSource() {
		return source;
	}
}
