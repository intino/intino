package io.intino.tara.builder.core;

import io.intino.tara.builder.core.errorcollection.TaraException;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class AbstractReaderSource {
	private static final Logger LOG = Logger.getGlobal();
	private BufferedReader lineSource = null;
	protected final String encoding;

	AbstractReaderSource(String encoding) {
		if (encoding == null)
			throw new IllegalArgumentException("Transpiler configuration must not be null!");
		this.encoding = encoding;
	}

	public boolean canReopenSource() {
		return true;
	}

	public abstract String content() throws IOException;

	public void cleanup() throws TaraException {
		if (this.lineSource != null) {
			try {
				this.lineSource.close();
			} catch (IOException e) {
				LOG.log(Level.SEVERE, e.getMessage(), e);
				throw new TaraException("Error cleaning source");
			}
		}
		this.lineSource = null;
	}
}
