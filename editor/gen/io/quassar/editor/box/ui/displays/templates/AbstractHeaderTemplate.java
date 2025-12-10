package io.quassar.editor.box.ui.displays.templates;

import io.intino.alexandria.core.Box;
import io.intino.alexandria.exceptions.*;
import io.intino.alexandria.ui.displays.components.*;
import io.quassar.editor.box.ui.*;

import io.quassar.editor.box.EditorBox;

import io.quassar.editor.box.ui.displays.templates.*;






import io.quassar.editor.box.ui.displays.items.*;

import io.intino.alexandria.ui.displays.notifiers.TemplateNotifier;

public abstract class AbstractHeaderTemplate<B extends Box> extends io.intino.alexandria.ui.displays.components.Template<TemplateNotifier, java.lang.Void, B> {
	public _43_1_12016783430 _43_1_12016783430;
	public HeaderTemplate._43_1_12016783430. GoogleLoginStamp googleLoginStamp;
	public LanguageView languageView;
	public HeaderTemplate.LanguageView. _46_2_086521241 _46_2_086521241;
	public HeaderTemplate.LanguageView. _47_2_0236553557 _47_2_0236553557;
	public HeaderTemplate.LanguageView. LanguageBlock languageBlock;
	public HeaderTemplate.LanguageView.LanguageBlock. _49_3_11637287909 _49_3_11637287909;
	public HeaderTemplate.LanguageView.LanguageBlock. LanguageLink languageLink;
	public _52_1_11091187965 _52_1_11091187965;
	public HeaderTemplate._52_1_11091187965. _53_2_01105318056 _53_2_01105318056;
	public HeaderTemplate._52_1_11091187965. _54_2_01829421553 _54_2_01829421553;
	public HeaderTemplate._52_1_11091187965. Login login;
	public HeaderTemplate._52_1_11091187965. User user;
	public HeaderTemplate._52_1_11091187965.User. _59_3_11679004454 _59_3_11679004454;
	public UserHomeTemplate userHomeStamp;

	public AbstractHeaderTemplate(B box) {
		super(box);
		id("headerTemplate");
	}

	@Override
	public void init() {
		super.init();
		if (_43_1_12016783430 == null) _43_1_12016783430 = register(new _43_1_12016783430(box()).<_43_1_12016783430>id("a_1278070197").owner(AbstractHeaderTemplate.this));
		if (_43_1_12016783430 != null) googleLoginStamp = _43_1_12016783430.googleLoginStamp;
		if (languageView == null) languageView = register(new LanguageView(box()).<LanguageView>id("a_2055520906").owner(AbstractHeaderTemplate.this));
		if (languageView != null) _46_2_086521241 = languageView._46_2_086521241;
		if (languageView != null) _47_2_0236553557 = languageView._47_2_0236553557;
		if (languageView != null) languageBlock = languageView.languageBlock;
		if (languageBlock != null) _49_3_11637287909 = languageView.languageBlock._49_3_11637287909;
		if (languageBlock != null) languageLink = languageView.languageBlock.languageLink;
		if (_52_1_11091187965 == null) _52_1_11091187965 = register(new _52_1_11091187965(box()).<_52_1_11091187965>id("a1938703462").owner(AbstractHeaderTemplate.this));
		if (_52_1_11091187965 != null) _53_2_01105318056 = _52_1_11091187965._53_2_01105318056;
		if (_52_1_11091187965 != null) _54_2_01829421553 = _52_1_11091187965._54_2_01829421553;
		if (_52_1_11091187965 != null) login = _52_1_11091187965.login;
		if (_52_1_11091187965 != null) user = _52_1_11091187965.user;
		if (user != null) _59_3_11679004454 = _52_1_11091187965.user._59_3_11679004454;
		if (_59_3_11679004454 != null) userHomeStamp = _52_1_11091187965.user._59_3_11679004454.userHomeStamp;
	}

	@Override
	public void remove() {
		super.remove();
		if (_43_1_12016783430 != null) _43_1_12016783430.unregister();
		if (languageView != null) languageView.unregister();
		if (_52_1_11091187965 != null) _52_1_11091187965.unregister();
	}

	public class _43_1_12016783430 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
		public HeaderTemplate._43_1_12016783430. GoogleLoginStamp googleLoginStamp;

		public _43_1_12016783430(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (googleLoginStamp == null) googleLoginStamp = AbstractHeaderTemplate.this.googleLoginStamp = register(new GoogleLoginStamp(box()).<GoogleLoginStamp>id("a_22508138").owner(AbstractHeaderTemplate.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (googleLoginStamp != null) googleLoginStamp.unregister();
		}

		public class GoogleLoginStamp extends io.intino.alexandria.ui.displays.components.DisplayStamp<io.intino.alexandria.ui.displays.notifiers.DisplayStampNotifier, B>  {

			public GoogleLoginStamp(B box) {
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

	public class LanguageView extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
		public HeaderTemplate.LanguageView. _46_2_086521241 _46_2_086521241;
		public HeaderTemplate.LanguageView. _47_2_0236553557 _47_2_0236553557;
		public HeaderTemplate.LanguageView. LanguageBlock languageBlock;

		public LanguageView(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (_46_2_086521241 == null) _46_2_086521241 = register(new _46_2_086521241(box()).<_46_2_086521241>id("a_1196194699").owner(AbstractHeaderTemplate.this));
			if (_47_2_0236553557 == null) _47_2_0236553557 = register(new _47_2_0236553557(box()).<_47_2_0236553557>id("a_929411300").owner(AbstractHeaderTemplate.this));
			if (languageBlock == null) languageBlock = register(new LanguageBlock(box()).<LanguageBlock>id("a1020125452").owner(AbstractHeaderTemplate.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (_46_2_086521241 != null) _46_2_086521241.unregister();
			if (_47_2_0236553557 != null) _47_2_0236553557.unregister();
			if (languageBlock != null) languageBlock.unregister();
		}

		public class _46_2_086521241 extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B> implements io.intino.alexandria.ui.displays.components.addressable.Addressed<_46_2_086521241> {

			public _46_2_086521241(B box) {
				super(box);
				_title("");
				_mode(io.intino.alexandria.ui.displays.components.Actionable.Mode.valueOf("Link"));
				_path("/");
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
			public _46_2_086521241 address(java.util.function.Function<String, String> addressFromPathResolver) {
				address(addressFromPathResolver.apply(path()));
				return this;
			}
		}

		public class _47_2_0236553557 extends io.intino.alexandria.ui.displays.components.Image<io.intino.alexandria.ui.displays.notifiers.ImageNotifier, B>  {

			public _47_2_0236553557(B box) {
				super(box);
				_value(AbstractHeaderTemplate.class.getResource("/images/logo-expanded-dark.png"));
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

		public class LanguageBlock extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public HeaderTemplate.LanguageView.LanguageBlock. _49_3_11637287909 _49_3_11637287909;
			public HeaderTemplate.LanguageView.LanguageBlock. LanguageLink languageLink;

			public LanguageBlock(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (_49_3_11637287909 == null) _49_3_11637287909 = register(new _49_3_11637287909(box()).<_49_3_11637287909>id("a_1131873583").owner(AbstractHeaderTemplate.this));
				if (languageLink == null) languageLink = register(new LanguageLink(box()).<LanguageLink>id("a1121576901").owner(AbstractHeaderTemplate.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (_49_3_11637287909 != null) _49_3_11637287909.unregister();
				if (languageLink != null) languageLink.unregister();
			}

			public class _49_3_11637287909 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

				public _49_3_11637287909(B box) {
					super(box);
					_value(" ");
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

			public class LanguageLink extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B>  {

				public LanguageLink(B box) {
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
		}
	}

	public class _52_1_11091187965 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
		public HeaderTemplate._52_1_11091187965. _53_2_01105318056 _53_2_01105318056;
		public HeaderTemplate._52_1_11091187965. _54_2_01829421553 _54_2_01829421553;
		public HeaderTemplate._52_1_11091187965. Login login;
		public HeaderTemplate._52_1_11091187965. User user;

		public _52_1_11091187965(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (_53_2_01105318056 == null) _53_2_01105318056 = register(new _53_2_01105318056(box()).<_53_2_01105318056>id("a2110050904").owner(AbstractHeaderTemplate.this));
			if (_54_2_01829421553 == null) _54_2_01829421553 = register(new _54_2_01829421553(box()).<_54_2_01829421553>id("a_1969594197").owner(AbstractHeaderTemplate.this));
			if (login == null) login = register(new Login(box()).<Login>id("a_2122510140").owner(AbstractHeaderTemplate.this));
			if (user == null) user = register(new User(box()).<User>id("a_1592216816").owner(AbstractHeaderTemplate.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (_53_2_01105318056 != null) _53_2_01105318056.unregister();
			if (_54_2_01829421553 != null) _54_2_01829421553.unregister();
			if (login != null) login.unregister();
			if (user != null) user.unregister();
		}

		public class _53_2_01105318056 extends io.intino.alexandria.ui.displays.components.SetDarkMode<io.intino.alexandria.ui.displays.notifiers.SetDarkModeNotifier, B>  {

			public _53_2_01105318056(B box) {
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

		public class _54_2_01829421553 extends io.intino.alexandria.ui.displays.components.SetLightMode<io.intino.alexandria.ui.displays.notifiers.SetLightModeNotifier, B>  {

			public _54_2_01829421553(B box) {
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
			public HeaderTemplate._52_1_11091187965.User. _59_3_11679004454 _59_3_11679004454;

			public User(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (_59_3_11679004454 == null) _59_3_11679004454 = register(new _59_3_11679004454(box()).<_59_3_11679004454>id("a1144258336").owner(AbstractHeaderTemplate.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (_59_3_11679004454 != null) _59_3_11679004454.unregister();
			}

			public class _59_3_11679004454 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
				public UserHomeTemplate userHomeStamp;

				public _59_3_11679004454(B box) {
					super(box);
				}

				@Override
				public void init() {
					super.init();
					if (userHomeStamp == null) userHomeStamp = AbstractHeaderTemplate.this.userHomeStamp = register(new UserHomeTemplate((EditorBox)box()).id("a_1778526339"));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (userHomeStamp != null) userHomeStamp.unregister();
				}
			}
		}
	}
}