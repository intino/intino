package io.intino.tara.builder.core.operation.sourceunit;

import io.intino.tara.builder.core.SourceUnit;
import io.intino.tara.builder.core.errorcollection.CompilationFailedException;
import io.intino.tara.builder.core.operation.Operation;

import java.util.Collection;

public abstract class SourceUnitCollectionOperation implements Operation {
	public abstract void call(Collection<SourceUnit> units) throws CompilationFailedException;
}

