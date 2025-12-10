package io.quassar.editor.box.ui.displays.templates;

import io.intino.alexandria.core.Box;
import io.intino.alexandria.exceptions.*;
import io.intino.alexandria.ui.displays.components.*;
import io.quassar.editor.box.ui.*;

import io.quassar.editor.box.EditorBox;

import io.quassar.editor.box.ui.displays.templates.*;






import io.quassar.editor.box.ui.displays.items.*;

import io.intino.alexandria.ui.displays.notifiers.TemplateNotifier;

public abstract class AbstractModelViewer<B extends Box> extends io.intino.alexandria.ui.displays.components.Template<TemplateNotifier, java.lang.Void, B> {
	public LanguageNotLoadedBlock languageNotLoadedBlock;
	public ModelViewer.LanguageNotLoadedBlock. _196_2_117761100 _196_2_117761100;
	public ModelViewer.LanguageNotLoadedBlock._196_2_117761100. _197_3_168563720 _197_3_168563720;
	public ModelViewer.LanguageNotLoadedBlock._196_2_117761100._197_3_168563720. V v;
	public ModelViewer.LanguageNotLoadedBlock._196_2_117761100._197_3_168563720. _199_4_02144232157 _199_4_02144232157;
	public ContentBlock contentBlock;
	public ModelViewer.ContentBlock. _202_2_1499803814 _202_2_1499803814;
	public ModelViewer.ContentBlock._202_2_1499803814. _203_3_11144494212 _203_3_11144494212;
	public ModelViewer.ContentBlock._202_2_1499803814._203_3_11144494212. _204_4_11424544042 _204_4_11424544042;
	public ModelViewer.ContentBlock._202_2_1499803814._203_3_11144494212._204_4_11424544042. FileSelector fileSelector;
	public ModelViewer.ContentBlock. NoFilesMessage noFilesMessage;
	public ModelViewer.ContentBlock. IntinoDslEditor intinoDslEditor;

	public AbstractModelViewer(B box) {
		super(box);
		id("modelViewer");
	}

	@Override
	public void init() {
		super.init();
		if (languageNotLoadedBlock == null) languageNotLoadedBlock = register(new LanguageNotLoadedBlock(box()).<LanguageNotLoadedBlock>id("a374866672").owner(AbstractModelViewer.this));
		if (languageNotLoadedBlock != null) _196_2_117761100 = languageNotLoadedBlock._196_2_117761100;
		if (_196_2_117761100 != null) _197_3_168563720 = languageNotLoadedBlock._196_2_117761100._197_3_168563720;
		if (_197_3_168563720 != null) v = languageNotLoadedBlock._196_2_117761100._197_3_168563720.v;
		if (_197_3_168563720 != null) _199_4_02144232157 = languageNotLoadedBlock._196_2_117761100._197_3_168563720._199_4_02144232157;
		if (contentBlock == null) contentBlock = register(new ContentBlock(box()).<ContentBlock>id("a_490340841").owner(AbstractModelViewer.this));
		if (contentBlock != null) _202_2_1499803814 = contentBlock._202_2_1499803814;
		if (_202_2_1499803814 != null) _203_3_11144494212 = contentBlock._202_2_1499803814._203_3_11144494212;
		if (_203_3_11144494212 != null) _204_4_11424544042 = contentBlock._202_2_1499803814._203_3_11144494212._204_4_11424544042;
		if (_204_4_11424544042 != null) fileSelector = contentBlock._202_2_1499803814._203_3_11144494212._204_4_11424544042.fileSelector;
		if (contentBlock != null) noFilesMessage = contentBlock.noFilesMessage;
		if (contentBlock != null) intinoDslEditor = contentBlock.intinoDslEditor;
	}

	@Override
	public void remove() {
		super.remove();
		if (languageNotLoadedBlock != null) languageNotLoadedBlock.unregister();
		if (contentBlock != null) contentBlock.unregister();
	}

	public class LanguageNotLoadedBlock extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
		public ModelViewer.LanguageNotLoadedBlock. _196_2_117761100 _196_2_117761100;

		public LanguageNotLoadedBlock(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (_196_2_117761100 == null) _196_2_117761100 = register(new _196_2_117761100(box()).<_196_2_117761100>id("a_624172024").owner(AbstractModelViewer.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (_196_2_117761100 != null) _196_2_117761100.unregister();
		}

		public class _196_2_117761100 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public ModelViewer.LanguageNotLoadedBlock._196_2_117761100. _197_3_168563720 _197_3_168563720;

			public _196_2_117761100(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (_197_3_168563720 == null) _197_3_168563720 = register(new _197_3_168563720(box()).<_197_3_168563720>id("a1576510542").owner(AbstractModelViewer.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (_197_3_168563720 != null) _197_3_168563720.unregister();
			}

			public class _197_3_168563720 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
				public ModelViewer.LanguageNotLoadedBlock._196_2_117761100._197_3_168563720. V v;
				public ModelViewer.LanguageNotLoadedBlock._196_2_117761100._197_3_168563720. _199_4_02144232157 _199_4_02144232157;

				public _197_3_168563720(B box) {
					super(box);
				}

				@Override
				public void init() {
					super.init();
					if (v == null) v = register(new V(box()).<V>id("a_722047611").owner(AbstractModelViewer.this));
					if (_199_4_02144232157 == null) _199_4_02144232157 = register(new _199_4_02144232157(box()).<_199_4_02144232157>id("a_2021858070").owner(AbstractModelViewer.this));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (v != null) v.unregister();
					if (_199_4_02144232157 != null) _199_4_02144232157.unregister();
				}

				public class V extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

					public V(B box) {
						super(box);
						_value("Internal error");
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

				public class _199_4_02144232157 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

					public _199_4_02144232157(B box) {
						super(box);
						_value("Could not load model");
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

	public class ContentBlock extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
		public ModelViewer.ContentBlock. _202_2_1499803814 _202_2_1499803814;
		public ModelViewer.ContentBlock. NoFilesMessage noFilesMessage;
		public ModelViewer.ContentBlock. IntinoDslEditor intinoDslEditor;

		public ContentBlock(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (_202_2_1499803814 == null) _202_2_1499803814 = register(new _202_2_1499803814(box()).<_202_2_1499803814>id("a2009560466").owner(AbstractModelViewer.this));
			if (noFilesMessage == null) noFilesMessage = register(new NoFilesMessage(box()).<NoFilesMessage>id("a1778966809").owner(AbstractModelViewer.this));
			if (intinoDslEditor == null) intinoDslEditor = AbstractModelViewer.this.intinoDslEditor = register(new IntinoDslEditor(box()).<IntinoDslEditor>id("a435736583").owner(AbstractModelViewer.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (_202_2_1499803814 != null) _202_2_1499803814.unregister();
			if (noFilesMessage != null) noFilesMessage.unregister();
			if (intinoDslEditor != null) intinoDslEditor.unregister();
		}

		public class _202_2_1499803814 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public ModelViewer.ContentBlock._202_2_1499803814. _203_3_11144494212 _203_3_11144494212;

			public _202_2_1499803814(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (_203_3_11144494212 == null) _203_3_11144494212 = register(new _203_3_11144494212(box()).<_203_3_11144494212>id("a1555926541").owner(AbstractModelViewer.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (_203_3_11144494212 != null) _203_3_11144494212.unregister();
			}

			public class _203_3_11144494212 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
				public ModelViewer.ContentBlock._202_2_1499803814._203_3_11144494212. _204_4_11424544042 _204_4_11424544042;

				public _203_3_11144494212(B box) {
					super(box);
				}

				@Override
				public void init() {
					super.init();
					if (_204_4_11424544042 == null) _204_4_11424544042 = register(new _204_4_11424544042(box()).<_204_4_11424544042>id("a29155079").owner(AbstractModelViewer.this));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (_204_4_11424544042 != null) _204_4_11424544042.unregister();
				}

				public class _204_4_11424544042 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
					public ModelViewer.ContentBlock._202_2_1499803814._203_3_11144494212._204_4_11424544042. FileSelector fileSelector;

					public _204_4_11424544042(B box) {
						super(box);
					}

					@Override
					public void init() {
						super.init();
						if (fileSelector == null) fileSelector = register(new FileSelector(box()).<FileSelector>id("a_749831900").owner(AbstractModelViewer.this));
					}

					@Override
					public void unregister() {
						super.unregister();
						if (fileSelector != null) fileSelector.unregister();
					}

					public class FileSelector extends io.intino.alexandria.ui.displays.components.SelectorComboBox<io.intino.alexandria.ui.displays.notifiers.SelectorComboBoxNotifier, B>  {

						public FileSelector(B box) {
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
		}

		public class NoFilesMessage extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

			public NoFilesMessage(B box) {
				super(box);
				_value("No files in model");
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

		public class IntinoDslEditor extends io.intino.alexandria.ui.displays.components.DisplayStamp<io.intino.alexandria.ui.displays.notifiers.DisplayStampNotifier, B>  {

			public IntinoDslEditor(B box) {
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