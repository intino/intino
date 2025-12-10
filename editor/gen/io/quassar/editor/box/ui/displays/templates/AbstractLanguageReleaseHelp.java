package io.quassar.editor.box.ui.displays.templates;

import io.intino.alexandria.core.Box;
import io.intino.alexandria.exceptions.*;
import io.intino.alexandria.ui.displays.components.*;
import io.quassar.editor.box.ui.*;

import io.quassar.editor.box.EditorBox;

import io.quassar.editor.box.ui.displays.templates.*;






import io.quassar.editor.box.ui.displays.items.*;

import io.intino.alexandria.ui.displays.notifiers.TemplateNotifier;

public abstract class AbstractLanguageReleaseHelp<B extends Box> extends io.intino.alexandria.ui.displays.components.Template<TemplateNotifier, java.lang.Void, B> {
	public TitleLink titleLink;

	public AbstractLanguageReleaseHelp(B box) {
		super(box);
		id("languageReleaseHelp");
	}

	@Override
	public void init() {
		super.init();
		if (titleLink == null) titleLink = register(new TitleLink(box()).<TitleLink>id("a1617040996").owner(AbstractLanguageReleaseHelp.this));
	}

	@Override
	public void remove() {
		super.remove();
		if (titleLink != null) titleLink.unregister();
	}

	public class TitleLink extends io.intino.alexandria.ui.displays.components.OpenSite<io.intino.alexandria.ui.displays.notifiers.OpenSiteNotifier, B>  {

		public TitleLink(B box) {
			super(box);
			_title("");
			_mode(io.intino.alexandria.ui.displays.components.Actionable.Mode.valueOf("Link"));
		}

		@Override
		public void init() {
			super.init();
		}

		@Override
		public void unregister() {
			super.unregister();
		}
	}
}