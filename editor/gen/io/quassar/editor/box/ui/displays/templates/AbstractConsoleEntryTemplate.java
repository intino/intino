package io.quassar.editor.box.ui.displays.templates;

import io.intino.alexandria.core.Box;
import io.intino.alexandria.exceptions.*;
import io.intino.alexandria.ui.displays.components.*;
import io.quassar.editor.box.ui.*;

import io.quassar.editor.box.EditorBox;

import io.quassar.editor.box.ui.displays.templates.*;






import io.quassar.editor.box.ui.displays.items.*;

import io.intino.alexandria.ui.displays.notifiers.TemplateNotifier;

public abstract class AbstractConsoleEntryTemplate<B extends Box> extends io.intino.alexandria.ui.displays.components.Template<TemplateNotifier, java.lang.Void, B> {
	public InfoIcon infoIcon;
	public WarningIcon warningIcon;
	public ErrorIcon errorIcon;
	public File file;
	public Location location;
	public Content content;

	public AbstractConsoleEntryTemplate(B box) {
		super(box);
		id("consoleEntryTemplate");
	}

	@Override
	public void init() {
		super.init();
		if (infoIcon == null) infoIcon = register(new InfoIcon(box()).<InfoIcon>id("a487808082").owner(AbstractConsoleEntryTemplate.this));
		if (warningIcon == null) warningIcon = register(new WarningIcon(box()).<WarningIcon>id("a_2027150262").owner(AbstractConsoleEntryTemplate.this));
		if (errorIcon == null) errorIcon = register(new ErrorIcon(box()).<ErrorIcon>id("a1355526646").owner(AbstractConsoleEntryTemplate.this));
		if (file == null) file = register(new File(box()).<File>id("a2047082759").owner(AbstractConsoleEntryTemplate.this));
		if (location == null) location = register(new Location(box()).<Location>id("a_2083721792").owner(AbstractConsoleEntryTemplate.this));
		if (content == null) content = register(new Content(box()).<Content>id("a_2086504178").owner(AbstractConsoleEntryTemplate.this));
	}

	@Override
	public void remove() {
		super.remove();
		if (infoIcon != null) infoIcon.unregister();
		if (warningIcon != null) warningIcon.unregister();
		if (errorIcon != null) errorIcon.unregister();
		if (file != null) file.unregister();
		if (location != null) location.unregister();
		if (content != null) content.unregister();
	}

	public class InfoIcon extends io.intino.alexandria.ui.displays.components.MaterialIcon<io.intino.alexandria.ui.displays.notifiers.MaterialIconNotifier, B>  {

		public InfoIcon(B box) {
			super(box);
			_icon("Info");
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

	public class WarningIcon extends io.intino.alexandria.ui.displays.components.MaterialIcon<io.intino.alexandria.ui.displays.notifiers.MaterialIconNotifier, B>  {

		public WarningIcon(B box) {
			super(box);
			_icon("Warning");
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

	public class ErrorIcon extends io.intino.alexandria.ui.displays.components.MaterialIcon<io.intino.alexandria.ui.displays.notifiers.MaterialIconNotifier, B>  {

		public ErrorIcon(B box) {
			super(box);
			_icon("Error");
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

	public class File extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B> implements io.intino.alexandria.ui.displays.components.addressable.Addressed<File> {

		public File(B box) {
			super(box);
			_title("");
			_mode(io.intino.alexandria.ui.displays.components.Actionable.Mode.valueOf("Link"));
			_path("/models/:language/:model/:release");
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
		public File address(java.util.function.Function<String, String> addressFromPathResolver) {
			address(addressFromPathResolver.apply(path()));
			return this;
		}
	}

	public class Location extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

		public Location(B box) {
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

	public class Content extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

		public Content(B box) {
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