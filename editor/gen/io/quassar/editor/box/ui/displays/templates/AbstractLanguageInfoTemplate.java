package io.quassar.editor.box.ui.displays.templates;

import io.intino.alexandria.core.Box;
import io.intino.alexandria.exceptions.*;
import io.intino.alexandria.ui.displays.components.*;
import io.quassar.editor.box.ui.*;

import io.quassar.editor.box.EditorBox;

import io.quassar.editor.box.ui.displays.templates.*;






import io.quassar.editor.box.ui.displays.items.*;

import io.intino.alexandria.ui.displays.notifiers.TemplateNotifier;

public abstract class AbstractLanguageInfoTemplate<B extends Box> extends io.intino.alexandria.ui.displays.components.Template<TemplateNotifier, java.lang.Void, B> {
	public _219_1_12069995324 _219_1_12069995324;
	public LanguageInfoTemplate._219_1_12069995324. GeneralBlock generalBlock;
	public LanguageEditor editorStamp;
	public LanguageInfoTemplate._219_1_12069995324.GeneralBlock. _222_3_0292766838 _222_3_0292766838;
	public LanguagePropertiesTemplate propertiesStamp;

	public AbstractLanguageInfoTemplate(B box) {
		super(box);
		id("languageInfoTemplate");
	}

	@Override
	public void init() {
		super.init();
		if (_219_1_12069995324 == null) _219_1_12069995324 = register(new _219_1_12069995324(box()).<_219_1_12069995324>id("a_259754080").owner(AbstractLanguageInfoTemplate.this));
		if (_219_1_12069995324 != null) generalBlock = _219_1_12069995324.generalBlock;
		if (generalBlock != null) editorStamp = _219_1_12069995324.generalBlock.editorStamp;
		if (generalBlock != null) _222_3_0292766838 = _219_1_12069995324.generalBlock._222_3_0292766838;
		if (_222_3_0292766838 != null) propertiesStamp = _219_1_12069995324.generalBlock._222_3_0292766838.propertiesStamp;
	}

	@Override
	public void remove() {
		super.remove();
		if (_219_1_12069995324 != null) _219_1_12069995324.unregister();
	}

	public class _219_1_12069995324 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
		public LanguageInfoTemplate._219_1_12069995324. GeneralBlock generalBlock;

		public _219_1_12069995324(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (generalBlock == null) generalBlock = register(new GeneralBlock(box()).<GeneralBlock>id("a1846327708").owner(AbstractLanguageInfoTemplate.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (generalBlock != null) generalBlock.unregister();
		}

		public class GeneralBlock extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public LanguageEditor editorStamp;
			public LanguageInfoTemplate._219_1_12069995324.GeneralBlock. _222_3_0292766838 _222_3_0292766838;

			public GeneralBlock(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (editorStamp == null) editorStamp = AbstractLanguageInfoTemplate.this.editorStamp = register(new LanguageEditor((EditorBox)box()).id("a1655446579"));
				if (_222_3_0292766838 == null) _222_3_0292766838 = register(new _222_3_0292766838(box()).<_222_3_0292766838>id("a2003163030").owner(AbstractLanguageInfoTemplate.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (editorStamp != null) editorStamp.unregister();
				if (_222_3_0292766838 != null) _222_3_0292766838.unregister();
			}

			public class _222_3_0292766838 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
				public LanguagePropertiesTemplate propertiesStamp;

				public _222_3_0292766838(B box) {
					super(box);
				}

				@Override
				public void init() {
					super.init();
					if (propertiesStamp == null) propertiesStamp = AbstractLanguageInfoTemplate.this.propertiesStamp = register(new LanguagePropertiesTemplate((EditorBox)box()).id("a446704627"));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (propertiesStamp != null) propertiesStamp.unregister();
				}
			}
		}
	}
}