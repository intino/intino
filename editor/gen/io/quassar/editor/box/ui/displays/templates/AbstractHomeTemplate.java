package io.quassar.editor.box.ui.displays.templates;

import io.intino.alexandria.core.Box;
import io.intino.alexandria.exceptions.*;
import io.intino.alexandria.ui.displays.components.*;
import io.quassar.editor.box.ui.*;

import io.quassar.editor.box.EditorBox;

import io.quassar.editor.box.ui.displays.templates.*;






import io.quassar.editor.box.ui.displays.items.*;

import io.intino.alexandria.ui.displays.notifiers.TemplateNotifier;

public abstract class AbstractHomeTemplate<B extends Box> extends io.intino.alexandria.ui.displays.components.Template<TemplateNotifier, java.lang.Void, B> {
	public HeaderTemplate header;
	public _26_1_01384496268 _26_1_01384496268;
	public HomeTemplate._26_1_01384496268. _27_2_1836485050 _27_2_1836485050;
	public HomeTemplate._26_1_01384496268._27_2_1836485050. Loading loading;
	public HomeTemplate._26_1_01384496268._27_2_1836485050.Loading. _28_58_1970205540 _28_58_1970205540;
	public HomeTemplate._26_1_01384496268._27_2_1836485050. LandingPage landingPage;
	public LandingTemplate landingStamp;
	public HomeTemplate._26_1_01384496268._27_2_1836485050. AboutPage aboutPage;
	public AboutTemplate aboutStamp;
	public HomeTemplate._26_1_01384496268._27_2_1836485050. CollectionPage collectionPage;
	public CollectionTemplate collectionStamp;
	public HomeTemplate._26_1_01384496268._27_2_1836485050. LanguagePage languagePage;
	public LanguageTemplate languageStamp;
	public HomeTemplate._26_1_01384496268._27_2_1836485050. ModelPage modelPage;
	public ModelTemplate modelStamp;
	public HomeTemplate._26_1_01384496268._27_2_1836485050. ForgePage forgePage;
	public ForgeTemplate forgeStamp;

	public AbstractHomeTemplate(B box) {
		super(box);
		id("homeTemplate");
	}

	@Override
	public void init() {
		super.init();
		if (header == null) header = register(new HeaderTemplate((EditorBox)box()).id("a2083916884"));
		if (_26_1_01384496268 == null) _26_1_01384496268 = register(new _26_1_01384496268(box()).<_26_1_01384496268>id("a2124480832").owner(AbstractHomeTemplate.this));
		if (_26_1_01384496268 != null) _27_2_1836485050 = _26_1_01384496268._27_2_1836485050;
		if (_27_2_1836485050 != null) loading = _26_1_01384496268._27_2_1836485050.loading;
		if (loading != null) _28_58_1970205540 = _26_1_01384496268._27_2_1836485050.loading._28_58_1970205540;
		if (_27_2_1836485050 != null) landingPage = _26_1_01384496268._27_2_1836485050.landingPage;
		if (landingPage != null) landingStamp = _26_1_01384496268._27_2_1836485050.landingPage.landingStamp;
		if (_27_2_1836485050 != null) aboutPage = _26_1_01384496268._27_2_1836485050.aboutPage;
		if (aboutPage != null) aboutStamp = _26_1_01384496268._27_2_1836485050.aboutPage.aboutStamp;
		if (_27_2_1836485050 != null) collectionPage = _26_1_01384496268._27_2_1836485050.collectionPage;
		if (collectionPage != null) collectionStamp = _26_1_01384496268._27_2_1836485050.collectionPage.collectionStamp;
		if (_27_2_1836485050 != null) languagePage = _26_1_01384496268._27_2_1836485050.languagePage;
		if (languagePage != null) languageStamp = _26_1_01384496268._27_2_1836485050.languagePage.languageStamp;
		if (_27_2_1836485050 != null) modelPage = _26_1_01384496268._27_2_1836485050.modelPage;
		if (modelPage != null) modelStamp = _26_1_01384496268._27_2_1836485050.modelPage.modelStamp;
		if (_27_2_1836485050 != null) forgePage = _26_1_01384496268._27_2_1836485050.forgePage;
		if (forgePage != null) forgeStamp = _26_1_01384496268._27_2_1836485050.forgePage.forgeStamp;
	}

	@Override
	public void remove() {
		super.remove();
		if (header != null) header.unregister();
		if (_26_1_01384496268 != null) _26_1_01384496268.unregister();
	}

	public class _26_1_01384496268 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
		public HomeTemplate._26_1_01384496268. _27_2_1836485050 _27_2_1836485050;

		public _26_1_01384496268(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (_27_2_1836485050 == null) _27_2_1836485050 = register(new _27_2_1836485050(box()).<_27_2_1836485050>id("a1739344554").owner(AbstractHomeTemplate.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (_27_2_1836485050 != null) _27_2_1836485050.unregister();
		}

		public class _27_2_1836485050 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public HomeTemplate._26_1_01384496268._27_2_1836485050. Loading loading;
			public HomeTemplate._26_1_01384496268._27_2_1836485050. LandingPage landingPage;
			public HomeTemplate._26_1_01384496268._27_2_1836485050. AboutPage aboutPage;
			public HomeTemplate._26_1_01384496268._27_2_1836485050. CollectionPage collectionPage;
			public HomeTemplate._26_1_01384496268._27_2_1836485050. LanguagePage languagePage;
			public HomeTemplate._26_1_01384496268._27_2_1836485050. ModelPage modelPage;
			public HomeTemplate._26_1_01384496268._27_2_1836485050. ForgePage forgePage;

			public _27_2_1836485050(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (loading == null) loading = register(new Loading(box()).<Loading>id("a2076972160").owner(AbstractHomeTemplate.this));
				if (landingPage == null) landingPage = register(new LandingPage(box()).<LandingPage>id("a38346378").owner(AbstractHomeTemplate.this));
				if (aboutPage == null) aboutPage = register(new AboutPage(box()).<AboutPage>id("a366992896").owner(AbstractHomeTemplate.this));
				if (collectionPage == null) collectionPage = register(new CollectionPage(box()).<CollectionPage>id("a103571081").owner(AbstractHomeTemplate.this));
				if (languagePage == null) languagePage = register(new LanguagePage(box()).<LanguagePage>id("a866465091").owner(AbstractHomeTemplate.this));
				if (modelPage == null) modelPage = register(new ModelPage(box()).<ModelPage>id("a_303986788").owner(AbstractHomeTemplate.this));
				if (forgePage == null) forgePage = register(new ForgePage(box()).<ForgePage>id("a_945764134").owner(AbstractHomeTemplate.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (loading != null) loading.unregister();
				if (landingPage != null) landingPage.unregister();
				if (aboutPage != null) aboutPage.unregister();
				if (collectionPage != null) collectionPage.unregister();
				if (languagePage != null) languagePage.unregister();
				if (modelPage != null) modelPage.unregister();
				if (forgePage != null) forgePage.unregister();
			}

			public class Loading extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
				public HomeTemplate._26_1_01384496268._27_2_1836485050.Loading. _28_58_1970205540 _28_58_1970205540;

				public Loading(B box) {
					super(box);
				}

				@Override
				public void init() {
					super.init();
					if (_28_58_1970205540 == null) _28_58_1970205540 = register(new _28_58_1970205540(box()).<_28_58_1970205540>id("a_648528930").owner(AbstractHomeTemplate.this));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (_28_58_1970205540 != null) _28_58_1970205540.unregister();
				}

				public class _28_58_1970205540 extends io.intino.alexandria.ui.displays.components.Spinner<io.intino.alexandria.ui.displays.notifiers.SpinnerNotifier, B>  {

					public _28_58_1970205540(B box) {
						super(box);

						_color("#F68A1C");
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

			public class LandingPage extends io.intino.alexandria.ui.displays.components.BlockConditional<io.intino.alexandria.ui.displays.notifiers.BlockConditionalNotifier, B>  {
				public LandingTemplate landingStamp;

				public LandingPage(B box) {
					super(box);
				}

				@Override
				public void initConditional() {
					super.init();
					if (landingStamp == null) landingStamp = AbstractHomeTemplate.this.landingStamp = register(new LandingTemplate((EditorBox)box()).id("a_1797452927"));
					if (AbstractHomeTemplate.this.landingStamp == null) AbstractHomeTemplate.this.landingStamp = _26_1_01384496268._27_2_1836485050.landingPage.landingStamp;
				}

				@Override
				public void unregister() {
					super.unregister();
					if (landingStamp != null) landingStamp.unregister();
				}
			}

			public class AboutPage extends io.intino.alexandria.ui.displays.components.BlockConditional<io.intino.alexandria.ui.displays.notifiers.BlockConditionalNotifier, B>  {
				public AboutTemplate aboutStamp;

				public AboutPage(B box) {
					super(box);
				}

				@Override
				public void initConditional() {
					super.init();
					if (aboutStamp == null) aboutStamp = AbstractHomeTemplate.this.aboutStamp = register(new AboutTemplate((EditorBox)box()).id("a2074318805"));
					if (AbstractHomeTemplate.this.aboutStamp == null) AbstractHomeTemplate.this.aboutStamp = _26_1_01384496268._27_2_1836485050.aboutPage.aboutStamp;
				}

				@Override
				public void unregister() {
					super.unregister();
					if (aboutStamp != null) aboutStamp.unregister();
				}
			}

			public class CollectionPage extends io.intino.alexandria.ui.displays.components.BlockConditional<io.intino.alexandria.ui.displays.notifiers.BlockConditionalNotifier, B>  {
				public CollectionTemplate collectionStamp;

				public CollectionPage(B box) {
					super(box);
				}

				@Override
				public void initConditional() {
					super.init();
					if (collectionStamp == null) collectionStamp = AbstractHomeTemplate.this.collectionStamp = register(new CollectionTemplate((EditorBox)box()).id("a_1404691953"));
					if (AbstractHomeTemplate.this.collectionStamp == null) AbstractHomeTemplate.this.collectionStamp = _26_1_01384496268._27_2_1836485050.collectionPage.collectionStamp;
				}

				@Override
				public void unregister() {
					super.unregister();
					if (collectionStamp != null) collectionStamp.unregister();
				}
			}

			public class LanguagePage extends io.intino.alexandria.ui.displays.components.BlockConditional<io.intino.alexandria.ui.displays.notifiers.BlockConditionalNotifier, B>  {
				public LanguageTemplate languageStamp;

				public LanguagePage(B box) {
					super(box);
				}

				@Override
				public void initConditional() {
					super.init();
					if (languageStamp == null) languageStamp = AbstractHomeTemplate.this.languageStamp = register(new LanguageTemplate((EditorBox)box()).id("a409120079"));
					if (AbstractHomeTemplate.this.languageStamp == null) AbstractHomeTemplate.this.languageStamp = _26_1_01384496268._27_2_1836485050.languagePage.languageStamp;
				}

				@Override
				public void unregister() {
					super.unregister();
					if (languageStamp != null) languageStamp.unregister();
				}
			}

			public class ModelPage extends io.intino.alexandria.ui.displays.components.BlockConditional<io.intino.alexandria.ui.displays.notifiers.BlockConditionalNotifier, B>  {
				public ModelTemplate modelStamp;

				public ModelPage(B box) {
					super(box);
				}

				@Override
				public void initConditional() {
					super.init();
					if (modelStamp == null) modelStamp = AbstractHomeTemplate.this.modelStamp = register(new ModelTemplate((EditorBox)box()).id("a1738710685"));
					if (AbstractHomeTemplate.this.modelStamp == null) AbstractHomeTemplate.this.modelStamp = _26_1_01384496268._27_2_1836485050.modelPage.modelStamp;
				}

				@Override
				public void unregister() {
					super.unregister();
					if (modelStamp != null) modelStamp.unregister();
				}
			}

			public class ForgePage extends io.intino.alexandria.ui.displays.components.BlockConditional<io.intino.alexandria.ui.displays.notifiers.BlockConditionalNotifier, B>  {
				public ForgeTemplate forgeStamp;

				public ForgePage(B box) {
					super(box);
				}

				@Override
				public void initConditional() {
					super.init();
					if (forgeStamp == null) forgeStamp = AbstractHomeTemplate.this.forgeStamp = register(new ForgeTemplate((EditorBox)box()).id("a_1498435295"));
					if (AbstractHomeTemplate.this.forgeStamp == null) AbstractHomeTemplate.this.forgeStamp = _26_1_01384496268._27_2_1836485050.forgePage.forgeStamp;
				}

				@Override
				public void unregister() {
					super.unregister();
					if (forgeStamp != null) forgeStamp.unregister();
				}
			}
		}
	}
}