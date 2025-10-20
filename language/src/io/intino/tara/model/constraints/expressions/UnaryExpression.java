package io.intino.tara.model.constraints.expressions;

import io.intino.tara.model.constraints.context.EvaluationContext;

import java.math.BigDecimal;

public abstract class UnaryExpression implements Expression {
	private static final long serialVersionUID = 1L;
	private static final BigDecimal BD_LONG_MIN_VALUE = BigDecimal.valueOf(Long.MIN_VALUE);
	protected Expression left;

	public UnaryExpression(Expression left) {
		this.left = left;
	}

	public static UnaryExpression createNegate(Expression left) {
		return new UnaryExpression(left) {
			public Object evaluate(EvaluationContext context) throws Exception {
				Object rvalue = left.evaluate(context);
				if (rvalue == null) return null;
				if (rvalue instanceof Number) return negate((Number) rvalue);
				return null;
			}

			public String getExpressionSymbol() {
				return "-";
			}
		};
	}

	abstract static class BooleanUnaryExpression extends UnaryExpression implements BooleanExpression {
		public BooleanUnaryExpression(Expression left) {
			super(left);
		}

		public boolean matches(EvaluationContext context) throws Exception {
			return evaluate(context) == Boolean.TRUE;
		}
	}

	public static BooleanExpression createNOT(BooleanExpression left) {
		return new NotExpression(left);
	}

	public static BooleanExpression createBooleanCast(Expression left) {
		return new BooleanUnaryExpression(left) {
			public Object evaluate(EvaluationContext context) throws Exception {
				Object rvalue = left.evaluate(context);
				if (rvalue == null) return null;
				if (!rvalue.getClass().equals(Boolean.class)) return Boolean.FALSE;
				return (Boolean) rvalue ? Boolean.TRUE : Boolean.FALSE;
			}

			public String toString() {
				return left.toString();
			}

			public String getExpressionSymbol() {
				return "";
			}
		};
	}

	private static Number negate(Number left) {
		Class<?> clazz = left.getClass();
		if (clazz == Integer.class) return -left.intValue();
		else if (clazz == Long.class) return -left.longValue();
		else if (clazz == Float.class) return -left.floatValue();
		else if (clazz == Double.class) return -left.doubleValue();
		else if (clazz == BigDecimal.class) {
			BigDecimal bd = (BigDecimal) left;
			bd = bd.negate();
			if (BD_LONG_MIN_VALUE.compareTo(bd) == 0) return Long.MIN_VALUE;
			return bd;
		} else throw new RuntimeException("Don't know how to negate: " + left);
	}

	public Expression getLeft() {
		return left;
	}

	public void setLeft(Expression expression) {
		left = expression;
	}


	public String toString() {
		return "(" + getExpressionSymbol() + " " + left.toString() + ")";
	}

	public int hashCode() {
		return toString().hashCode();
	}

	public boolean equals(Object o) {
		if (o == null || !this.getClass().equals(o.getClass())) return false;
		return toString().equals(o.toString());
	}

	public abstract String getExpressionSymbol();

	private static class NotExpression extends BooleanUnaryExpression {
		public NotExpression(BooleanExpression right) {
			super(right);
		}

		public Object evaluate(EvaluationContext context) throws Exception {
			Boolean lvalue = (Boolean) left.evaluate(context);
			if (lvalue == null) return null;
			return lvalue ? Boolean.FALSE : Boolean.TRUE;
		}

		@Override
		public boolean matches(EvaluationContext context) throws Exception {
			Boolean lvalue = (Boolean) left.evaluate(context);
			return lvalue != null && !lvalue;
		}

		public String getExpressionSymbol() {
			return "not";
		}
	}
}