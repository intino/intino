package io.intino.tara.builder.core.operation.setup;

import io.intino.builder.CompilerConfiguration;
import io.intino.tara.Language;
import io.intino.tara.builder.LanguageLoader;
import io.intino.tara.builder.core.CompilationUnit;
import io.intino.tara.builder.core.errorcollection.CompilationFailedException;
import io.intino.tara.builder.core.errorcollection.TaraException;
import io.intino.tara.processors.dependencyresolution.DependencyException;
import io.intino.tara.processors.dependencyresolution.DependencyResolver;
import io.intino.tara.processors.model.Model;

import java.io.File;
import java.io.IOException;
import java.util.jar.Attributes;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import java.util.logging.Logger;

import static io.intino.builder.BuildConstants.GENERATION_PACKAGE;

public class SetupConfigurationOperation extends SetupOperation {
	private static final Logger LOG = Logger.getGlobal();

	private final CompilerConfiguration configuration;
	private final CompilationUnit unit;
	private final String localRepo;

	public SetupConfigurationOperation(CompilationUnit unit) {
		this.configuration = unit.configuration();
		this.unit = unit;
		this.localRepo = configuration.localRepository().getAbsolutePath();
	}

	@Override
	public void call() throws CompilationFailedException {
		try {
			Language language = loadLanguage();
			DependencyResolver resolver = new DependencyResolver((Model) language.model(), null, null, null, null, null);
			resolver.resolve();
			unit.setLanguage(language);
			configuration.dsl().generationPackage(generationPackage());
		} catch (TaraException e) {
			LOG.severe(e.getMessage());
			unit.getErrorCollector().addException(e, null);
		} catch (DependencyException e) {
			LOG.severe(e.getMessage());
		}
	}

	private String generationPackage() {
		return generationPackage(LanguageLoader.getLanguagePath(configuration.dsl().groupId(), configuration.dsl().artifactId(), configuration.dsl().version(), localRepo));
	}

	private Language loadLanguage() throws TaraException {
		return LanguageLoader.load(configuration.dsl().groupId(), configuration.dsl().artifactId(), configuration.dsl().version(), localRepo);
	}

	String generationPackage(File language) {
		String name = configuration.dsl().artifactId();
		if (language.isDirectory() || !language.exists()) {
			return name;
		} else {
			try (JarFile jarFile = new JarFile(language)) {
				Manifest manifest = jarFile.getManifest();
				final Attributes tara = manifest.getAttributes("tara");
				return tara == null ? name : tara.getValue(GENERATION_PACKAGE.replace(".", "-"));
			} catch (IOException e) {
				LOG.severe(e.getMessage());
			}
		}
		return null;
	}
}