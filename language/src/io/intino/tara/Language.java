package io.intino.tara;

import io.intino.tara.language.semantics.Assumption;
import io.intino.tara.language.semantics.Constraint;
import io.intino.tara.language.semantics.Context;
import io.intino.tara.model.Level;
import io.intino.tara.model.MogramRoot;

import java.util.List;
import java.util.Locale;
import java.util.Map;

public interface Language {

	String[] lexicon();

	Map<String, Context> catalog();

	Level level(String qualifiedName);

	List<Constraint> constraints(String qualifiedName);

	List<Assumption> assumptions(String qualifiedName);

	List<String> types(String qualifiedName);

	String languageName();

	Locale locale();

	MogramRoot model();

	String metaLanguage();
}
