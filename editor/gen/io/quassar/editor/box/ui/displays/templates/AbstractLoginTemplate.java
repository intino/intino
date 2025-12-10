package io.quassar.editor.box.ui.displays.templates;

import io.intino.alexandria.core.Box;
import io.intino.alexandria.exceptions.*;
import io.intino.alexandria.ui.displays.components.*;
import io.quassar.editor.box.ui.*;

import io.quassar.editor.box.EditorBox;

import io.quassar.editor.box.ui.displays.templates.*;






import io.quassar.editor.box.ui.displays.items.*;

import io.intino.alexandria.ui.displays.notifiers.TemplateNotifier;

public abstract class AbstractLoginTemplate<B extends Box> extends io.intino.alexandria.ui.displays.components.Template<TemplateNotifier, java.lang.Void, B> {
	public Content content;
	public LoginTemplate.Content. _90_2_11118885617 _90_2_11118885617;
	public LoginTemplate.Content._90_2_11118885617. HomeLink homeLink;
	public LoginTemplate.Content._90_2_11118885617. _92_3_11316766197 _92_3_11316766197;
	public LoginTemplate.Content. _93_2_01581375786 _93_2_01581375786;
	public LoginTemplate.Content._93_2_01581375786. _94_3_02046497470 _94_3_02046497470;
	public LoginTemplate.Content._93_2_01581375786._94_3_02046497470. GoogleLoginBlock googleLoginBlock;
	public LoginTemplate.Content._93_2_01581375786._94_3_02046497470.GoogleLoginBlock. _97_5_11919191528 _97_5_11919191528;
	public LoginTemplate.Content._93_2_01581375786._94_3_02046497470.GoogleLoginBlock._97_5_11919191528. _98_6_0755805536 _98_6_0755805536;
	public LoginTemplate.Content._93_2_01581375786._94_3_02046497470.GoogleLoginBlock._97_5_11919191528. _99_6_139538778 _99_6_139538778;
	public LoginTemplate.Content._93_2_01581375786._94_3_02046497470.GoogleLoginBlock._97_5_11919191528._99_6_139538778. GoogleLoginStamp googleLoginStamp;
	public LoginTemplate.Content._93_2_01581375786._94_3_02046497470. LocalLoginBlock localLoginBlock;
	public LoginTemplate.Content._93_2_01581375786._94_3_02046497470.LocalLoginBlock. _102_5_0145198685 _102_5_0145198685;
	public LoginTemplate.Content._93_2_01581375786._94_3_02046497470.LocalLoginBlock._102_5_0145198685. _103_6_0156987834 _103_6_0156987834;
	public LoginTemplate.Content._93_2_01581375786._94_3_02046497470.LocalLoginBlock._102_5_0145198685. _104_6_01761892360 _104_6_01761892360;
	public LoginTemplate.Content._93_2_01581375786._94_3_02046497470.LocalLoginBlock._102_5_0145198685._104_6_01761892360. UserSelector userSelector;
	public LoginTemplate.Content._93_2_01581375786._94_3_02046497470.LocalLoginBlock._102_5_0145198685._104_6_01761892360. _106_7_01843998075 _106_7_01843998075;
	public LoginTemplate.Content._93_2_01581375786._94_3_02046497470.LocalLoginBlock._102_5_0145198685._104_6_01761892360._106_7_01843998075. UsernameField usernameField;
	public LoginTemplate.Content._93_2_01581375786._94_3_02046497470.LocalLoginBlock._102_5_0145198685._104_6_01761892360. NotFoundUsernameMessage notFoundUsernameMessage;
	public LoginTemplate.Content._93_2_01581375786._94_3_02046497470.LocalLoginBlock. _109_5_11370932491 _109_5_11370932491;
	public LoginTemplate.Content._93_2_01581375786._94_3_02046497470.LocalLoginBlock._109_5_11370932491. Login login;
	public LoginSelectorOption _112_1_043191460;

	public AbstractLoginTemplate(B box) {
		super(box);
		id("loginTemplate");
	}

	@Override
	public void init() {
		super.init();
		if (content == null) content = register(new Content(box()).<Content>id("a1326125118").owner(AbstractLoginTemplate.this));
		if (content != null) _90_2_11118885617 = content._90_2_11118885617;
		if (_90_2_11118885617 != null) homeLink = content._90_2_11118885617.homeLink;
		if (_90_2_11118885617 != null) _92_3_11316766197 = content._90_2_11118885617._92_3_11316766197;
		if (content != null) _93_2_01581375786 = content._93_2_01581375786;
		if (_93_2_01581375786 != null) _94_3_02046497470 = content._93_2_01581375786._94_3_02046497470;
		if (_94_3_02046497470 != null) googleLoginBlock = content._93_2_01581375786._94_3_02046497470.googleLoginBlock;
		if (googleLoginBlock != null) _97_5_11919191528 = content._93_2_01581375786._94_3_02046497470.googleLoginBlock._97_5_11919191528;
		if (_97_5_11919191528 != null) _98_6_0755805536 = content._93_2_01581375786._94_3_02046497470.googleLoginBlock._97_5_11919191528._98_6_0755805536;
		if (_97_5_11919191528 != null) _99_6_139538778 = content._93_2_01581375786._94_3_02046497470.googleLoginBlock._97_5_11919191528._99_6_139538778;
		if (_99_6_139538778 != null) googleLoginStamp = content._93_2_01581375786._94_3_02046497470.googleLoginBlock._97_5_11919191528._99_6_139538778.googleLoginStamp;
		if (_94_3_02046497470 != null) localLoginBlock = content._93_2_01581375786._94_3_02046497470.localLoginBlock;
		if (localLoginBlock != null) _102_5_0145198685 = content._93_2_01581375786._94_3_02046497470.localLoginBlock._102_5_0145198685;
		if (_102_5_0145198685 != null) _103_6_0156987834 = content._93_2_01581375786._94_3_02046497470.localLoginBlock._102_5_0145198685._103_6_0156987834;
		if (_102_5_0145198685 != null) _104_6_01761892360 = content._93_2_01581375786._94_3_02046497470.localLoginBlock._102_5_0145198685._104_6_01761892360;
		if (_104_6_01761892360 != null) userSelector = content._93_2_01581375786._94_3_02046497470.localLoginBlock._102_5_0145198685._104_6_01761892360.userSelector;
		if (_104_6_01761892360 != null) _106_7_01843998075 = content._93_2_01581375786._94_3_02046497470.localLoginBlock._102_5_0145198685._104_6_01761892360._106_7_01843998075;
		if (_106_7_01843998075 != null) usernameField = content._93_2_01581375786._94_3_02046497470.localLoginBlock._102_5_0145198685._104_6_01761892360._106_7_01843998075.usernameField;
		if (_104_6_01761892360 != null) notFoundUsernameMessage = content._93_2_01581375786._94_3_02046497470.localLoginBlock._102_5_0145198685._104_6_01761892360.notFoundUsernameMessage;
		if (localLoginBlock != null) _109_5_11370932491 = content._93_2_01581375786._94_3_02046497470.localLoginBlock._109_5_11370932491;
		if (_109_5_11370932491 != null) login = content._93_2_01581375786._94_3_02046497470.localLoginBlock._109_5_11370932491.login;
		if (_112_1_043191460 == null) _112_1_043191460 = register(new LoginSelectorOption((EditorBox)box()).id("a_1447221227"));
	}

	@Override
	public void remove() {
		super.remove();
		if (content != null) content.unregister();
		if (_112_1_043191460 != null) _112_1_043191460.unregister();
	}

	public class Content extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
		public LoginTemplate.Content. _90_2_11118885617 _90_2_11118885617;
		public LoginTemplate.Content. _93_2_01581375786 _93_2_01581375786;

		public Content(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (_90_2_11118885617 == null) _90_2_11118885617 = register(new _90_2_11118885617(box()).<_90_2_11118885617>id("a_412554648").owner(AbstractLoginTemplate.this));
			if (_93_2_01581375786 == null) _93_2_01581375786 = register(new _93_2_01581375786(box()).<_93_2_01581375786>id("a225345469").owner(AbstractLoginTemplate.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (_90_2_11118885617 != null) _90_2_11118885617.unregister();
			if (_93_2_01581375786 != null) _93_2_01581375786.unregister();
		}

		public class _90_2_11118885617 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public LoginTemplate.Content._90_2_11118885617. HomeLink homeLink;
			public LoginTemplate.Content._90_2_11118885617. _92_3_11316766197 _92_3_11316766197;

			public _90_2_11118885617(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (homeLink == null) homeLink = register(new HomeLink(box()).<HomeLink>id("a_1033474397").owner(AbstractLoginTemplate.this));
				if (_92_3_11316766197 == null) _92_3_11316766197 = register(new _92_3_11316766197(box()).<_92_3_11316766197>id("a_930008141").owner(AbstractLoginTemplate.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (homeLink != null) homeLink.unregister();
				if (_92_3_11316766197 != null) _92_3_11316766197.unregister();
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

			public class _92_3_11316766197 extends io.intino.alexandria.ui.displays.components.Image<io.intino.alexandria.ui.displays.notifiers.ImageNotifier, B>  {

				public _92_3_11316766197(B box) {
					super(box);
					_value(AbstractLoginTemplate.class.getResource("/images/logo-expanded.png"));
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

		public class _93_2_01581375786 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public LoginTemplate.Content._93_2_01581375786. _94_3_02046497470 _94_3_02046497470;

			public _93_2_01581375786(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (_94_3_02046497470 == null) _94_3_02046497470 = register(new _94_3_02046497470(box()).<_94_3_02046497470>id("a2002394291").owner(AbstractLoginTemplate.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (_94_3_02046497470 != null) _94_3_02046497470.unregister();
			}

			public class _94_3_02046497470 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
				public LoginTemplate.Content._93_2_01581375786._94_3_02046497470. GoogleLoginBlock googleLoginBlock;
				public LoginTemplate.Content._93_2_01581375786._94_3_02046497470. LocalLoginBlock localLoginBlock;

				public _94_3_02046497470(B box) {
					super(box);
				}

				@Override
				public void init() {
					super.init();
					if (googleLoginBlock == null) googleLoginBlock = register(new GoogleLoginBlock(box()).<GoogleLoginBlock>id("a_1384647550").owner(AbstractLoginTemplate.this));
					if (localLoginBlock == null) localLoginBlock = register(new LocalLoginBlock(box()).<LocalLoginBlock>id("a_1705372406").owner(AbstractLoginTemplate.this));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (googleLoginBlock != null) googleLoginBlock.unregister();
					if (localLoginBlock != null) localLoginBlock.unregister();
				}

				public class GoogleLoginBlock extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
					public LoginTemplate.Content._93_2_01581375786._94_3_02046497470.GoogleLoginBlock. _97_5_11919191528 _97_5_11919191528;

					public GoogleLoginBlock(B box) {
						super(box);
					}

					@Override
					public void init() {
						super.init();
						if (_97_5_11919191528 == null) _97_5_11919191528 = register(new _97_5_11919191528(box()).<_97_5_11919191528>id("a1859373642").owner(AbstractLoginTemplate.this));
					}

					@Override
					public void unregister() {
						super.unregister();
						if (_97_5_11919191528 != null) _97_5_11919191528.unregister();
					}

					public class _97_5_11919191528 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
						public LoginTemplate.Content._93_2_01581375786._94_3_02046497470.GoogleLoginBlock._97_5_11919191528. _98_6_0755805536 _98_6_0755805536;
						public LoginTemplate.Content._93_2_01581375786._94_3_02046497470.GoogleLoginBlock._97_5_11919191528. _99_6_139538778 _99_6_139538778;

						public _97_5_11919191528(B box) {
							super(box);
						}

						@Override
						public void init() {
							super.init();
							if (_98_6_0755805536 == null) _98_6_0755805536 = register(new _98_6_0755805536(box()).<_98_6_0755805536>id("a1209638476").owner(AbstractLoginTemplate.this));
							if (_99_6_139538778 == null) _99_6_139538778 = register(new _99_6_139538778(box()).<_99_6_139538778>id("a_1469568148").owner(AbstractLoginTemplate.this));
						}

						@Override
						public void unregister() {
							super.unregister();
							if (_98_6_0755805536 != null) _98_6_0755805536.unregister();
							if (_99_6_139538778 != null) _99_6_139538778.unregister();
						}

						public class _98_6_0755805536 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

							public _98_6_0755805536(B box) {
								super(box);
								_value("Login using Google");
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

						public class _99_6_139538778 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
							public LoginTemplate.Content._93_2_01581375786._94_3_02046497470.GoogleLoginBlock._97_5_11919191528._99_6_139538778. GoogleLoginStamp googleLoginStamp;

							public _99_6_139538778(B box) {
								super(box);
							}

							@Override
							public void init() {
								super.init();
								if (googleLoginStamp == null) googleLoginStamp = AbstractLoginTemplate.this.googleLoginStamp = register(new GoogleLoginStamp(box()).<GoogleLoginStamp>id("a_2109093392").owner(AbstractLoginTemplate.this));
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
					}
				}

				public class LocalLoginBlock extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
					public LoginTemplate.Content._93_2_01581375786._94_3_02046497470.LocalLoginBlock. _102_5_0145198685 _102_5_0145198685;
					public LoginTemplate.Content._93_2_01581375786._94_3_02046497470.LocalLoginBlock. _109_5_11370932491 _109_5_11370932491;

					public LocalLoginBlock(B box) {
						super(box);
					}

					@Override
					public void init() {
						super.init();
						if (_102_5_0145198685 == null) _102_5_0145198685 = register(new _102_5_0145198685(box()).<_102_5_0145198685>id("a1836679909").owner(AbstractLoginTemplate.this));
						if (_109_5_11370932491 == null) _109_5_11370932491 = register(new _109_5_11370932491(box()).<_109_5_11370932491>id("a1374342759").owner(AbstractLoginTemplate.this));
					}

					@Override
					public void unregister() {
						super.unregister();
						if (_102_5_0145198685 != null) _102_5_0145198685.unregister();
						if (_109_5_11370932491 != null) _109_5_11370932491.unregister();
					}

					public class _102_5_0145198685 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
						public LoginTemplate.Content._93_2_01581375786._94_3_02046497470.LocalLoginBlock._102_5_0145198685. _103_6_0156987834 _103_6_0156987834;
						public LoginTemplate.Content._93_2_01581375786._94_3_02046497470.LocalLoginBlock._102_5_0145198685. _104_6_01761892360 _104_6_01761892360;

						public _102_5_0145198685(B box) {
							super(box);
						}

						@Override
						public void init() {
							super.init();
							if (_103_6_0156987834 == null) _103_6_0156987834 = register(new _103_6_0156987834(box()).<_103_6_0156987834>id("a_970287243").owner(AbstractLoginTemplate.this));
							if (_104_6_01761892360 == null) _104_6_01761892360 = register(new _104_6_01761892360(box()).<_104_6_01761892360>id("a_629917028").owner(AbstractLoginTemplate.this));
						}

						@Override
						public void unregister() {
							super.unregister();
							if (_103_6_0156987834 != null) _103_6_0156987834.unregister();
							if (_104_6_01761892360 != null) _104_6_01761892360.unregister();
						}

						public class _103_6_0156987834 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

							public _103_6_0156987834(B box) {
								super(box);
								_value("Login using...");
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

						public class _104_6_01761892360 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
							public LoginTemplate.Content._93_2_01581375786._94_3_02046497470.LocalLoginBlock._102_5_0145198685._104_6_01761892360. UserSelector userSelector;
							public LoginTemplate.Content._93_2_01581375786._94_3_02046497470.LocalLoginBlock._102_5_0145198685._104_6_01761892360. _106_7_01843998075 _106_7_01843998075;
							public LoginTemplate.Content._93_2_01581375786._94_3_02046497470.LocalLoginBlock._102_5_0145198685._104_6_01761892360. NotFoundUsernameMessage notFoundUsernameMessage;

							public _104_6_01761892360(B box) {
								super(box);
							}

							@Override
							public void init() {
								super.init();
								if (userSelector == null) userSelector = register(new UserSelector(box()).<UserSelector>id("a_1197109944").owner(AbstractLoginTemplate.this));
								if (_106_7_01843998075 == null) _106_7_01843998075 = register(new _106_7_01843998075(box()).<_106_7_01843998075>id("a_1587448645").owner(AbstractLoginTemplate.this));
								if (notFoundUsernameMessage == null) notFoundUsernameMessage = register(new NotFoundUsernameMessage(box()).<NotFoundUsernameMessage>id("a1505187492").owner(AbstractLoginTemplate.this));
							}

							@Override
							public void unregister() {
								super.unregister();
								if (userSelector != null) userSelector.unregister();
								if (_106_7_01843998075 != null) _106_7_01843998075.unregister();
								if (notFoundUsernameMessage != null) notFoundUsernameMessage.unregister();
							}

							public class UserSelector extends io.intino.alexandria.ui.displays.components.SelectorListBox<io.intino.alexandria.ui.displays.notifiers.SelectorListBoxNotifier, B>  {

								public UserSelector(B box) {
									super(box);
									_multipleSelection(false);
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

							public class _106_7_01843998075 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
								public LoginTemplate.Content._93_2_01581375786._94_3_02046497470.LocalLoginBlock._102_5_0145198685._104_6_01761892360._106_7_01843998075. UsernameField usernameField;

								public _106_7_01843998075(B box) {
									super(box);
								}

								@Override
								public void init() {
									super.init();
									if (usernameField == null) usernameField = register(new UsernameField(box()).<UsernameField>id("a_1909018807").owner(AbstractLoginTemplate.this));
								}

								@Override
								public void unregister() {
									super.unregister();
									if (usernameField != null) usernameField.unregister();
								}

								public class UsernameField extends io.intino.alexandria.ui.displays.components.TextEditable<io.intino.alexandria.ui.displays.notifiers.TextEditableNotifier, B>  {

									public UsernameField(B box) {
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

							public class NotFoundUsernameMessage extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

								public NotFoundUsernameMessage(B box) {
									super(box);
									_value("User not found");
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

					public class _109_5_11370932491 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
						public LoginTemplate.Content._93_2_01581375786._94_3_02046497470.LocalLoginBlock._109_5_11370932491. Login login;

						public _109_5_11370932491(B box) {
							super(box);
						}

						@Override
						public void init() {
							super.init();
							if (login == null) login = register(new Login(box()).<Login>id("a1446087791").owner(AbstractLoginTemplate.this));
						}

						@Override
						public void unregister() {
							super.unregister();
							if (login != null) login.unregister();
						}

						public class Login extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B>  {

							public Login(B box) {
								super(box);
								_title("Enter");
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
					}
				}
			}
		}
	}
}