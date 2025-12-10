package io.quassar.editor.box.ui.displays.items;

import io.intino.alexandria.core.Box;
import io.intino.alexandria.exceptions.*;
import io.intino.alexandria.ui.displays.components.*;
import io.quassar.editor.box.ui.*;

import io.quassar.editor.box.EditorBox;

import io.quassar.editor.box.ui.displays.templates.*;






import io.quassar.editor.box.ui.displays.items.*;

import io.intino.alexandria.ui.displays.notifiers.ItemNotifier;

public class LanguageItem extends io.intino.alexandria.ui.displays.components.Item<ItemNotifier, io.quassar.editor.model.Language, EditorBox> {
	public LogoLink logoLink;
	public LogoSelectorLink logoSelectorLink;
	public _36_6_11638032749 _36_6_11638032749;
	public LanguageItem._36_6_11638032749. _37_7_02019293432 _37_7_02019293432;
	public LanguageItem._36_6_11638032749._37_7_02019293432. Logo logo;
	public LanguageItem._36_6_11638032749. _39_7_01418566320 _39_7_01418566320;
	public LanguageItem._36_6_11638032749._39_7_01418566320. Name name;
	public LanguageItem._36_6_11638032749._39_7_01418566320. NameSelector nameSelector;
	public LanguageItem._36_6_11638032749._39_7_01418566320. Title title;
	public LanguageItem._36_6_11638032749._39_7_01418566320. Description description;

	public LanguageItem(EditorBox box) {
		super(box);
		id("a_202609838");
	}

	@Override
	public void init() {
		super.init();
		if (logoLink == null) logoLink = register(new LogoLink(box()).<LogoLink>id("a631078546").owner(LanguageItem.this));
		if (logoSelectorLink == null) logoSelectorLink = register(new LogoSelectorLink(box()).<LogoSelectorLink>id("a_560085231").owner(LanguageItem.this));
		if (_36_6_11638032749 == null) _36_6_11638032749 = register(new _36_6_11638032749(box()).<_36_6_11638032749>id("a1258847765").owner(LanguageItem.this));
		if (_36_6_11638032749 != null) _37_7_02019293432 = _36_6_11638032749._37_7_02019293432;
		if (_37_7_02019293432 != null) logo = _36_6_11638032749._37_7_02019293432.logo;
		if (_36_6_11638032749 != null) _39_7_01418566320 = _36_6_11638032749._39_7_01418566320;
		if (_39_7_01418566320 != null) name = _36_6_11638032749._39_7_01418566320.name;
		if (_39_7_01418566320 != null) nameSelector = _36_6_11638032749._39_7_01418566320.nameSelector;
		if (_39_7_01418566320 != null) title = _36_6_11638032749._39_7_01418566320.title;
		if (_39_7_01418566320 != null) description = _36_6_11638032749._39_7_01418566320.description;
	}

	@Override
	public void remove() {
		super.remove();
		if (logoLink != null) logoLink.unregister();
		if (logoSelectorLink != null) logoSelectorLink.unregister();
		if (_36_6_11638032749 != null) _36_6_11638032749.unregister();
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

	public class LogoSelectorLink extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, EditorBox>  {

		public LogoSelectorLink(EditorBox box) {
			super(box);
			_title("&nbsp;");
			_mode(io.intino.alexandria.ui.displays.components.Actionable.Mode.valueOf("Link"));
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

	public class _36_6_11638032749 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, EditorBox>  {
		public LanguageItem._36_6_11638032749. _37_7_02019293432 _37_7_02019293432;
		public LanguageItem._36_6_11638032749. _39_7_01418566320 _39_7_01418566320;

		public _36_6_11638032749(EditorBox box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (_37_7_02019293432 == null) _37_7_02019293432 = register(new _37_7_02019293432(box()).<_37_7_02019293432>id("a_212410184").owner(LanguageItem.this));
			if (_39_7_01418566320 == null) _39_7_01418566320 = register(new _39_7_01418566320(box()).<_39_7_01418566320>id("a_739942029").owner(LanguageItem.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (_37_7_02019293432 != null) _37_7_02019293432.unregister();
			if (_39_7_01418566320 != null) _39_7_01418566320.unregister();
		}

		public class _37_7_02019293432 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, EditorBox>  {
			public LanguageItem._36_6_11638032749._37_7_02019293432. Logo logo;

			public _37_7_02019293432(EditorBox box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (logo == null) logo = register(new Logo(box()).<Logo>id("a73415594").owner(LanguageItem.this));
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

		public class _39_7_01418566320 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, EditorBox>  {
			public LanguageItem._36_6_11638032749._39_7_01418566320. Name name;
			public LanguageItem._36_6_11638032749._39_7_01418566320. NameSelector nameSelector;
			public LanguageItem._36_6_11638032749._39_7_01418566320. Title title;
			public LanguageItem._36_6_11638032749._39_7_01418566320. Description description;

			public _39_7_01418566320(EditorBox box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (name == null) name = register(new Name(box()).<Name>id("a_735884728").owner(LanguageItem.this));
				if (nameSelector == null) nameSelector = register(new NameSelector(box()).<NameSelector>id("a_950478265").owner(LanguageItem.this));
				if (title == null) title = register(new Title(box()).<Title>id("a_1331803589").owner(LanguageItem.this));
				if (description == null) description = register(new Description(box()).<Description>id("a250410399").owner(LanguageItem.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (name != null) name.unregister();
				if (nameSelector != null) nameSelector.unregister();
				if (title != null) title.unregister();
				if (description != null) description.unregister();
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

			public class NameSelector extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, EditorBox>  {

				public NameSelector(EditorBox box) {
					super(box);
					_title("");
					_mode(io.intino.alexandria.ui.displays.components.Actionable.Mode.valueOf("Link"));
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

			public class Title extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, EditorBox>  {

				public Title(EditorBox box) {
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

			public class Description extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, EditorBox>  {

				public Description(EditorBox box) {
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
	}
}