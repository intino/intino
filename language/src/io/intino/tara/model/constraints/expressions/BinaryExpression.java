package io.intino.tara.model.constraints.expressions;

public abstract class BinaryExpression implements Expression {
	private static final long serialVersionUID = 1L;
	protected Expression left;
	protected Expression right;

	public BinaryExpression(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	public Expression getLeft() {
		return left;
	}

	public Expression getRight() {
		return right;
	}

	public String toString() {
		return "(" + left.toString() + " " + getExpressionSymbol() + " " + right.toString() + ")";
	}

	public int hashCode() {
		return toString().hashCode();
	}

	public boolean equals(Object o) {

		if (o == null || !this.getClass().equals(o.getClass())) {
			return false;
		}
		return toString().equals(o.toString());

	}

	public abstract String getExpressionSymbol();

	public void setRight(Expression expression) {
		right = expression;
	}

	public void setLeft(Expression expression) {
		left = expression;
	}
}
