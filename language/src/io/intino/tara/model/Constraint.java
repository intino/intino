package io.intino.tara.model;

import io.intino.tara.model.constraints.expressions.Expression;

public interface Constraint extends Element {

	String name();

	String message();

	Expression expression();

	Boolean evaluate(Mogram mogram) throws Exception;
}
