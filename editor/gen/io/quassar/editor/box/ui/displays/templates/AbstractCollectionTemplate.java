package io.quassar.editor.box.ui.displays.templates;

import io.intino.alexandria.core.Box;
import io.intino.alexandria.exceptions.*;
import io.intino.alexandria.ui.displays.components.*;
import io.quassar.editor.box.ui.*;

import io.quassar.editor.box.EditorBox;

import io.quassar.editor.box.ui.displays.templates.*;






import io.quassar.editor.box.ui.displays.items.*;

import io.intino.alexandria.ui.displays.notifiers.TemplateNotifier;

public abstract class AbstractCollectionTemplate<B extends Box> extends io.intino.alexandria.ui.displays.components.Template<TemplateNotifier, java.lang.Void, B> {
	public CollectionHeaderTemplate headerStamp;
	public BodyBlock bodyBlock;
	public CollectionTemplate.BodyBlock. NotFoundBlock notFoundBlock;
	public CollectionTemplate.BodyBlock.NotFoundBlock. _23_3_1913719718 _23_3_1913719718;
	public CollectionTemplate.BodyBlock.NotFoundBlock._23_3_1913719718. _24_4_0985437230 _24_4_0985437230;
	public CollectionTemplate.BodyBlock.NotFoundBlock._23_3_1913719718._24_4_0985437230. _25_5_01262367153 _25_5_01262367153;
	public CollectionTemplate.BodyBlock.NotFoundBlock._23_3_1913719718._24_4_0985437230. _26_5_0356789015 _26_5_0356789015;
	public CollectionTemplate.BodyBlock.NotFoundBlock._23_3_1913719718._24_4_0985437230. _27_5_11544629458 _27_5_11544629458;
	public CollectionTemplate.BodyBlock.NotFoundBlock._23_3_1913719718._24_4_0985437230._27_5_11544629458. _27_32_0285899485 _27_32_0285899485;
	public CollectionTemplate.BodyBlock. MainBlock mainBlock;
	public CollectionTemplate.BodyBlock.MainBlock. MainContentBlock mainContentBlock;
	public CollectionTemplate.BodyBlock.MainBlock.MainContentBlock. PropertiesBlock propertiesBlock;
	public CollectionTemplate.BodyBlock.MainBlock.MainContentBlock.PropertiesBlock. _34_5_0684659768 _34_5_0684659768;
	public CollectionTemplate.BodyBlock.MainBlock.MainContentBlock.PropertiesBlock._34_5_0684659768. _35_6_12079045686 _35_6_12079045686;
	public CollectionTemplate.BodyBlock.MainBlock.MainContentBlock.PropertiesBlock._34_5_0684659768._35_6_12079045686. SubscriptionPlan subscriptionPlan;
	public CollectionTemplate.BodyBlock.MainBlock.MainContentBlock.PropertiesBlock._34_5_0684659768. _37_6_12129823159 _37_6_12129823159;
	public CollectionTemplate.BodyBlock.MainBlock.MainContentBlock.PropertiesBlock._34_5_0684659768._37_6_12129823159. Remove remove;
	public CollectionTemplate.BodyBlock.MainBlock.MainContentBlock.PropertiesBlock. _39_5_0914390189 _39_5_0914390189;
	public CollectionTemplate.BodyBlock.MainBlock.MainContentBlock.PropertiesBlock._39_5_0914390189. _40_6_11075622095 _40_6_11075622095;
	public CollectionTemplate.BodyBlock.MainBlock.MainContentBlock.PropertiesBlock._39_5_0914390189. _41_6_01961667662 _41_6_01961667662;
	public LanguagesCollectionTemplate languagesCatalog;
	public CollectionTemplate.BodyBlock.MainBlock.MainContentBlock.PropertiesBlock. _42_5_01816863202 _42_5_01816863202;
	public CollaboratorsTemplate collaboratorsStamp;
	public CollectionTemplate.BodyBlock.MainBlock.MainContentBlock. HomeBlock homeBlock;
	public CollectionTemplate.BodyBlock.MainBlock.MainContentBlock.HomeBlock. _46_5_1428888497 _46_5_1428888497;
	public LicensesTemplate licensesStamp;

	public AbstractCollectionTemplate(B box) {
		super(box);
		id("collectionTemplate");
	}

	@Override
	public void init() {
		super.init();
		if (headerStamp == null) headerStamp = register(new CollectionHeaderTemplate((EditorBox)box()).id("a_707560242"));
		if (bodyBlock == null) bodyBlock = register(new BodyBlock(box()).<BodyBlock>id("a1769296291").owner(AbstractCollectionTemplate.this));
		if (bodyBlock != null) notFoundBlock = bodyBlock.notFoundBlock;
		if (notFoundBlock != null) _23_3_1913719718 = bodyBlock.notFoundBlock._23_3_1913719718;
		if (_23_3_1913719718 != null) _24_4_0985437230 = bodyBlock.notFoundBlock._23_3_1913719718._24_4_0985437230;
		if (_24_4_0985437230 != null) _25_5_01262367153 = bodyBlock.notFoundBlock._23_3_1913719718._24_4_0985437230._25_5_01262367153;
		if (_24_4_0985437230 != null) _26_5_0356789015 = bodyBlock.notFoundBlock._23_3_1913719718._24_4_0985437230._26_5_0356789015;
		if (_24_4_0985437230 != null) _27_5_11544629458 = bodyBlock.notFoundBlock._23_3_1913719718._24_4_0985437230._27_5_11544629458;
		if (_27_5_11544629458 != null) _27_32_0285899485 = bodyBlock.notFoundBlock._23_3_1913719718._24_4_0985437230._27_5_11544629458._27_32_0285899485;
		if (bodyBlock != null) mainBlock = bodyBlock.mainBlock;
		if (mainBlock != null) mainContentBlock = bodyBlock.mainBlock.mainContentBlock;
		if (mainContentBlock != null) propertiesBlock = bodyBlock.mainBlock.mainContentBlock.propertiesBlock;
		if (propertiesBlock != null) _34_5_0684659768 = bodyBlock.mainBlock.mainContentBlock.propertiesBlock._34_5_0684659768;
		if (_34_5_0684659768 != null) _35_6_12079045686 = bodyBlock.mainBlock.mainContentBlock.propertiesBlock._34_5_0684659768._35_6_12079045686;
		if (_35_6_12079045686 != null) subscriptionPlan = bodyBlock.mainBlock.mainContentBlock.propertiesBlock._34_5_0684659768._35_6_12079045686.subscriptionPlan;
		if (_34_5_0684659768 != null) _37_6_12129823159 = bodyBlock.mainBlock.mainContentBlock.propertiesBlock._34_5_0684659768._37_6_12129823159;
		if (_37_6_12129823159 != null) remove = bodyBlock.mainBlock.mainContentBlock.propertiesBlock._34_5_0684659768._37_6_12129823159.remove;
		if (propertiesBlock != null) _39_5_0914390189 = bodyBlock.mainBlock.mainContentBlock.propertiesBlock._39_5_0914390189;
		if (_39_5_0914390189 != null) _40_6_11075622095 = bodyBlock.mainBlock.mainContentBlock.propertiesBlock._39_5_0914390189._40_6_11075622095;
		if (_39_5_0914390189 != null) _41_6_01961667662 = bodyBlock.mainBlock.mainContentBlock.propertiesBlock._39_5_0914390189._41_6_01961667662;
		if (_41_6_01961667662 != null) languagesCatalog = bodyBlock.mainBlock.mainContentBlock.propertiesBlock._39_5_0914390189._41_6_01961667662.languagesCatalog;
		if (propertiesBlock != null) _42_5_01816863202 = bodyBlock.mainBlock.mainContentBlock.propertiesBlock._42_5_01816863202;
		if (_42_5_01816863202 != null) collaboratorsStamp = bodyBlock.mainBlock.mainContentBlock.propertiesBlock._42_5_01816863202.collaboratorsStamp;
		if (mainContentBlock != null) homeBlock = bodyBlock.mainBlock.mainContentBlock.homeBlock;
		if (homeBlock != null) _46_5_1428888497 = bodyBlock.mainBlock.mainContentBlock.homeBlock._46_5_1428888497;
		if (homeBlock != null) licensesStamp = bodyBlock.mainBlock.mainContentBlock.homeBlock.licensesStamp;
	}

	@Override
	public void remove() {
		super.remove();
		if (headerStamp != null) headerStamp.unregister();
		if (bodyBlock != null) bodyBlock.unregister();
	}

	public class BodyBlock extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
		public CollectionTemplate.BodyBlock. NotFoundBlock notFoundBlock;
		public CollectionTemplate.BodyBlock. MainBlock mainBlock;

		public BodyBlock(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (notFoundBlock == null) notFoundBlock = register(new NotFoundBlock(box()).<NotFoundBlock>id("a_262405182").owner(AbstractCollectionTemplate.this));
			if (mainBlock == null) mainBlock = register(new MainBlock(box()).<MainBlock>id("a_1676650824").owner(AbstractCollectionTemplate.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (notFoundBlock != null) notFoundBlock.unregister();
			if (mainBlock != null) mainBlock.unregister();
		}

		public class NotFoundBlock extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public CollectionTemplate.BodyBlock.NotFoundBlock. _23_3_1913719718 _23_3_1913719718;

			public NotFoundBlock(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (_23_3_1913719718 == null) _23_3_1913719718 = register(new _23_3_1913719718(box()).<_23_3_1913719718>id("a223909841").owner(AbstractCollectionTemplate.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (_23_3_1913719718 != null) _23_3_1913719718.unregister();
			}

			public class _23_3_1913719718 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
				public CollectionTemplate.BodyBlock.NotFoundBlock._23_3_1913719718. _24_4_0985437230 _24_4_0985437230;

				public _23_3_1913719718(B box) {
					super(box);
				}

				@Override
				public void init() {
					super.init();
					if (_24_4_0985437230 == null) _24_4_0985437230 = register(new _24_4_0985437230(box()).<_24_4_0985437230>id("a1858964294").owner(AbstractCollectionTemplate.this));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (_24_4_0985437230 != null) _24_4_0985437230.unregister();
				}

				public class _24_4_0985437230 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
					public CollectionTemplate.BodyBlock.NotFoundBlock._23_3_1913719718._24_4_0985437230. _25_5_01262367153 _25_5_01262367153;
					public CollectionTemplate.BodyBlock.NotFoundBlock._23_3_1913719718._24_4_0985437230. _26_5_0356789015 _26_5_0356789015;
					public CollectionTemplate.BodyBlock.NotFoundBlock._23_3_1913719718._24_4_0985437230. _27_5_11544629458 _27_5_11544629458;

					public _24_4_0985437230(B box) {
						super(box);
					}

					@Override
					public void init() {
						super.init();
						if (_25_5_01262367153 == null) _25_5_01262367153 = register(new _25_5_01262367153(box()).<_25_5_01262367153>id("a1873305731").owner(AbstractCollectionTemplate.this));
						if (_26_5_0356789015 == null) _26_5_0356789015 = register(new _26_5_0356789015(box()).<_26_5_0356789015>id("a1870428004").owner(AbstractCollectionTemplate.this));
						if (_27_5_11544629458 == null) _27_5_11544629458 = register(new _27_5_11544629458(box()).<_27_5_11544629458>id("a335704428").owner(AbstractCollectionTemplate.this));
					}

					@Override
					public void unregister() {
						super.unregister();
						if (_25_5_01262367153 != null) _25_5_01262367153.unregister();
						if (_26_5_0356789015 != null) _26_5_0356789015.unregister();
						if (_27_5_11544629458 != null) _27_5_11544629458.unregister();
					}

					public class _25_5_01262367153 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

						public _25_5_01262367153(B box) {
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

					public class _26_5_0356789015 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

						public _26_5_0356789015(B box) {
							super(box);
							_value("Sorry, we can't find the collection you are visiting");
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

					public class _27_5_11544629458 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
						public CollectionTemplate.BodyBlock.NotFoundBlock._23_3_1913719718._24_4_0985437230._27_5_11544629458. _27_32_0285899485 _27_32_0285899485;

						public _27_5_11544629458(B box) {
							super(box);
						}

						@Override
						public void init() {
							super.init();
							if (_27_32_0285899485 == null) _27_32_0285899485 = register(new _27_32_0285899485(box()).<_27_32_0285899485>id("a_1200604573").owner(AbstractCollectionTemplate.this));
						}

						@Override
						public void unregister() {
							super.unregister();
							if (_27_32_0285899485 != null) _27_32_0285899485.unregister();
						}

						public class _27_32_0285899485 extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B> implements io.intino.alexandria.ui.displays.components.addressable.Addressed<_27_32_0285899485> {

							public _27_32_0285899485(B box) {
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
							public _27_32_0285899485 address(java.util.function.Function<String, String> addressFromPathResolver) {
								address(addressFromPathResolver.apply(path()));
								return this;
							}
						}
					}
				}
			}
		}

		public class MainBlock extends io.intino.alexandria.ui.displays.components.BlockConditional<io.intino.alexandria.ui.displays.notifiers.BlockConditionalNotifier, B>  {
			public CollectionTemplate.BodyBlock.MainBlock. MainContentBlock mainContentBlock;

			public MainBlock(B box) {
				super(box);
			}

			@Override
			public void initConditional() {
				super.init();
				if (mainContentBlock == null) mainContentBlock = register(new MainContentBlock(box()).<MainContentBlock>id("a_1324260716").owner(AbstractCollectionTemplate.this));
				if (AbstractCollectionTemplate.this.subscriptionPlan == null) AbstractCollectionTemplate.this.subscriptionPlan = bodyBlock.mainBlock.mainContentBlock.propertiesBlock._34_5_0684659768._35_6_12079045686.subscriptionPlan;
				if (AbstractCollectionTemplate.this.remove == null) AbstractCollectionTemplate.this.remove = bodyBlock.mainBlock.mainContentBlock.propertiesBlock._34_5_0684659768._37_6_12129823159.remove;
				if (AbstractCollectionTemplate.this._40_6_11075622095 == null) AbstractCollectionTemplate.this._40_6_11075622095 = bodyBlock.mainBlock.mainContentBlock.propertiesBlock._39_5_0914390189._40_6_11075622095;
				if (AbstractCollectionTemplate.this.languagesCatalog == null) AbstractCollectionTemplate.this.languagesCatalog = bodyBlock.mainBlock.mainContentBlock.propertiesBlock._39_5_0914390189._41_6_01961667662.languagesCatalog;
				if (AbstractCollectionTemplate.this.collaboratorsStamp == null) AbstractCollectionTemplate.this.collaboratorsStamp = bodyBlock.mainBlock.mainContentBlock.propertiesBlock._42_5_01816863202.collaboratorsStamp;
				if (AbstractCollectionTemplate.this._46_5_1428888497 == null) AbstractCollectionTemplate.this._46_5_1428888497 = bodyBlock.mainBlock.mainContentBlock.homeBlock._46_5_1428888497;
				if (AbstractCollectionTemplate.this.licensesStamp == null) AbstractCollectionTemplate.this.licensesStamp = bodyBlock.mainBlock.mainContentBlock.homeBlock.licensesStamp;
			}

			@Override
			public void unregister() {
				super.unregister();
				if (mainContentBlock != null) mainContentBlock.unregister();
			}

			public class MainContentBlock extends io.intino.alexandria.ui.displays.components.BlockResizable<io.intino.alexandria.ui.displays.notifiers.BlockResizableNotifier, B>  {
				public CollectionTemplate.BodyBlock.MainBlock.MainContentBlock. PropertiesBlock propertiesBlock;
				public CollectionTemplate.BodyBlock.MainBlock.MainContentBlock. HomeBlock homeBlock;

				public MainContentBlock(B box) {
					super(box);
				}

				@Override
				public void init() {
					super.init();
					if (propertiesBlock == null) propertiesBlock = register(new PropertiesBlock(box()).<PropertiesBlock>id("a1927389039").owner(AbstractCollectionTemplate.this));
					if (homeBlock == null) homeBlock = register(new HomeBlock(box()).<HomeBlock>id("a341591811").owner(AbstractCollectionTemplate.this));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (propertiesBlock != null) propertiesBlock.unregister();
					if (homeBlock != null) homeBlock.unregister();
				}

				public class PropertiesBlock extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
					public CollectionTemplate.BodyBlock.MainBlock.MainContentBlock.PropertiesBlock. _34_5_0684659768 _34_5_0684659768;
					public CollectionTemplate.BodyBlock.MainBlock.MainContentBlock.PropertiesBlock. _39_5_0914390189 _39_5_0914390189;
					public CollectionTemplate.BodyBlock.MainBlock.MainContentBlock.PropertiesBlock. _42_5_01816863202 _42_5_01816863202;

					public PropertiesBlock(B box) {
						super(box);
					}

					@Override
					public void init() {
						super.init();
						if (_34_5_0684659768 == null) _34_5_0684659768 = register(new _34_5_0684659768(box()).<_34_5_0684659768>id("a344582042").owner(AbstractCollectionTemplate.this));
						if (_39_5_0914390189 == null) _39_5_0914390189 = register(new _39_5_0914390189(box()).<_39_5_0914390189>id("a1587122472").owner(AbstractCollectionTemplate.this));
						if (_42_5_01816863202 == null) _42_5_01816863202 = register(new _42_5_01816863202(box()).<_42_5_01816863202>id("a_1301431585").owner(AbstractCollectionTemplate.this));
					}

					@Override
					public void unregister() {
						super.unregister();
						if (_34_5_0684659768 != null) _34_5_0684659768.unregister();
						if (_39_5_0914390189 != null) _39_5_0914390189.unregister();
						if (_42_5_01816863202 != null) _42_5_01816863202.unregister();
					}

					public class _34_5_0684659768 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
						public CollectionTemplate.BodyBlock.MainBlock.MainContentBlock.PropertiesBlock._34_5_0684659768. _35_6_12079045686 _35_6_12079045686;
						public CollectionTemplate.BodyBlock.MainBlock.MainContentBlock.PropertiesBlock._34_5_0684659768. _37_6_12129823159 _37_6_12129823159;

						public _34_5_0684659768(B box) {
							super(box);
						}

						@Override
						public void init() {
							super.init();
							if (_35_6_12079045686 == null) _35_6_12079045686 = register(new _35_6_12079045686(box()).<_35_6_12079045686>id("a_914103217").owner(AbstractCollectionTemplate.this));
							if (_37_6_12129823159 == null) _37_6_12129823159 = register(new _37_6_12129823159(box()).<_37_6_12129823159>id("a396550544").owner(AbstractCollectionTemplate.this));
						}

						@Override
						public void unregister() {
							super.unregister();
							if (_35_6_12079045686 != null) _35_6_12079045686.unregister();
							if (_37_6_12129823159 != null) _37_6_12129823159.unregister();
						}

						public class _35_6_12079045686 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
							public CollectionTemplate.BodyBlock.MainBlock.MainContentBlock.PropertiesBlock._34_5_0684659768._35_6_12079045686. SubscriptionPlan subscriptionPlan;

							public _35_6_12079045686(B box) {
								super(box);
							}

							@Override
							public void init() {
								super.init();
								if (subscriptionPlan == null) subscriptionPlan = register(new SubscriptionPlan(box()).<SubscriptionPlan>id("a695304322").owner(AbstractCollectionTemplate.this));
							}

							@Override
							public void unregister() {
								super.unregister();
								if (subscriptionPlan != null) subscriptionPlan.unregister();
							}

							public class SubscriptionPlan extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

								public SubscriptionPlan(B box) {
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
								public SubscriptionPlan textColor(String color) {
									this._textColor(color);
									this._refreshHighlight();
									return this;
								}

								public SubscriptionPlan backgroundColor(String color) {
									this._backgroundColor(color);
									this._refreshHighlight();
									return this;
								}
							}
						}

						public class _37_6_12129823159 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
							public CollectionTemplate.BodyBlock.MainBlock.MainContentBlock.PropertiesBlock._34_5_0684659768._37_6_12129823159. Remove remove;

							public _37_6_12129823159(B box) {
								super(box);
							}

							@Override
							public void init() {
								super.init();
								if (remove == null) remove = register(new Remove(box()).<Remove>id("a_2090652578").owner(AbstractCollectionTemplate.this));
							}

							@Override
							public void unregister() {
								super.unregister();
								if (remove != null) remove.unregister();
							}

							public class Remove extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B>  {

								public Remove(B box) {
									super(box);
									_title("remove");
									_mode(io.intino.alexandria.ui.displays.components.Actionable.Mode.valueOf("MaterialIconButton"));
									_signMode(io.intino.alexandria.ui.displays.components.Actionable.SignMode.valueOf("SimpleText"));
									_icon("Delete");
								}

								@Override
								public void init() {
									super.init();
								}

								@Override
								public void unregister() {
									super.unregister();
								}
								public String signSecret() {
								    return this._signSecret();
								}
								public Remove signInfoProvider(io.intino.alexandria.ui.displays.components.actionable.SignInfoProvider provider) {
									this._signInfoProvider(provider);
									return this;
								}
								public Remove signChecker(io.intino.alexandria.ui.displays.components.actionable.SignChecker checker) {
									this._signChecker(checker);
									return this;
								}
							}
						}
					}

					public class _39_5_0914390189 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
						public CollectionTemplate.BodyBlock.MainBlock.MainContentBlock.PropertiesBlock._39_5_0914390189. _40_6_11075622095 _40_6_11075622095;
						public CollectionTemplate.BodyBlock.MainBlock.MainContentBlock.PropertiesBlock._39_5_0914390189. _41_6_01961667662 _41_6_01961667662;

						public _39_5_0914390189(B box) {
							super(box);
						}

						@Override
						public void init() {
							super.init();
							if (_40_6_11075622095 == null) _40_6_11075622095 = register(new _40_6_11075622095(box()).<_40_6_11075622095>id("a1795591550").owner(AbstractCollectionTemplate.this));
							if (_41_6_01961667662 == null) _41_6_01961667662 = register(new _41_6_01961667662(box()).<_41_6_01961667662>id("a723897385").owner(AbstractCollectionTemplate.this));
						}

						@Override
						public void unregister() {
							super.unregister();
							if (_40_6_11075622095 != null) _40_6_11075622095.unregister();
							if (_41_6_01961667662 != null) _41_6_01961667662.unregister();
						}

						public class _40_6_11075622095 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

							public _40_6_11075622095(B box) {
								super(box);
								_value("DSLs");
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

						public class _41_6_01961667662 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
							public LanguagesCollectionTemplate languagesCatalog;

							public _41_6_01961667662(B box) {
								super(box);
							}

							@Override
							public void init() {
								super.init();
								if (languagesCatalog == null) languagesCatalog = AbstractCollectionTemplate.this.languagesCatalog = register(new LanguagesCollectionTemplate((EditorBox)box()).id("a_707299809"));
							}

							@Override
							public void unregister() {
								super.unregister();
								if (languagesCatalog != null) languagesCatalog.unregister();
							}
						}
					}

					public class _42_5_01816863202 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
						public CollaboratorsTemplate collaboratorsStamp;

						public _42_5_01816863202(B box) {
							super(box);
						}

						@Override
						public void init() {
							super.init();
							if (collaboratorsStamp == null) collaboratorsStamp = AbstractCollectionTemplate.this.collaboratorsStamp = register(new CollaboratorsTemplate((EditorBox)box()).id("a_2027237065"));
						}

						@Override
						public void unregister() {
							super.unregister();
							if (collaboratorsStamp != null) collaboratorsStamp.unregister();
						}
					}
				}

				public class HomeBlock extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
					public CollectionTemplate.BodyBlock.MainBlock.MainContentBlock.HomeBlock. _46_5_1428888497 _46_5_1428888497;
					public LicensesTemplate licensesStamp;

					public HomeBlock(B box) {
						super(box);
					}

					@Override
					public void init() {
						super.init();
						if (_46_5_1428888497 == null) _46_5_1428888497 = register(new _46_5_1428888497(box()).<_46_5_1428888497>id("a1986380647").owner(AbstractCollectionTemplate.this));
						if (licensesStamp == null) licensesStamp = AbstractCollectionTemplate.this.licensesStamp = register(new LicensesTemplate((EditorBox)box()).id("a_1062483371"));
					}

					@Override
					public void unregister() {
						super.unregister();
						if (_46_5_1428888497 != null) _46_5_1428888497.unregister();
						if (licensesStamp != null) licensesStamp.unregister();
					}

					public class _46_5_1428888497 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

						public _46_5_1428888497(B box) {
							super(box);
							_value("Licenses");
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