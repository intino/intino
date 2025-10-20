package io.intino.tara.processors.utils;

public class Format {

	public static String firstUpperCase(String input) {
		if (input == null || input.isEmpty()) return input;
		return input.substring(0, 1).toUpperCase() + input.substring(1);
	}


	public static String capitalize(String input) {
		return input.isEmpty() ? "" : input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase();
	}
}