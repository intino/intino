package io.intino.builderservice.konos.schemas;

import io.intino.builderservice.konos.schemas.*;

public class OperationResult implements java.io.Serializable {

	private State state;

	public enum State {
		Running, Finished
	}

	private String genRef;
	private String srcRef;
	private String resRef;
	private String outRef;
	private String buildRef;
	private Boolean success = false;
	private java.util.List<Message> messages = new java.util.ArrayList<>();

	public State state() {
		return state;
	}

	public String genRef() {
		return this.genRef;
	}

	public String srcRef() {
		return this.srcRef;
	}

	public String resRef() {
		return this.resRef;
	}

	public String outRef() {
		return this.outRef;
	}

	public String buildRef() {
		return this.buildRef;
	}

	public Boolean success() {
		return this.success;
	}

	public java.util.List<Message> messages() {
		return this.messages;
	}

	public OperationResult state(State state) {
		this.state = state;
		return this;
	}

	public OperationResult genRef(String genRef) {
		this.genRef = genRef;
		return this;
	}

	public OperationResult srcRef(String srcRef) {
		this.srcRef = srcRef;
		return this;
	}

	public OperationResult resRef(String resRef) {
		this.resRef = resRef;
		return this;
	}

	public OperationResult outRef(String outRef) {
		this.outRef = outRef;
		return this;
	}

	public OperationResult buildRef(String buildRef) {
		this.buildRef = buildRef;
		return this;
	}

	public OperationResult success(Boolean success) {
		this.success = success;
		return this;
	}

	public OperationResult messages(java.util.List<Message> messages) {
		this.messages = messages;
		return this;
	}
}