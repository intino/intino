package io.intino.tara.model.rules;

import java.io.File;

public interface CustomRule {

	Class<?> loadedClass();

	void setLoadedClass(Class<?> loadedClass);

	void classFile(File file);

	File classFile();

	String externalClass();
}
