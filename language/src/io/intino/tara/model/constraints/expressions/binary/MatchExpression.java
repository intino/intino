package io.intino.tara.model.constraints.expressions.binary;

import io.intino.tara.model.constraints.context.EvaluationContext;
import io.intino.tara.model.constraints.expressions.BinaryExpression;
import io.intino.tara.model.constraints.expressions.BooleanExpression;
import io.intino.tara.model.constraints.expressions.ConstantExpression;
import io.intino.tara.model.constraints.expressions.Expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Boolean.TRUE;

public class MatchExpression extends BinaryExpression implements BooleanExpression {
	private static final long serialVersionUID = 1L;
	private final Pattern pattern;

	public MatchExpression(Expression left, ConstantExpression right, int escape) {
		super(left, right);
		pattern = Pattern.compile(right.getValue().toString());
	}

	public String getExpressionSymbol() {
		return "matches";
	}

	public Object evaluate(EvaluationContext context) throws Exception {
		Object candidate = this.left.evaluate(context);
		if (candidate == null) return false;
		Matcher matcher = pattern.matcher(candidate instanceof String ? (String) candidate : candidate.toString());
		return matcher.find();
	}

	public boolean matches(EvaluationContext context) throws Exception {
		return evaluate(context) == TRUE;
	}

}
