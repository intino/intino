package io.intino.tara.processors.dependencyresolution;

import io.intino.tara.model.rules.CustomRule;
import io.intino.tara.model.rules.custom.Url;
import io.intino.tara.processors.utils.Format;
import io.intino.tara.processors.utils.JavaCompiler;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.logging.Level;
import java.util.logging.Logger;

class CustomRuleLoader {

	private static final Logger LOG = Logger.getGlobal();

	private CustomRuleLoader() {
	}

	static File compile(CustomRule rule, String workingPackage, File rulesDirectory, File classPath, File tempDirectory) throws IOException {
		try {
			final File source = new File(rulesDirectory, rule.externalClass() + ".java");
			if (source.exists()) {
				compile(source, classPath, tempDirectory);
				return new File(tempDirectory, composeQualifiedName(workingPackage, rule.externalClass()).replace(".", File.separator) + ".class");
			} else return null;
		} catch (Exception e) {
			throw new IOException(e.getMessage());
		}
	}

	static Class<?> load(CustomRule rule, String workingPackage, File classPath, File tempDirectory) {
		return load(rule.externalClass(), workingPackage, tempDirectory, classPath);
	}

	static Class<?> tryAsProvided(CustomRule rule) {
		try {
			return Class.forName(Url.class.getPackage().getName() + "." + Format.firstUpperCase(rule.externalClass()));
		} catch (ClassNotFoundException e) {
			return null;
		}
	}

	private static File compile(File source, File classPath, File compilationDirectory) throws Exception {
		JavaCompiler.compile(source, classPath.getAbsolutePath(), compilationDirectory);
		compilationDirectory.deleteOnExit();
		return compilationDirectory;
	}

	public static Class<?> load(String source, String workingPackage, File baseDirectory, File classPath) {
		return AccessController.doPrivileged((PrivilegedAction<Class<?>>) () -> {
			try {
				URL url = baseDirectory.toURI().toURL();
				URL[] urls = new URL[]{url, classPath.toURI().toURL()};
				ClassLoader cl = new URLClassLoader(urls);
				return cl.loadClass(composeQualifiedName(workingPackage, source));
			} catch (ClassNotFoundException | MalformedURLException e) {
				LOG.log(Level.SEVERE, "Error loading class " + source + " in " + baseDirectory.getAbsolutePath());
			}
			return null;
		});
	}

	static String composeQualifiedName(String workingPackage, String aClass) {
		return workingPackage.toLowerCase() + ".rules." + aClass;
	}
}
