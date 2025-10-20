package io.intino.tara.builder;

import io.intino.Configuration;
import io.intino.builder.CompilerConfiguration;

import java.io.File;
import java.net.URI;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static io.intino.builder.BuildConstants.ENCODING;
import static io.intino.builder.BuildConstants.LEVEL;

public class Tarac {
	public static void main(String[] args) {
		if (args[0].equals("--help")) {
			System.out.println(help());
			return;
		}
		TaraCompilerRunner runner = new TaraCompilerRunner(false, Collections.emptyList());
		runner.run(loadConfiguration(args), new FileSourceProvider(sourcesFrom(args)));
	}

	private static String help() {
		return "Usage: tarac <options> <source files>\nwhere possible options include:\n" +
			   "  --level <level>         		REQUIRED. Specify the abstraction level in MDE: model (1), meta-model (2), meta-meta-model (3)\n" +
			   "  --dsl <name:version> 			REQUIRED. Specify the name and version of the language used for define models\n" +
			   "  --out-dsl <name:version>      REQUIRED. Specify the name and version of the language created. Not necessary if level is model\n" +
			   "  --dsl-repository <directory>  Specify the directory where the where the language will be found and out language will be created. Used '~/.m2/repository' as default\n" +
			   "  --encoding <encoding>         Specify character encoding used by source files. UTF-8 is used by default\n";
	}

	private static Map<URI, Boolean> sourcesFrom(String[] args) {
		return Arrays.stream(args)
				.dropWhile(a -> a.startsWith("-"))
				.map(pathname -> new File(pathname).toURI())
				.collect(Collectors.toMap(f -> f, f -> true, (a, b) -> b, LinkedHashMap::new));
	}

	private static CompilerConfiguration loadConfiguration(String[] args) {
		Map<String, String> arguments = Arrays.stream(args)
				.takeWhile(a -> a.startsWith("-"))
				.map(a -> a.split(" "))
				.collect(Collectors.toMap(a -> a[0].replace("-", ""), a -> a[1]));
		CompilerConfiguration conf = new CompilerConfiguration();
		arguments.keySet().forEach(name -> processArg(conf, name, arguments.get(name)));
		return conf;
	}

	private static void processArg(CompilerConfiguration conf, String name, String value) {
		switch (name) {
			case "dslrepository" -> conf.localRepository(new File(value));
			case "outdsl" -> {
				final String[] dsl = value.trim().split(":");
				conf.dsl().outDsl(dsl[0]);
				conf.version(dsl[1]);
				if (conf.module() == null) conf.module(dsl[0]);
				if (conf.generationPackage() == null) conf.generationPackage(dsl[0]);
			}
			case ENCODING -> conf.sourceEncoding(value);
			case LEVEL -> conf.dsl().level(Configuration.Artifact.Dsl.Level.values()[Integer.parseInt(value) - 1]);
			case "dsl" -> {
				final String[] aDsl = value.trim().split(":");
				conf.dsl().groupId(aDsl[0]).artifactId(aDsl[1]).version(aDsl[2]);
			}
			default -> {
			}
		}
	}
}
