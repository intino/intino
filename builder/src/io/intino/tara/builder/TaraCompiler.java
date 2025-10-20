package io.intino.tara.builder;

import io.intino.builder.CompilerMessage;
import io.intino.tara.builder.core.CompilationUnit;
import io.intino.tara.builder.core.SourceUnit;
import io.intino.tara.builder.core.errorcollection.CompilationFailedException;
import io.intino.tara.builder.core.errorcollection.ErrorCollector;
import io.intino.tara.builder.core.errorcollection.MultipleCompilationErrorsException;
import io.intino.tara.builder.core.errorcollection.TaraRuntimeException;
import io.intino.tara.builder.core.errorcollection.message.*;
import io.intino.tara.language.grammar.SyntaxException;
import io.intino.tara.language.semantics.errorcollector.SemanticException;
import io.intino.tara.model.Element;
import io.intino.tara.processors.dependencyresolution.DependencyException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TaraCompiler {
	private static final String LINE_AT = " @ line ";
	private final List<CompilerMessage> collector;

	public TaraCompiler(List<CompilerMessage> collector) {
		this.collector = collector;
	}

	public List<OutputItem> compile(CompilationUnit unit) {
		List<OutputItem> compiledFiles = new ArrayList<>();
		try {
			unit.compile();
			addCompiledFiles(unit, compiledFiles);
		} catch (CompilationFailedException e) {
			processCompilationException(e);
		} catch (TaraRuntimeException e) {
			processException(e);
		} finally {
			addWarnings(unit.getErrorCollector(), collector);
		}
		return compiledFiles;
	}

	private void addCompiledFiles(CompilationUnit compilationUnit, final List<OutputItem> compiledFiles) {
		for (Map.Entry<String, List<String>> entry : compilationUnit.getOutputItems().entrySet())
			compiledFiles.addAll(entry.getValue().stream().map(outFile -> new OutputItem(entry.getKey(), outFile)).toList());
	}

	private void addWarnings(ErrorCollector errorCollector, List<CompilerMessage> collector) {
		for (int i = 0; i < errorCollector.getWarningCount(); i++) {
			WarningMessage warning = errorCollector.getWarning(i);
			collector.add(new CompilerMessage(CompilerMessage.WARNING, warning.getMessage(), ((SourceUnit) warning.getOwner()).uri().getPath(), warning.line(), warning.column()));
		}
	}

	private void processCompilationException(Exception exception) {
		if (exception instanceof MultipleCompilationErrorsException errorsException) {
			ErrorCollector errorCollector = errorsException.getErrorCollector();
			for (int i = 0; i < errorCollector.getErrorCount(); i++)
				processException(errorCollector.getError(i));
		} else processException(exception);
	}

	private void processException(Message message) {
		if (message instanceof SyntaxErrorMessage)
			addErrorMessage(((SyntaxErrorMessage) message).getCause());
		else if (message instanceof SemanticErrorMessage)
			addErrorMessage(((SemanticErrorMessage) message).getCause());
		else if (message instanceof DependencyErrorMessage)
			addErrorMessage(((DependencyErrorMessage) message).getCause());
		else if (message instanceof ExceptionMessage)
			processException(((ExceptionMessage) message).getCause());
		else if (message instanceof SimpleMessage)
			addErrorMessage((SimpleMessage) message, collector);
		else
			addMessageWithoutLocation(collector, "An unknown error occurred: " + message, true);
	}

	private void processException(Throwable e) {
		if (e instanceof TaraRuntimeException) {
			addErrorMessage((TaraRuntimeException) e);
			return;
		}
		addMessageWithoutLocation(collector, e.getMessage(), true);
	}

	private void addMessageWithoutLocation(List<CompilerMessage> collector, String message, boolean error) {
		collector.add(new CompilerMessage(error ? CompilerMessage.ERROR : CompilerMessage.WARNING, message, null, -1, -1));
	}

	private void addErrorMessage(SyntaxException exception) {
		String message = exception.getMessage();
		String justMessage = message.substring(0, message.lastIndexOf(LINE_AT));
		collector.add(new CompilerMessage(CompilerMessage.ERROR, justMessage, exception.getUri().getPath(),
				exception.getLine(), exception.getStartColumn()));
	}

	private void addErrorMessage(SemanticException ex) {
		String message;
		if (ex.getIssue().origin() != null) {
			message = (ex.getMessage().contains(LINE_AT)) ? ex.getMessage().substring(0, ex.getMessage().lastIndexOf(LINE_AT)) : ex.getMessage();
			Element[] origins = ex.getIssue().origin();
			for (Element element : origins)
				collector.add(new CompilerMessage(CompilerMessage.ERROR, message, element.source().getPath(), element.line(), element.textRange().startColumn()));
		} else {
			collector.add(new CompilerMessage(CompilerMessage.ERROR, ex.getMessage(), null, -1, -1));
		}
	}

	private void addErrorMessage(DependencyException exception) {
		String message = exception.getMessage();
		String justMessage = message.substring(0, message.lastIndexOf(LINE_AT));
		collector.add(new CompilerMessage(CompilerMessage.ERROR, justMessage, exception.getElement().source().getPath(),
				exception.getLine(), 1));
	}

	private void addErrorMessage(TaraRuntimeException exception) {
		Element element = exception.getElement();
		collector.add(element != null ?
				new CompilerMessage(CompilerMessage.ERROR, exception.getMessageWithoutLocationText(), element.source().getPath(), element.line(), element.textRange().startColumn()) :
				new CompilerMessage(CompilerMessage.ERROR, exception.getMessageWithoutLocationText(), "null", -1, -1));
	}

	private void addErrorMessage(SimpleMessage message, List collector) {
		addMessageWithoutLocation(collector, message.getMessage(), true);
	}

	public static class OutputItem {
		private final String myOutputPath;
		private final String mySourceFileName;

		OutputItem(String sourceFileName, String outputFilePath) {
			myOutputPath = outputFilePath;
			mySourceFileName = sourceFileName;
		}

		public String getOutputPath() {
			return myOutputPath;
		}

		public String getSourceFile() {
			return mySourceFileName;
		}
	}
}
