package io.quassar.editor.box.util;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Locale;
import java.util.function.Function;

public class Formatters {

	private static final String DayFormat = "yyyy/MM/dd";

	public static String formattedNumber(long value, String language) {
		return formattedNumber(value, Locale.forLanguageTag(language));
	}

	public static String formattedNumber(long value, Locale locale) {
		return NumberFormat.getNumberInstance(locale).format(value);
	}

	public static String firstLowerCase(String value) {
		return value != null ? value.substring(0, 1).toLowerCase() + value.substring(1) : null;
	}

	public static String firstUpperCase(String value) {
		return value != null ? value.substring(0, 1).toUpperCase() + value.substring(1) : null;
	}

	public static String kebabCaseToCamelCase(String string) {
		if (string.isEmpty()) {
			return string;
		} else {
			StringBuilder result = new StringBuilder();
			String[] var2 = string.split("-");
			int var3 = var2.length;

			for(int var4 = 0; var4 < var3; ++var4) {
				String part = var2[var4];
				result.append(Character.toUpperCase(part.charAt(0))).append(part.substring(1));
			}

			return result.toString();
		}
	}

	public static String normalizeLanguageName(String value) {
		return Formatters.firstLowerCase(StringHelper.snakeCaseToCamelCase(StringHelper.kebabCaseToCamelCase(value)));
	}

	public static String date(Instant date, String language, Function<String, String> translator) {
		return date(date, DayFormat, language, translator);
	}

	public static String date(Instant date, String format, String language, Function<String, String> translator) {
		if (date == null) return null;
		return formatDate(translator.apply(format), date, locale(language));
	}

	private static String formatDate(String pattern, Instant instant, Locale locale) {
		SimpleDateFormat format = new SimpleDateFormat(pattern, locale);
		return format.format(Date.from(instant));
	}

	private static Locale locale(String language) {
		if (language.toLowerCase().contains("es")) return Locale.of("es", "ES");
		if (language.toLowerCase().contains("pt")) return Locale.of("pt", "PT");
		return Locale.of("en", "EN");
	}

}
