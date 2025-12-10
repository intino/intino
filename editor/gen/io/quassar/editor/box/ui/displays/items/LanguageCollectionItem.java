package io.quassar.editor.box.ui.displays.items;

import io.intino.alexandria.core.Box;
import io.intino.alexandria.exceptions.*;
import io.intino.alexandria.ui.displays.components.*;
import io.quassar.editor.box.ui.*;

import io.quassar.editor.box.EditorBox;

import io.quassar.editor.box.ui.displays.templates.*;






import io.quassar.editor.box.ui.displays.items.*;

import io.intino.alexandria.ui.displays.notifiers.ItemNotifier;

public class LanguageCollectionItem extends io.intino.alexandria.ui.displays.components.Item<ItemNotifier, io.quassar.editor.model.Language, EditorBox> {
	public LogoLink logoLink;
	public _81_6_1190584922 _81_6_1190584922;
	public LanguageCollectionItem._81_6_1190584922. _82_7_0112816756 _82_7_0112816756;
	public LanguageCollectionItem._81_6_1190584922._82_7_0112816756. Logo logo;
	public LanguageCollectionItem._81_6_1190584922. _84_7_1143081370 _84_7_1143081370;
	public LanguageCollectionItem._81_6_1190584922._84_7_1143081370. Name name;

	public LanguageCollectionItem(EditorBox box) {
		super(box);
		id("a569852430");
	}

	@Override
	public void init() {
		super.init();
		if (logoLink == null) logoLink = register(new LogoLink(box()).<LogoLink>id("a_313361578").owner(LanguageCollectionItem.this));
		if (_81_6_1190584922 == null) _81_6_1190584922 = register(new _81_6_1190584922(box()).<_81_6_1190584922>id("a_19396704").owner(LanguageCollectionItem.this));
		if (_81_6_1190584922 != null) _82_7_0112816756 = _81_6_1190584922._82_7_0112816756;
		if (_82_7_0112816756 != null) logo = _81_6_1190584922._82_7_0112816756.logo;
		if (_81_6_1190584922 != null) _84_7_1143081370 = _81_6_1190584922._84_7_1143081370;
		if (_84_7_1143081370 != null) name = _81_6_1190584922._84_7_1143081370.name;
	}

	@Override
	public void remove() {
		super.remove();
		if (logoLink != null) logoLink.unregister();
		if (_81_6_1190584922 != null) _81_6_1190584922.unregister();
	}

	public class LogoLink extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, EditorBox> implements io.intino.alexandria.ui.displays.components.addressable.Addressed<LogoLink> {

		public LogoLink(EditorBox box) {
			super(box);
			_title("&nbsp;");
			_mode(io.intino.alexandria.ui.displays.components.Actionable.Mode.valueOf("Link"));
			_path("/models/:language");
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
		public LogoLink address(java.util.function.Function<String, String> addressFromPathResolver) {
			address(addressFromPathResolver.apply(path()));
			return this;
		}
	}

	public class _81_6_1190584922 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, EditorBox>  {
		public LanguageCollectionItem._81_6_1190584922. _82_7_0112816756 _82_7_0112816756;
		public LanguageCollectionItem._81_6_1190584922. _84_7_1143081370 _84_7_1143081370;

		public _81_6_1190584922(EditorBox box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (_82_7_0112816756 == null) _82_7_0112816756 = register(new _82_7_0112816756(box()).<_82_7_0112816756>id("a1496215702").owner(LanguageCollectionItem.this));
			if (_84_7_1143081370 == null) _84_7_1143081370 = register(new _84_7_1143081370(box()).<_84_7_1143081370>id("a1886831033").owner(LanguageCollectionItem.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (_82_7_0112816756 != null) _82_7_0112816756.unregister();
			if (_84_7_1143081370 != null) _84_7_1143081370.unregister();
		}

		public class _82_7_0112816756 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, EditorBox>  {
			public LanguageCollectionItem._81_6_1190584922._82_7_0112816756. Logo logo;

			public _82_7_0112816756(EditorBox box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (logo == null) logo = register(new Logo(box()).<Logo>id("a_498039212").owner(LanguageCollectionItem.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (logo != null) logo.unregister();
			}

			public class Logo extends io.intino.alexandria.ui.displays.components.Image<io.intino.alexandria.ui.displays.notifiers.ImageNotifier, EditorBox>  {

				public Logo(EditorBox box) {
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

		public class _84_7_1143081370 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, EditorBox>  {
			public LanguageCollectionItem._81_6_1190584922._84_7_1143081370. Name name;

			public _84_7_1143081370(EditorBox box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (name == null) name = register(new Name(box()).<Name>id("a_1307339534").owner(LanguageCollectionItem.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (name != null) name.unregister();
			}

			public class Name extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, EditorBox> implements io.intino.alexandria.ui.displays.components.addressable.Addressed<Name> {

				public Name(EditorBox box) {
					super(box);
					_title("");
					_mode(io.intino.alexandria.ui.displays.components.Actionable.Mode.valueOf("Link"));
					_path("/models/:language");
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
				public Name address(java.util.function.Function<String, String> addressFromPathResolver) {
					address(addressFromPathResolver.apply(path()));
					return this;
				}
			}
		}
	}
}