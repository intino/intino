package io.intino.tara.builder.core.errorcollection;

import io.intino.builder.CompilerConfiguration;
import io.intino.tara.builder.core.SourceUnit;
import io.intino.tara.builder.core.errorcollection.message.ExceptionMessage;
import io.intino.tara.builder.core.errorcollection.message.Message;
import io.intino.tara.builder.core.errorcollection.message.SyntaxErrorMessage;
import io.intino.tara.builder.core.errorcollection.message.WarningMessage;
import io.intino.tara.language.grammar.SyntaxException;

import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

import static java.util.logging.Level.SEVERE;

public class ErrorCollector {
	private static final Logger LOG = Logger.getGlobal();
	protected List<Message> warnings;
	protected List<Message> errors;
	protected CompilerConfiguration configuration;

	public ErrorCollector(CompilerConfiguration configuration) {
		this.warnings = null;
		this.errors = null;
		this.configuration = configuration;
	}

	public void addErrorAndContinue(Message message) {
		if (this.errors == null) this.errors = new LinkedList<>();
		this.errors.add(message);
	}

	public void addError(Message message) {
		addErrorAndContinue(message);
	}

	public void addError(Message message, boolean fatal) {
		if (fatal) addFatalError(message);
		else addError(message);
	}

	public void addSyntaxError(SyntaxException error, SourceUnit source) {
		addError(Message.create(error, source), error.isFatal());
	}

	public void addFatalError(Message message) {
		addError(message);
		failIfErrors();
	}

	public void addException(Exception cause, SourceUnit source) {
		addError(new ExceptionMessage(cause, this.configuration.getDebug(), source));
		failIfErrors();
	}

	public boolean hasErrors() {
		return this.errors != null;
	}

	public CompilerConfiguration getConfiguration() {
		return this.configuration;
	}

	public int getWarningCount() {
		return this.warnings == null ? 0 : this.warnings.size();
	}

	public int getErrorCount() {
		return this.errors == null ? 0 : this.errors.size();
	}

	public WarningMessage getWarning(int index) {
		return index < getWarningCount() ? (WarningMessage) this.warnings.get(index) : null;
	}

	public Message getError(int index) {
		return index < getErrorCount() ? this.errors.get(index) : null;
	}

	public void addWarning(WarningMessage message) {
		if (message.isRelevant(this.configuration.getWarningLevel())) {
			if (this.warnings == null)
				this.warnings = new LinkedList<>();
			this.warnings.add(message);
		}
	}

	public void failIfErrors() {
		if (hasErrors()) throw new MultipleCompilationErrorsException(this);
	}

	private void write(PrintWriter writer, List<Message> messages, String txt) {
		if (messages == null || messages.isEmpty()) return;
		for (Message m : messages) {
			m.write(writer);
			if (this.configuration.getDebug() && m instanceof SyntaxErrorMessage sem)
				LOG.log(SEVERE, sem.getCause().getMessage(), sem.getCause());
			writer.println();
		}
		writer.print(messages.size());
		writer.print(" " + txt);
		if (messages.size() > 1) writer.print("s");
		writer.println();
	}

	public void write(PrintWriter writer) {
		write(writer, this.warnings, "warning");
		write(writer, this.errors, "error");
	}
}