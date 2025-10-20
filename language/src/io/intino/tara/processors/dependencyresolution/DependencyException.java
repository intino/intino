package io.intino.tara.processors.dependencyresolution;

import io.intino.tara.language.LanguageException;
import io.intino.tara.language.semantics.MessageProvider;
import io.intino.tara.model.Element;
import io.intino.tara.model.Mogram;
import io.intino.tara.model.Property;
import io.intino.tara.model.PropertyDescription;
import io.intino.tara.processors.model.MogramImpl;

public class DependencyException extends LanguageException {
	private final String message;
	private transient final Element element;
	private final String[] parameters;
	private final int line;

	public DependencyException(String message, Element element, String... parameters) {
		this.message = message;
		this.element = element;
		this.parameters = parameters;
		if (element != null) this.line = element.line();
		else this.line = -1;
	}

	@Override
	public String getMessage() {
		String elementReference = element != null && element instanceof MogramImpl ? ((Mogram) element).qualifiedName() : getElement(element);
		return "Dependency resolution error in " + elementReference + "; " + getCompleteMessage() + " @ line " + this.line + ", column " + 1 + ".";
	}

	private String getElement(Element element) {
		if (element == null) return "";
		if (element instanceof Property) return "property " + element;
		if (element instanceof PropertyDescription) return "parameter";
		return element.toString();
	}

	public Element getElement() {
		return element;
	}

	public int getLine() {
		return line;
	}

	private String getCompleteMessage() {
		return MessageProvider.message(message, (Object[]) parameters);
	}
}
