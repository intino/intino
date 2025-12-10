package io.quassar.editor.box.ui.displays.templates;

import io.intino.alexandria.core.Box;
import io.intino.alexandria.exceptions.*;
import io.intino.alexandria.ui.displays.components.*;
import io.quassar.editor.box.ui.*;

import io.quassar.editor.box.EditorBox;

import io.quassar.editor.box.ui.displays.templates.*;






import io.quassar.editor.box.ui.displays.items.*;

import io.intino.alexandria.ui.displays.notifiers.TemplateNotifier;

public abstract class AbstractLanguageHeaderTemplate<B extends Box> extends io.intino.alexandria.ui.displays.components.Template<TemplateNotifier, java.lang.Void, B> {
	public _9_1_0840824549 _9_1_0840824549;
	public LanguageHeaderTemplate._9_1_0840824549. Title title;
	public _11_1_12140898777 _11_1_12140898777;
	public LanguageToolbar toolbar;

	public AbstractLanguageHeaderTemplate(B box) {
		super(box);
		id("languageHeaderTemplate");
	}

	@Override
	public void init() {
		super.init();
		if (_9_1_0840824549 == null) _9_1_0840824549 = register(new _9_1_0840824549(box()).<_9_1_0840824549>id("a1380233206").owner(AbstractLanguageHeaderTemplate.this));
		if (_9_1_0840824549 != null) title = _9_1_0840824549.title;
		if (_11_1_12140898777 == null) _11_1_12140898777 = register(new _11_1_12140898777(box()).<_11_1_12140898777>id("a1559625853").owner(AbstractLanguageHeaderTemplate.this));
		if (_11_1_12140898777 != null) toolbar = _11_1_12140898777.toolbar;
	}

	@Override
	public void remove() {
		super.remove();
		if (_9_1_0840824549 != null) _9_1_0840824549.unregister();
		if (_11_1_12140898777 != null) _11_1_12140898777.unregister();
	}

	public class _9_1_0840824549 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
		public LanguageHeaderTemplate._9_1_0840824549. Title title;

		public _9_1_0840824549(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (title == null) title = register(new Title(box()).<Title>id("a2100539264").owner(AbstractLanguageHeaderTemplate.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (title != null) title.unregister();
		}

		public class Title extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

			public Title(B box) {
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

	public class _11_1_12140898777 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
		public LanguageToolbar toolbar;

		public _11_1_12140898777(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (toolbar == null) toolbar = AbstractLanguageHeaderTemplate.this.toolbar = register(new LanguageToolbar((EditorBox)box()).id("a_603468846"));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (toolbar != null) toolbar.unregister();
		}
	}
}