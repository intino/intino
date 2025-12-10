package io.quassar.editor.box.ui.pages;

import io.quassar.editor.box.EditorBox;
import io.intino.alexandria.exceptions.*;
import java.util.*;

public abstract class AbstractLoginPage extends io.intino.alexandria.ui.server.pages.WebPage {
	public EditorBox box;

	public AbstractLoginPage() { super("editor-elements"); }

	public String execute() {
		return super.template("loginTemplate");
	}

	@Override
	protected String title() {
		return "{title}".replace("{title}", box.configuration().get("title"));
	}

	@Override
	protected java.net.URL favicon() {
		return this.getClass().getResource("/images/favicon.ico");
	}
}