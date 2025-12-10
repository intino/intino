package io.quassar.editor.box.ui.displays.templates;

import io.intino.alexandria.core.Box;
import io.intino.alexandria.exceptions.*;
import io.intino.alexandria.ui.displays.components.*;
import io.quassar.editor.box.ui.*;

import io.quassar.editor.box.EditorBox;

import io.quassar.editor.box.ui.displays.templates.*;






import io.quassar.editor.box.ui.displays.items.*;

import io.intino.alexandria.ui.displays.notifiers.TemplateNotifier;

public abstract class AbstractLanguageExplorer<B extends Box> extends io.intino.alexandria.ui.displays.components.Template<TemplateNotifier, java.lang.Void, B> {
	public _136_1_11932002508 _136_1_11932002508;
	public LanguageExplorer._136_1_11932002508. _137_2_01066131792 _137_2_01066131792;
	public LanguageExplorer._136_1_11932002508._137_2_01066131792. SimpleTitle simpleTitle;
	public LanguageExplorer._136_1_11932002508._137_2_01066131792.SimpleTitle. Title title;
	public LanguageExplorer._136_1_11932002508._137_2_01066131792. ReleaseTitle releaseTitle;
	public LanguageExplorer._136_1_11932002508._137_2_01066131792.ReleaseTitle. TitlePrefix titlePrefix;
	public LanguageExplorer._136_1_11932002508._137_2_01066131792.ReleaseTitle. _141_4_01570960080 _141_4_01570960080;
	public LanguageExplorer._136_1_11932002508._137_2_01066131792.ReleaseTitle._141_4_01570960080. ReleaseSelector releaseSelector;
	public LanguageExplorer._136_1_11932002508._137_2_01066131792. _142_3_0438019676 _142_3_0438019676;
	public ModelsDialog examplesDialog;
	public LanguageExplorer._136_1_11932002508._137_2_01066131792._142_3_0438019676. ForgeLink forgeLink;
	public LanguageExplorer._136_1_11932002508._137_2_01066131792. CollapseExplorer collapseExplorer;
	public AboutBlock aboutBlock;
	public LanguageExplorer.AboutBlock. AboutContent aboutContent;
	public LanguageExplorer.AboutBlock.AboutContent. _149_3_0339225946 _149_3_0339225946;
	public LanguageExplorer.AboutBlock.AboutContent._149_3_0339225946. _150_4_0564637815 _150_4_0564637815;
	public LanguageExplorer.AboutBlock.AboutContent._149_3_0339225946. AboutTitle aboutTitle;
	public LanguageExplorer.AboutBlock.AboutContent. _152_3_0644733523 _152_3_0644733523;
	public LanguageExplorer.AboutBlock.AboutContent._152_3_0644733523. _153_4_0883827854 _153_4_0883827854;
	public LanguageExplorer.AboutBlock.AboutContent._152_3_0644733523. AboutDescription aboutDescription;
	public LanguageExplorer.AboutBlock.AboutContent. _155_3_1103649037 _155_3_1103649037;
	public LanguageExplorer.AboutBlock.AboutContent._155_3_1103649037. _156_4_01569372737 _156_4_01569372737;
	public LanguageExplorer.AboutBlock.AboutContent._155_3_1103649037. AboutCitation aboutCitation;
	public LanguageExplorer.AboutBlock.AboutContent._155_3_1103649037. AboutCitationLink aboutCitationLink;
	public LanguageExplorer.AboutBlock.AboutContent. _159_3_12017351092 _159_3_12017351092;
	public LanguageExplorer.AboutBlock.AboutContent._159_3_12017351092. _160_4_0304812272 _160_4_0304812272;
	public LanguageExplorer.AboutBlock.AboutContent._159_3_12017351092. AboutLicense aboutLicense;
	public VersionsBlock versionsBlock;
	public LanguageExplorer.VersionsBlock. _164_2_11253028413 _164_2_11253028413;
	public LanguageExplorer.VersionsBlock._164_2_11253028413. ReleaseHelpStamp releaseHelpStamp;
	public ExamplesBlock examplesBlock;
	public ModelsTemplate examplesStamp;

	public AbstractLanguageExplorer(B box) {
		super(box);
		id("languageExplorer");
	}

	@Override
	public void init() {
		super.init();
		if (_136_1_11932002508 == null) _136_1_11932002508 = register(new _136_1_11932002508(box()).<_136_1_11932002508>id("a881177172").owner(AbstractLanguageExplorer.this));
		if (_136_1_11932002508 != null) _137_2_01066131792 = _136_1_11932002508._137_2_01066131792;
		if (_137_2_01066131792 != null) simpleTitle = _136_1_11932002508._137_2_01066131792.simpleTitle;
		if (simpleTitle != null) title = _136_1_11932002508._137_2_01066131792.simpleTitle.title;
		if (_137_2_01066131792 != null) releaseTitle = _136_1_11932002508._137_2_01066131792.releaseTitle;
		if (releaseTitle != null) titlePrefix = _136_1_11932002508._137_2_01066131792.releaseTitle.titlePrefix;
		if (releaseTitle != null) _141_4_01570960080 = _136_1_11932002508._137_2_01066131792.releaseTitle._141_4_01570960080;
		if (_141_4_01570960080 != null) releaseSelector = _136_1_11932002508._137_2_01066131792.releaseTitle._141_4_01570960080.releaseSelector;
		if (_137_2_01066131792 != null) _142_3_0438019676 = _136_1_11932002508._137_2_01066131792._142_3_0438019676;
		if (_142_3_0438019676 != null) examplesDialog = _136_1_11932002508._137_2_01066131792._142_3_0438019676.examplesDialog;
		if (_142_3_0438019676 != null) forgeLink = _136_1_11932002508._137_2_01066131792._142_3_0438019676.forgeLink;
		if (_137_2_01066131792 != null) collapseExplorer = _136_1_11932002508._137_2_01066131792.collapseExplorer;
		if (aboutBlock == null) aboutBlock = register(new AboutBlock(box()).<AboutBlock>id("a1939755721").owner(AbstractLanguageExplorer.this));
		if (aboutBlock != null) aboutContent = aboutBlock.aboutContent;
		if (aboutContent != null) _149_3_0339225946 = aboutBlock.aboutContent._149_3_0339225946;
		if (_149_3_0339225946 != null) _150_4_0564637815 = aboutBlock.aboutContent._149_3_0339225946._150_4_0564637815;
		if (_149_3_0339225946 != null) aboutTitle = aboutBlock.aboutContent._149_3_0339225946.aboutTitle;
		if (aboutContent != null) _152_3_0644733523 = aboutBlock.aboutContent._152_3_0644733523;
		if (_152_3_0644733523 != null) _153_4_0883827854 = aboutBlock.aboutContent._152_3_0644733523._153_4_0883827854;
		if (_152_3_0644733523 != null) aboutDescription = aboutBlock.aboutContent._152_3_0644733523.aboutDescription;
		if (aboutContent != null) _155_3_1103649037 = aboutBlock.aboutContent._155_3_1103649037;
		if (_155_3_1103649037 != null) _156_4_01569372737 = aboutBlock.aboutContent._155_3_1103649037._156_4_01569372737;
		if (_155_3_1103649037 != null) aboutCitation = aboutBlock.aboutContent._155_3_1103649037.aboutCitation;
		if (_155_3_1103649037 != null) aboutCitationLink = aboutBlock.aboutContent._155_3_1103649037.aboutCitationLink;
		if (aboutContent != null) _159_3_12017351092 = aboutBlock.aboutContent._159_3_12017351092;
		if (_159_3_12017351092 != null) _160_4_0304812272 = aboutBlock.aboutContent._159_3_12017351092._160_4_0304812272;
		if (_159_3_12017351092 != null) aboutLicense = aboutBlock.aboutContent._159_3_12017351092.aboutLicense;
		if (versionsBlock == null) versionsBlock = register(new VersionsBlock(box()).<VersionsBlock>id("a1973980233").owner(AbstractLanguageExplorer.this));
		if (versionsBlock != null) _164_2_11253028413 = versionsBlock._164_2_11253028413;
		if (_164_2_11253028413 != null) releaseHelpStamp = versionsBlock._164_2_11253028413.releaseHelpStamp;
		if (examplesBlock == null) examplesBlock = register(new ExamplesBlock(box()).<ExamplesBlock>id("a_1906357413").owner(AbstractLanguageExplorer.this));
		if (examplesBlock != null) examplesStamp = examplesBlock.examplesStamp;
	}

	@Override
	public void remove() {
		super.remove();
		if (_136_1_11932002508 != null) _136_1_11932002508.unregister();
		if (aboutBlock != null) aboutBlock.unregister();
		if (versionsBlock != null) versionsBlock.unregister();
		if (examplesBlock != null) examplesBlock.unregister();
	}

	public class _136_1_11932002508 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
		public LanguageExplorer._136_1_11932002508. _137_2_01066131792 _137_2_01066131792;

		public _136_1_11932002508(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (_137_2_01066131792 == null) _137_2_01066131792 = register(new _137_2_01066131792(box()).<_137_2_01066131792>id("a_1698645225").owner(AbstractLanguageExplorer.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (_137_2_01066131792 != null) _137_2_01066131792.unregister();
		}

		public class _137_2_01066131792 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public LanguageExplorer._136_1_11932002508._137_2_01066131792. SimpleTitle simpleTitle;
			public LanguageExplorer._136_1_11932002508._137_2_01066131792. ReleaseTitle releaseTitle;
			public LanguageExplorer._136_1_11932002508._137_2_01066131792. _142_3_0438019676 _142_3_0438019676;
			public LanguageExplorer._136_1_11932002508._137_2_01066131792. CollapseExplorer collapseExplorer;

			public _137_2_01066131792(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (simpleTitle == null) simpleTitle = register(new SimpleTitle(box()).<SimpleTitle>id("a797520779").owner(AbstractLanguageExplorer.this));
				if (releaseTitle == null) releaseTitle = register(new ReleaseTitle(box()).<ReleaseTitle>id("a_1663141012").owner(AbstractLanguageExplorer.this));
				if (_142_3_0438019676 == null) _142_3_0438019676 = register(new _142_3_0438019676(box()).<_142_3_0438019676>id("a452480678").owner(AbstractLanguageExplorer.this));
				if (collapseExplorer == null) collapseExplorer = register(new CollapseExplorer(box()).<CollapseExplorer>id("a1324384871").owner(AbstractLanguageExplorer.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (simpleTitle != null) simpleTitle.unregister();
				if (releaseTitle != null) releaseTitle.unregister();
				if (_142_3_0438019676 != null) _142_3_0438019676.unregister();
				if (collapseExplorer != null) collapseExplorer.unregister();
			}

			public class SimpleTitle extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
				public LanguageExplorer._136_1_11932002508._137_2_01066131792.SimpleTitle. Title title;

				public SimpleTitle(B box) {
					super(box);
				}

				@Override
				public void init() {
					super.init();
					if (title == null) title = register(new Title(box()).<Title>id("a_464935772").owner(AbstractLanguageExplorer.this));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (title != null) title.unregister();
				}

				public class Title extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

					public Title(B box) {
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

			public class ReleaseTitle extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
				public LanguageExplorer._136_1_11932002508._137_2_01066131792.ReleaseTitle. TitlePrefix titlePrefix;
				public LanguageExplorer._136_1_11932002508._137_2_01066131792.ReleaseTitle. _141_4_01570960080 _141_4_01570960080;

				public ReleaseTitle(B box) {
					super(box);
				}

				@Override
				public void init() {
					super.init();
					if (titlePrefix == null) titlePrefix = register(new TitlePrefix(box()).<TitlePrefix>id("a_943606089").owner(AbstractLanguageExplorer.this));
					if (_141_4_01570960080 == null) _141_4_01570960080 = register(new _141_4_01570960080(box()).<_141_4_01570960080>id("a486232474").owner(AbstractLanguageExplorer.this));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (titlePrefix != null) titlePrefix.unregister();
					if (_141_4_01570960080 != null) _141_4_01570960080.unregister();
				}

				public class TitlePrefix extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

					public TitlePrefix(B box) {
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

				public class _141_4_01570960080 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
					public LanguageExplorer._136_1_11932002508._137_2_01066131792.ReleaseTitle._141_4_01570960080. ReleaseSelector releaseSelector;

					public _141_4_01570960080(B box) {
						super(box);
					}

					@Override
					public void init() {
						super.init();
						if (releaseSelector == null) releaseSelector = register(new ReleaseSelector(box()).<ReleaseSelector>id("a1945197094").owner(AbstractLanguageExplorer.this));
					}

					@Override
					public void unregister() {
						super.unregister();
						if (releaseSelector != null) releaseSelector.unregister();
					}

					public class ReleaseSelector extends io.intino.alexandria.ui.displays.components.SelectorComboBox<io.intino.alexandria.ui.displays.notifiers.SelectorComboBoxNotifier, B>  {

						public ReleaseSelector(B box) {
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
				}
			}

			public class _142_3_0438019676 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
				public ModelsDialog examplesDialog;
				public LanguageExplorer._136_1_11932002508._137_2_01066131792._142_3_0438019676. ForgeLink forgeLink;

				public _142_3_0438019676(B box) {
					super(box);
				}

				@Override
				public void init() {
					super.init();
					if (examplesDialog == null) examplesDialog = AbstractLanguageExplorer.this.examplesDialog = register(new ModelsDialog((EditorBox)box()).id("a_1340704239"));
					if (forgeLink == null) forgeLink = register(new ForgeLink(box()).<ForgeLink>id("a_1206509343").owner(AbstractLanguageExplorer.this));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (examplesDialog != null) examplesDialog.unregister();
					if (forgeLink != null) forgeLink.unregister();
				}

				public class ForgeLink extends io.intino.alexandria.ui.displays.components.OpenSite<io.intino.alexandria.ui.displays.notifiers.OpenSiteNotifier, B>  {

					public ForgeLink(B box) {
						super(box);
						_title("");
						_mode(io.intino.alexandria.ui.displays.components.Actionable.Mode.valueOf("IconButton"));
						_icon("/images/circle-up.png");
						_darkIcon("/images/circle-up-dark.png");
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

			public class CollapseExplorer extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B>  {

				public CollapseExplorer(B box) {
					super(box);
					_title("close panel");
					_mode(io.intino.alexandria.ui.displays.components.Actionable.Mode.valueOf("MaterialIconButton"));
					_icon("ChevronRight");
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

	public class AboutBlock extends io.intino.alexandria.ui.displays.components.BlockConditional<io.intino.alexandria.ui.displays.notifiers.BlockConditionalNotifier, B>  {
		public LanguageExplorer.AboutBlock. AboutContent aboutContent;

		public AboutBlock(B box) {
			super(box);
		}

		@Override
		public void initConditional() {
			super.init();
			if (aboutContent == null) aboutContent = register(new AboutContent(box()).<AboutContent>id("a141338082").owner(AbstractLanguageExplorer.this));
			if (AbstractLanguageExplorer.this._150_4_0564637815 == null) AbstractLanguageExplorer.this._150_4_0564637815 = aboutBlock.aboutContent._149_3_0339225946._150_4_0564637815;
			if (AbstractLanguageExplorer.this.aboutTitle == null) AbstractLanguageExplorer.this.aboutTitle = aboutBlock.aboutContent._149_3_0339225946.aboutTitle;
			if (AbstractLanguageExplorer.this._153_4_0883827854 == null) AbstractLanguageExplorer.this._153_4_0883827854 = aboutBlock.aboutContent._152_3_0644733523._153_4_0883827854;
			if (AbstractLanguageExplorer.this.aboutDescription == null) AbstractLanguageExplorer.this.aboutDescription = aboutBlock.aboutContent._152_3_0644733523.aboutDescription;
			if (AbstractLanguageExplorer.this._156_4_01569372737 == null) AbstractLanguageExplorer.this._156_4_01569372737 = aboutBlock.aboutContent._155_3_1103649037._156_4_01569372737;
			if (AbstractLanguageExplorer.this.aboutCitation == null) AbstractLanguageExplorer.this.aboutCitation = aboutBlock.aboutContent._155_3_1103649037.aboutCitation;
			if (AbstractLanguageExplorer.this.aboutCitationLink == null) AbstractLanguageExplorer.this.aboutCitationLink = aboutBlock.aboutContent._155_3_1103649037.aboutCitationLink;
			if (AbstractLanguageExplorer.this._160_4_0304812272 == null) AbstractLanguageExplorer.this._160_4_0304812272 = aboutBlock.aboutContent._159_3_12017351092._160_4_0304812272;
			if (AbstractLanguageExplorer.this.aboutLicense == null) AbstractLanguageExplorer.this.aboutLicense = aboutBlock.aboutContent._159_3_12017351092.aboutLicense;
		}

		@Override
		public void unregister() {
			super.unregister();
			if (aboutContent != null) aboutContent.unregister();
		}

		public class AboutContent extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public LanguageExplorer.AboutBlock.AboutContent. _149_3_0339225946 _149_3_0339225946;
			public LanguageExplorer.AboutBlock.AboutContent. _152_3_0644733523 _152_3_0644733523;
			public LanguageExplorer.AboutBlock.AboutContent. _155_3_1103649037 _155_3_1103649037;
			public LanguageExplorer.AboutBlock.AboutContent. _159_3_12017351092 _159_3_12017351092;

			public AboutContent(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (_149_3_0339225946 == null) _149_3_0339225946 = register(new _149_3_0339225946(box()).<_149_3_0339225946>id("a_1267273914").owner(AbstractLanguageExplorer.this));
				if (_152_3_0644733523 == null) _152_3_0644733523 = register(new _152_3_0644733523(box()).<_152_3_0644733523>id("a101089892").owner(AbstractLanguageExplorer.this));
				if (_155_3_1103649037 == null) _155_3_1103649037 = register(new _155_3_1103649037(box()).<_155_3_1103649037>id("a_461103848").owner(AbstractLanguageExplorer.this));
				if (_159_3_12017351092 == null) _159_3_12017351092 = register(new _159_3_12017351092(box()).<_159_3_12017351092>id("a1793963127").owner(AbstractLanguageExplorer.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (_149_3_0339225946 != null) _149_3_0339225946.unregister();
				if (_152_3_0644733523 != null) _152_3_0644733523.unregister();
				if (_155_3_1103649037 != null) _155_3_1103649037.unregister();
				if (_159_3_12017351092 != null) _159_3_12017351092.unregister();
			}

			public class _149_3_0339225946 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
				public LanguageExplorer.AboutBlock.AboutContent._149_3_0339225946. _150_4_0564637815 _150_4_0564637815;
				public LanguageExplorer.AboutBlock.AboutContent._149_3_0339225946. AboutTitle aboutTitle;

				public _149_3_0339225946(B box) {
					super(box);
				}

				@Override
				public void init() {
					super.init();
					if (_150_4_0564637815 == null) _150_4_0564637815 = register(new _150_4_0564637815(box()).<_150_4_0564637815>id("a684932041").owner(AbstractLanguageExplorer.this));
					if (aboutTitle == null) aboutTitle = register(new AboutTitle(box()).<AboutTitle>id("a_237838012").owner(AbstractLanguageExplorer.this));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (_150_4_0564637815 != null) _150_4_0564637815.unregister();
					if (aboutTitle != null) aboutTitle.unregister();
				}

				public class _150_4_0564637815 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

					public _150_4_0564637815(B box) {
						super(box);
						_value("title");
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

				public class AboutTitle extends io.intino.alexandria.ui.displays.components.TextCode<io.intino.alexandria.ui.displays.notifiers.TextCodeNotifier, B>  {

					public AboutTitle(B box) {
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

			public class _152_3_0644733523 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
				public LanguageExplorer.AboutBlock.AboutContent._152_3_0644733523. _153_4_0883827854 _153_4_0883827854;
				public LanguageExplorer.AboutBlock.AboutContent._152_3_0644733523. AboutDescription aboutDescription;

				public _152_3_0644733523(B box) {
					super(box);
				}

				@Override
				public void init() {
					super.init();
					if (_153_4_0883827854 == null) _153_4_0883827854 = register(new _153_4_0883827854(box()).<_153_4_0883827854>id("a1472766582").owner(AbstractLanguageExplorer.this));
					if (aboutDescription == null) aboutDescription = register(new AboutDescription(box()).<AboutDescription>id("a_111641904").owner(AbstractLanguageExplorer.this));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (_153_4_0883827854 != null) _153_4_0883827854.unregister();
					if (aboutDescription != null) aboutDescription.unregister();
				}

				public class _153_4_0883827854 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

					public _153_4_0883827854(B box) {
						super(box);
						_value("what is it");
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

				public class AboutDescription extends io.intino.alexandria.ui.displays.components.TextCode<io.intino.alexandria.ui.displays.notifiers.TextCodeNotifier, B>  {

					public AboutDescription(B box) {
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

			public class _155_3_1103649037 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
				public LanguageExplorer.AboutBlock.AboutContent._155_3_1103649037. _156_4_01569372737 _156_4_01569372737;
				public LanguageExplorer.AboutBlock.AboutContent._155_3_1103649037. AboutCitation aboutCitation;
				public LanguageExplorer.AboutBlock.AboutContent._155_3_1103649037. AboutCitationLink aboutCitationLink;

				public _155_3_1103649037(B box) {
					super(box);
				}

				@Override
				public void init() {
					super.init();
					if (_156_4_01569372737 == null) _156_4_01569372737 = register(new _156_4_01569372737(box()).<_156_4_01569372737>id("a1172020715").owner(AbstractLanguageExplorer.this));
					if (aboutCitation == null) aboutCitation = register(new AboutCitation(box()).<AboutCitation>id("a_424132970").owner(AbstractLanguageExplorer.this));
					if (aboutCitationLink == null) aboutCitationLink = register(new AboutCitationLink(box()).<AboutCitationLink>id("a1020209072").owner(AbstractLanguageExplorer.this));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (_156_4_01569372737 != null) _156_4_01569372737.unregister();
					if (aboutCitation != null) aboutCitation.unregister();
					if (aboutCitationLink != null) aboutCitationLink.unregister();
				}

				public class _156_4_01569372737 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

					public _156_4_01569372737(B box) {
						super(box);
						_value("how to cite");
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

				public class AboutCitation extends io.intino.alexandria.ui.displays.components.TextCode<io.intino.alexandria.ui.displays.notifiers.TextCodeNotifier, B>  {

					public AboutCitation(B box) {
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

				public class AboutCitationLink extends io.intino.alexandria.ui.displays.components.CopyToClipboard<io.intino.alexandria.ui.displays.notifiers.CopyToClipboardNotifier, B>  {

					public AboutCitationLink(B box) {
						super(box);
						_title("Copy cite");
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

			public class _159_3_12017351092 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
				public LanguageExplorer.AboutBlock.AboutContent._159_3_12017351092. _160_4_0304812272 _160_4_0304812272;
				public LanguageExplorer.AboutBlock.AboutContent._159_3_12017351092. AboutLicense aboutLicense;

				public _159_3_12017351092(B box) {
					super(box);
				}

				@Override
				public void init() {
					super.init();
					if (_160_4_0304812272 == null) _160_4_0304812272 = register(new _160_4_0304812272(box()).<_160_4_0304812272>id("a1957665791").owner(AbstractLanguageExplorer.this));
					if (aboutLicense == null) aboutLicense = register(new AboutLicense(box()).<AboutLicense>id("a1898255918").owner(AbstractLanguageExplorer.this));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (_160_4_0304812272 != null) _160_4_0304812272.unregister();
					if (aboutLicense != null) aboutLicense.unregister();
				}

				public class _160_4_0304812272 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

					public _160_4_0304812272(B box) {
						super(box);
						_value("copyright and license");
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

				public class AboutLicense extends io.intino.alexandria.ui.displays.components.TextCode<io.intino.alexandria.ui.displays.notifiers.TextCodeNotifier, B>  {

					public AboutLicense(B box) {
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

	public class VersionsBlock extends io.intino.alexandria.ui.displays.components.BlockConditional<io.intino.alexandria.ui.displays.notifiers.BlockConditionalNotifier, B>  {
		public LanguageExplorer.VersionsBlock. _164_2_11253028413 _164_2_11253028413;

		public VersionsBlock(B box) {
			super(box);
		}

		@Override
		public void initConditional() {
			super.init();
			if (_164_2_11253028413 == null) _164_2_11253028413 = register(new _164_2_11253028413(box()).<_164_2_11253028413>id("a188002922").owner(AbstractLanguageExplorer.this));
			if (AbstractLanguageExplorer.this.releaseHelpStamp == null) AbstractLanguageExplorer.this.releaseHelpStamp = versionsBlock._164_2_11253028413.releaseHelpStamp;
		}

		@Override
		public void unregister() {
			super.unregister();
			if (_164_2_11253028413 != null) _164_2_11253028413.unregister();
		}

		public class _164_2_11253028413 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public LanguageExplorer.VersionsBlock._164_2_11253028413. ReleaseHelpStamp releaseHelpStamp;

			public _164_2_11253028413(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (releaseHelpStamp == null) releaseHelpStamp = register(new ReleaseHelpStamp(box()).<ReleaseHelpStamp>id("a69235068").owner(AbstractLanguageExplorer.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (releaseHelpStamp != null) releaseHelpStamp.unregister();
			}

			public class ReleaseHelpStamp extends io.intino.alexandria.ui.displays.components.HtmlViewer<io.intino.alexandria.ui.displays.notifiers.HtmlViewerNotifier, B>  {

				public ReleaseHelpStamp(B box) {
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

	public class ExamplesBlock extends io.intino.alexandria.ui.displays.components.BlockConditional<io.intino.alexandria.ui.displays.notifiers.BlockConditionalNotifier, B>  {
		public ModelsTemplate examplesStamp;

		public ExamplesBlock(B box) {
			super(box);
		}

		@Override
		public void initConditional() {
			super.init();
			if (examplesStamp == null) examplesStamp = AbstractLanguageExplorer.this.examplesStamp = register(new ModelsTemplate((EditorBox)box()).id("a37396246"));
			if (AbstractLanguageExplorer.this.examplesStamp == null) AbstractLanguageExplorer.this.examplesStamp = examplesBlock.examplesStamp;
		}

		@Override
		public void unregister() {
			super.unregister();
			if (examplesStamp != null) examplesStamp.unregister();
		}
	}
}