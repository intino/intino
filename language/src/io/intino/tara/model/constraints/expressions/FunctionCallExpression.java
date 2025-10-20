package io.intino.tara.model.constraints.expressions;

import io.intino.tara.model.constraints.context.EvaluationContext;
import io.intino.tara.model.constraints.expressions.functions.BuiltinFunctionRegistry;
import io.intino.tara.model.constraints.expressions.functions.FilterFunction;

import java.util.*;

public class FunctionCallExpression implements Expression {
	private static final long serialVersionUID = 1L;
	protected static final Map<String, FunctionRegistration> functionRegistry = new HashMap<>();
	protected String functionName;
	protected List<Expression> arguments;
	protected FilterFunction function;

	static {
		BuiltinFunctionRegistry.register();
	}

	public static List<String> registeredFunctions() {
		return new ArrayList<>(functionRegistry.keySet());
	}

	public static boolean registerFunction(String name, FilterFunction function) {
		boolean result;
		result = true;
		synchronized (functionRegistry) {
			if (functionRegistry.containsKey(name)) result = false;
			else functionRegistry.put(name, new FunctionRegistration(function));
		}
		return result;
	}

	public static void deregisterFunction(String name) {
		synchronized (functionRegistry) {
			functionRegistry.remove(name);
		}
	}

	public FunctionCallExpression(String function, List<Expression> args) throws InvalidFunctionException {
		FunctionRegistration registry;
		synchronized (functionRegistry) {
			registry = functionRegistry.get(function);
		}
		if (registry != null) {
			this.arguments = new ArrayList<>();
			this.arguments.addAll(args);
			this.functionName = function;
			this.function = registry.getFilterFunction();
			if (!this.function.isValid(this)) throw new InvalidFunctionException("invalid function " + function);
		} else throw new InvalidFunctionException("invalid function name, \"" + function + "\"");
	}

	public int getNumArguments() {
		return arguments.size();
	}

	public Expression getArgument(int which) {
		return arguments.get(which);
	}

	public List<Expression> arguments() {
		return Collections.unmodifiableList(arguments);
	}

	public Object evaluate(EvaluationContext context) throws Exception {
		return this.function.evaluate(this, context);
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append(functionName).append("(");
		boolean first_f = true;
		for (Object arg : arguments) {
			if (first_f) first_f = false;
			else result.append(", ");
			result.append(arg.toString());
		}
		result.append(")");
		return result.toString();
	}

	protected static class FunctionRegistration {
		protected FilterFunction filterFunction;

		public FunctionRegistration(FilterFunction func) {
			this.filterFunction = func;
		}

		public FilterFunction getFilterFunction() {
			return filterFunction;
		}
	}

	public static class InvalidFunctionException extends Exception {
		public InvalidFunctionException(String msg) {
			super(msg);
		}
	}
}