package io.intino.tara.builder.codegeneration.language;

import io.intino.builder.CompilerConfiguration;
import io.intino.itrules.FrameBuilder;
import io.intino.itrules.formatters.StringFormatters;
import io.intino.tara.Language;
import io.intino.tara.builder.core.errorcollection.TaraException;
import io.intino.tara.builder.utils.FileSystemUtils;
import io.intino.tara.language.semantics.Constraint;
import io.intino.tara.language.semantics.Context;
import io.intino.tara.processors.model.Model;
import io.intino.tara.processors.utils.JavaCompiler;

import java.io.*;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.MessageFormat;
import java.util.*;
import java.util.jar.Attributes;
import java.util.jar.Attributes.Name;
import java.util.jar.JarEntry;
import java.util.jar.JarOutputStream;
import java.util.jar.Manifest;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import static io.intino.builder.BuildConstants.*;
import static io.intino.itrules.formatters.StringFormatters.lowerCase;
import static io.intino.tara.builder.utils.FileSystemUtils.writeBuffer;
import static io.intino.tara.builder.utils.Format.firstUpperCase;
import static io.intino.tara.builder.utils.Format.reference;
import static java.io.File.separator;

public class LanguageSerializer {
	private static final Logger LOG = Logger.getGlobal();
	private static final String JAVA = ".java";
	private static final String JAR = ".jar";
	private static final String TARA_LANG_PACKAGE = "io.intino.tara.language";
	private final CompilerConfiguration conf;
	private final Model model;
	private final Language language;

	public LanguageSerializer(Language language, CompilerConfiguration conf, Model model) throws TaraException {
		this.conf = conf;
		this.model = model;
		this.language = language;
	}

	public File serialize() throws TaraException {
		return serialize(new LanguageCreator(conf, model, language).create(), getDslDestination(), collectRules());
	}

	private List<File> collectRules() {
		Set<File> classes = new HashSet<>();
		classes.addAll(filesOf(model));
		classes.addAll(collectLanguageRules());
		return new ArrayList<>(classes);
	}

	private Collection<File> filesOf(Model model) {
		return model.rules().values();
	}

	private List<File> collectLanguageRules() {
		return language.catalog().values().stream()
				.flatMap(context -> getRulesOfContext(context).stream().map(LanguageSerializer::sourceOf).distinct())
				.collect(Collectors.toList());
	}

	private List<Class<?>> getRulesOfContext(Context context) {
		return context.constraints().stream()
				.filter(c -> c instanceof Constraint.Property)
				.flatMap(c -> ((Constraint.Property) c).rules().stream())
				.map(Object::getClass)
				.filter(r -> !r.getName().startsWith(TARA_LANG_PACKAGE))
				.collect(Collectors.toList());
	}

	private static File sourceOf(Class<?> c) {
		return new File(c.getProtectionDomain().getCodeSource().getLocation().getPath());
	}

	private File getDslDestination() {
		final File file = new File(conf.localRepository(), conf.groupId().replace(".", separator) + separator +
				StringFormatters.camelCase().format(conf.dsl().outDsl()).toString().toLowerCase() + separator + (conf.version() == null ? "1.0.0" : conf.version()));
		file.mkdirs();
		return new File(file, reference().format(firstUpperCase().format(conf.dsl().outDsl())) + JAVA);
	}

	private File serialize(String content, File javaFile, List<File> rules) throws TaraException {
		try {
			final File dslDirectory = javaFile.getParentFile();
			if (dslDirectory.exists()) FileSystemUtils.removeDir(dslDirectory);
			dslDirectory.mkdirs();
			Files.writeString(javaFile.toPath(), content);
			JavaCompiler.compile(javaFile, String.join(File.pathSeparator, collectClassPath(rules)), getDslDestination().getParentFile());
			serializeModel(dslDirectory);
			File pom = createPOM(dslDirectory);
			jar(dslDirectory, pom, rules.stream().filter(v -> !v.getName().startsWith(TARA_LANG_PACKAGE)).collect(Collectors.toList()));
			return jarFile(dslDirectory);
		} catch (Exception e) {
			throw new TaraException("Error serializing language: " + e.getMessage(), e);
		}
	}

	private void serializeModel(File dslDirectory) throws IOException {
		File file = new File(dslDirectory, StringFormatters.camelCase().format(conf.groupId()).toString().toLowerCase().replace(".", separator) + File.separator + conf.dsl().outDsl() + "-" + conf.version() + ".obj");
		ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(file));
		stream.writeObject(model);
		stream.close();
	}

	private File createPOM(File dslDirectory) throws IOException {
		String text = new POMTemplate().render(new FrameBuilder().add("POM").add("groupId", conf.groupId()).add("name", conf.dsl().outDsl()).add("version", conf.version()));
		File file = new File(jarFile(dslDirectory).getAbsolutePath().replace(JAR, ".pom"));
		Files.write(file.toPath(), text.getBytes());
		return file;
	}

	private Collection<String> collectClassPath(Collection<File> values) throws IOException {
		Set<String> dependencies = new HashSet<>();
		File languageLib = new File(Language.class.getProtectionDomain().getCodeSource().getLocation().getFile());
		dependencies.add(languageLib.getAbsolutePath());
		try {
			dependencies.add(Paths.get(language.getClass().getProtectionDomain().getCodeSource().getLocation().toURI()).toFile().getCanonicalPath().replaceAll("%20", " "));
			dependencies.addAll(values.stream()
					.filter(v -> !v.getName().startsWith(TARA_LANG_PACKAGE))
					.map(File::getPath)
					.toList());
		} catch (URISyntaxException ignored) {
		}
		return dependencies;
	}

	private void jar(File dslDir, File pom, List<File> rules) throws IOException {
		Manifest manifest = new Manifest();
		manifest.getMainAttributes().put(Name.MANIFEST_VERSION, "1.0");
		manifest.getMainAttributes().put(Name.IMPLEMENTATION_VERSION, conf.version());
		manifest.getEntries().put("tara", createTaraProperties());
		JarOutputStream target = new JarOutputStream(new FileOutputStream(jarFile(dslDir)), manifest);
		final File src = new File(dslDir, conf.groupId().split("\\.")[0]);
		src.mkdirs();
		add(dslDir, src, target);
		addPom(dslDir, pom, target);
		addRules(rules, target);
		addInheritedRules(target);
		target.close();
		FileSystemUtils.removeDir(new File(dslDir, "META-INF"));
		FileSystemUtils.removeDir(src);
	}

	private void addPom(File dslDir, File pom, JarOutputStream target) throws IOException {
		File dir = new File(dslDir, "META-INF/maven/" + conf.groupId().toLowerCase() + "/" + conf.artifactId().toLowerCase());
		dir.mkdirs();
		FileSystemUtils.copyFile(pom.getAbsolutePath(), new File(dir, "pom.xml").getAbsolutePath());
		Files.writeString(new File(dir, "pom.properties").toPath(), pomProperties());
		add(dslDir, new File(dslDir, "META-INF"), target);
	}

	private String pomProperties() {
		return MessageFormat.format("artifactId={0}\ngroupId={1}\nversion={2}\n", conf.artifactId(), conf.groupId(), conf.version());

	}

	private File jarFile(File dslDir) {
		return new File(dslDir, lowerCase().format(conf.dsl().outDsl()) + "-" + conf.version() + JAR);
	}

	private Attributes createTaraProperties() {
		final Attributes taraAttributes = new Attributes();
		taraAttributes.put(new Name(GROUP_ID), conf.groupId());
		taraAttributes.put(new Name(ARTIFACT_ID), conf.artifactId());
		taraAttributes.put(new Name(VERSION), conf.version());
		taraAttributes.put(new Name(normalize(DSL)), conf.dsl().groupId() + ":" + conf.dsl().artifactId() + ":" + conf.dsl().version());
		taraAttributes.put(new Name(normalize(DSL_VERSION)), conf.dsl().version());
		taraAttributes.put(new Name(normalize(OUT_DSL)), conf.dsl().outDsl());
		taraAttributes.put(new Name(normalize(BUILDER_GROUP_ID)), conf.dsl().builder().groupId());
		taraAttributes.put(new Name(normalize(BUILDER_ARTIFACT_ID)), conf.dsl().builder().artifactId());
		taraAttributes.put(new Name(normalize(BUILDER_VERSION)), conf.dsl().builder().version());
		taraAttributes.put(new Name(normalize(RUNTIME_GROUP_ID)), conf.dsl().runtime().groupId());
		taraAttributes.put(new Name(normalize(RUNTIME_ARTIFACT_ID)), conf.dsl().runtime().artifactId());
		taraAttributes.put(new Name(normalize(RUNTIME_VERSION)), conf.dsl().runtime().version());
		taraAttributes.put(new Name(normalize(GENERATION_PACKAGE)), conf.generationPackage());
		return taraAttributes;
	}

	private String normalize(String tag) {
		return tag.replace(".", "-");
	}

	private void addInheritedRules(JarOutputStream target) {
		final File tempDirectory = conf.getTempDirectory();
		FileSystemUtils.removeDir(tempDirectory);
		FileSystemUtils.extractJar(language.getClass().getProtectionDomain().getCodeSource().getLocation().getPath(), tempDirectory);
		final File[] languageDirectories = languageDirectory(tempDirectory);
		List<File> rules = new ArrayList<>();
		for (File d : languageDirectories) FileSystemUtils.getAllFiles(d, rules);
		rules.stream().filter(f -> f.getName().endsWith(".class")).forEach(r -> {
			try {
				add(conf.getTempDirectory(), r, target);
			} catch (IOException e) {
				LOG.log(Level.SEVERE, e.getMessage(), e);
			}
		});
	}

	private File[] languageDirectory(File tempDirectory) {
		return tempDirectory.listFiles(file -> file.isDirectory() && !file.getName().equals("META-INF") && !file.getName().equals("tara"));
	}

	private void addRules(List<File> rules, JarOutputStream target) throws IOException {
		HashMap<File, String> ruleFiles = new HashMap<>();
		for (File rule : rules) {
			List<File> files = new ArrayList<>();
			FileSystemUtils.getAllFiles(rule, files);
			for (File file : files) ruleFiles.put(file, rule.getAbsolutePath());
		}
		for (Map.Entry<File, String> entry : ruleFiles.entrySet())
			add(new File(entry.getValue()), entry.getKey(), target);
	}

	private void add(File base, File source, JarOutputStream target) throws IOException {
		BufferedInputStream in = null;
		try {
			if (source.isDirectory()) {
				createDirectory(base, source, target);
				return;
			}
			JarEntry entry = new JarEntry(getRelativePath(base, source).replace("\\", "/"));
			entry.setTime(source.lastModified());
			target.putNextEntry(entry);
			in = writeEntry(source, target);
			target.closeEntry();
		} finally {
			if (in != null) in.close();
		}
	}

	private BufferedInputStream writeEntry(File source, OutputStream target) throws IOException {
		BufferedInputStream in;
		in = new BufferedInputStream(new FileInputStream(source));
		writeBuffer(in, target);
		return in;
	}

	private void createDirectory(File base, File source, JarOutputStream target) throws IOException {
		String name = getRelativePath(base, source).replace("\\", "/");
		if (!name.isEmpty()) createEntry(source, target, name);
		for (File nestedFile : Objects.requireNonNull(source.listFiles()))
			add(base, nestedFile, target);
	}

	private void createEntry(File source, JarOutputStream target, String name) throws IOException {
		if (!name.endsWith("/")) name += "/";
		JarEntry entry = new JarEntry(name);
		entry.setTime(source.lastModified());
		target.putNextEntry(entry);
		target.closeEntry();
	}

	private String getRelativePath(File base, File source) {
		return source.getPath().replace(base.getAbsolutePath() + separator, "");
	}
}