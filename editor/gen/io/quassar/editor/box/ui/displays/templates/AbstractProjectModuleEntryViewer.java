package io.quassar.editor.box.ui.displays.templates;

import io.intino.alexandria.core.Box;
import io.intino.alexandria.exceptions.*;
import io.intino.alexandria.ui.displays.components.*;
import io.quassar.editor.box.ui.*;

import io.quassar.editor.box.EditorBox;

import io.quassar.editor.box.ui.displays.templates.*;






import io.quassar.editor.box.ui.displays.items.*;

import io.intino.alexandria.ui.displays.notifiers.TemplateNotifier;

public abstract class AbstractProjectModuleEntryViewer<B extends Box> extends io.intino.alexandria.ui.displays.components.Template<TemplateNotifier, java.lang.Void, B> {
	public Bubble bubble;
	public TitleLink titleLink;
	public TitleText titleText;

	public AbstractProjectModuleEntryViewer(B box) {
		super(box);
		id("projectModuleEntryViewer");
	}

	@Override
	public void init() {
		super.init();
		if (bubble == null) bubble = register(new Bubble(box()).<Bubble>id("a1042030477").owner(AbstractProjectModuleEntryViewer.this));
		if (titleLink == null) titleLink = register(new TitleLink(box()).<TitleLink>id("a567378897").owner(AbstractProjectModuleEntryViewer.this));
		if (titleText == null) titleText = register(new TitleText(box()).<TitleText>id("a567613700").owner(AbstractProjectModuleEntryViewer.this));
	}

	@Override
	public void remove() {
		super.remove();
		if (bubble != null) bubble.unregister();
		if (titleLink != null) titleLink.unregister();
		if (titleText != null) titleText.unregister();
	}

	public class Bubble extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

		public Bubble(B box) {
			super(box);
			_value(" ");
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

	public class TitleLink extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B>  {

		public TitleLink(B box) {
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

	public class TitleText extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

		public TitleText(B box) {
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