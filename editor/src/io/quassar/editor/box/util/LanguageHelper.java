package io.quassar.editor.box.util;

import io.intino.alexandria.Resource;
import io.intino.alexandria.exceptions.InternalServerError;
import io.intino.alexandria.exceptions.NotFound;
import io.intino.alexandria.logger.Logger;
import io.intino.builderservice.schemas.Message;
import io.quassar.editor.box.EditorBox;
import io.quassar.editor.box.builder.BuildResult;
import io.quassar.editor.box.builder.ModelBuilder;
import io.quassar.editor.box.ui.types.LanguageTab;
import io.quassar.editor.model.*;
import org.eclipse.lsp4j.services.LanguageServer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.function.Function;

import static java.util.Collections.emptyList;

public class LanguageHelper {

	public static BuildResult rebuild(Model model, Language language, LanguageRelease release, String author, EditorBox box) {
		File destination = null;
		try {
			BuildResult result = new ModelBuilder(model, Model.DraftRelease, new GavCoordinates(language.collection(), language.name(), release.version()), box).build(author);
			if (!result.success()) return result;
			Resource resource = result.zipArtifacts();
			destination = box.archetype().tmp().builds(UUID.randomUUID().toString());
			TarHelper.extract(resource.inputStream(), destination);
			box.languageManager().saveDsl(language, release.version(), LanguageHelper.dslOf(destination));
			box.languageManager().saveDslManifest(language, release.version(), LanguageHelper.dslManifestOf(destination));
			box.languageManager().saveLsp(language, release.version(), LanguageHelper.lspOf(destination));
			box.languageManager().saveLspManifest(language, release.version(), LanguageHelper.lspManifestOf(destination));
			box.languageManager().saveGraph(language, release.version(), LanguageHelper.graphOf(destination));
			box.languageManager().saveParsers(language, release.version(), LanguageHelper.parsersOf(destination));
			return result;
		}
		catch (Exception | InternalServerError | NotFound e) {
			Logger.error(e);
			return BuildResult.failure(List.of(new Message().content(e.getMessage()).kind(Message.Kind.ERROR)));
		} finally {
			if (destination != null) destination.delete();
		}
	}

	public static boolean hasExamples(Language language) {
		return language != null && language.lastRelease() != null && !language.lastRelease().examples().isEmpty();
	}

	public static void generateLogo(String language, File destiny) {
		try {
			BufferedImage image = new LanguageLogoGenerator().put(language.charAt(0)).image();
			ImageIO.write(image, "png", destiny);
		} catch (IOException e) {
			Logger.error(e);
		}
	}

	public static final String TaraDslPackage = "tara.dsl.";
	public static final String MavenDslFile = "%s/repository/tara/dsl/%s/%s/%s-%s.jar";
	public static File mavenDslFile(Model metamodel, String version, EditorBox box) {
		return new File(MavenDslFile.formatted(box.configuration().languageRepository(), mavenDirectory(metamodel.name()), version, Formatters.normalizeLanguageName(metamodel.name()), version));
	}

	public static File mavenDslFile(Language language, String version, EditorBox box) {
		return new File(MavenDslFile.formatted(box.configuration().languageRepository(), mavenDirectory(language.name()), version, Formatters.normalizeLanguageName(language.name()), version));
	}

	public static String title(LanguageTab tab) {
		if (tab == LanguageTab.Help) return "help %s";
		else if (tab == LanguageTab.Examples) return "examples %s";
		return "about %s";
	}

	public static String title(GavCoordinates release) {
		return release.artifactId().toLowerCase() + " " + release.version();
	}

	public static Model model(Language language, EditorBox box) {
		return box.modelManager().get(language.metamodel());
	}

	public static URL logo(Language language, LogoSize size, EditorBox box) {
		try {
			if (language == null) return ModelHelper.class.getResource("/images/language-logo.png");
			File logo = box.languageManager().loadLogo(language, size);
			return logo.exists() ? logo.toURI().toURL() : ModelHelper.class.getResource("/images/language-logo.png");
		} catch (MalformedURLException e) {
			Logger.error(e);
			return null;
		}
	}

	private static String mavenDirectory(String name) {
		return name.toLowerCase().replace("-", "");
	}

	private static final String LanguageDir = "language";
	public static File dslOf(File destination) {
		File[] files = destination.listFiles();
		if (files == null) return null;
		File dir = Arrays.stream(files).filter(f -> f.getName().equals(LanguageDir)).findFirst().orElse(null);
		if (dir == null) return null;
		File[] languageFiles = dir.listFiles();
		if (languageFiles == null) return null;
		return Arrays.stream(languageFiles).filter(l -> l.getName().endsWith(".jar")).findFirst().orElse(null);
	}

	public static File dslManifestOf(File destination) {
		File[] files = destination.listFiles();
		if (files == null) return null;
		File dir = Arrays.stream(files).filter(f -> f.getName().equals(LanguageDir)).findFirst().orElse(null);
		if (dir == null) return null;
		File[] languageFiles = dir.listFiles();
		if (languageFiles == null) return null;
		return Arrays.stream(languageFiles).filter(l -> l.getName().endsWith(".pom")).findFirst().orElse(null);
	}

	public static File lspOf(File destination) {
		File[] files = destination.listFiles();
		if (files == null) return null;
		File dir = Arrays.stream(files).filter(f -> f.getName().endsWith(ArtifactoryHelper.LanguageServer)).findFirst().orElse(null);
		if (dir == null) return null;
		File[] languageFiles = dir.listFiles();
		if (languageFiles == null) return null;
		return Arrays.stream(languageFiles).filter(l -> l.getName().endsWith(".jar")).findFirst().orElse(null);
	}

	public static File lspManifestOf(File destination) {
		File[] files = destination.listFiles();
		if (files == null) return null;
		File dir = Arrays.stream(files).filter(f -> f.getName().endsWith(ArtifactoryHelper.LanguageServer)).findFirst().orElse(null);
		if (dir == null) return null;
		File[] languageFiles = dir.listFiles();
		if (languageFiles == null) return null;
		return Arrays.stream(languageFiles).filter(l -> l.getName().endsWith(".pom")).findFirst().orElse(null);
	}

	private static final String GraphFilename = "graph.json";
	public static File graphOf(File destination) {
		File[] files = destination.listFiles();
		if (files == null) return null;
		return Arrays.stream(files).filter(f -> f.getName().equals(GraphFilename)).findFirst().orElse(null);
	}

	public static List<File> parsersOf(File destination) throws Exception {
		File[] files = destination.listFiles();
		if (files == null) return emptyList();
		return compressed(Arrays.stream(files).filter(f -> f.isDirectory() && !f.getName().equals(LanguageDir)).toList());
	}

	private static List<File> compressed(List<File> list) throws Exception {
		List<File> result = new ArrayList<>();
		for (File file : list) {
			File zipFile = new File(file.getParent(), file.getName().substring(file.getName().lastIndexOf("-")+1) + ".zip");
			ZipHelper.zip(file.toPath(), zipFile.toPath());
			result.add(zipFile);
		}
		return result;
	}

	public static String label(Language language, Function<String, String> translator) {
		if (language.isFoundational()) return language.name();
		return translator.apply("%s by %s").formatted(language.name().toLowerCase(), language.collection());
	}
}
