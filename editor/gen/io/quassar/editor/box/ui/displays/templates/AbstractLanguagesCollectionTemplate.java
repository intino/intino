package io.quassar.editor.box.ui.displays.templates;

import io.intino.alexandria.core.Box;
import io.intino.alexandria.exceptions.*;
import io.intino.alexandria.ui.displays.components.*;
import io.quassar.editor.box.ui.*;

import io.quassar.editor.box.EditorBox;

import io.quassar.editor.box.ui.displays.templates.*;






import io.quassar.editor.box.ui.displays.items.*;

import io.intino.alexandria.ui.displays.notifiers.TemplateNotifier;

public abstract class AbstractLanguagesCollectionTemplate<B extends Box> extends io.intino.alexandria.ui.displays.components.Template<TemplateNotifier, java.lang.Void, B> {
	public _69_1_12023564106 _69_1_12023564106;
	public LanguagesCollectionTemplate._69_1_12023564106. SearchBox searchBox;
	public NoItemsMessage noItemsMessage;
	public BodyBlock bodyBlock;
	public LanguagesCollectionTemplate.BodyBlock. ContentBlock contentBlock;
	public LanguagesCollectionTemplate.BodyBlock.ContentBlock. LanguagesCollectionCatalog languagesCollectionCatalog;

	public AbstractLanguagesCollectionTemplate(B box) {
		super(box);
		id("languagesCollectionTemplate");
	}

	@Override
	public void init() {
		super.init();
		if (_69_1_12023564106 == null) _69_1_12023564106 = register(new _69_1_12023564106(box()).<_69_1_12023564106>id("a_317834146").owner(AbstractLanguagesCollectionTemplate.this));
		if (_69_1_12023564106 != null) searchBox = _69_1_12023564106.searchBox;
		if (noItemsMessage == null) noItemsMessage = register(new NoItemsMessage(box()).<NoItemsMessage>id("a_1985992909").owner(AbstractLanguagesCollectionTemplate.this));
		if (bodyBlock == null) bodyBlock = register(new BodyBlock(box()).<BodyBlock>id("a_1836078464").owner(AbstractLanguagesCollectionTemplate.this));
		if (bodyBlock != null) contentBlock = bodyBlock.contentBlock;
		if (contentBlock != null) languagesCollectionCatalog = bodyBlock.contentBlock.languagesCollectionCatalog;
	}

	@Override
	public void remove() {
		super.remove();
		if (_69_1_12023564106 != null) _69_1_12023564106.unregister();
		if (noItemsMessage != null) noItemsMessage.unregister();
		if (bodyBlock != null) bodyBlock.unregister();
	}

	public class _69_1_12023564106 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
		public LanguagesCollectionTemplate._69_1_12023564106. SearchBox searchBox;

		public _69_1_12023564106(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (searchBox == null) searchBox = register(new SearchBox(box()).<SearchBox>id("a1498909117").owner(AbstractLanguagesCollectionTemplate.this));
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

	public class NoItemsMessage extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

		public NoItemsMessage(B box) {
			super(box);
			_value("There are no DSLs assigned to this collection");
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

	public class BodyBlock extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
		public LanguagesCollectionTemplate.BodyBlock. ContentBlock contentBlock;

		public BodyBlock(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (contentBlock == null) contentBlock = register(new ContentBlock(box()).<ContentBlock>id("a925979379").owner(AbstractLanguagesCollectionTemplate.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (contentBlock != null) contentBlock.unregister();
		}

		public class ContentBlock extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public LanguagesCollectionTemplate.BodyBlock.ContentBlock. LanguagesCollectionCatalog languagesCollectionCatalog;

			public ContentBlock(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (languagesCollectionCatalog == null) languagesCollectionCatalog = register(new LanguagesCollectionCatalog(box()).<LanguagesCollectionCatalog>id("a_765910644").owner(AbstractLanguagesCollectionTemplate.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (languagesCollectionCatalog != null) languagesCollectionCatalog.unregister();
			}

			public class LanguagesCollectionCatalog extends io.intino.alexandria.ui.displays.components.Magazine<B, LanguageCollectionItem, io.quassar.editor.model.Language>  {

				public LanguagesCollectionCatalog(B box) {
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

				public LanguageCollectionItem create(io.quassar.editor.model.Language element) {
					LanguageCollectionItem result = new LanguageCollectionItem((EditorBox)box());
					result.id(java.util.UUID.randomUUID().toString());
					result.item(element);
					result.section(source().section(element));
					return result;
				}
			}
		}
	}
}