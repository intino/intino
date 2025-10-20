package io.intino.tara.model.constraints.expressions;

import io.intino.tara.model.constraints.context.EvaluationContext;
import io.intino.tara.model.constraints.expressions.binary.*;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import static io.intino.tara.model.constraints.expressions.UnaryExpression.createNOT;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public abstract class ComparisonExpression extends BinaryExpression implements BooleanExpression, Serializable {
	private static final long serialVersionUID = 1L;
	transient boolean convertStringExpressions;
	public static final Set<Character> REGEXP_CONTROL_CHARS = new HashSet<>();

	public ComparisonExpression(Expression left, Expression right) {
		super(left, right);
		convertStringExpressions = true;
	}

	static {
		REGEXP_CONTROL_CHARS.add('.');
		REGEXP_CONTROL_CHARS.add('\\');
		REGEXP_CONTROL_CHARS.add('[');
		REGEXP_CONTROL_CHARS.add(']');
		REGEXP_CONTROL_CHARS.add('^');
		REGEXP_CONTROL_CHARS.add('$');
		REGEXP_CONTROL_CHARS.add('?');
		REGEXP_CONTROL_CHARS.add('*');
		REGEXP_CONTROL_CHARS.add('+');
		REGEXP_CONTROL_CHARS.add('{');
		REGEXP_CONTROL_CHARS.add('}');
		REGEXP_CONTROL_CHARS.add('|');
		REGEXP_CONTROL_CHARS.add('(');
		REGEXP_CONTROL_CHARS.add(')');
		REGEXP_CONTROL_CHARS.add(':');
		REGEXP_CONTROL_CHARS.add('&');
		REGEXP_CONTROL_CHARS.add('<');
		REGEXP_CONTROL_CHARS.add('>');
		REGEXP_CONTROL_CHARS.add('=');
		REGEXP_CONTROL_CHARS.add('!');
	}

	public static BooleanExpression createStartsWith(Expression left, String right, String escape, boolean negated) throws InvalidExpression {
		return createLike(left, right + "%", escape, negated);
	}

	public static BooleanExpression createLike(Expression left, String right, String escape, boolean negated) throws InvalidExpression {
		if (escape != null && escape.length() != 1)
			throw error("The ESCAPE string literal is invalid.  It can only be one character.  Literal used: " + escape);
		int c = -1;
		if (escape != null) c = 0xFFFF & escape.charAt(0);
		LikeExpression expression = new LikeExpression(left, right, c);
		return negated ? createNOT(expression) : expression;
	}

	public static BooleanExpression createMatch(Expression left, ConstantExpression right, String escape, boolean negated) throws InvalidExpression {
		if (escape != null && escape.length() != 1)
			throw error("The ESCAPE string literal is invalid.  It can only be one character.  Literal used: " + escape);
		int c = -1;
		if (escape != null) c = 0xFFFF & escape.charAt(0);
		var expression = new MatchExpression(left, right, c);
		return negated ? createNOT(expression) : expression;
	}

	public static BooleanExpression createInFilter(Expression left, Expression right, boolean negated) throws InvalidExpression {
		if (!(left instanceof PropertyExpression)) throw error("Expected a property for In expression, got: " + left);
		if (right instanceof PropertyExpression rightP) {
			return createInExpression((PropertyExpression) left, rightP, negated);
		} else if (right instanceof FunctionCallExpression c) {
			return createInExpression((PropertyExpression) left, c, negated);
		}
		throw error("Expected a property for In expression, got: " + right);
	}

	public static BooleanExpression createIs(Expression left, Expression right, boolean negated) throws InvalidExpression {
		IsExpression expression = new IsExpression(left, right);
		if (!(right instanceof ConstantExpression))
			throw new InvalidExpression("'is' operator expects an String as second parameter");
		return negated ? createNOT(expression) : expression;
	}

	public static BooleanExpression createInExpression(PropertyExpression left, Expression container, boolean negated) {
		InExpression expression = new InExpression(left, container);
		return negated ? createNOT(expression) : expression;
	}

	public static BooleanExpression createEqual(Expression left, Expression right, boolean negated) throws InvalidExpression {
		return negated ? createNOT(createEqual(left, right)) : createEqual(left, right);
	}

	private static InvalidExpression error(String left) {
		return new InvalidExpression(left);
	}

	public static BooleanExpression createEqual(Expression left, Expression right) throws InvalidExpression {
		checkEqualOperand(left);
		checkEqualOperand(right);
		checkEqualOperandCompatability(left, right);
		return doCreateEqual(left, right);
	}

	private static BooleanExpression doCreateEqual(Expression left, Expression right) {
		return new EqualsExpression(left, right);
	}

	public static BooleanExpression createGreaterThan(final Expression left, final Expression right) throws InvalidExpression {
		checkLessThanOperand(left);
		checkLessThanOperand(right);
		return new GreaterThan(left, right);
	}

	public static BooleanExpression createGreaterThanEqual(final Expression left, final Expression right) throws InvalidExpression {
		checkLessThanOperand(left);
		checkLessThanOperand(right);
		return new GreaterThanEqual(left, right);
	}

	public static BooleanExpression createLessThan(final Expression left, final Expression right) throws InvalidExpression {
		checkLessThanOperand(left);
		checkLessThanOperand(right);
		return new LessThan(left, right);
	}

	public static BooleanExpression createLessThanEqual(final Expression left, final Expression right) throws InvalidExpression {
		checkLessThanOperand(left);
		checkLessThanOperand(right);
		return new LessThanEqual(left, right);
	}

	public static void checkLessThanOperand(Expression expr) throws InvalidExpression {
		if (expr instanceof ConstantExpression) {
			Object value = ((ConstantExpression) expr).getValue();
			if (value instanceof Number || value instanceof String) return;
			throw error("Value '" + expr + "' cannot be compared.");
		}
		if (expr instanceof BooleanExpression) throw error("Value '" + expr + "' cannot be compared.");
	}

	public static void checkEqualOperand(Expression expr) throws InvalidExpression {
		if (expr instanceof ConstantExpression) {
			Object value = ((ConstantExpression) expr).getValue();
			if (value == null) {
				throw error("'" + expr + "' cannot be compared.");
			}
		}
	}

	private static void checkEqualOperandCompatability(Expression left, Expression right) throws InvalidExpression {
		if (left instanceof ConstantExpression && right instanceof ConstantExpression) {
			if (left instanceof BooleanExpression && !(right instanceof BooleanExpression)) {
				throw error("'" + left + "' cannot be compared with '" + right + "'");
			}
		}
	}

	public Object evaluate(EvaluationContext context) throws Exception {
		Object left = this.left.evaluate(context);
		if (left == null) return false;
		if (left instanceof Collection) throw error("Collections cannot be compared in this way");
		if (!(left instanceof Comparable<?>)) throw error("Collections cannot be compared in this way");
		Object rv = right.evaluate(context);
		if (rv == null) return false;
		return compare((Comparable<?>) left, (Comparable<?>) rv);
	}

	protected Boolean compare(Comparable lv, Comparable rv) {
		Class<? extends Comparable> lc = lv.getClass();
		Class<? extends Comparable> rc = rv.getClass();
		if (lc != rc) {
			try {
				if (lc == Boolean.class) {
					if (convertStringExpressions && rc == String.class) lv = Boolean.valueOf(lv.toString());
					else return FALSE;
				} else if (lc == Byte.class) {
					if (rc == Short.class) lv = ((Number) lv).shortValue();
					else if (rc == Integer.class) lv = ((Number) lv).intValue();
					else if (rc == Long.class) lv = ((Number) lv).longValue();
					else if (rc == Float.class) lv = ((Number) lv).floatValue();
					else if (rc == Double.class) lv = ((Number) lv).doubleValue();
					else if (convertStringExpressions && rc == String.class) rv = Byte.valueOf((String) rv);
					else return FALSE;
				} else if (lc == Short.class) {
					if (rc == Integer.class) lv = ((Number) lv).intValue();
					else if (rc == Long.class) lv = ((Number) lv).longValue();
					else if (rc == Float.class) lv = ((Number) lv).floatValue();
					else if (rc == Double.class) lv = ((Number) lv).doubleValue();
					else if (convertStringExpressions && rc == String.class) rv = Short.valueOf((String) rv);
					else return FALSE;
				} else if (lc == Integer.class) {
					if (rc == Long.class) lv = ((Number) lv).longValue();
					else if (rc == Float.class) lv = ((Number) lv).floatValue();
					else if (rc == Double.class) lv = ((Number) lv).doubleValue();
					else if (convertStringExpressions && rc == String.class) rv = Integer.valueOf((String) rv);
					else return FALSE;
				} else if (lc == Long.class) {
					if (rc == Integer.class) rv = ((Number) rv).longValue();
					else if (rc == Float.class) lv = ((Number) lv).floatValue();
					else if (rc == Double.class) lv = ((Number) lv).doubleValue();
					else if (convertStringExpressions && rc == String.class) rv = Long.valueOf((String) rv);
					else return FALSE;
				} else if (lc == Float.class) {
					if (rc == Integer.class) rv = ((Number) rv).floatValue();
					else if (rc == Long.class) rv = ((Number) rv).floatValue();
					else if (rc == Double.class) lv = ((Number) lv).doubleValue();
					else if (convertStringExpressions && rc == String.class) rv = Float.valueOf((String) rv);
					else return FALSE;
				} else if (lc == Double.class) {
					if (rc == Integer.class) rv = ((Number) rv).doubleValue();
					else if (rc == Long.class) rv = ((Number) rv).doubleValue();
					else if (rc == Float.class) rv = ((Number) rv).floatValue();
					else if (convertStringExpressions && rc == String.class) rv = Double.valueOf((String) rv);
					else return FALSE;
				} else if (convertStringExpressions && lc == String.class) {
					if (rc == Boolean.class) lv = Boolean.valueOf((String) lv);
					else if (rc == Byte.class) lv = Byte.valueOf((String) lv);
					else if (rc == Short.class) lv = Short.valueOf((String) lv);
					else if (rc == Integer.class) lv = Integer.valueOf((String) lv);
					else if (rc == Long.class) lv = Long.valueOf((String) lv);
					else if (rc == Float.class) lv = Float.valueOf((String) lv);
					else if (rc == Double.class) lv = Double.valueOf((String) lv);
					else return FALSE;
				} else return FALSE;
			} catch (NumberFormatException e) {
				return FALSE;
			}
		}
		return asBoolean(lv.compareTo(rv)) ? TRUE : FALSE;
	}

	protected abstract boolean asBoolean(int answer);

	public boolean matches(EvaluationContext context) throws Exception {
		return evaluate(context) == TRUE;
	}

	private static class GreaterThanEqual extends ComparisonExpression {
		public GreaterThanEqual(Expression left, Expression right) {
			super(left, right);
		}

		protected boolean asBoolean(int answer) {
			return answer >= 0;
		}

		public String getExpressionSymbol() {
			return ">=";
		}
	}

	private static class LessThan extends ComparisonExpression {

		public LessThan(Expression left, Expression right) {
			super(left, right);
		}

		protected boolean asBoolean(int answer) {
			return answer < 0;
		}

		public String getExpressionSymbol() {
			return "<";
		}
	}

	private static class LessThanEqual extends ComparisonExpression {
		public LessThanEqual(Expression left, Expression right) {
			super(left, right);
		}

		protected boolean asBoolean(int answer) {
			return answer <= 0;
		}

		public String getExpressionSymbol() {
			return "<=";
		}
	}

	private static class GreaterThan extends ComparisonExpression {
		public GreaterThan(Expression left, Expression right) {
			super(left, right);
		}

		protected boolean asBoolean(int answer) {
			return answer > 0;
		}

		public String getExpressionSymbol() {
			return ">";
		}
	}
}
