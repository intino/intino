package io.intino.tara.model.rules.property;

import io.intino.tara.model.Rule;
import io.intino.tara.model.Valued;

import java.util.ArrayList;
import java.util.List;

public class FunctionRule implements Rule<Valued> {
	private static final long serialVersionUID = 1L;
	private final List<String> imports = new ArrayList<>();
	private String interfaceClass;
	private String signature;

	public FunctionRule(String interfaceClass) {
		this.interfaceClass = interfaceClass;
	}

	public FunctionRule(String interfaceClass, String signature) {
		this.interfaceClass = interfaceClass;
		this.signature = signature;
	}

	public FunctionRule(String interfaceClass, String signature, List<String> imports) {
		this.interfaceClass = interfaceClass;
		this.signature = signature;
		this.imports.addAll(imports);
	}

	@Override
	public boolean accept(Valued value) {
		return true;
	}

	public String signature() {
		return signature;
	}

	public String interfaceClass() {
		return interfaceClass;
	}

	public void interfaceClass(String interfaceClass) {
		this.interfaceClass = interfaceClass;
	}

	public void signature(String signature) {
		this.signature = signature;
	}

	public List<String> imports() {
		return new ArrayList<>(imports);
	}

	public void imports(List<String> imports) {
		this.imports.addAll(imports.stream().filter(s -> !s.isEmpty() && !this.imports.contains(s)).toList());
	}

	@Override
	public String toString() {
		return "NativeRule{" + interfaceClass + '}';
	}
}
