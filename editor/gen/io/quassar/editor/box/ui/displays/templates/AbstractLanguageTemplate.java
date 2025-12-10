package io.quassar.editor.box.ui.displays.templates;

import io.intino.alexandria.core.Box;
import io.intino.alexandria.exceptions.*;
import io.intino.alexandria.ui.displays.components.*;
import io.quassar.editor.box.ui.*;

import io.quassar.editor.box.EditorBox;

import io.quassar.editor.box.ui.displays.templates.*;






import io.quassar.editor.box.ui.displays.items.*;

import io.intino.alexandria.ui.displays.notifiers.TemplateNotifier;

public abstract class AbstractLanguageTemplate<B extends Box> extends io.intino.alexandria.ui.displays.components.Template<TemplateNotifier, java.lang.Void, B> {
	public LicenseExpiredBanner licenseExpiredBanner;
	public LanguageHeaderTemplate headerStamp;
	public BodyBlock bodyBlock;
	public LanguageTemplate.BodyBlock. NotFoundBlock notFoundBlock;
	public LanguageTemplate.BodyBlock.NotFoundBlock. _94_3_1107172803 _94_3_1107172803;
	public LanguageTemplate.BodyBlock.NotFoundBlock._94_3_1107172803. _95_4_01578775145 _95_4_01578775145;
	public LanguageTemplate.BodyBlock.NotFoundBlock._94_3_1107172803._95_4_01578775145. _96_5_01262367153 _96_5_01262367153;
	public LanguageTemplate.BodyBlock.NotFoundBlock._94_3_1107172803._95_4_01578775145. _97_5_01664726864 _97_5_01664726864;
	public LanguageTemplate.BodyBlock.NotFoundBlock._94_3_1107172803._95_4_01578775145. _98_5_11544629458 _98_5_11544629458;
	public LanguageTemplate.BodyBlock.NotFoundBlock._94_3_1107172803._95_4_01578775145._98_5_11544629458. _98_32_0285899485 _98_32_0285899485;
	public LanguageTemplate.BodyBlock. HelpBlock helpBlock;
	public LanguageTemplate.BodyBlock.HelpBlock. _101_3_01397642534 _101_3_01397642534;
	public LanguageTemplate.BodyBlock.HelpBlock._101_3_01397642534. _102_4_01111504235 _102_4_01111504235;
	public LanguageTemplate.BodyBlock.HelpBlock._101_3_01397642534._102_4_01111504235. _103_5_02080303221 _103_5_02080303221;
	public LanguageTemplate.BodyBlock.HelpBlock._101_3_01397642534._102_4_01111504235._103_5_02080303221. _104_6_11285890044 _104_6_11285890044;
	public LanguageTemplate.BodyBlock.HelpBlock._101_3_01397642534._102_4_01111504235._103_5_02080303221._104_6_11285890044. HelpTitle helpTitle;
	public LanguageTemplate.BodyBlock.HelpBlock._101_3_01397642534._102_4_01111504235._103_5_02080303221. _106_6_0185610667 _106_6_0185610667;
	public LanguageTemplate.BodyBlock.HelpBlock._101_3_01397642534._102_4_01111504235._103_5_02080303221._106_6_0185610667. HelpLogo helpLogo;
	public LanguageTemplate.BodyBlock.HelpBlock._101_3_01397642534._102_4_01111504235. HelpStamp helpStamp;
	public LanguageTemplate.BodyBlock. MainBlock mainBlock;
	public LanguageTemplate.BodyBlock.MainBlock. NotLoggedBlock notLoggedBlock;
	public LanguageTemplate.BodyBlock.MainBlock.NotLoggedBlock. _113_4_11484268815 _113_4_11484268815;
	public LanguageTemplate.BodyBlock.MainBlock. MainContentBlock mainContentBlock;
	public LanguageTemplate.BodyBlock.MainBlock.MainContentBlock. MainResizableBlock mainResizableBlock;
	public LanguageTemplate.BodyBlock.MainBlock.MainContentBlock.MainResizableBlock. ModelsBlock modelsBlock;
	public LanguageTemplate.BodyBlock.MainBlock.MainContentBlock.MainResizableBlock.ModelsBlock. _119_6_01999854639 _119_6_01999854639;
	public ModelsDialog modelsDialog;
	public ModelsTemplate modelsStamp;
	public LanguageTemplate.BodyBlock.MainBlock.MainContentBlock.MainResizableBlock. HomeBlock homeBlock;
	public LanguageTemplate.BodyBlock.MainBlock.MainContentBlock.MainResizableBlock.HomeBlock. ViewsBlock viewsBlock;
	public LanguageExplorer languageExplorer;
	public LanguageTemplate.BodyBlock.MainBlock.MainContentBlock. CollapsedRightPanel collapsedRightPanel;
	public LanguageTemplate.BodyBlock.MainBlock.MainContentBlock.CollapsedRightPanel. _127_5_0836395274 _127_5_0836395274;
	public LanguageTemplate.BodyBlock.MainBlock.MainContentBlock.CollapsedRightPanel. _128_5_1219056606 _128_5_1219056606;
	public LanguageTemplate.BodyBlock.MainBlock.MainContentBlock.CollapsedRightPanel._128_5_1219056606. _129_6_1134146038 _129_6_1134146038;
	public LanguageTemplate.BodyBlock.MainBlock.MainContentBlock.CollapsedRightPanel._128_5_1219056606._129_6_1134146038. ExpandRightPanel expandRightPanel;
	public LanguageTemplate.BodyBlock.MainBlock.MainContentBlock.CollapsedRightPanel. _131_5_1744038778 _131_5_1744038778;
	public LanguageTemplate.BodyBlock.MainBlock.MainContentBlock.CollapsedRightPanel._131_5_1744038778. _132_6_01909031857 _132_6_01909031857;
	public LanguageTemplate.BodyBlock.MainBlock.MainContentBlock.CollapsedRightPanel._131_5_1744038778._132_6_01909031857. ExpandRightPanelFull expandRightPanelFull;

	public AbstractLanguageTemplate(B box) {
		super(box);
		id("languageTemplate");
	}

	@Override
	public void init() {
		super.init();
		if (licenseExpiredBanner == null) licenseExpiredBanner = register(new LicenseExpiredBanner((EditorBox)box()).id("a499079454"));
		if (headerStamp == null) headerStamp = register(new LanguageHeaderTemplate((EditorBox)box()).id("a_344179640"));
		if (bodyBlock == null) bodyBlock = register(new BodyBlock(box()).<BodyBlock>id("a1599842205").owner(AbstractLanguageTemplate.this));
		if (bodyBlock != null) notFoundBlock = bodyBlock.notFoundBlock;
		if (notFoundBlock != null) _94_3_1107172803 = bodyBlock.notFoundBlock._94_3_1107172803;
		if (_94_3_1107172803 != null) _95_4_01578775145 = bodyBlock.notFoundBlock._94_3_1107172803._95_4_01578775145;
		if (_95_4_01578775145 != null) _96_5_01262367153 = bodyBlock.notFoundBlock._94_3_1107172803._95_4_01578775145._96_5_01262367153;
		if (_95_4_01578775145 != null) _97_5_01664726864 = bodyBlock.notFoundBlock._94_3_1107172803._95_4_01578775145._97_5_01664726864;
		if (_95_4_01578775145 != null) _98_5_11544629458 = bodyBlock.notFoundBlock._94_3_1107172803._95_4_01578775145._98_5_11544629458;
		if (_98_5_11544629458 != null) _98_32_0285899485 = bodyBlock.notFoundBlock._94_3_1107172803._95_4_01578775145._98_5_11544629458._98_32_0285899485;
		if (bodyBlock != null) helpBlock = bodyBlock.helpBlock;
		if (helpBlock != null) _101_3_01397642534 = bodyBlock.helpBlock._101_3_01397642534;
		if (_101_3_01397642534 != null) _102_4_01111504235 = bodyBlock.helpBlock._101_3_01397642534._102_4_01111504235;
		if (_102_4_01111504235 != null) _103_5_02080303221 = bodyBlock.helpBlock._101_3_01397642534._102_4_01111504235._103_5_02080303221;
		if (_103_5_02080303221 != null) _104_6_11285890044 = bodyBlock.helpBlock._101_3_01397642534._102_4_01111504235._103_5_02080303221._104_6_11285890044;
		if (_104_6_11285890044 != null) helpTitle = bodyBlock.helpBlock._101_3_01397642534._102_4_01111504235._103_5_02080303221._104_6_11285890044.helpTitle;
		if (_103_5_02080303221 != null) _106_6_0185610667 = bodyBlock.helpBlock._101_3_01397642534._102_4_01111504235._103_5_02080303221._106_6_0185610667;
		if (_106_6_0185610667 != null) helpLogo = bodyBlock.helpBlock._101_3_01397642534._102_4_01111504235._103_5_02080303221._106_6_0185610667.helpLogo;
		if (_102_4_01111504235 != null) helpStamp = bodyBlock.helpBlock._101_3_01397642534._102_4_01111504235.helpStamp;
		if (bodyBlock != null) mainBlock = bodyBlock.mainBlock;
		if (mainBlock != null) notLoggedBlock = bodyBlock.mainBlock.notLoggedBlock;
		if (notLoggedBlock != null) _113_4_11484268815 = bodyBlock.mainBlock.notLoggedBlock._113_4_11484268815;
		if (mainBlock != null) mainContentBlock = bodyBlock.mainBlock.mainContentBlock;
		if (mainContentBlock != null) mainResizableBlock = bodyBlock.mainBlock.mainContentBlock.mainResizableBlock;
		if (mainResizableBlock != null) modelsBlock = bodyBlock.mainBlock.mainContentBlock.mainResizableBlock.modelsBlock;
		if (modelsBlock != null) _119_6_01999854639 = bodyBlock.mainBlock.mainContentBlock.mainResizableBlock.modelsBlock._119_6_01999854639;
		if (_119_6_01999854639 != null) modelsDialog = bodyBlock.mainBlock.mainContentBlock.mainResizableBlock.modelsBlock._119_6_01999854639.modelsDialog;
		if (modelsBlock != null) modelsStamp = bodyBlock.mainBlock.mainContentBlock.mainResizableBlock.modelsBlock.modelsStamp;
		if (mainResizableBlock != null) homeBlock = bodyBlock.mainBlock.mainContentBlock.mainResizableBlock.homeBlock;
		if (homeBlock != null) viewsBlock = bodyBlock.mainBlock.mainContentBlock.mainResizableBlock.homeBlock.viewsBlock;
		if (viewsBlock != null) languageExplorer = bodyBlock.mainBlock.mainContentBlock.mainResizableBlock.homeBlock.viewsBlock.languageExplorer;
		if (mainContentBlock != null) collapsedRightPanel = bodyBlock.mainBlock.mainContentBlock.collapsedRightPanel;
		if (collapsedRightPanel != null) _127_5_0836395274 = bodyBlock.mainBlock.mainContentBlock.collapsedRightPanel._127_5_0836395274;
		if (collapsedRightPanel != null) _128_5_1219056606 = bodyBlock.mainBlock.mainContentBlock.collapsedRightPanel._128_5_1219056606;
		if (_128_5_1219056606 != null) _129_6_1134146038 = bodyBlock.mainBlock.mainContentBlock.collapsedRightPanel._128_5_1219056606._129_6_1134146038;
		if (_129_6_1134146038 != null) expandRightPanel = bodyBlock.mainBlock.mainContentBlock.collapsedRightPanel._128_5_1219056606._129_6_1134146038.expandRightPanel;
		if (collapsedRightPanel != null) _131_5_1744038778 = bodyBlock.mainBlock.mainContentBlock.collapsedRightPanel._131_5_1744038778;
		if (_131_5_1744038778 != null) _132_6_01909031857 = bodyBlock.mainBlock.mainContentBlock.collapsedRightPanel._131_5_1744038778._132_6_01909031857;
		if (_132_6_01909031857 != null) expandRightPanelFull = bodyBlock.mainBlock.mainContentBlock.collapsedRightPanel._131_5_1744038778._132_6_01909031857.expandRightPanelFull;
	}

	@Override
	public void remove() {
		super.remove();
		if (licenseExpiredBanner != null) licenseExpiredBanner.unregister();
		if (headerStamp != null) headerStamp.unregister();
		if (bodyBlock != null) bodyBlock.unregister();
	}

	public class BodyBlock extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
		public LanguageTemplate.BodyBlock. NotFoundBlock notFoundBlock;
		public LanguageTemplate.BodyBlock. HelpBlock helpBlock;
		public LanguageTemplate.BodyBlock. MainBlock mainBlock;

		public BodyBlock(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (notFoundBlock == null) notFoundBlock = register(new NotFoundBlock(box()).<NotFoundBlock>id("a911170620").owner(AbstractLanguageTemplate.this));
			if (helpBlock == null) helpBlock = register(new HelpBlock(box()).<HelpBlock>id("a_1653479510").owner(AbstractLanguageTemplate.this));
			if (mainBlock == null) mainBlock = register(new MainBlock(box()).<MainBlock>id("a1093073970").owner(AbstractLanguageTemplate.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (notFoundBlock != null) notFoundBlock.unregister();
			if (helpBlock != null) helpBlock.unregister();
			if (mainBlock != null) mainBlock.unregister();
		}

		public class NotFoundBlock extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public LanguageTemplate.BodyBlock.NotFoundBlock. _94_3_1107172803 _94_3_1107172803;

			public NotFoundBlock(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (_94_3_1107172803 == null) _94_3_1107172803 = register(new _94_3_1107172803(box()).<_94_3_1107172803>id("a_175355286").owner(AbstractLanguageTemplate.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (_94_3_1107172803 != null) _94_3_1107172803.unregister();
			}

			public class _94_3_1107172803 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
				public LanguageTemplate.BodyBlock.NotFoundBlock._94_3_1107172803. _95_4_01578775145 _95_4_01578775145;

				public _94_3_1107172803(B box) {
					super(box);
				}

				@Override
				public void init() {
					super.init();
					if (_95_4_01578775145 == null) _95_4_01578775145 = register(new _95_4_01578775145(box()).<_95_4_01578775145>id("a_1773276937").owner(AbstractLanguageTemplate.this));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (_95_4_01578775145 != null) _95_4_01578775145.unregister();
				}

				public class _95_4_01578775145 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
					public LanguageTemplate.BodyBlock.NotFoundBlock._94_3_1107172803._95_4_01578775145. _96_5_01262367153 _96_5_01262367153;
					public LanguageTemplate.BodyBlock.NotFoundBlock._94_3_1107172803._95_4_01578775145. _97_5_01664726864 _97_5_01664726864;
					public LanguageTemplate.BodyBlock.NotFoundBlock._94_3_1107172803._95_4_01578775145. _98_5_11544629458 _98_5_11544629458;

					public _95_4_01578775145(B box) {
						super(box);
					}

					@Override
					public void init() {
						super.init();
						if (_96_5_01262367153 == null) _96_5_01262367153 = register(new _96_5_01262367153(box()).<_96_5_01262367153>id("a1341868657").owner(AbstractLanguageTemplate.this));
						if (_97_5_01664726864 == null) _97_5_01664726864 = register(new _97_5_01664726864(box()).<_97_5_01664726864>id("a1800376760").owner(AbstractLanguageTemplate.this));
						if (_98_5_11544629458 == null) _98_5_11544629458 = register(new _98_5_11544629458(box()).<_98_5_11544629458>id("a_195732646").owner(AbstractLanguageTemplate.this));
					}

					@Override
					public void unregister() {
						super.unregister();
						if (_96_5_01262367153 != null) _96_5_01262367153.unregister();
						if (_97_5_01664726864 != null) _97_5_01664726864.unregister();
						if (_98_5_11544629458 != null) _98_5_11544629458.unregister();
					}

					public class _96_5_01262367153 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

						public _96_5_01262367153(B box) {
							super(box);
							_value("Not found");
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

					public class _97_5_01664726864 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

						public _97_5_01664726864(B box) {
							super(box);
							_value("Sorry, we can't find the DSL you are visiting");
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

					public class _98_5_11544629458 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
						public LanguageTemplate.BodyBlock.NotFoundBlock._94_3_1107172803._95_4_01578775145._98_5_11544629458. _98_32_0285899485 _98_32_0285899485;

						public _98_5_11544629458(B box) {
							super(box);
						}

						@Override
						public void init() {
							super.init();
							if (_98_32_0285899485 == null) _98_32_0285899485 = register(new _98_32_0285899485(box()).<_98_32_0285899485>id("a_1732041647").owner(AbstractLanguageTemplate.this));
						}

						@Override
						public void unregister() {
							super.unregister();
							if (_98_32_0285899485 != null) _98_32_0285899485.unregister();
						}

						public class _98_32_0285899485 extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B> implements io.intino.alexandria.ui.displays.components.addressable.Addressed<_98_32_0285899485> {

							public _98_32_0285899485(B box) {
								super(box);
								_title("home");
								_mode(io.intino.alexandria.ui.displays.components.Actionable.Mode.valueOf("Button"));
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
							public _98_32_0285899485 address(java.util.function.Function<String, String> addressFromPathResolver) {
								address(addressFromPathResolver.apply(path()));
								return this;
							}
						}
					}
				}
			}
		}

		public class HelpBlock extends io.intino.alexandria.ui.displays.components.BlockConditional<io.intino.alexandria.ui.displays.notifiers.BlockConditionalNotifier, B>  {
			public LanguageTemplate.BodyBlock.HelpBlock. _101_3_01397642534 _101_3_01397642534;

			public HelpBlock(B box) {
				super(box);
			}

			@Override
			public void initConditional() {
				super.init();
				if (_101_3_01397642534 == null) _101_3_01397642534 = register(new _101_3_01397642534(box()).<_101_3_01397642534>id("a883633967").owner(AbstractLanguageTemplate.this));
				if (AbstractLanguageTemplate.this.helpTitle == null) AbstractLanguageTemplate.this.helpTitle = bodyBlock.helpBlock._101_3_01397642534._102_4_01111504235._103_5_02080303221._104_6_11285890044.helpTitle;
				if (AbstractLanguageTemplate.this.helpLogo == null) AbstractLanguageTemplate.this.helpLogo = bodyBlock.helpBlock._101_3_01397642534._102_4_01111504235._103_5_02080303221._106_6_0185610667.helpLogo;
				if (AbstractLanguageTemplate.this.helpStamp == null) AbstractLanguageTemplate.this.helpStamp = bodyBlock.helpBlock._101_3_01397642534._102_4_01111504235.helpStamp;
			}

			@Override
			public void unregister() {
				super.unregister();
				if (_101_3_01397642534 != null) _101_3_01397642534.unregister();
			}

			public class _101_3_01397642534 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
				public LanguageTemplate.BodyBlock.HelpBlock._101_3_01397642534. _102_4_01111504235 _102_4_01111504235;

				public _101_3_01397642534(B box) {
					super(box);
				}

				@Override
				public void init() {
					super.init();
					if (_102_4_01111504235 == null) _102_4_01111504235 = register(new _102_4_01111504235(box()).<_102_4_01111504235>id("a_320593134").owner(AbstractLanguageTemplate.this));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (_102_4_01111504235 != null) _102_4_01111504235.unregister();
				}

				public class _102_4_01111504235 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
					public LanguageTemplate.BodyBlock.HelpBlock._101_3_01397642534._102_4_01111504235. _103_5_02080303221 _103_5_02080303221;
					public LanguageTemplate.BodyBlock.HelpBlock._101_3_01397642534._102_4_01111504235. HelpStamp helpStamp;

					public _102_4_01111504235(B box) {
						super(box);
					}

					@Override
					public void init() {
						super.init();
						if (_103_5_02080303221 == null) _103_5_02080303221 = register(new _103_5_02080303221(box()).<_103_5_02080303221>id("a_1572405240").owner(AbstractLanguageTemplate.this));
						if (helpStamp == null) helpStamp = register(new HelpStamp(box()).<HelpStamp>id("a_1337233881").owner(AbstractLanguageTemplate.this));
					}

					@Override
					public void unregister() {
						super.unregister();
						if (_103_5_02080303221 != null) _103_5_02080303221.unregister();
						if (helpStamp != null) helpStamp.unregister();
					}

					public class _103_5_02080303221 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
						public LanguageTemplate.BodyBlock.HelpBlock._101_3_01397642534._102_4_01111504235._103_5_02080303221. _104_6_11285890044 _104_6_11285890044;
						public LanguageTemplate.BodyBlock.HelpBlock._101_3_01397642534._102_4_01111504235._103_5_02080303221. _106_6_0185610667 _106_6_0185610667;

						public _103_5_02080303221(B box) {
							super(box);
						}

						@Override
						public void init() {
							super.init();
							if (_104_6_11285890044 == null) _104_6_11285890044 = register(new _104_6_11285890044(box()).<_104_6_11285890044>id("a863368183").owner(AbstractLanguageTemplate.this));
							if (_106_6_0185610667 == null) _106_6_0185610667 = register(new _106_6_0185610667(box()).<_106_6_0185610667>id("a_1421887113").owner(AbstractLanguageTemplate.this));
						}

						@Override
						public void unregister() {
							super.unregister();
							if (_104_6_11285890044 != null) _104_6_11285890044.unregister();
							if (_106_6_0185610667 != null) _106_6_0185610667.unregister();
						}

						public class _104_6_11285890044 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
							public LanguageTemplate.BodyBlock.HelpBlock._101_3_01397642534._102_4_01111504235._103_5_02080303221._104_6_11285890044. HelpTitle helpTitle;

							public _104_6_11285890044(B box) {
								super(box);
							}

							@Override
							public void init() {
								super.init();
								if (helpTitle == null) helpTitle = register(new HelpTitle(box()).<HelpTitle>id("a_1222361280").owner(AbstractLanguageTemplate.this));
							}

							@Override
							public void unregister() {
								super.unregister();
								if (helpTitle != null) helpTitle.unregister();
							}

							public class HelpTitle extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

								public HelpTitle(B box) {
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

						public class _106_6_0185610667 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
							public LanguageTemplate.BodyBlock.HelpBlock._101_3_01397642534._102_4_01111504235._103_5_02080303221._106_6_0185610667. HelpLogo helpLogo;

							public _106_6_0185610667(B box) {
								super(box);
							}

							@Override
							public void init() {
								super.init();
								if (helpLogo == null) helpLogo = register(new HelpLogo(box()).<HelpLogo>id("a1603974785").owner(AbstractLanguageTemplate.this));
							}

							@Override
							public void unregister() {
								super.unregister();
								if (helpLogo != null) helpLogo.unregister();
							}

							public class HelpLogo extends io.intino.alexandria.ui.displays.components.Image<io.intino.alexandria.ui.displays.notifiers.ImageNotifier, B>  {

								public HelpLogo(B box) {
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

					public class HelpStamp extends io.intino.alexandria.ui.displays.components.HtmlViewer<io.intino.alexandria.ui.displays.notifiers.HtmlViewerNotifier, B>  {

						public HelpStamp(B box) {
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

		public class MainBlock extends io.intino.alexandria.ui.displays.components.BlockConditional<io.intino.alexandria.ui.displays.notifiers.BlockConditionalNotifier, B>  {
			public LanguageTemplate.BodyBlock.MainBlock. NotLoggedBlock notLoggedBlock;
			public LanguageTemplate.BodyBlock.MainBlock. MainContentBlock mainContentBlock;

			public MainBlock(B box) {
				super(box);
			}

			@Override
			public void initConditional() {
				super.init();
				if (notLoggedBlock == null) notLoggedBlock = register(new NotLoggedBlock(box()).<NotLoggedBlock>id("a_1607183611").owner(AbstractLanguageTemplate.this));
				if (mainContentBlock == null) mainContentBlock = register(new MainContentBlock(box()).<MainContentBlock>id("a_822140838").owner(AbstractLanguageTemplate.this));
				if (AbstractLanguageTemplate.this._113_4_11484268815 == null) AbstractLanguageTemplate.this._113_4_11484268815 = bodyBlock.mainBlock.notLoggedBlock._113_4_11484268815;
				if (AbstractLanguageTemplate.this.modelsDialog == null) AbstractLanguageTemplate.this.modelsDialog = bodyBlock.mainBlock.mainContentBlock.mainResizableBlock.modelsBlock._119_6_01999854639.modelsDialog;
				if (AbstractLanguageTemplate.this.modelsStamp == null) AbstractLanguageTemplate.this.modelsStamp = bodyBlock.mainBlock.mainContentBlock.mainResizableBlock.modelsBlock.modelsStamp;
				if (AbstractLanguageTemplate.this.languageExplorer == null) AbstractLanguageTemplate.this.languageExplorer = bodyBlock.mainBlock.mainContentBlock.mainResizableBlock.homeBlock.viewsBlock.languageExplorer;
				if (AbstractLanguageTemplate.this.expandRightPanel == null) AbstractLanguageTemplate.this.expandRightPanel = bodyBlock.mainBlock.mainContentBlock.collapsedRightPanel._128_5_1219056606._129_6_1134146038.expandRightPanel;
				if (AbstractLanguageTemplate.this.expandRightPanelFull == null) AbstractLanguageTemplate.this.expandRightPanelFull = bodyBlock.mainBlock.mainContentBlock.collapsedRightPanel._131_5_1744038778._132_6_01909031857.expandRightPanelFull;
			}

			@Override
			public void unregister() {
				super.unregister();
				if (notLoggedBlock != null) notLoggedBlock.unregister();
				if (mainContentBlock != null) mainContentBlock.unregister();
			}

			public class NotLoggedBlock extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
				public LanguageTemplate.BodyBlock.MainBlock.NotLoggedBlock. _113_4_11484268815 _113_4_11484268815;

				public NotLoggedBlock(B box) {
					super(box);
				}

				@Override
				public void init() {
					super.init();
					if (_113_4_11484268815 == null) _113_4_11484268815 = register(new _113_4_11484268815(box()).<_113_4_11484268815>id("a24552892").owner(AbstractLanguageTemplate.this));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (_113_4_11484268815 != null) _113_4_11484268815.unregister();
				}

				public class _113_4_11484268815 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

					public _113_4_11484268815(B box) {
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

			public class MainContentBlock extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
				public LanguageTemplate.BodyBlock.MainBlock.MainContentBlock. MainResizableBlock mainResizableBlock;
				public LanguageTemplate.BodyBlock.MainBlock.MainContentBlock. CollapsedRightPanel collapsedRightPanel;

				public MainContentBlock(B box) {
					super(box);
				}

				@Override
				public void init() {
					super.init();
					if (mainResizableBlock == null) mainResizableBlock = register(new MainResizableBlock(box()).<MainResizableBlock>id("a_1310080320").owner(AbstractLanguageTemplate.this));
					if (collapsedRightPanel == null) collapsedRightPanel = register(new CollapsedRightPanel(box()).<CollapsedRightPanel>id("a672117658").owner(AbstractLanguageTemplate.this));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (mainResizableBlock != null) mainResizableBlock.unregister();
					if (collapsedRightPanel != null) collapsedRightPanel.unregister();
				}

				public class MainResizableBlock extends io.intino.alexandria.ui.displays.components.BlockResizable<io.intino.alexandria.ui.displays.notifiers.BlockResizableNotifier, B>  {
					public LanguageTemplate.BodyBlock.MainBlock.MainContentBlock.MainResizableBlock. ModelsBlock modelsBlock;
					public LanguageTemplate.BodyBlock.MainBlock.MainContentBlock.MainResizableBlock. HomeBlock homeBlock;

					public MainResizableBlock(B box) {
						super(box);
					}

					@Override
					public void init() {
						super.init();
						if (modelsBlock == null) modelsBlock = register(new ModelsBlock(box()).<ModelsBlock>id("a1971674436").owner(AbstractLanguageTemplate.this));
						if (homeBlock == null) homeBlock = register(new HomeBlock(box()).<HomeBlock>id("a1099653167").owner(AbstractLanguageTemplate.this));
					}

					@Override
					public void unregister() {
						super.unregister();
						if (modelsBlock != null) modelsBlock.unregister();
						if (homeBlock != null) homeBlock.unregister();
					}

					public class ModelsBlock extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
						public LanguageTemplate.BodyBlock.MainBlock.MainContentBlock.MainResizableBlock.ModelsBlock. _119_6_01999854639 _119_6_01999854639;
						public ModelsTemplate modelsStamp;

						public ModelsBlock(B box) {
							super(box);
						}

						@Override
						public void init() {
							super.init();
							if (_119_6_01999854639 == null) _119_6_01999854639 = register(new _119_6_01999854639(box()).<_119_6_01999854639>id("a_152921974").owner(AbstractLanguageTemplate.this));
							if (modelsStamp == null) modelsStamp = AbstractLanguageTemplate.this.modelsStamp = register(new ModelsTemplate((EditorBox)box()).id("a1997295870"));
						}

						@Override
						public void unregister() {
							super.unregister();
							if (_119_6_01999854639 != null) _119_6_01999854639.unregister();
							if (modelsStamp != null) modelsStamp.unregister();
						}

						public class _119_6_01999854639 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
							public ModelsDialog modelsDialog;

							public _119_6_01999854639(B box) {
								super(box);
							}

							@Override
							public void init() {
								super.init();
								if (modelsDialog == null) modelsDialog = AbstractLanguageTemplate.this.modelsDialog = register(new ModelsDialog((EditorBox)box()).id("a_1915615387"));
							}

							@Override
							public void unregister() {
								super.unregister();
								if (modelsDialog != null) modelsDialog.unregister();
							}
						}
					}

					public class HomeBlock extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
						public LanguageTemplate.BodyBlock.MainBlock.MainContentBlock.MainResizableBlock.HomeBlock. ViewsBlock viewsBlock;

						public HomeBlock(B box) {
							super(box);
						}

						@Override
						public void init() {
							super.init();
							if (viewsBlock == null) viewsBlock = register(new ViewsBlock(box()).<ViewsBlock>id("a_152149809").owner(AbstractLanguageTemplate.this));
						}

						@Override
						public void unregister() {
							super.unregister();
							if (viewsBlock != null) viewsBlock.unregister();
						}

						public class ViewsBlock extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
							public LanguageExplorer languageExplorer;

							public ViewsBlock(B box) {
								super(box);
							}

							@Override
							public void init() {
								super.init();
								if (languageExplorer == null) languageExplorer = AbstractLanguageTemplate.this.languageExplorer = register(new LanguageExplorer((EditorBox)box()).id("a445927719"));
							}

							@Override
							public void unregister() {
								super.unregister();
								if (languageExplorer != null) languageExplorer.unregister();
							}
						}
					}
				}

				public class CollapsedRightPanel extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
					public LanguageTemplate.BodyBlock.MainBlock.MainContentBlock.CollapsedRightPanel. _127_5_0836395274 _127_5_0836395274;
					public LanguageTemplate.BodyBlock.MainBlock.MainContentBlock.CollapsedRightPanel. _128_5_1219056606 _128_5_1219056606;
					public LanguageTemplate.BodyBlock.MainBlock.MainContentBlock.CollapsedRightPanel. _131_5_1744038778 _131_5_1744038778;

					public CollapsedRightPanel(B box) {
						super(box);
					}

					@Override
					public void init() {
						super.init();
						if (_127_5_0836395274 == null) _127_5_0836395274 = register(new _127_5_0836395274(box()).<_127_5_0836395274>id("a_1418543496").owner(AbstractLanguageTemplate.this));
						if (_128_5_1219056606 == null) _128_5_1219056606 = register(new _128_5_1219056606(box()).<_128_5_1219056606>id("a_778481184").owner(AbstractLanguageTemplate.this));
						if (_131_5_1744038778 == null) _131_5_1744038778 = register(new _131_5_1744038778(box()).<_131_5_1744038778>id("a314802301").owner(AbstractLanguageTemplate.this));
					}

					@Override
					public void unregister() {
						super.unregister();
						if (_127_5_0836395274 != null) _127_5_0836395274.unregister();
						if (_128_5_1219056606 != null) _128_5_1219056606.unregister();
						if (_131_5_1744038778 != null) _131_5_1744038778.unregister();
					}

					public class _127_5_0836395274 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {

						public _127_5_0836395274(B box) {
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

					public class _128_5_1219056606 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
						public LanguageTemplate.BodyBlock.MainBlock.MainContentBlock.CollapsedRightPanel._128_5_1219056606. _129_6_1134146038 _129_6_1134146038;

						public _128_5_1219056606(B box) {
							super(box);
						}

						@Override
						public void init() {
							super.init();
							if (_129_6_1134146038 == null) _129_6_1134146038 = register(new _129_6_1134146038(box()).<_129_6_1134146038>id("a3813340").owner(AbstractLanguageTemplate.this));
						}

						@Override
						public void unregister() {
							super.unregister();
							if (_129_6_1134146038 != null) _129_6_1134146038.unregister();
						}

						public class _129_6_1134146038 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
							public LanguageTemplate.BodyBlock.MainBlock.MainContentBlock.CollapsedRightPanel._128_5_1219056606._129_6_1134146038. ExpandRightPanel expandRightPanel;

							public _129_6_1134146038(B box) {
								super(box);
							}

							@Override
							public void init() {
								super.init();
								if (expandRightPanel == null) expandRightPanel = register(new ExpandRightPanel(box()).<ExpandRightPanel>id("a390130326").owner(AbstractLanguageTemplate.this));
							}

							@Override
							public void unregister() {
								super.unregister();
								if (expandRightPanel != null) expandRightPanel.unregister();
							}

							public class ExpandRightPanel extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B>  {

								public ExpandRightPanel(B box) {
									super(box);
									_title("open panel");
									_mode(io.intino.alexandria.ui.displays.components.Actionable.Mode.valueOf("MaterialIconButton"));
									_icon("ChevronLeft");
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

					public class _131_5_1744038778 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
						public LanguageTemplate.BodyBlock.MainBlock.MainContentBlock.CollapsedRightPanel._131_5_1744038778. _132_6_01909031857 _132_6_01909031857;

						public _131_5_1744038778(B box) {
							super(box);
						}

						@Override
						public void init() {
							super.init();
							if (_132_6_01909031857 == null) _132_6_01909031857 = register(new _132_6_01909031857(box()).<_132_6_01909031857>id("a_175297420").owner(AbstractLanguageTemplate.this));
						}

						@Override
						public void unregister() {
							super.unregister();
							if (_132_6_01909031857 != null) _132_6_01909031857.unregister();
						}

						public class _132_6_01909031857 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
							public LanguageTemplate.BodyBlock.MainBlock.MainContentBlock.CollapsedRightPanel._131_5_1744038778._132_6_01909031857. ExpandRightPanelFull expandRightPanelFull;

							public _132_6_01909031857(B box) {
								super(box);
							}

							@Override
							public void init() {
								super.init();
								if (expandRightPanelFull == null) expandRightPanelFull = register(new ExpandRightPanelFull(box()).<ExpandRightPanelFull>id("a21277485").owner(AbstractLanguageTemplate.this));
							}

							@Override
							public void unregister() {
								super.unregister();
								if (expandRightPanelFull != null) expandRightPanelFull.unregister();
							}

							public class ExpandRightPanelFull extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B>  {

								public ExpandRightPanelFull(B box) {
									super(box);
									_title(" ");
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
	}
}