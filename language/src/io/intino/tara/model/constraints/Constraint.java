package io.intino.tara.model.constraints;

import io.intino.tara.model.Element;
import io.intino.tara.model.Mogram;
import io.intino.tara.model.constraints.context.MogramContext;
import io.intino.tara.model.constraints.expressions.Expression;

import java.net.URI;

public class Constraint implements Element {
	private static final long serialVersionUID = 7700837726655946516L;
	private final URI source;
	private final String name;
	private final String message;
	private final TextRange range;
	private Expression expression;

	public Constraint(URI source, String name, String message, TextRange range) {
		this.source = source;
		this.name = name;
		this.message = message;
		this.range = range;
	}

	public String name() {
		return name;
	}

	public String message() {
		return message;
	}

	public Expression expression() {
		return expression;
	}

	public void expression(Expression expression) {
		this.expression = expression;
	}

	public Boolean evaluate(Mogram mogram) throws Exception {
		return (Boolean) expression.evaluate(new MogramContext(mogram));
	}

	@Override
	public URI source() {
		return this.source;
	}

	@Override
	public int line() {
		return textRange().startLine();
	}

	@Override
	public TextRange textRange() {
		return this.range;
	}

	@Override
	public String doc() {
		return "";
	}
}
