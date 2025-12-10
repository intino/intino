package io.quassar.editor.box.ui.displays.templates;

import io.intino.alexandria.core.Box;
import io.intino.alexandria.exceptions.*;
import io.intino.alexandria.ui.displays.components.*;
import io.quassar.editor.box.ui.*;

import io.quassar.editor.box.EditorBox;

import io.quassar.editor.box.ui.displays.templates.*;






import io.quassar.editor.box.ui.displays.items.*;

import io.intino.alexandria.ui.displays.notifiers.TemplateNotifier;

public abstract class AbstractAboutTemplate<B extends Box> extends io.intino.alexandria.ui.displays.components.Template<TemplateNotifier, java.lang.Void, B> {
	public BodyBlock bodyBlock;
	public AboutTemplate.BodyBlock. ContentBlock contentBlock;
	public AboutTemplate.BodyBlock.ContentBlock. _39_3_1843653726 _39_3_1843653726;
	public AboutTemplate.BodyBlock.ContentBlock._39_3_1843653726. AboutStamp aboutStamp;

	public AbstractAboutTemplate(B box) {
		super(box);
		id("aboutTemplate");
	}

	@Override
	public void init() {
		super.init();
		if (bodyBlock == null) bodyBlock = register(new BodyBlock(box()).<BodyBlock>id("a659505588").owner(AbstractAboutTemplate.this));
		if (bodyBlock != null) contentBlock = bodyBlock.contentBlock;
		if (contentBlock != null) _39_3_1843653726 = bodyBlock.contentBlock._39_3_1843653726;
		if (_39_3_1843653726 != null) aboutStamp = bodyBlock.contentBlock._39_3_1843653726.aboutStamp;
	}

	@Override
	public void remove() {
		super.remove();
		if (bodyBlock != null) bodyBlock.unregister();
	}

	public class BodyBlock extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
		public AboutTemplate.BodyBlock. ContentBlock contentBlock;

		public BodyBlock(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (contentBlock == null) contentBlock = register(new ContentBlock(box()).<ContentBlock>id("a1137446975").owner(AbstractAboutTemplate.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (contentBlock != null) contentBlock.unregister();
		}

		public class ContentBlock extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public AboutTemplate.BodyBlock.ContentBlock. _39_3_1843653726 _39_3_1843653726;

			public ContentBlock(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (_39_3_1843653726 == null) _39_3_1843653726 = register(new _39_3_1843653726(box()).<_39_3_1843653726>id("a548109267").owner(AbstractAboutTemplate.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (_39_3_1843653726 != null) _39_3_1843653726.unregister();
			}

			public class _39_3_1843653726 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
				public AboutTemplate.BodyBlock.ContentBlock._39_3_1843653726. AboutStamp aboutStamp;

				public _39_3_1843653726(B box) {
					super(box);
				}

				@Override
				public void init() {
					super.init();
					if (aboutStamp == null) aboutStamp = register(new AboutStamp(box()).<AboutStamp>id("a_879273648").owner(AbstractAboutTemplate.this));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (aboutStamp != null) aboutStamp.unregister();
				}

				public class AboutStamp extends io.intino.alexandria.ui.displays.components.HtmlViewer<io.intino.alexandria.ui.displays.notifiers.HtmlViewerNotifier, B>  {

					public AboutStamp(B box) {
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
}