package io.intino.tara.model.constraints.expressions.functions;


import io.intino.tara.model.constraints.context.EvaluationContext;
import io.intino.tara.model.constraints.expressions.FunctionCallExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Filter function that matches a value against a regular expression.
 * <p/>
 * <p style="margin-left: 4em">
 * REGEX( 'A.B', 'A-B' )
 * </p>
 * <p/>
 * Note that the regular expression is not anchored; use the anchor characters, ^ and $, as-needed.  For example,
 * REGEX( 'AA', 'XAAX' ) evaluates to true while REGEX( '^AA$' , 'XAAX' ) evaluates to false.
 */
public class RegexMatchFunction implements FilterFunction {
	private static final long serialVersionUID = 1L;

	public boolean isValid(FunctionCallExpression expr) {
		return expr.getNumArguments() == 2;
	}

	public boolean returnsBoolean(FunctionCallExpression expr) {
		return true;
	}

	public Object evaluate(FunctionCallExpression expr, EvaluationContext context) throws Exception {
		Pattern pattern;
		Object reg = expr.getArgument(0).evaluate(context);
		if (reg != null) {
			String reg_str = reg instanceof String ? (String) reg : reg.toString();
			Object cand = expr.getArgument(1).evaluate(context);
			if (cand != null) {
				pattern = Pattern.compile(reg_str);
				Matcher matchEng = pattern.matcher(cand instanceof String ? (String) cand : cand.toString());
				return matchEng.find();
			}
		}
		return Boolean.FALSE;
	}
}