package io.intino.tara.language.grammar;

import io.intino.tara.language.LanguageException;

import java.net.URI;

public class SyntaxException extends LanguageException {
	private final URI uri;
	private final int startLine;
	private final int endLine;
	private final int startColumn;
	private final int endColumn;
	private final String expectedTokens;

	public SyntaxException(String message, URI uri, int startLine, int startColumn, String expectedTokens) {
		this(message, uri, startLine, startColumn, startLine, startColumn + 1, expectedTokens);
	}

	public SyntaxException(String message, URI uri, int startLine, int startColumn) {
		this(message, uri, startLine, startColumn, startLine, startColumn + 1, "");
	}

	public SyntaxException(String message, URI uri, int startLine, int startColumn, int endLine, int endColumn, String expectedTokens) {
		super(message, false);
		this.uri = uri;
		this.startLine = startLine;
		this.startColumn = startColumn;
		this.endLine = endLine;
		this.endColumn = endColumn;
		this.expectedTokens = expectedTokens;
	}

	public SyntaxException(String message, Throwable cause, URI uri, int startLine, int startColumn) {
		this(message, cause, uri, startLine, startColumn, startLine, startColumn + 1);
	}

	public SyntaxException(String message, Throwable cause, URI uri, int startLine, int startColumn, int endLine, int endColumn) {
		super(message, cause);
		this.uri = uri;
		this.startLine = startLine;
		this.startColumn = startColumn;
		this.endLine = endLine;
		this.endColumn = endColumn;
		this.expectedTokens = "";
	}

	public URI getUri() {
		return this.uri;
	}

	public int getLine() {
		return getStartLine();
	}

	public int getStartLine() {
		return this.startLine;
	}

	public int getStartColumn() {
		return this.startColumn;
	}

	public int getEndLine() {
		return this.endLine;
	}

	public int getEndColumn() {
		return this.endColumn;
	}

	public String getExpectedTokens() {
		return expectedTokens;
	}

	public String getOriginalMessage() {
		return super.getMessage();
	}

	@Override
	public String getMessage() {
		return super.getMessage() + (!expectedTokens.isEmpty() ? ". Expected " + this.expectedTokens : "") + " @ line " + this.startLine + ", column " + this.startColumn + ".";
	}
}