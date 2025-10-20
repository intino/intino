package io.intino.tara.model.constraints.expressions.functions;


import static io.intino.tara.model.constraints.expressions.FunctionCallExpression.registerFunction;

public class BuiltinFunctionRegistry {
	public static void register() {
		registerFunction("all", new AllFunction());
		registerFunction("components", new ComponentsFunction());
		registerFunction("name", new NameFunction());
		registerFunction("container", new ContainerFunction());
		registerFunction("contains", new ContainsFunction());
		registerFunction("count", new CountFunction());
		registerFunction("difference", new DifferenceFunction());
		registerFunction("distinct", new DistinctFunction());
		registerFunction("map", new MapFunction());
		registerFunction("match", new RegexMatchFunction());
		registerFunction("replace", new ReplaceFunction());
		registerFunction("siblings", new SiblingsFunction());
		registerFunction("sort", new SortFunction());
		registerFunction("substring", new SubstringFunction());
		registerFunction("sum", new SumFunction());
//		registerFunction("MAKELIST", new MakeListFunction());
//		registerFunction("SPLIT", new SplitFunction());
	}
}

