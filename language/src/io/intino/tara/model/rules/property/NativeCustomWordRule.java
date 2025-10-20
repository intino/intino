package io.intino.tara.model.rules.property;

import io.intino.tara.model.rules.CustomRule;

import java.io.File;
import java.util.Collections;
import java.util.List;

public class NativeCustomWordRule extends FunctionRule implements CustomRule {
	private static final long serialVersionUID = 1L;
	private final List<String> words;
	private final String externalWordClass;
	private transient File classFile;

	public NativeCustomWordRule(List<String> words, String externalWordClass) {
		super(externalWordClass, "", Collections.emptyList());
		this.words = words;
		this.externalWordClass = externalWordClass;
	}

	public List<String> words() {
		return words;
	}


	public String source() {
		return externalWordClass;
	}

	@Override
	public String toString() {
		return "NativeCustomWordRule{" + String.join(",", words) + '}';
	}

	@Override
	public Class<?> loadedClass() {
		return null;
	}

	@Override
	public void setLoadedClass(Class<?> loadedClass) {

	}

	@Override
	public void classFile(File file) {
		this.classFile = file;
	}

	@Override
	public File classFile() {
		return this.classFile;
	}

	@Override
	public String externalClass() {
		return externalWordClass;
	}
}
