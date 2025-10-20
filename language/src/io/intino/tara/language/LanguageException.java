package io.intino.tara.language;

public abstract class LanguageException extends Exception {
	private final boolean fatal;

	public LanguageException() {
		fatal = true;
	}

	public LanguageException(String message) {
		super(message);
		fatal = true;
	}

	public LanguageException(String message, Throwable cause) {
		super(message, cause);
		fatal = true;
	}

	public LanguageException(boolean fatal) {
		this.fatal = fatal;
	}

	public LanguageException(String message, boolean fatal) {
		super(message);
		this.fatal = fatal;
	}

	public boolean isFatal() {
		return this.fatal;
	}
}