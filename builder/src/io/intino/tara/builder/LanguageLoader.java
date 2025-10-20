package io.intino.tara.builder;

import io.intino.tara.Language;
import io.intino.tara.Tara;
import io.intino.tara.builder.core.errorcollection.TaraException;
import io.intino.tara.builder.utils.Format;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;


public class LanguageLoader {
	private LanguageLoader() {
	}

	public static Language load(String groupId, String artifactId, String version, String languagesDirectory) throws TaraException {
		String languageClass = groupId + "." + Format.toCamelCase().format(artifactId);
		Language language = loadFromResources(languageClass);
		if (language != null) return language;
		return loadFromRepository(groupId, artifactId, version, languagesDirectory, languageClass);
	}

	private static Language loadFromResources(String languageClass) {
		try {
			Class<?> cls = LanguageLoader.class.getClassLoader().loadClass(languageClass);
			if (cls != null) return (Language) cls.getConstructors()[0].newInstance();
		} catch (ClassNotFoundException | InvocationTargetException | InstantiationException |
				 IllegalAccessException ignored) {
		}
		return null;
	}

	private static Language loadFromRepository(String groupId, String artifactId, String version, String languagesDirectory, String languageClass) throws TaraException {
		String errorMessage = "Impossible to load " + artifactId;
		try {
			File jar = getLanguagePath(groupId, artifactId, version, languagesDirectory);
			if (!jar.exists()) throw new TaraException(errorMessage + ". Language file not found: " + jar.getPath());
			ClassLoader cl = new URLClassLoader(new URL[]{jar.toURI().toURL()}, Tara.class.getClassLoader());
			Class<?> cls = cl.loadClass(languageClass);
			return (Language) cls.getConstructors()[0].newInstance();
		} catch (MalformedURLException | ClassNotFoundException | InstantiationException | IllegalAccessException |
				 InvocationTargetException e) {
			throw new TaraException(errorMessage + ": " + (e.getMessage() != null ? e.getMessage() : e.getCause()), e);
		}
	}

	public static File getLanguagePath(String groupId, String artifactId, String version, String languagesDirectory) {
		String groupIdPath = groupId.replace(".", File.separator).toLowerCase();
		String effectiveVersion = version.equals("LATEST") ? findLatestVersion(new File(String.join(languagesDirectory, groupIdPath, artifactId.toLowerCase()))) : version;
		return new File(String.join(File.separator, languagesDirectory, groupIdPath, artifactId.toLowerCase(), effectiveVersion), artifactId.toLowerCase() + "-" + effectiveVersion + ".jar");
	}

	private static String findLatestVersion(File languageDirectory) {
		final File[] files = languageDirectory.listFiles(File::isDirectory);
		if (files == null || files.length == 0) return "1.0.0";
		return files[files.length - 1].getName();
	}
}