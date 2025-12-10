package io.quassar.editor.box.ui.displays.templates;

import io.intino.alexandria.core.Box;
import io.intino.alexandria.exceptions.*;
import io.intino.alexandria.ui.displays.components.*;
import io.quassar.editor.box.ui.*;

import io.quassar.editor.box.EditorBox;

import io.quassar.editor.box.ui.displays.templates.*;






import io.quassar.editor.box.ui.displays.items.*;

import io.intino.alexandria.ui.displays.notifiers.TemplateNotifier;

public abstract class AbstractForgeHeaderTemplate<B extends Box> extends io.intino.alexandria.ui.displays.components.Template<TemplateNotifier, java.lang.Void, B> {
	public LanguageView languageView;
	public ForgeHeaderTemplate.LanguageView. HomeLink homeLink;
	public ForgeHeaderTemplate.LanguageView. Logo logo;
	public ForgeHeaderTemplate.LanguageView. ForgeTitle forgeTitle;
	public _32_1_1730980717 _32_1_1730980717;
	public ForgeHeaderTemplate._32_1_1730980717. _33_2_01105318056 _33_2_01105318056;
	public ForgeHeaderTemplate._32_1_1730980717. _34_2_01829421553 _34_2_01829421553;
	public ForgeHeaderTemplate._32_1_1730980717. AboutLink aboutLink;
	public ForgeHeaderTemplate._32_1_1730980717. Login login;
	public ForgeHeaderTemplate._32_1_1730980717. User user;
	public ForgeHeaderTemplate._32_1_1730980717.User. _39_3_0917013363 _39_3_0917013363;
	public ForgeHeaderTemplate._32_1_1730980717.User._39_3_0917013363. _40_4_097558501 _40_4_097558501;
	public ForgeHeaderTemplate._32_1_1730980717.User._39_3_0917013363._40_4_097558501. ProjectsLink projectsLink;

	public AbstractForgeHeaderTemplate(B box) {
		super(box);
		id("forgeHeaderTemplate");
	}

	@Override
	public void init() {
		super.init();
		if (languageView == null) languageView = register(new LanguageView(box()).<LanguageView>id("a_209733203").owner(AbstractForgeHeaderTemplate.this));
		if (languageView != null) homeLink = languageView.homeLink;
		if (languageView != null) logo = languageView.logo;
		if (languageView != null) forgeTitle = languageView.forgeTitle;
		if (_32_1_1730980717 == null) _32_1_1730980717 = register(new _32_1_1730980717(box()).<_32_1_1730980717>id("a_1403881778").owner(AbstractForgeHeaderTemplate.this));
		if (_32_1_1730980717 != null) _33_2_01105318056 = _32_1_1730980717._33_2_01105318056;
		if (_32_1_1730980717 != null) _34_2_01829421553 = _32_1_1730980717._34_2_01829421553;
		if (_32_1_1730980717 != null) aboutLink = _32_1_1730980717.aboutLink;
		if (_32_1_1730980717 != null) login = _32_1_1730980717.login;
		if (_32_1_1730980717 != null) user = _32_1_1730980717.user;
		if (user != null) _39_3_0917013363 = _32_1_1730980717.user._39_3_0917013363;
		if (_39_3_0917013363 != null) _40_4_097558501 = _32_1_1730980717.user._39_3_0917013363._40_4_097558501;
		if (_40_4_097558501 != null) projectsLink = _32_1_1730980717.user._39_3_0917013363._40_4_097558501.projectsLink;
	}

	@Override
	public void remove() {
		super.remove();
		if (languageView != null) languageView.unregister();
		if (_32_1_1730980717 != null) _32_1_1730980717.unregister();
	}

	public class LanguageView extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
		public ForgeHeaderTemplate.LanguageView. HomeLink homeLink;
		public ForgeHeaderTemplate.LanguageView. Logo logo;
		public ForgeHeaderTemplate.LanguageView. ForgeTitle forgeTitle;

		public LanguageView(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (homeLink == null) homeLink = register(new HomeLink(box()).<HomeLink>id("a_1675060277").owner(AbstractForgeHeaderTemplate.this));
			if (logo == null) logo = register(new Logo(box()).<Logo>id("a1091553533").owner(AbstractForgeHeaderTemplate.this));
			if (forgeTitle == null) forgeTitle = register(new ForgeTitle(box()).<ForgeTitle>id("a_426808061").owner(AbstractForgeHeaderTemplate.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (homeLink != null) homeLink.unregister();
			if (logo != null) logo.unregister();
			if (forgeTitle != null) forgeTitle.unregister();
		}

		public class HomeLink extends io.intino.alexandria.ui.displays.components.OpenSite<io.intino.alexandria.ui.displays.notifiers.OpenSiteNotifier, B>  {

			public HomeLink(B box) {
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

		public class Logo extends io.intino.alexandria.ui.displays.components.Image<io.intino.alexandria.ui.displays.notifiers.ImageNotifier, B>  {

			public Logo(B box) {
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

		public class ForgeTitle extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

			public ForgeTitle(B box) {
				super(box);
				_value("");
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

	public class _32_1_1730980717 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
		public ForgeHeaderTemplate._32_1_1730980717. _33_2_01105318056 _33_2_01105318056;
		public ForgeHeaderTemplate._32_1_1730980717. _34_2_01829421553 _34_2_01829421553;
		public ForgeHeaderTemplate._32_1_1730980717. AboutLink aboutLink;
		public ForgeHeaderTemplate._32_1_1730980717. Login login;
		public ForgeHeaderTemplate._32_1_1730980717. User user;

		public _32_1_1730980717(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (_33_2_01105318056 == null) _33_2_01105318056 = register(new _33_2_01105318056(box()).<_33_2_01105318056>id("a255588169").owner(AbstractForgeHeaderTemplate.this));
			if (_34_2_01829421553 == null) _34_2_01829421553 = register(new _34_2_01829421553(box()).<_34_2_01829421553>id("a470910364").owner(AbstractForgeHeaderTemplate.this));
			if (aboutLink == null) aboutLink = register(new AboutLink(box()).<AboutLink>id("a507884721").owner(AbstractForgeHeaderTemplate.this));
			if (login == null) login = register(new Login(box()).<Login>id("a1851277299").owner(AbstractForgeHeaderTemplate.this));
			if (user == null) user = register(new User(box()).<User>id("a59990529").owner(AbstractForgeHeaderTemplate.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (_33_2_01105318056 != null) _33_2_01105318056.unregister();
			if (_34_2_01829421553 != null) _34_2_01829421553.unregister();
			if (aboutLink != null) aboutLink.unregister();
			if (login != null) login.unregister();
			if (user != null) user.unregister();
		}

		public class _33_2_01105318056 extends io.intino.alexandria.ui.displays.components.SetDarkMode<io.intino.alexandria.ui.displays.notifiers.SetDarkModeNotifier, B>  {

			public _33_2_01105318056(B box) {
				super(box);
				_title("Set dark mode");
				_mode(io.intino.alexandria.ui.displays.components.Actionable.Mode.valueOf("MaterialIconButton"));
				_icon("Brightness4");
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

		public class _34_2_01829421553 extends io.intino.alexandria.ui.displays.components.SetLightMode<io.intino.alexandria.ui.displays.notifiers.SetLightModeNotifier, B>  {

			public _34_2_01829421553(B box) {
				super(box);
				_title("Set light mode");
				_mode(io.intino.alexandria.ui.displays.components.Actionable.Mode.valueOf("MaterialIconButton"));
				_icon("Brightness7");
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

		public class AboutLink extends io.intino.alexandria.ui.displays.components.OpenSite<io.intino.alexandria.ui.displays.notifiers.OpenSiteNotifier, B>  {

			public AboutLink(B box) {
				super(box);
				_title("About");
				_mode(io.intino.alexandria.ui.displays.components.Actionable.Mode.valueOf("Button"));
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

		public class Login extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B>  {

			public Login(B box) {
				super(box);
				_title("Log in");
				_mode(io.intino.alexandria.ui.displays.components.Actionable.Mode.valueOf("Button"));
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

		public class User extends io.intino.alexandria.ui.displays.components.User<io.intino.alexandria.ui.displays.notifiers.UserNotifier, B>  {
			public ForgeHeaderTemplate._32_1_1730980717.User. _39_3_0917013363 _39_3_0917013363;

			public User(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (_39_3_0917013363 == null) _39_3_0917013363 = register(new _39_3_0917013363(box()).<_39_3_0917013363>id("a1482197585").owner(AbstractForgeHeaderTemplate.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (_39_3_0917013363 != null) _39_3_0917013363.unregister();
			}

			public class _39_3_0917013363 extends io.intino.alexandria.ui.displays.components.SelectorListBox<io.intino.alexandria.ui.displays.notifiers.SelectorListBoxNotifier, B>  {
				public ForgeHeaderTemplate._32_1_1730980717.User._39_3_0917013363. _40_4_097558501 _40_4_097558501;

				public _39_3_0917013363(B box) {
					super(box);
					_multipleSelection(false);
				}

				@Override
				public void init() {
					super.init();
					if (_40_4_097558501 == null) _40_4_097558501 = register(new _40_4_097558501(box()).<_40_4_097558501>id("a_1453074416").owner(AbstractForgeHeaderTemplate.this));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (_40_4_097558501 != null) _40_4_097558501.unregister();
				}

				public class _40_4_097558501 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B> implements io.intino.alexandria.ui.displays.components.selector.SelectorOption {
					public ForgeHeaderTemplate._32_1_1730980717.User._39_3_0917013363._40_4_097558501. ProjectsLink projectsLink;

					public _40_4_097558501(B box) {
						super(box);

						name("Forge_40_4_097558501");
					}

					@Override
					public void init() {
						super.init();
						if (projectsLink == null) projectsLink = register(new ProjectsLink(box()).<ProjectsLink>id("a622710506").owner(AbstractForgeHeaderTemplate.this));
					}

					@Override
					public void unregister() {
						super.unregister();
						if (projectsLink != null) projectsLink.unregister();
					}

					public class ProjectsLink extends io.intino.alexandria.ui.displays.components.OpenSite<io.intino.alexandria.ui.displays.notifiers.OpenSiteNotifier, B>  {

						public ProjectsLink(B box) {
							super(box);
							_title("Projects");
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
				}
			}
		}
	}
}