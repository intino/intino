package io.intino.tara.builder.core.operation.model;

import io.intino.builder.CompilerConfiguration;
import io.intino.tara.builder.core.CompilationUnit;
import io.intino.tara.builder.core.SourceUnit;
import io.intino.tara.builder.core.errorcollection.CompilationFailedException;
import io.intino.tara.builder.core.errorcollection.TaraException;
import io.intino.tara.builder.core.errorcollection.message.Message;
import io.intino.tara.builder.core.errorcollection.message.WarningMessage;
import io.intino.tara.language.semantics.errorcollector.SemanticException;
import io.intino.tara.language.semantics.errorcollector.SemanticFatalException;
import io.intino.tara.language.semantics.errorcollector.SemanticIssue;
import io.intino.tara.model.Element;
import io.intino.tara.processors.SemanticAnalyzer;
import io.intino.tara.processors.model.Model;

import java.util.Collection;
import java.util.logging.Logger;

import static io.intino.builder.BuildConstants.PRESENTABLE_MESSAGE;

public class SemanticAnalysisOperation extends ModelOperation {
	private static final Logger LOG = Logger.getLogger(SemanticAnalysisOperation.class.getName());
	private final CompilerConfiguration conf;

	public SemanticAnalysisOperation(CompilationUnit unit) {
		super(unit);
		this.conf = unit.configuration();
	}

	@Override
	public void call(Model model) {
		try {
			if (conf.isVerbose())
				unit.out().println(PRESENTABLE_MESSAGE + "[" + conf.module() + " - " + unit.configuration().dsl().outDsl() + "]" + " Analyzing semantic...");
			new SemanticAnalyzer(model, unit.language()).analyze();
		} catch (SemanticFatalException e) {
			semanticErrors(e);
		}
	}

	private void semanticErrors(SemanticFatalException fatal) {
		for (io.intino.tara.language.semantics.errorcollector.SemanticException e : fatal.exceptions()) {
			Element[] origins = e.origin();
			if (origins == null || origins.length == 0) return;
			SourceUnit sourceFromFile = getSourceFromFile(unit.getSourceUnits().values(), origins[0]);
			SemanticException semanticException = new SemanticException(e.getIssue());
			for (Element element : origins) {
				if (e.level() == SemanticIssue.Level.ERROR || e.level() == SemanticIssue.Level.RECOVERABLE_ERROR)
					unit.getErrorCollector().addError(Message.create(semanticException, sourceFromFile));
				else if (e.level() == SemanticIssue.Level.WARNING)
					unit.getErrorCollector().addWarning(new WarningMessage(WarningMessage.LIKELY_ERRORS, e.getMessage(), sourceFromFile, element != null ? element.line() : -1, element != null ? 0 : -1));
			}
		}
	}

	public void error(TaraException e) {
		LOG.severe(e.getMessage());
		throw new CompilationFailedException(unit.getPhase(), unit, e);
	}

	private SourceUnit getSourceFromFile(Collection<SourceUnit> values, Element origin) {
		if (origin == null) return null;
		for (SourceUnit value : values)
			if (value.uri().equals(origin.source())) return value;
		return null;
	}
}