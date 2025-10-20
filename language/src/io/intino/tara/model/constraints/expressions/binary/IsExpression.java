package io.intino.tara.model.constraints.expressions.binary;

import io.intino.tara.model.Mogram;
import io.intino.tara.model.constraints.context.EvaluationContext;
import io.intino.tara.model.constraints.expressions.ComparisonExpression;
import io.intino.tara.model.constraints.expressions.Expression;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class IsExpression extends ComparisonExpression {
	private static final long serialVersionUID = 1L;

	public IsExpression(Expression left, Expression right) {
		super(left, right);
	}

	public Object evaluate(EvaluationContext context) throws Exception {
		Object lv = left.evaluate(context);
		Object rv = right.evaluate(context);
		if (lv == null ^ rv == null) return lv == null ? null : FALSE;
		if (lv instanceof Mogram m && rv instanceof String) {
			return m.types().contains(rv) || m.shortType().equals(rv) || m.appliedFacets().stream().anyMatch(f -> f.type().equals(rv));
		}
		if (lv == rv || lv.equals(rv)) return TRUE;
		if (lv instanceof Comparable && rv instanceof Comparable) return compare((Comparable) lv, (Comparable) rv);
		return FALSE;
	}

	@Override
	public boolean matches(EvaluationContext context) throws Exception {
		Object lv = left.evaluate(context);
		Object rv = right.evaluate(context);
		if (lv == null ^ rv == null) return false;
		if (lv == rv || lv.equals(rv)) return true;
		if (lv.getClass() == rv.getClass()) return false;
		if (lv instanceof Comparable && rv instanceof Comparable) {
			Boolean compareResult = compare((Comparable) lv, (Comparable) rv);
			return compareResult != null && compareResult;
		}
		return false;
	}

	protected boolean asBoolean(int answer) {
		return answer == 0;
	}

	public String getExpressionSymbol() {
		return "is";
	}
}
