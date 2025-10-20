package io.intino.tara.builder.core.operation.model;

import io.intino.tara.builder.core.CompilationUnit;
import io.intino.tara.builder.core.errorcollection.CompilationFailedException;
import io.intino.tara.builder.core.operation.Operation;
import io.intino.tara.processors.model.Model;

public abstract class ModelOperation implements Operation {
	protected final CompilationUnit unit;

	public ModelOperation(CompilationUnit unit) {
		this.unit = unit;
	}

	public abstract void call(Model model) throws CompilationFailedException;
}