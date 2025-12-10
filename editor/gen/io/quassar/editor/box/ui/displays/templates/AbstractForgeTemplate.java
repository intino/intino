package io.quassar.editor.box.ui.displays.templates;

import io.intino.alexandria.core.Box;
import io.intino.alexandria.exceptions.*;
import io.intino.alexandria.ui.displays.components.*;
import io.quassar.editor.box.ui.*;

import io.quassar.editor.box.EditorBox;

import io.quassar.editor.box.ui.displays.templates.*;






import io.quassar.editor.box.ui.displays.items.*;

import io.intino.alexandria.ui.displays.notifiers.TemplateNotifier;

public abstract class AbstractForgeTemplate<B extends Box> extends io.intino.alexandria.ui.displays.components.Template<TemplateNotifier, java.lang.Void, B> {
	public NotFoundBlock notFoundBlock;
	public ForgeTemplate.NotFoundBlock. _11_2_0761958926 _11_2_0761958926;
	public ForgeTemplate.NotFoundBlock._11_2_0761958926. _12_3_0849583651 _12_3_0849583651;
	public ForgeTemplate.NotFoundBlock._11_2_0761958926._12_3_0849583651. _13_4_01262367153 _13_4_01262367153;
	public ForgeTemplate.NotFoundBlock._11_2_0761958926._12_3_0849583651. _14_4_02070965865 _14_4_02070965865;
	public ForgeTemplate.NotFoundBlock._11_2_0761958926._12_3_0849583651. _15_4_01106772302 _15_4_01106772302;
	public ForgeTemplate.NotFoundBlock._11_2_0761958926._12_3_0849583651._15_4_01106772302. _15_31_0285899485 _15_31_0285899485;
	public ContentBlock contentBlock;
	public ForgeTemplate.ContentBlock. CreateLanguageBlock createLanguageBlock;
	public CreateLanguageEditor createLanguageStamp;
	public ForgeTemplate.ContentBlock. LanguageBlock languageBlock;
	public LanguageForgeTemplate languageStamp;

	public AbstractForgeTemplate(B box) {
		super(box);
		id("forgeTemplate");
	}

	@Override
	public void init() {
		super.init();
		if (notFoundBlock == null) notFoundBlock = register(new NotFoundBlock(box()).<NotFoundBlock>id("a2069927649").owner(AbstractForgeTemplate.this));
		if (notFoundBlock != null) _11_2_0761958926 = notFoundBlock._11_2_0761958926;
		if (_11_2_0761958926 != null) _12_3_0849583651 = notFoundBlock._11_2_0761958926._12_3_0849583651;
		if (_12_3_0849583651 != null) _13_4_01262367153 = notFoundBlock._11_2_0761958926._12_3_0849583651._13_4_01262367153;
		if (_12_3_0849583651 != null) _14_4_02070965865 = notFoundBlock._11_2_0761958926._12_3_0849583651._14_4_02070965865;
		if (_12_3_0849583651 != null) _15_4_01106772302 = notFoundBlock._11_2_0761958926._12_3_0849583651._15_4_01106772302;
		if (_15_4_01106772302 != null) _15_31_0285899485 = notFoundBlock._11_2_0761958926._12_3_0849583651._15_4_01106772302._15_31_0285899485;
		if (contentBlock == null) contentBlock = register(new ContentBlock(box()).<ContentBlock>id("a_1797084751").owner(AbstractForgeTemplate.this));
		if (contentBlock != null) createLanguageBlock = contentBlock.createLanguageBlock;
		if (createLanguageBlock != null) createLanguageStamp = contentBlock.createLanguageBlock.createLanguageStamp;
		if (contentBlock != null) languageBlock = contentBlock.languageBlock;
		if (languageBlock != null) languageStamp = contentBlock.languageBlock.languageStamp;
	}

	@Override
	public void remove() {
		super.remove();
		if (notFoundBlock != null) notFoundBlock.unregister();
		if (contentBlock != null) contentBlock.unregister();
	}

	public class NotFoundBlock extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
		public ForgeTemplate.NotFoundBlock. _11_2_0761958926 _11_2_0761958926;

		public NotFoundBlock(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (_11_2_0761958926 == null) _11_2_0761958926 = register(new _11_2_0761958926(box()).<_11_2_0761958926>id("a1551294702").owner(AbstractForgeTemplate.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (_11_2_0761958926 != null) _11_2_0761958926.unregister();
		}

		public class _11_2_0761958926 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public ForgeTemplate.NotFoundBlock._11_2_0761958926. _12_3_0849583651 _12_3_0849583651;

			public _11_2_0761958926(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (_12_3_0849583651 == null) _12_3_0849583651 = register(new _12_3_0849583651(box()).<_12_3_0849583651>id("a510426830").owner(AbstractForgeTemplate.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (_12_3_0849583651 != null) _12_3_0849583651.unregister();
			}

			public class _12_3_0849583651 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
				public ForgeTemplate.NotFoundBlock._11_2_0761958926._12_3_0849583651. _13_4_01262367153 _13_4_01262367153;
				public ForgeTemplate.NotFoundBlock._11_2_0761958926._12_3_0849583651. _14_4_02070965865 _14_4_02070965865;
				public ForgeTemplate.NotFoundBlock._11_2_0761958926._12_3_0849583651. _15_4_01106772302 _15_4_01106772302;

				public _12_3_0849583651(B box) {
					super(box);
				}

				@Override
				public void init() {
					super.init();
					if (_13_4_01262367153 == null) _13_4_01262367153 = register(new _13_4_01262367153(box()).<_13_4_01262367153>id("a478570029").owner(AbstractForgeTemplate.this));
					if (_14_4_02070965865 == null) _14_4_02070965865 = register(new _14_4_02070965865(box()).<_14_4_02070965865>id("a1249075020").owner(AbstractForgeTemplate.this));
					if (_15_4_01106772302 == null) _15_4_01106772302 = register(new _15_4_01106772302(box()).<_15_4_01106772302>id("a_1490426240").owner(AbstractForgeTemplate.this));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (_13_4_01262367153 != null) _13_4_01262367153.unregister();
					if (_14_4_02070965865 != null) _14_4_02070965865.unregister();
					if (_15_4_01106772302 != null) _15_4_01106772302.unregister();
				}

				public class _13_4_01262367153 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

					public _13_4_01262367153(B box) {
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

				public class _14_4_02070965865 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

					public _14_4_02070965865(B box) {
						super(box);
						_value("Sorry, we can't find the forge you are looking for");
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

				public class _15_4_01106772302 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
					public ForgeTemplate.NotFoundBlock._11_2_0761958926._12_3_0849583651._15_4_01106772302. _15_31_0285899485 _15_31_0285899485;

					public _15_4_01106772302(B box) {
						super(box);
					}

					@Override
					public void init() {
						super.init();
						if (_15_31_0285899485 == null) _15_31_0285899485 = register(new _15_31_0285899485(box()).<_15_31_0285899485>id("a1277141295").owner(AbstractForgeTemplate.this));
					}

					@Override
					public void unregister() {
						super.unregister();
						if (_15_31_0285899485 != null) _15_31_0285899485.unregister();
					}

					public class _15_31_0285899485 extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B> implements io.intino.alexandria.ui.displays.components.addressable.Addressed<_15_31_0285899485> {

						public _15_31_0285899485(B box) {
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
						public _15_31_0285899485 address(java.util.function.Function<String, String> addressFromPathResolver) {
							address(addressFromPathResolver.apply(path()));
							return this;
						}
					}
				}
			}
		}
	}

	public class ContentBlock extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
		public ForgeTemplate.ContentBlock. CreateLanguageBlock createLanguageBlock;
		public ForgeTemplate.ContentBlock. LanguageBlock languageBlock;

		public ContentBlock(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (createLanguageBlock == null) createLanguageBlock = register(new CreateLanguageBlock(box()).<CreateLanguageBlock>id("a994383083").owner(AbstractForgeTemplate.this));
			if (languageBlock == null) languageBlock = register(new LanguageBlock(box()).<LanguageBlock>id("a307874311").owner(AbstractForgeTemplate.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (createLanguageBlock != null) createLanguageBlock.unregister();
			if (languageBlock != null) languageBlock.unregister();
		}

		public class CreateLanguageBlock extends io.intino.alexandria.ui.displays.components.BlockConditional<io.intino.alexandria.ui.displays.notifiers.BlockConditionalNotifier, B>  {
			public CreateLanguageEditor createLanguageStamp;

			public CreateLanguageBlock(B box) {
				super(box);
			}

			@Override
			public void initConditional() {
				super.init();
				if (createLanguageStamp == null) createLanguageStamp = AbstractForgeTemplate.this.createLanguageStamp = register(new CreateLanguageEditor((EditorBox)box()).id("a_1495359909"));
				if (AbstractForgeTemplate.this.createLanguageStamp == null) AbstractForgeTemplate.this.createLanguageStamp = contentBlock.createLanguageBlock.createLanguageStamp;
			}

			@Override
			public void unregister() {
				super.unregister();
				if (createLanguageStamp != null) createLanguageStamp.unregister();
			}
		}

		public class LanguageBlock extends io.intino.alexandria.ui.displays.components.BlockConditional<io.intino.alexandria.ui.displays.notifiers.BlockConditionalNotifier, B>  {
			public LanguageForgeTemplate languageStamp;

			public LanguageBlock(B box) {
				super(box);
			}

			@Override
			public void initConditional() {
				super.init();
				if (languageStamp == null) languageStamp = AbstractForgeTemplate.this.languageStamp = register(new LanguageForgeTemplate((EditorBox)box()).id("a_780035309"));
				if (AbstractForgeTemplate.this.languageStamp == null) AbstractForgeTemplate.this.languageStamp = contentBlock.languageBlock.languageStamp;
			}

			@Override
			public void unregister() {
				super.unregister();
				if (languageStamp != null) languageStamp.unregister();
			}
		}
	}
}