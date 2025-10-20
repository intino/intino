package io.intino.tara.builder.core.errorcollection.message;

import io.intino.tara.builder.core.ProcessingUnit;
import io.intino.tara.builder.core.SourceUnit;
import io.intino.tara.language.grammar.SyntaxException;
import io.intino.tara.language.semantics.errorcollector.SemanticException;
import io.intino.tara.processors.dependencyresolution.DependencyException;

import java.io.PrintWriter;

public abstract class Message {

	public Message() {
	}

	public static Message create(String text, SourceUnit owner) {
		return new SimpleMessage(text, owner);
	}

	public static Message create(String text, Object data, SourceUnit owner) {
		return new SimpleMessage(text, data, owner);
	}

	public static Message create(SyntaxException error, SourceUnit owner) {
		return new SyntaxErrorMessage(error, owner);
	}


	public static Message create(SemanticException error, SourceUnit owner) {
		return new SemanticErrorMessage(error, owner);
	}

	public static Message create(DependencyException exception, SourceUnit owner) {
		return new DependencyErrorMessage(exception, owner);
	}

	public static Message create(String text, ProcessingUnit owner) {
		return new SimpleMessage(text, owner);
	}

	public abstract void write(PrintWriter paramPrintWriter);

}
