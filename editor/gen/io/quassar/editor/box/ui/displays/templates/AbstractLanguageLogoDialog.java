package io.quassar.editor.box.ui.displays.templates;

import io.intino.alexandria.core.Box;
import io.intino.alexandria.exceptions.*;
import io.intino.alexandria.ui.displays.components.*;
import io.quassar.editor.box.ui.*;

import io.quassar.editor.box.EditorBox;

import io.quassar.editor.box.ui.displays.templates.*;






import io.quassar.editor.box.ui.displays.items.*;

import io.intino.alexandria.ui.displays.notifiers.TemplateNotifier;

public abstract class AbstractLanguageLogoDialog<B extends Box> extends io.intino.alexandria.ui.displays.components.Template<TemplateNotifier, java.lang.Void, B> {
	public Logo logo;
	public OpenDialogTrigger openDialogTrigger;
	public Dialog dialog;
	public LanguageLogoDialog.Dialog. _220_8_02036781850 _220_8_02036781850;
	public LanguageLogoDialog.Dialog._220_8_02036781850. _221_9_1742219648 _221_9_1742219648;
	public LanguageLogoDialog.Dialog._220_8_02036781850._221_9_1742219648. LogoPreview logoPreview;
	public LanguageLogoDialog.Dialog._220_8_02036781850._221_9_1742219648. LanguageId languageId;
	public LanguageLogoDialog.Dialog._220_8_02036781850. _224_9_1273672839 _224_9_1273672839;
	public LanguageLogoDialog.Dialog._220_8_02036781850._224_9_1273672839. _225_10_12025781299 _225_10_12025781299;
	public LanguageLogoDialog.Dialog._220_8_02036781850._224_9_1273672839._225_10_12025781299. _226_5_1741997999 _226_5_1741997999;
	public LanguageLogoDialog.Dialog._220_8_02036781850._224_9_1273672839._225_10_12025781299._226_5_1741997999. LogoField logoField;
	public LanguageLogoDialog.Dialog._220_8_02036781850._224_9_1273672839._225_10_12025781299. _228_5_01343005241 _228_5_01343005241;
	public LanguageLogoDialog.Dialog._220_8_02036781850._224_9_1273672839._225_10_12025781299. _229_5_01532646205 _229_5_01532646205;
	public LanguageLogoDialog.Dialog._220_8_02036781850._224_9_1273672839._225_10_12025781299. _230_5_11621283592 _230_5_11621283592;
	public LanguageLogoDialog.Dialog._220_8_02036781850._224_9_1273672839._225_10_12025781299. _231_5_0573630564 _231_5_0573630564;
	public LanguageLogoDialog.Dialog._220_8_02036781850._224_9_1273672839._225_10_12025781299. _232_5_11237875430 _232_5_11237875430;
	public LanguageLogoDialog.Dialog._220_8_02036781850._224_9_1273672839. _233_10_12039995799 _233_10_12039995799;
	public LanguageLogoDialog.Dialog._220_8_02036781850._224_9_1273672839._233_10_12039995799. _234_11_0607217376 _234_11_0607217376;
	public LanguageLogoDialog.Dialog._220_8_02036781850._224_9_1273672839._233_10_12039995799._234_11_0607217376. GenerateLogo generateLogo;
	public LanguageLogoDialog.Dialog._220_8_02036781850._224_9_1273672839._233_10_12039995799. _236_5_1587148941 _236_5_1587148941;
	public LanguageLogoDialog.Dialog. _237_2_1955995399 _237_2_1955995399;
	public LanguageLogoDialog.Dialog. _238_8_0799904427 _238_8_0799904427;
	public LanguageLogoDialog.Dialog._238_8_0799904427. CancelLogo cancelLogo;
	public LanguageLogoDialog.Dialog._238_8_0799904427. ChangeLogo changeLogo;

	public AbstractLanguageLogoDialog(B box) {
		super(box);
		id("languageLogoDialog");
	}

	@Override
	public void init() {
		super.init();
		if (logo == null) logo = register(new Logo(box()).<Logo>id("a_1595288096").owner(AbstractLanguageLogoDialog.this));
		if (openDialogTrigger == null) openDialogTrigger = register(new OpenDialogTrigger(box()).<OpenDialogTrigger>id("a_2145210607").owner(AbstractLanguageLogoDialog.this));
		if (dialog == null) dialog = register(new Dialog(box()).<Dialog>id("a_3288003").owner(AbstractLanguageLogoDialog.this));
		if (dialog != null) _220_8_02036781850 = dialog._220_8_02036781850;
		if (_220_8_02036781850 != null) _221_9_1742219648 = dialog._220_8_02036781850._221_9_1742219648;
		if (_221_9_1742219648 != null) logoPreview = dialog._220_8_02036781850._221_9_1742219648.logoPreview;
		if (_221_9_1742219648 != null) languageId = dialog._220_8_02036781850._221_9_1742219648.languageId;
		if (_220_8_02036781850 != null) _224_9_1273672839 = dialog._220_8_02036781850._224_9_1273672839;
		if (_224_9_1273672839 != null) _225_10_12025781299 = dialog._220_8_02036781850._224_9_1273672839._225_10_12025781299;
		if (_225_10_12025781299 != null) _226_5_1741997999 = dialog._220_8_02036781850._224_9_1273672839._225_10_12025781299._226_5_1741997999;
		if (_226_5_1741997999 != null) logoField = dialog._220_8_02036781850._224_9_1273672839._225_10_12025781299._226_5_1741997999.logoField;
		if (_225_10_12025781299 != null) _228_5_01343005241 = dialog._220_8_02036781850._224_9_1273672839._225_10_12025781299._228_5_01343005241;
		if (_225_10_12025781299 != null) _229_5_01532646205 = dialog._220_8_02036781850._224_9_1273672839._225_10_12025781299._229_5_01532646205;
		if (_225_10_12025781299 != null) _230_5_11621283592 = dialog._220_8_02036781850._224_9_1273672839._225_10_12025781299._230_5_11621283592;
		if (_225_10_12025781299 != null) _231_5_0573630564 = dialog._220_8_02036781850._224_9_1273672839._225_10_12025781299._231_5_0573630564;
		if (_225_10_12025781299 != null) _232_5_11237875430 = dialog._220_8_02036781850._224_9_1273672839._225_10_12025781299._232_5_11237875430;
		if (_224_9_1273672839 != null) _233_10_12039995799 = dialog._220_8_02036781850._224_9_1273672839._233_10_12039995799;
		if (_233_10_12039995799 != null) _234_11_0607217376 = dialog._220_8_02036781850._224_9_1273672839._233_10_12039995799._234_11_0607217376;
		if (_234_11_0607217376 != null) generateLogo = dialog._220_8_02036781850._224_9_1273672839._233_10_12039995799._234_11_0607217376.generateLogo;
		if (_233_10_12039995799 != null) _236_5_1587148941 = dialog._220_8_02036781850._224_9_1273672839._233_10_12039995799._236_5_1587148941;
		if (dialog != null) _237_2_1955995399 = dialog._237_2_1955995399;
		if (dialog != null) _238_8_0799904427 = dialog._238_8_0799904427;
		if (_238_8_0799904427 != null) cancelLogo = dialog._238_8_0799904427.cancelLogo;
		if (_238_8_0799904427 != null) changeLogo = dialog._238_8_0799904427.changeLogo;
		if (openDialogTrigger != null) openDialogTrigger.bindTo(dialog);
	}

	@Override
	public void remove() {
		super.remove();
		if (logo != null) logo.unregister();
		if (openDialogTrigger != null) openDialogTrigger.unregister();
		if (dialog != null) dialog.unregister();
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

	public class OpenDialogTrigger extends io.intino.alexandria.ui.displays.components.OpenDialog<io.intino.alexandria.ui.displays.notifiers.OpenDialogNotifier, B>  {

		public OpenDialogTrigger(B box) {
			super(box);
			_title("change");
			_readonly(true);
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

	public class Dialog extends io.intino.alexandria.ui.displays.components.Dialog<io.intino.alexandria.ui.displays.notifiers.DialogNotifier, B>  {
		public LanguageLogoDialog.Dialog. _220_8_02036781850 _220_8_02036781850;
		public LanguageLogoDialog.Dialog. _237_2_1955995399 _237_2_1955995399;
		public LanguageLogoDialog.Dialog. _238_8_0799904427 _238_8_0799904427;

		public Dialog(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (_220_8_02036781850 == null) _220_8_02036781850 = register(new _220_8_02036781850(box()).<_220_8_02036781850>id("a_239413983").owner(AbstractLanguageLogoDialog.this));
			if (_237_2_1955995399 == null) _237_2_1955995399 = register(new _237_2_1955995399(box()).<_237_2_1955995399>id("a_513504583").owner(AbstractLanguageLogoDialog.this));
			if (_238_8_0799904427 == null) _238_8_0799904427 = register(new _238_8_0799904427(box()).<_238_8_0799904427>id("a1194868975").owner(AbstractLanguageLogoDialog.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (_220_8_02036781850 != null) _220_8_02036781850.unregister();
			if (_237_2_1955995399 != null) _237_2_1955995399.unregister();
			if (_238_8_0799904427 != null) _238_8_0799904427.unregister();
		}

		public class _220_8_02036781850 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public LanguageLogoDialog.Dialog._220_8_02036781850. _221_9_1742219648 _221_9_1742219648;
			public LanguageLogoDialog.Dialog._220_8_02036781850. _224_9_1273672839 _224_9_1273672839;

			public _220_8_02036781850(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (_221_9_1742219648 == null) _221_9_1742219648 = register(new _221_9_1742219648(box()).<_221_9_1742219648>id("a843814184").owner(AbstractLanguageLogoDialog.this));
				if (_224_9_1273672839 == null) _224_9_1273672839 = register(new _224_9_1273672839(box()).<_224_9_1273672839>id("a1715294507").owner(AbstractLanguageLogoDialog.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (_221_9_1742219648 != null) _221_9_1742219648.unregister();
				if (_224_9_1273672839 != null) _224_9_1273672839.unregister();
			}

			public class _221_9_1742219648 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
				public LanguageLogoDialog.Dialog._220_8_02036781850._221_9_1742219648. LogoPreview logoPreview;
				public LanguageLogoDialog.Dialog._220_8_02036781850._221_9_1742219648. LanguageId languageId;

				public _221_9_1742219648(B box) {
					super(box);
				}

				@Override
				public void init() {
					super.init();
					if (logoPreview == null) logoPreview = register(new LogoPreview(box()).<LogoPreview>id("a_277712048").owner(AbstractLanguageLogoDialog.this));
					if (languageId == null) languageId = register(new LanguageId(box()).<LanguageId>id("a1373896832").owner(AbstractLanguageLogoDialog.this));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (logoPreview != null) logoPreview.unregister();
					if (languageId != null) languageId.unregister();
				}

				public class LogoPreview extends io.intino.alexandria.ui.displays.components.Image<io.intino.alexandria.ui.displays.notifiers.ImageNotifier, B>  {

					public LogoPreview(B box) {
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

				public class LanguageId extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

					public LanguageId(B box) {
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

			public class _224_9_1273672839 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
				public LanguageLogoDialog.Dialog._220_8_02036781850._224_9_1273672839. _225_10_12025781299 _225_10_12025781299;
				public LanguageLogoDialog.Dialog._220_8_02036781850._224_9_1273672839. _233_10_12039995799 _233_10_12039995799;

				public _224_9_1273672839(B box) {
					super(box);
				}

				@Override
				public void init() {
					super.init();
					if (_225_10_12025781299 == null) _225_10_12025781299 = register(new _225_10_12025781299(box()).<_225_10_12025781299>id("a1411580691").owner(AbstractLanguageLogoDialog.this));
					if (_233_10_12039995799 == null) _233_10_12039995799 = register(new _233_10_12039995799(box()).<_233_10_12039995799>id("a547155001").owner(AbstractLanguageLogoDialog.this));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (_225_10_12025781299 != null) _225_10_12025781299.unregister();
					if (_233_10_12039995799 != null) _233_10_12039995799.unregister();
				}

				public class _225_10_12025781299 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
					public LanguageLogoDialog.Dialog._220_8_02036781850._224_9_1273672839._225_10_12025781299. _226_5_1741997999 _226_5_1741997999;
					public LanguageLogoDialog.Dialog._220_8_02036781850._224_9_1273672839._225_10_12025781299. _228_5_01343005241 _228_5_01343005241;
					public LanguageLogoDialog.Dialog._220_8_02036781850._224_9_1273672839._225_10_12025781299. _229_5_01532646205 _229_5_01532646205;
					public LanguageLogoDialog.Dialog._220_8_02036781850._224_9_1273672839._225_10_12025781299. _230_5_11621283592 _230_5_11621283592;
					public LanguageLogoDialog.Dialog._220_8_02036781850._224_9_1273672839._225_10_12025781299. _231_5_0573630564 _231_5_0573630564;
					public LanguageLogoDialog.Dialog._220_8_02036781850._224_9_1273672839._225_10_12025781299. _232_5_11237875430 _232_5_11237875430;

					public _225_10_12025781299(B box) {
						super(box);
					}

					@Override
					public void init() {
						super.init();
						if (_226_5_1741997999 == null) _226_5_1741997999 = register(new _226_5_1741997999(box()).<_226_5_1741997999>id("a_1942023846").owner(AbstractLanguageLogoDialog.this));
						if (_228_5_01343005241 == null) _228_5_01343005241 = register(new _228_5_01343005241(box()).<_228_5_01343005241>id("a_1225385288").owner(AbstractLanguageLogoDialog.this));
						if (_229_5_01532646205 == null) _229_5_01532646205 = register(new _229_5_01532646205(box()).<_229_5_01532646205>id("a_1492590464").owner(AbstractLanguageLogoDialog.this));
						if (_230_5_11621283592 == null) _230_5_11621283592 = register(new _230_5_11621283592(box()).<_230_5_11621283592>id("a_441883014").owner(AbstractLanguageLogoDialog.this));
						if (_231_5_0573630564 == null) _231_5_0573630564 = register(new _231_5_0573630564(box()).<_231_5_0573630564>id("a_68361060").owner(AbstractLanguageLogoDialog.this));
						if (_232_5_11237875430 == null) _232_5_11237875430 = register(new _232_5_11237875430(box()).<_232_5_11237875430>id("a_138088489").owner(AbstractLanguageLogoDialog.this));
					}

					@Override
					public void unregister() {
						super.unregister();
						if (_226_5_1741997999 != null) _226_5_1741997999.unregister();
						if (_228_5_01343005241 != null) _228_5_01343005241.unregister();
						if (_229_5_01532646205 != null) _229_5_01532646205.unregister();
						if (_230_5_11621283592 != null) _230_5_11621283592.unregister();
						if (_231_5_0573630564 != null) _231_5_0573630564.unregister();
						if (_232_5_11237875430 != null) _232_5_11237875430.unregister();
					}

					public class _226_5_1741997999 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
						public LanguageLogoDialog.Dialog._220_8_02036781850._224_9_1273672839._225_10_12025781299._226_5_1741997999. LogoField logoField;

						public _226_5_1741997999(B box) {
							super(box);
						}

						@Override
						public void init() {
							super.init();
							if (logoField == null) logoField = register(new LogoField(box()).<LogoField>id("a1138935811").owner(AbstractLanguageLogoDialog.this));
						}

						@Override
						public void unregister() {
							super.unregister();
							if (logoField != null) logoField.unregister();
						}

						public class LogoField extends io.intino.alexandria.ui.displays.components.ImageEditable<io.intino.alexandria.ui.displays.notifiers.ImageEditableNotifier, B>  {

							public LogoField(B box) {
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

					public class _228_5_01343005241 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

						public _228_5_01343005241(B box) {
							super(box);
							_value("Upload an image in PNG format");
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

					public class _229_5_01532646205 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

						public _229_5_01532646205(B box) {
							super(box);
							_value("Transparent background");
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

					public class _230_5_11621283592 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

						public _230_5_11621283592(B box) {
							super(box);
							_value("Black foreground elements only");
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

					public class _231_5_0573630564 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

						public _231_5_0573630564(B box) {
							super(box);
							_value("Recommended size: 100x100 pixels");
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

					public class _232_5_11237875430 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

						public _232_5_11237875430(B box) {
							super(box);
							_value("Square and centered for best display");
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

				public class _233_10_12039995799 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
					public LanguageLogoDialog.Dialog._220_8_02036781850._224_9_1273672839._233_10_12039995799. _234_11_0607217376 _234_11_0607217376;
					public LanguageLogoDialog.Dialog._220_8_02036781850._224_9_1273672839._233_10_12039995799. _236_5_1587148941 _236_5_1587148941;

					public _233_10_12039995799(B box) {
						super(box);
					}

					@Override
					public void init() {
						super.init();
						if (_234_11_0607217376 == null) _234_11_0607217376 = register(new _234_11_0607217376(box()).<_234_11_0607217376>id("a_758220971").owner(AbstractLanguageLogoDialog.this));
						if (_236_5_1587148941 == null) _236_5_1587148941 = register(new _236_5_1587148941(box()).<_236_5_1587148941>id("a_910880291").owner(AbstractLanguageLogoDialog.this));
					}

					@Override
					public void unregister() {
						super.unregister();
						if (_234_11_0607217376 != null) _234_11_0607217376.unregister();
						if (_236_5_1587148941 != null) _236_5_1587148941.unregister();
					}

					public class _234_11_0607217376 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
						public LanguageLogoDialog.Dialog._220_8_02036781850._224_9_1273672839._233_10_12039995799._234_11_0607217376. GenerateLogo generateLogo;

						public _234_11_0607217376(B box) {
							super(box);
						}

						@Override
						public void init() {
							super.init();
							if (generateLogo == null) generateLogo = register(new GenerateLogo(box()).<GenerateLogo>id("a143403290").owner(AbstractLanguageLogoDialog.this));
						}

						@Override
						public void unregister() {
							super.unregister();
							if (generateLogo != null) generateLogo.unregister();
						}

						public class GenerateLogo extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B>  {

							public GenerateLogo(B box) {
								super(box);
								_title("generate");
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

					public class _236_5_1587148941 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

						public _236_5_1587148941(B box) {
							super(box);
							_value("Automatically create an icon matching the DSL name and domain style");
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

		public class _237_2_1955995399 extends io.intino.alexandria.ui.displays.components.Divider<io.intino.alexandria.ui.displays.notifiers.DividerNotifier, B>  {

			public _237_2_1955995399(B box) {
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

		public class _238_8_0799904427 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public LanguageLogoDialog.Dialog._238_8_0799904427. CancelLogo cancelLogo;
			public LanguageLogoDialog.Dialog._238_8_0799904427. ChangeLogo changeLogo;

			public _238_8_0799904427(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (cancelLogo == null) cancelLogo = register(new CancelLogo(box()).<CancelLogo>id("a1278328173").owner(AbstractLanguageLogoDialog.this));
				if (changeLogo == null) changeLogo = register(new ChangeLogo(box()).<ChangeLogo>id("a1552750499").owner(AbstractLanguageLogoDialog.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (cancelLogo != null) cancelLogo.unregister();
				if (changeLogo != null) changeLogo.unregister();
			}

			public class CancelLogo extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B>  {

				public CancelLogo(B box) {
					super(box);
					_title("Cancel");
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

			public class ChangeLogo extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B>  {

				public ChangeLogo(B box) {
					super(box);
					_title("Change");
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