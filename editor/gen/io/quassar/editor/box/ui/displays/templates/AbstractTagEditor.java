package io.quassar.editor.box.ui.displays.templates;

import io.intino.alexandria.core.Box;
import io.intino.alexandria.exceptions.*;
import io.intino.alexandria.ui.displays.components.*;
import io.quassar.editor.box.ui.*;

import io.quassar.editor.box.EditorBox;

import io.quassar.editor.box.ui.displays.templates.*;






import io.quassar.editor.box.ui.displays.items.*;

import io.intino.alexandria.ui.displays.notifiers.TemplateNotifier;

public abstract class AbstractTagEditor<B extends Box> extends io.intino.alexandria.ui.displays.components.Template<TemplateNotifier, java.lang.Void, B> {
	public NameField nameField;
	public Delete delete;

	public AbstractTagEditor(B box) {
		super(box);
		id("tagEditor");
	}

	@Override
	public void init() {
		super.init();
		if (nameField == null) nameField = register(new NameField(box()).<NameField>id("a1183066584").owner(AbstractTagEditor.this));
		if (delete == null) delete = register(new Delete(box()).<Delete>id("a_49030750").owner(AbstractTagEditor.this));
	}

	@Override
	public void remove() {
		super.remove();
		if (nameField != null) nameField.unregister();
		if (delete != null) delete.unregister();
	}

	public class NameField extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

		public NameField(B box) {
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

	public class Delete extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B>  {

		public Delete(B box) {
			super(box);
			_title("Delete");
			_mode(io.intino.alexandria.ui.displays.components.Actionable.Mode.valueOf("MaterialIconButton"));
			_icon("Clear");
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