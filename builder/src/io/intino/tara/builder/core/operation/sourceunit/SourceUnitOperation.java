package io.intino.tara.builder.core.operation.sourceunit;

import io.intino.tara.builder.core.SourceUnit;
import io.intino.tara.builder.core.errorcollection.CompilationFailedException;
import io.intino.tara.builder.core.operation.Operation;

public abstract class SourceUnitOperation implements Operation {
	public abstract void call(SourceUnit unit) throws CompilationFailedException;
}
