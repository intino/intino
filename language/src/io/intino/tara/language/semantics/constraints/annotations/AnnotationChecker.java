package io.intino.tara.language.semantics.constraints.annotations;

import io.intino.tara.language.semantics.errorcollector.SemanticException;
import io.intino.tara.model.Mogram;

public interface AnnotationChecker {
	void check(Mogram mogram) throws SemanticException;
}
