package io.quassar.editor.box.ui.displays.templates;

import io.intino.alexandria.core.Box;
import io.intino.alexandria.exceptions.*;
import io.intino.alexandria.ui.displays.components.*;
import io.quassar.editor.box.ui.*;

import io.quassar.editor.box.EditorBox;

import io.quassar.editor.box.ui.displays.templates.*;






import io.quassar.editor.box.ui.displays.items.*;

import io.intino.alexandria.ui.displays.notifiers.TemplateNotifier;

public abstract class AbstractLanguagesLandingTemplate<B extends Box> extends io.intino.alexandria.ui.displays.components.Template<TemplateNotifier, java.lang.Void, B> {
	public _47_1_180750617 _47_1_180750617;
	public LanguagesLandingTemplate._47_1_180750617. SearchBox searchBox;
	public BodyBlock bodyBlock;
	public LanguagesLandingTemplate.BodyBlock. ContentBlock contentBlock;
	public LanguagesLandingTemplate.BodyBlock.ContentBlock. LanguagesLandingCatalog languagesLandingCatalog;

	public AbstractLanguagesLandingTemplate(B box) {
		super(box);
		id("languagesLandingTemplate");
	}

	@Override
	public void init() {
		super.init();
		if (_47_1_180750617 == null) _47_1_180750617 = register(new _47_1_180750617(box()).<_47_1_180750617>id("a_40134722").owner(AbstractLanguagesLandingTemplate.this));
		if (_47_1_180750617 != null) searchBox = _47_1_180750617.searchBox;
		if (bodyBlock == null) bodyBlock = register(new BodyBlock(box()).<BodyBlock>id("a_110233151").owner(AbstractLanguagesLandingTemplate.this));
		if (bodyBlock != null) contentBlock = bodyBlock.contentBlock;
		if (contentBlock != null) languagesLandingCatalog = bodyBlock.contentBlock.languagesLandingCatalog;
	}

	@Override
	public void remove() {
		super.remove();
		if (_47_1_180750617 != null) _47_1_180750617.unregister();
		if (bodyBlock != null) bodyBlock.unregister();
	}

	public class _47_1_180750617 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
		public LanguagesLandingTemplate._47_1_180750617. SearchBox searchBox;

		public _47_1_180750617(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (searchBox == null) searchBox = register(new SearchBox(box()).<SearchBox>id("a_1198134915").owner(AbstractLanguagesLandingTemplate.this));
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
		public LanguagesLandingTemplate.BodyBlock. ContentBlock contentBlock;

		public BodyBlock(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (contentBlock == null) contentBlock = register(new ContentBlock(box()).<ContentBlock>id("a865834322").owner(AbstractLanguagesLandingTemplate.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (contentBlock != null) contentBlock.unregister();
		}

		public class ContentBlock extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public LanguagesLandingTemplate.BodyBlock.ContentBlock. LanguagesLandingCatalog languagesLandingCatalog;

			public ContentBlock(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (languagesLandingCatalog == null) languagesLandingCatalog = register(new LanguagesLandingCatalog(box()).<LanguagesLandingCatalog>id("a337879824").owner(AbstractLanguagesLandingTemplate.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (languagesLandingCatalog != null) languagesLandingCatalog.unregister();
			}

			public class LanguagesLandingCatalog extends io.intino.alexandria.ui.displays.components.List<B, LanguageLandingItem, io.quassar.editor.model.Language>  {

				public LanguagesLandingCatalog(B box) {
					super(box);

					_pageSize(5);
				}

				@Override
				public void init() {
					super.init();
				}

				@Override
				public void unregister() {
					super.unregister();
				}

				public LanguageLandingItem create(io.quassar.editor.model.Language element) {
					LanguageLandingItem result = new LanguageLandingItem((EditorBox)box());
					result.id(java.util.UUID.randomUUID().toString());
					result.item(element);
					result.section(source().section(element));
					return result;
				}
			}
		}
	}
}