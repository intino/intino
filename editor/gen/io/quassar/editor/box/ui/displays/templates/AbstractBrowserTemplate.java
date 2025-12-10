package io.quassar.editor.box.ui.displays.templates;

import io.intino.alexandria.core.Box;
import io.intino.alexandria.exceptions.*;
import io.intino.alexandria.ui.displays.components.*;
import io.quassar.editor.box.ui.*;

import io.quassar.editor.box.EditorBox;

import io.quassar.editor.box.ui.displays.templates.*;






import io.quassar.editor.box.ui.displays.items.*;

import io.intino.alexandria.ui.displays.notifiers.TemplateNotifier;

public abstract class AbstractBrowserTemplate<B extends Box> extends io.intino.alexandria.ui.displays.components.Template<TemplateNotifier, java.lang.Void, B> {
	public FileBrowser fileBrowser;

	public AbstractBrowserTemplate(B box) {
		super(box);
		id("browserTemplate");
	}

	@Override
	public void init() {
		super.init();
		if (fileBrowser == null) fileBrowser = register(new FileBrowser(box()).<FileBrowser>id("a_1192549040").owner(AbstractBrowserTemplate.this));
	}

	@Override
	public void remove() {
		super.remove();
		if (fileBrowser != null) fileBrowser.unregister();
	}

	public class FileBrowser extends io.intino.alexandria.ui.displays.components.DisplayStamp<io.intino.alexandria.ui.displays.notifiers.DisplayStampNotifier, B>  {

		public FileBrowser(B box) {
			super(box);
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