package io.quassar.editor.box.ui.displays.items;

import io.intino.alexandria.core.Box;
import io.intino.alexandria.exceptions.*;
import io.intino.alexandria.ui.displays.components.*;
import io.quassar.editor.box.ui.*;

import io.quassar.editor.box.EditorBox;

import io.quassar.editor.box.ui.displays.templates.*;






import io.quassar.editor.box.ui.displays.items.*;

import io.intino.alexandria.ui.displays.notifiers.ItemNotifier;

public class LanguageLandingItem extends io.intino.alexandria.ui.displays.components.Item<ItemNotifier, io.quassar.editor.model.Language, EditorBox> {
	public LogoLink logoLink;
	public LogoSelectorLink logoSelectorLink;
	public _58_6_1881410689 _58_6_1881410689;
	public LanguageLandingItem._58_6_1881410689. _59_7_0940236094 _59_7_0940236094;
	public LanguageLandingItem._58_6_1881410689._59_7_0940236094. Logo logo;
	public LanguageLandingItem._58_6_1881410689. _61_7_0347974780 _61_7_0347974780;
	public LanguageLandingItem._58_6_1881410689._61_7_0347974780. Name name;
	public LanguageLandingItem._58_6_1881410689._61_7_0347974780. NameSelector nameSelector;
	public LanguageLandingItem._58_6_1881410689._61_7_0347974780. Title title;
	public LanguageLandingItem._58_6_1881410689._61_7_0347974780. Description description;

	public LanguageLandingItem(EditorBox box) {
		super(box);
		id("a_432441141");
	}

	@Override
	public void init() {
		super.init();
		if (logoLink == null) logoLink = register(new LogoLink(box()).<LogoLink>id("a_1419409095").owner(LanguageLandingItem.this));
		if (logoSelectorLink == null) logoSelectorLink = register(new LogoSelectorLink(box()).<LogoSelectorLink>id("a_2124399944").owner(LanguageLandingItem.this));
		if (_58_6_1881410689 == null) _58_6_1881410689 = register(new _58_6_1881410689(box()).<_58_6_1881410689>id("a_461011618").owner(LanguageLandingItem.this));
		if (_58_6_1881410689 != null) _59_7_0940236094 = _58_6_1881410689._59_7_0940236094;
		if (_59_7_0940236094 != null) logo = _58_6_1881410689._59_7_0940236094.logo;
		if (_58_6_1881410689 != null) _61_7_0347974780 = _58_6_1881410689._61_7_0347974780;
		if (_61_7_0347974780 != null) name = _58_6_1881410689._61_7_0347974780.name;
		if (_61_7_0347974780 != null) nameSelector = _58_6_1881410689._61_7_0347974780.nameSelector;
		if (_61_7_0347974780 != null) title = _58_6_1881410689._61_7_0347974780.title;
		if (_61_7_0347974780 != null) description = _58_6_1881410689._61_7_0347974780.description;
	}

	@Override
	public void remove() {
		super.remove();
		if (logoLink != null) logoLink.unregister();
		if (logoSelectorLink != null) logoSelectorLink.unregister();
		if (_58_6_1881410689 != null) _58_6_1881410689.unregister();
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

	public class _58_6_1881410689 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, EditorBox>  {
		public LanguageLandingItem._58_6_1881410689. _59_7_0940236094 _59_7_0940236094;
		public LanguageLandingItem._58_6_1881410689. _61_7_0347974780 _61_7_0347974780;

		public _58_6_1881410689(EditorBox box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (_59_7_0940236094 == null) _59_7_0940236094 = register(new _59_7_0940236094(box()).<_59_7_0940236094>id("a237517536").owner(LanguageLandingItem.this));
			if (_61_7_0347974780 == null) _61_7_0347974780 = register(new _61_7_0347974780(box()).<_61_7_0347974780>id("a1575999661").owner(LanguageLandingItem.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (_59_7_0940236094 != null) _59_7_0940236094.unregister();
			if (_61_7_0347974780 != null) _61_7_0347974780.unregister();
		}

		public class _59_7_0940236094 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, EditorBox>  {
			public LanguageLandingItem._58_6_1881410689._59_7_0940236094. Logo logo;

			public _59_7_0940236094(EditorBox box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (logo == null) logo = register(new Logo(box()).<Logo>id("a_55872662").owner(LanguageLandingItem.this));
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

		public class _61_7_0347974780 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, EditorBox>  {
			public LanguageLandingItem._58_6_1881410689._61_7_0347974780. Name name;
			public LanguageLandingItem._58_6_1881410689._61_7_0347974780. NameSelector nameSelector;
			public LanguageLandingItem._58_6_1881410689._61_7_0347974780. Title title;
			public LanguageLandingItem._58_6_1881410689._61_7_0347974780. Description description;

			public _61_7_0347974780(EditorBox box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (name == null) name = register(new Name(box()).<Name>id("a1374105683").owner(LanguageLandingItem.this));
				if (nameSelector == null) nameSelector = register(new NameSelector(box()).<NameSelector>id("a_1396210350").owner(LanguageLandingItem.this));
				if (title == null) title = register(new Title(box()).<Title>id("a_346610288").owner(LanguageLandingItem.this));
				if (description == null) description = register(new Description(box()).<Description>id("a_456704716").owner(LanguageLandingItem.this));
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