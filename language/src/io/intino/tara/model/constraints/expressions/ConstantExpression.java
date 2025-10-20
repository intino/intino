package io.intino.tara.model.constraints.expressions;


import io.intino.tara.model.constraints.context.EvaluationContext;

import java.math.BigDecimal;

public class ConstantExpression implements Expression {
	private static final long serialVersionUID = 1L;
	public static final BooleanConstantExpression EMTPY = new BooleanConstantExpression(null);

	static class BooleanConstantExpression extends ConstantExpression implements BooleanExpression {
		public BooleanConstantExpression(Object value) {
			super(value);
		}

		public boolean matches(EvaluationContext context) throws Exception {
			Object object = evaluate(context);
			return object == Boolean.TRUE;
		}

	}

	private final Object value;

	public ConstantExpression(Object value) {
		this.value = value;
	}

	public static ConstantExpression createFromDecimal(String text) {
		if (text.endsWith("l") || text.endsWith("L")) text = text.substring(0, text.length() - 1);
		Number value;
		try {
			value = Long.valueOf(text);
		} catch (NumberFormatException e) {
			value = new BigDecimal(text);
		}
		long l = value.longValue();
		if (Integer.MIN_VALUE <= l && l <= Integer.MAX_VALUE) value = value.intValue();
		return new ConstantExpression(value);
	}

	public static ConstantExpression createFromHex(String text) {
		Number value = Long.parseLong(text.substring(2), 16);
		long l = value.longValue();
		if (Integer.MIN_VALUE <= l && l <= Integer.MAX_VALUE) value = value.intValue();
		return new ConstantExpression(value);
	}

	public static ConstantExpression createFromOctal(String text) {
		Number value = Long.parseLong(text, 8);
		long l = value.longValue();
		if (Integer.MIN_VALUE <= l && l <= Integer.MAX_VALUE) value = value.intValue();
		return new ConstantExpression(value);
	}

	public static ConstantExpression createFloat(String text) {
		Number value = Double.valueOf(text);
		return new ConstantExpression(value);
	}

	public Object evaluate(EvaluationContext context) throws Exception {
		return value;
	}

	public Object getValue() {
		return value;
	}

	public String toString() {
		return switch (value) {
			case null -> "empty";
			case Boolean b -> b ? "true" : "false";
			case String s -> encodeString(s);
			default -> value.toString();
		};
	}

	public int hashCode() {
		return toString().hashCode();
	}

	public boolean equals(Object o) {
		if (o == null || !this.getClass().equals(o.getClass())) return false;
		return toString().equals(o.toString());

	}

	public static String encodeString(String s) {
		StringBuilder b = new StringBuilder();
		b.append('\'');
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '\'') b.append(c);
			b.append(c);
		}
		b.append('\'');
		return b.toString();
	}

}
