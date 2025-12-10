package io.quassar.editor.box.ui.displays.templates;

import io.intino.alexandria.core.Box;
import io.intino.alexandria.exceptions.*;
import io.intino.alexandria.ui.displays.components.*;
import io.quassar.editor.box.ui.*;

import io.quassar.editor.box.EditorBox;

import io.quassar.editor.box.ui.displays.templates.*;






import io.quassar.editor.box.ui.displays.items.*;

import io.intino.alexandria.ui.displays.notifiers.TemplateNotifier;

public abstract class AbstractReleaseSelectorOption<B extends Box> extends io.intino.alexandria.ui.displays.components.Template<TemplateNotifier, java.lang.Void, B> {
	public ContentBlock contentBlock;
	public ReleaseSelectorOption.ContentBlock. _215_2_1705318263 _215_2_1705318263;
	public ReleaseSelectorOption.ContentBlock._215_2_1705318263. Version version;
	public ReleaseSelectorOption.ContentBlock. _216_2_1257020672 _216_2_1257020672;
	public ReleaseSelectorOption.ContentBlock._216_2_1257020672. Remove remove;

	public AbstractReleaseSelectorOption(B box) {
		super(box);
		id("releaseSelectorOption");
	}

	@Override
	public void init() {
		super.init();
		if (contentBlock == null) contentBlock = register(new ContentBlock(box()).<ContentBlock>id("a_1844029225").owner(AbstractReleaseSelectorOption.this));
		if (contentBlock != null) _215_2_1705318263 = contentBlock._215_2_1705318263;
		if (_215_2_1705318263 != null) version = contentBlock._215_2_1705318263.version;
		if (contentBlock != null) _216_2_1257020672 = contentBlock._216_2_1257020672;
		if (_216_2_1257020672 != null) remove = contentBlock._216_2_1257020672.remove;
	}

	@Override
	public void remove() {
		super.remove();
		if (contentBlock != null) contentBlock.unregister();
	}

	public class ContentBlock extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
		public ReleaseSelectorOption.ContentBlock. _215_2_1705318263 _215_2_1705318263;
		public ReleaseSelectorOption.ContentBlock. _216_2_1257020672 _216_2_1257020672;

		public ContentBlock(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (_215_2_1705318263 == null) _215_2_1705318263 = register(new _215_2_1705318263(box()).<_215_2_1705318263>id("a1384464365").owner(AbstractReleaseSelectorOption.this));
			if (_216_2_1257020672 == null) _216_2_1257020672 = register(new _216_2_1257020672(box()).<_216_2_1257020672>id("a_1154797774").owner(AbstractReleaseSelectorOption.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (_215_2_1705318263 != null) _215_2_1705318263.unregister();
			if (_216_2_1257020672 != null) _216_2_1257020672.unregister();
		}

		public class _215_2_1705318263 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public ReleaseSelectorOption.ContentBlock._215_2_1705318263. Version version;

			public _215_2_1705318263(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (version == null) version = register(new Version(box()).<Version>id("a_684125858").owner(AbstractReleaseSelectorOption.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (version != null) version.unregister();
			}

			public class Version extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B> implements io.intino.alexandria.ui.displays.components.addressable.Addressed<Version> {

				public Version(B box) {
					super(box);
					_title("");
					_mode(io.intino.alexandria.ui.displays.components.Actionable.Mode.valueOf("Link"));
					_path("/forge/:model/:release");
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
				public Version address(java.util.function.Function<String, String> addressFromPathResolver) {
					address(addressFromPathResolver.apply(path()));
					return this;
				}
			}
		}

		public class _216_2_1257020672 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public ReleaseSelectorOption.ContentBlock._216_2_1257020672. Remove remove;

			public _216_2_1257020672(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (remove == null) remove = register(new Remove(box()).<Remove>id("a_748893091").owner(AbstractReleaseSelectorOption.this));
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
					_mode(io.intino.alexandria.ui.displays.components.Actionable.Mode.valueOf("Link"));
					_signMode(io.intino.alexandria.ui.displays.components.Actionable.SignMode.valueOf("SimpleText"));
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
}