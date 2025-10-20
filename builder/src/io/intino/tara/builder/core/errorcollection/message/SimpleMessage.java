package io.intino.tara.builder.core.errorcollection.message;


import io.intino.tara.builder.core.ProcessingUnit;
import io.intino.tara.builder.core.SourceUnit;

import java.io.PrintWriter;
import java.net.URI;

public class SimpleMessage extends Message {
	protected String message;
	protected Object data;
	protected ProcessingUnit owner;

	public SimpleMessage(String message, ProcessingUnit source) {
		this.message = message;
		this.data = null;
		this.owner = source;
	}

	public SimpleMessage(String message, Object data, ProcessingUnit source) {
		this.message = message;
		this.data = data;
		this.owner = source;
	}


	public void write(PrintWriter writer) {
		if (this.owner instanceof SourceUnit) {
			URI uri = ((SourceUnit) this.owner).uri();
			writer.println(uri + ": " + this.message);
		} else
			writer.println(this.message);
	}

	public String getMessage() {
		return this.message;
	}

	public ProcessingUnit getOwner() {
		return owner;
	}
}
