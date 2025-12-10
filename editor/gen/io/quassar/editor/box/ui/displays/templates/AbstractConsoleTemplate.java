package io.quassar.editor.box.ui.displays.templates;

import io.intino.alexandria.core.Box;
import io.intino.alexandria.exceptions.*;
import io.intino.alexandria.ui.displays.components.*;
import io.quassar.editor.box.ui.*;

import io.quassar.editor.box.EditorBox;

import io.quassar.editor.box.ui.displays.templates.*;






import io.quassar.editor.box.ui.displays.items.*;

import io.intino.alexandria.ui.displays.notifiers.TemplateNotifier;

public abstract class AbstractConsoleTemplate<B extends Box> extends io.intino.alexandria.ui.displays.components.Template<TemplateNotifier, java.lang.Void, B> {
	public CloseButton closeButton;
	public _346_1_01293000539 _346_1_01293000539;
	public _347_1_01703672771 _347_1_01703672771;
	public ConsoleTemplate._347_1_01703672771. Entries entries;

	public AbstractConsoleTemplate(B box) {
		super(box);
		id("consoleTemplate");
	}

	@Override
	public void init() {
		super.init();
		if (closeButton == null) closeButton = register(new CloseButton(box()).<CloseButton>id("a_859332803").owner(AbstractConsoleTemplate.this));
		if (_346_1_01293000539 == null) _346_1_01293000539 = register(new _346_1_01293000539(box()).<_346_1_01293000539>id("a_2075064212").owner(AbstractConsoleTemplate.this));
		if (_347_1_01703672771 == null) _347_1_01703672771 = register(new _347_1_01703672771(box()).<_347_1_01703672771>id("a658027216").owner(AbstractConsoleTemplate.this));
		if (_347_1_01703672771 != null) entries = _347_1_01703672771.entries;
	}

	@Override
	public void remove() {
		super.remove();
		if (closeButton != null) closeButton.unregister();
		if (_346_1_01293000539 != null) _346_1_01293000539.unregister();
		if (_347_1_01703672771 != null) _347_1_01703672771.unregister();
	}

	public class CloseButton extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B>  {

		public CloseButton(B box) {
			super(box);
			_title("Close");
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

	public class _346_1_01293000539 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

		public _346_1_01293000539(B box) {
			super(box);
			_value("Build output");
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

	public class _347_1_01703672771 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
		public ConsoleTemplate._347_1_01703672771. Entries entries;

		public _347_1_01703672771(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (entries == null) entries = AbstractConsoleTemplate.this.entries = register(new Entries((EditorBox)box()).<Entries>id("a341155460").owner(AbstractConsoleTemplate.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (entries != null) entries.unregister();
		}

		public class Entries extends io.intino.alexandria.ui.displays.components.Multiple<EditorBox,ConsoleEntryTemplate, java.lang.Void> implements io.intino.alexandria.ui.displays.components.multiple.NonCollapsable<EditorBox,ConsoleEntryTemplate, java.lang.Void> {

			public Entries(EditorBox box) {
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

			@Override
			public ConsoleEntryTemplate add(java.lang.Void value) {
				ConsoleEntryTemplate child = new ConsoleEntryTemplate(box());
				child.id(java.util.UUID.randomUUID().toString());
				add(child, "entries");
				notifyAdd(child);
				return child;
			}
			@Override
			public void remove(ConsoleEntryTemplate child) {
				removeChild(child, "entries");
			}
			public void clear() {
				super.clear("entries");
			}
		}
	}
}