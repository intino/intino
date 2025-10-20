package io.intino.builderservice.konos.schemas;

import io.intino.builderservice.konos.schemas.*;

public class Message implements java.io.Serializable {

	private String type;
	private Kind kind;

	public enum Kind {
		INFO, WARNING, ERROR
	}

	private String content;
	private String uri;
	private int line = 0;
	private int column = 0;

	public String type() {
		return this.type;
	}

	public Kind kind() {
		return kind;
	}

	public String content() {
		return this.content;
	}

	public String uri() {
		return this.uri;
	}

	public int line() {
		return this.line;
	}

	public int column() {
		return this.column;
	}

	public Message type(String type) {
		this.type = type;
		return this;
	}

	public Message kind(Kind kind) {
		this.kind = kind;
		return this;
	}

	public Message content(String content) {
		this.content = content;
		return this;
	}

	public Message uri(String uri) {
		this.uri = uri;
		return this;
	}

	public Message line(int line) {
		this.line = line;
		return this;
	}

	public Message column(int column) {
		this.column = column;
		return this;
	}
}