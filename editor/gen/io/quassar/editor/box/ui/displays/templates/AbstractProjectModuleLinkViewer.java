package io.quassar.editor.box.ui.displays.templates;

import io.intino.alexandria.core.Box;
import io.intino.alexandria.exceptions.*;
import io.intino.alexandria.ui.displays.components.*;
import io.quassar.editor.box.ui.*;

import io.quassar.editor.box.EditorBox;

import io.quassar.editor.box.ui.displays.templates.*;






import io.quassar.editor.box.ui.displays.items.*;

import io.intino.alexandria.ui.displays.notifiers.TemplateNotifier;

public abstract class AbstractProjectModuleLinkViewer<B extends Box> extends io.intino.alexandria.ui.displays.components.Template<TemplateNotifier, java.lang.Void, B> {
	public Bubble bubble;
	public ModuleLink moduleLink;
	public ModuleText moduleText;

	public AbstractProjectModuleLinkViewer(B box) {
		super(box);
		id("projectModuleLinkViewer");
	}

	@Override
	public void init() {
		super.init();
		if (bubble == null) bubble = register(new Bubble(box()).<Bubble>id("a_2098373319").owner(AbstractProjectModuleLinkViewer.this));
		if (moduleLink == null) moduleLink = register(new ModuleLink(box()).<ModuleLink>id("a681852595").owner(AbstractProjectModuleLinkViewer.this));
		if (moduleText == null) moduleText = register(new ModuleText(box()).<ModuleText>id("a682087398").owner(AbstractProjectModuleLinkViewer.this));
	}

	@Override
	public void remove() {
		super.remove();
		if (bubble != null) bubble.unregister();
		if (moduleLink != null) moduleLink.unregister();
		if (moduleText != null) moduleText.unregister();
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

	public class ModuleLink extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B>  {

		public ModuleLink(B box) {
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

	public class ModuleText extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

		public ModuleText(B box) {
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