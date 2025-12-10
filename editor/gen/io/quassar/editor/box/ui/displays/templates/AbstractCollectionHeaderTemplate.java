package io.quassar.editor.box.ui.displays.templates;

import io.intino.alexandria.core.Box;
import io.intino.alexandria.exceptions.*;
import io.intino.alexandria.ui.displays.components.*;
import io.quassar.editor.box.ui.*;

import io.quassar.editor.box.EditorBox;

import io.quassar.editor.box.ui.displays.templates.*;






import io.quassar.editor.box.ui.displays.items.*;

import io.intino.alexandria.ui.displays.notifiers.TemplateNotifier;

public abstract class AbstractCollectionHeaderTemplate<B extends Box> extends io.intino.alexandria.ui.displays.components.Template<TemplateNotifier, java.lang.Void, B> {
	public _11_1_01703156756 _11_1_01703156756;
	public CollectionHeaderTemplate._11_1_01703156756. Title title;
	public CollectionHeaderTemplate._11_1_01703156756. NotLoggedBlock notLoggedBlock;
	public CollectionHeaderTemplate._11_1_01703156756.NotLoggedBlock. _14_3_11484268815 _14_3_11484268815;
	public _15_1_12088999596 _15_1_12088999596;

	public AbstractCollectionHeaderTemplate(B box) {
		super(box);
		id("collectionHeaderTemplate");
	}

	@Override
	public void init() {
		super.init();
		if (_11_1_01703156756 == null) _11_1_01703156756 = register(new _11_1_01703156756(box()).<_11_1_01703156756>id("a_93198058").owner(AbstractCollectionHeaderTemplate.this));
		if (_11_1_01703156756 != null) title = _11_1_01703156756.title;
		if (_11_1_01703156756 != null) notLoggedBlock = _11_1_01703156756.notLoggedBlock;
		if (notLoggedBlock != null) _14_3_11484268815 = _11_1_01703156756.notLoggedBlock._14_3_11484268815;
		if (_15_1_12088999596 == null) _15_1_12088999596 = register(new _15_1_12088999596(box()).<_15_1_12088999596>id("a848803139").owner(AbstractCollectionHeaderTemplate.this));
	}

	@Override
	public void remove() {
		super.remove();
		if (_11_1_01703156756 != null) _11_1_01703156756.unregister();
		if (_15_1_12088999596 != null) _15_1_12088999596.unregister();
	}

	public class _11_1_01703156756 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
		public CollectionHeaderTemplate._11_1_01703156756. Title title;
		public CollectionHeaderTemplate._11_1_01703156756. NotLoggedBlock notLoggedBlock;

		public _11_1_01703156756(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (title == null) title = register(new Title(box()).<Title>id("a_1855166795").owner(AbstractCollectionHeaderTemplate.this));
			if (notLoggedBlock == null) notLoggedBlock = register(new NotLoggedBlock(box()).<NotLoggedBlock>id("a2108383131").owner(AbstractCollectionHeaderTemplate.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (title != null) title.unregister();
			if (notLoggedBlock != null) notLoggedBlock.unregister();
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

		public class NotLoggedBlock extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public CollectionHeaderTemplate._11_1_01703156756.NotLoggedBlock. _14_3_11484268815 _14_3_11484268815;

			public NotLoggedBlock(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (_14_3_11484268815 == null) _14_3_11484268815 = register(new _14_3_11484268815(box()).<_14_3_11484268815>id("a_125863669").owner(AbstractCollectionHeaderTemplate.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (_14_3_11484268815 != null) _14_3_11484268815.unregister();
			}

			public class _14_3_11484268815 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

				public _14_3_11484268815(B box) {
					super(box);
					_value("You are not logged in. Please log in to access your models.");
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
	}

	public class _15_1_12088999596 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {

		public _15_1_12088999596(B box) {
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