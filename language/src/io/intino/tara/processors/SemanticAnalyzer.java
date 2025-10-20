package io.intino.tara.processors;

import io.intino.tara.Language;
import io.intino.tara.language.semantics.errorcollector.SemanticException;
import io.intino.tara.language.semantics.errorcollector.SemanticFatalException;
import io.intino.tara.model.Mogram;
import io.intino.tara.model.MogramRoot;

import java.util.ArrayList;
import java.util.List;

public class SemanticAnalyzer {
	private final MogramRoot root;
	private final Resolver resolver;
	private final Checker checker;
	private final List<SemanticException> exceptions;

	public SemanticAnalyzer(MogramRoot root, Language language) {
		this.root = root;
		resolver = new Resolver(language);
		checker = new Checker(language);
		exceptions = new ArrayList<>();
	}

	public void analyze() throws SemanticFatalException {
		checker.check(root);
		root.mograms().forEach(this::resolve);
		root.mograms().forEach(this::check);
		if (!exceptions.isEmpty()) throw new SemanticFatalException(exceptions);
	}

	private void resolve(Mogram mogram) {
		resolver.resolve(mogram);
		mogram.mograms().forEach(this::resolve);
	}

	private void check(Mogram mogram) {
		try {
			checker.check(mogram);
			mogram.mograms().forEach(this::check);
//			mogram.referenceComponents().forEach();TODO
		} catch (SemanticFatalException e) {
			exceptions.addAll(e.exceptions());
			if (!hasFatal(e.exceptions())) mogram.components().forEach(this::check);
		}
	}

	private boolean hasFatal(List<SemanticException> exceptions) {
		return exceptions.stream().anyMatch(SemanticException::isFatal);
	}
}