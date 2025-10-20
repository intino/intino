package io.intino.tara.model.rules.property;

import io.intino.tara.model.*;

import java.io.File;
import java.util.List;

public class TypeRule implements Rule<Valued> {
	private static final long serialVersionUID = 1L;
	private String errorParameter;
	@Override
	public boolean accept(Valued valued) {
		Primitive inferredType = inferType(valued.values().get(0));
		boolean result = inferredType != null && checkCompatiblePrimitives(valued.type(), inferredType, valued.isMultiple());
		errorParameter = valued.type().javaName();
		return result;
	}

	@Override
	public String errorMessage() {
		return "reject.invalid.property.type";
	}

	@Override
	public List<Object> errorParameters() {
		return List.of(errorParameter);
	}

	public static boolean checkCompatiblePrimitives(Primitive type, Primitive inferredType, boolean multiple) {
		return inferredType == Primitive.EMPTY
				|| type.equals(inferredType)
				|| emptyInfersEmptyList(type, inferredType, multiple)
				|| integerInfersInteger(type, inferredType)
				|| booleanOrFunctionInfersBoolean(type, inferredType)
				|| nativeOrEmptyInfersObject(type, inferredType)
				|| stringInfersString(type, inferredType)
				|| integerInfersDouble(type, inferredType)
				|| integerInfersLong(type, inferredType)
				|| stringFunctionOrEmptyInfersDate(type, inferredType)
				|| stringFunctionOrEmptyInfersInstant(type, inferredType)
				|| stringInfersTime(type, inferredType)
				|| nativeOrEmptyInfersNative(type, inferredType)
				|| emptyInfersReference(type, inferredType)
				|| referenceInfersWord(type, inferredType)
				|| stringOrEmptyInfersFile(type, inferredType);
	}

	private static boolean stringInfersTime(Primitive type, Primitive inferredType) {
		return (inferredType.equals(Primitive.STRING) || inferredType.equals(Primitive.EMPTY)) && type.equals(Primitive.TIME);
	}

	private static boolean stringOrEmptyInfersFile(Primitive type, Primitive inferredType) {
		return (inferredType.equals(Primitive.STRING) || inferredType.equals(Primitive.EMPTY) || inferredType.equals(Primitive.FUNCTION)) && type.equals(Primitive.RESOURCE);
	}

	private static boolean booleanOrFunctionInfersBoolean(Primitive type, Primitive inferredType) {
		return (inferredType.equals(Primitive.BOOLEAN) || inferredType.equals(Primitive.FUNCTION) || inferredType.equals(Primitive.EMPTY)) && type.equals(Primitive.BOOLEAN);
	}

	private static boolean nativeOrEmptyInfersObject(Primitive type, Primitive inferredType) {
		return (inferredType.equals(Primitive.FUNCTION) || inferredType.equals(Primitive.EMPTY)) && type.equals(Primitive.OBJECT);
	}

	private static boolean stringInfersString(Primitive type, Primitive inferredType) {
		return (inferredType.equals(Primitive.STRING) || inferredType.equals(Primitive.FUNCTION) || inferredType.equals(Primitive.EMPTY)) && type.equals(Primitive.STRING);
	}

	private static boolean emptyInfersReference(Primitive type, Primitive inferredType) {
		return (inferredType.equals(Primitive.EMPTY) || inferredType.equals(Primitive.FUNCTION)) && type.equals(Primitive.REFERENCE);
	}

	private static boolean nativeOrEmptyInfersNative(Primitive type, Primitive inferredType) {
		return (inferredType.equals(Primitive.FUNCTION)) && type.equals(Primitive.FUNCTION);
	}

	private static boolean emptyInfersEmptyList(Primitive type, Primitive inferredType, boolean multiple) {
		return inferredType.equals(Primitive.EMPTY) && !type.equals(Primitive.REFERENCE) && multiple;
	}

	private static boolean stringFunctionOrEmptyInfersDate(Primitive type, Primitive inferredType) {
		return (inferredType.equals(Primitive.STRING) || inferredType.equals(Primitive.FUNCTION) || inferredType.equals(Primitive.EMPTY)) && type.equals(Primitive.DATE);
	}

	private static boolean stringFunctionOrEmptyInfersInstant(Primitive type, Primitive inferredType) {
		return (inferredType.equals(Primitive.STRING) || inferredType.equals(Primitive.FUNCTION) || inferredType.equals(Primitive.EMPTY)) && type.equals(Primitive.INSTANT);
	}

	private static boolean integerInfersDouble(Primitive type, Primitive inferredType) {
		return (inferredType.equals(Primitive.INTEGER) || inferredType.equals(Primitive.FUNCTION) || inferredType.equals(Primitive.EMPTY)) && type.equals(Primitive.DOUBLE);
	}

	private static boolean integerInfersInteger(Primitive type, Primitive inferredType) {
		return (inferredType.equals(Primitive.INTEGER) || inferredType.equals(Primitive.FUNCTION) || inferredType.equals(Primitive.EMPTY)) && type.equals(Primitive.INTEGER);
	}

	private static boolean integerInfersLong(Primitive type, Primitive inferredType) {
		return (inferredType.equals(Primitive.INTEGER) || inferredType.equals(Primitive.FUNCTION) || inferredType.equals(Primitive.EMPTY)) && type.equals(Primitive.LONG);
	}

	private static boolean referenceInfersWord(Primitive type, Primitive inferredType) {
		return type.equals(Primitive.WORD) && inferredType.equals(Primitive.REFERENCE);
	}

	public static Primitive inferType(Object value) {
		if (value == null || value instanceof EmptyMogram || value instanceof Primitive.Reference r && (r).isEmpty())
			return Primitive.EMPTY;
		if (value instanceof String) return Primitive.STRING;
		if (value instanceof Primitive.Reference || value instanceof Mogram) return Primitive.REFERENCE;
		if (value instanceof Double) return Primitive.DOUBLE;
		if (value instanceof Boolean) return Primitive.BOOLEAN;
		if (value instanceof Integer) return Primitive.INTEGER;
		if (value instanceof Long) return Primitive.LONG;
		if (value instanceof File) return Primitive.RESOURCE;
		if (value instanceof Primitive.Expression) return Primitive.FUNCTION;
		if (value instanceof Primitive.MethodReference) return Primitive.FUNCTION;
		return null;
	}


}
