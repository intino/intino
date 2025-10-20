package io.intino.tara.model.constraints.expressions.binary;

import io.intino.tara.model.constraints.context.EvaluationContext;
import io.intino.tara.model.constraints.expressions.BooleanExpression;
import io.intino.tara.model.constraints.expressions.Expression;
import io.intino.tara.model.constraints.expressions.UnaryExpression;

import java.util.regex.Pattern;

import static io.intino.tara.model.constraints.expressions.ComparisonExpression.REGEXP_CONTROL_CHARS;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class LikeExpression extends UnaryExpression implements BooleanExpression {
	private static final long serialVersionUID = 1L;
	Pattern likePattern;

	public LikeExpression(Expression right, String like, int escape) {
		super(right);

		StringBuffer regexp = new StringBuffer(like.length() * 2);
		regexp.append("\\A");
		for (int i = 0; i < like.length(); i++) {
			char c = like.charAt(i);
			if (escape == (0xFFFF & c) && shouldEscapeNext(like, i, c)) {
				i++;
				char t = like.charAt(i);
				regexp.append("\\x");
				regexp.append(Integer.toHexString(0xFFFF & t));
			} else {
				append(regexp, c);
			}
		}
		regexp.append("\\z");
		likePattern = Pattern.compile(regexp.toString(), Pattern.DOTALL);
	}

	private boolean shouldEscapeNext(String selector, int i, char escape) {
		int next = i + 1;
		if (next < selector.length()) {
			final char c = selector.charAt(next);
			return (c == '_' || c == '%' || c == escape);
		}
		return false;
	}

	private void append(StringBuffer regexp, char c) {
		if (c == '%') regexp.append(".*?");
		else if (c == '_') regexp.append(".");
		else if (REGEXP_CONTROL_CHARS.contains(c))
			regexp.append("\\x").append(Integer.toHexString(0xFFFF & c));
		else regexp.append(c);
	}

	public String getExpressionSymbol() {
		return "LIKE";
	}

	public Object evaluate(EvaluationContext context) throws Exception {
		Object rv = this.getLeft().evaluate(context);
		if (rv == null) return null;
		if (!(rv instanceof String)) return FALSE;
		return likePattern.matcher((String) rv).matches() ? TRUE : FALSE;
	}

	public boolean matches(EvaluationContext context) throws Exception {
		Object object = evaluate(context);
		return object == TRUE;
	}
}
