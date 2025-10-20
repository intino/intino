package io.intino.tara.builder.core.operation.model;

import io.intino.builder.CompilerConfiguration;
import io.intino.tara.Language;
import io.intino.tara.builder.core.CompilationUnit;
import io.intino.tara.builder.core.SourceUnit;
import io.intino.tara.builder.core.errorcollection.message.DependencyErrorMessage;
import io.intino.tara.builder.core.errorcollection.message.WarningMessage;
import io.intino.tara.model.Element;
import io.intino.tara.processors.dependencyresolution.DependencyException;
import io.intino.tara.processors.dependencyresolution.DependencyResolver;
import io.intino.tara.processors.dependencyresolution.InheritanceResolver;
import io.intino.tara.processors.dependencyresolution.NativeResolver;
import io.intino.tara.processors.model.Model;

import java.io.File;
import java.util.Collection;
import java.util.logging.Logger;

import static io.intino.builder.BuildConstants.PRESENTABLE_MESSAGE;

public class ModelDependencyResolutionOperation extends ModelOperation {
	private static final Logger LOG = Logger.getGlobal();

	public ModelDependencyResolutionOperation(CompilationUnit unit) {
		super(unit);
	}

	@Override
	public void call(Model model) {
		try {
			final CompilerConfiguration conf = unit.configuration();
			if (conf.isVerbose())
				unit.configuration().out().println(PRESENTABLE_MESSAGE + "[" + conf.module() + " - " + conf.dsl().outDsl() + "]" + " Resolving dependencies...");
			File languageLib = new File(Language.class.getProtectionDomain().getCodeSource().getLocation().getFile());
			final DependencyResolver dependencyResolver = new DependencyResolver(model, unit.language(), conf.generationPackage(), conf.rulesDirectory(), languageLib, conf.getTempDirectory());
			dependencyResolver.resolve();
			notifyRulesNotLoaded(dependencyResolver);
			new InheritanceResolver(model).resolve();
			new NativeResolver(model, conf.functionsDirectory()).resolve();
		} catch (DependencyException e) {
			unit.getErrorCollector().addError(DependencyErrorMessage.create(e, unit.getSourceUnits().get(e.getElement().source())), true);
		}
	}

	private void notifyRulesNotLoaded(DependencyResolver dependencyResolver) {
		dependencyResolver.rulesNotLoaded().forEach(entry -> {
			SourceUnit sourceFromFile = getSourceFromFile(unit.getSourceUnits().values(), entry.getElement());
			unit.getErrorCollector().addWarning(new WarningMessage(WarningMessage.LIKELY_ERRORS, entry.getMessage(), sourceFromFile, entry.getLine(), 0));
		});
	}

	private SourceUnit getSourceFromFile(Collection<SourceUnit> values, Element origin) {
		return origin == null ? null :
				values.stream().filter(value -> value.uri().equals(origin.source())).findFirst().orElse(null);
	}
}