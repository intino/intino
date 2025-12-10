package io.quassar.editor.box.ui.displays.templates;

import io.intino.alexandria.core.Box;
import io.intino.alexandria.exceptions.*;
import io.intino.alexandria.ui.displays.components.*;
import io.quassar.editor.box.ui.*;

import io.quassar.editor.box.EditorBox;

import io.quassar.editor.box.ui.displays.templates.*;






import io.quassar.editor.box.ui.displays.items.*;

import io.intino.alexandria.ui.displays.notifiers.TemplateNotifier;

public abstract class AbstractLanguagesTemplate<B extends Box> extends io.intino.alexandria.ui.displays.components.Template<TemplateNotifier, java.lang.Void, B> {
	public _25_1_180750617 _25_1_180750617;
	public LanguagesTemplate._25_1_180750617. SearchBox searchBox;
	public BodyBlock bodyBlock;
	public LanguagesTemplate.BodyBlock. ContentBlock contentBlock;
	public LanguagesTemplate.BodyBlock.ContentBlock. LanguagesCatalog languagesCatalog;

	public AbstractLanguagesTemplate(B box) {
		super(box);
		id("languagesTemplate");
	}

	@Override
	public void init() {
		super.init();
		if (_25_1_180750617 == null) _25_1_180750617 = register(new _25_1_180750617(box()).<_25_1_180750617>id("a764657471").owner(AbstractLanguagesTemplate.this));
		if (_25_1_180750617 != null) searchBox = _25_1_180750617.searchBox;
		if (bodyBlock == null) bodyBlock = register(new BodyBlock(box()).<BodyBlock>id("a_1408965054").owner(AbstractLanguagesTemplate.this));
		if (bodyBlock != null) contentBlock = bodyBlock.contentBlock;
		if (contentBlock != null) languagesCatalog = bodyBlock.contentBlock.languagesCatalog;
	}

	@Override
	public void remove() {
		super.remove();
		if (_25_1_180750617 != null) _25_1_180750617.unregister();
		if (bodyBlock != null) bodyBlock.unregister();
	}

	public class _25_1_180750617 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
		public LanguagesTemplate._25_1_180750617. SearchBox searchBox;

		public _25_1_180750617(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (searchBox == null) searchBox = register(new SearchBox(box()).<SearchBox>id("a399788349").owner(AbstractLanguagesTemplate.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (searchBox != null) searchBox.unregister();
		}

		public class SearchBox extends io.intino.alexandria.ui.displays.components.TextEditable<io.intino.alexandria.ui.displays.notifiers.TextEditableNotifier, B>  {

			public SearchBox(B box) {
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

	public class BodyBlock extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
		public LanguagesTemplate.BodyBlock. ContentBlock contentBlock;

		public BodyBlock(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (contentBlock == null) contentBlock = register(new ContentBlock(box()).<ContentBlock>id("a728154737").owner(AbstractLanguagesTemplate.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (contentBlock != null) contentBlock.unregister();
		}

		public class ContentBlock extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public LanguagesTemplate.BodyBlock.ContentBlock. LanguagesCatalog languagesCatalog;

			public ContentBlock(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (languagesCatalog == null) languagesCatalog = register(new LanguagesCatalog(box()).<LanguagesCatalog>id("a_1380414580").owner(AbstractLanguagesTemplate.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (languagesCatalog != null) languagesCatalog.unregister();
			}

			public class LanguagesCatalog extends io.intino.alexandria.ui.displays.components.List<B, LanguageItem, io.quassar.editor.model.Language>  {

				public LanguagesCatalog(B box) {
					super(box);

					_pageSize(20);
				}

				@Override
				public void init() {
					super.init();
				}

				@Override
				public void unregister() {
					super.unregister();
				}

				public LanguageItem create(io.quassar.editor.model.Language element) {
					LanguageItem result = new LanguageItem((EditorBox)box());
					result.id(java.util.UUID.randomUUID().toString());
					result.item(element);
					result.section(source().section(element));
					return result;
				}
			}
		}
	}
}