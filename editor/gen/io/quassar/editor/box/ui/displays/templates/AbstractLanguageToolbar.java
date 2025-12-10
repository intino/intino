package io.quassar.editor.box.ui.displays.templates;

import io.intino.alexandria.core.Box;
import io.intino.alexandria.exceptions.*;
import io.intino.alexandria.ui.displays.components.*;
import io.quassar.editor.box.ui.*;

import io.quassar.editor.box.EditorBox;

import io.quassar.editor.box.ui.displays.templates.*;






import io.quassar.editor.box.ui.displays.items.*;

import io.intino.alexandria.ui.displays.notifiers.TemplateNotifier;

public abstract class AbstractLanguageToolbar<B extends Box> extends io.intino.alexandria.ui.displays.components.Template<TemplateNotifier, java.lang.Void, B> {
	public AboutText aboutText;
	public AboutLink aboutLink;
	public HelpText helpText;
	public HelpLink helpLink;
	public ExamplesText examplesText;
	public ExamplesLink examplesLink;
	public LanguageLogo languageLogo;

	public AbstractLanguageToolbar(B box) {
		super(box);
		id("languageToolbar");
	}

	@Override
	public void init() {
		super.init();
		if (aboutText == null) aboutText = register(new AboutText(box()).<AboutText>id("a678991519").owner(AbstractLanguageToolbar.this));
		if (aboutLink == null) aboutLink = register(new AboutLink(box()).<AboutLink>id("a678756716").owner(AbstractLanguageToolbar.this));
		if (helpText == null) helpText = register(new HelpText(box()).<HelpText>id("a_1833034967").owner(AbstractLanguageToolbar.this));
		if (helpLink == null) helpLink = register(new HelpLink(box()).<HelpLink>id("a_1833269770").owner(AbstractLanguageToolbar.this));
		if (examplesText == null) examplesText = register(new ExamplesText(box()).<ExamplesText>id("a_352084303").owner(AbstractLanguageToolbar.this));
		if (examplesLink == null) examplesLink = register(new ExamplesLink(box()).<ExamplesLink>id("a_352319106").owner(AbstractLanguageToolbar.this));
		if (languageLogo == null) languageLogo = register(new LanguageLogo(box()).<LanguageLogo>id("a1922397886").owner(AbstractLanguageToolbar.this));
	}

	@Override
	public void remove() {
		super.remove();
		if (aboutText != null) aboutText.unregister();
		if (aboutLink != null) aboutLink.unregister();
		if (helpText != null) helpText.unregister();
		if (helpLink != null) helpLink.unregister();
		if (examplesText != null) examplesText.unregister();
		if (examplesLink != null) examplesLink.unregister();
		if (languageLogo != null) languageLogo.unregister();
	}

	public class AboutText extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

		public AboutText(B box) {
			super(box);
			_value("");
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

	public class AboutLink extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B> implements io.intino.alexandria.ui.displays.components.addressable.Addressed<AboutLink> {

		public AboutLink(B box) {
			super(box);
			_title("");
			_mode(io.intino.alexandria.ui.displays.components.Actionable.Mode.valueOf("Link"));
			_path("/models/:language");
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
		public AboutLink address(java.util.function.Function<String, String> addressFromPathResolver) {
			address(addressFromPathResolver.apply(path()));
			return this;
		}
	}

	public class HelpText extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

		public HelpText(B box) {
			super(box);
			_value("help");
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

	public class HelpLink extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B> implements io.intino.alexandria.ui.displays.components.addressable.Addressed<HelpLink> {

		public HelpLink(B box) {
			super(box);
			_title("help");
			_mode(io.intino.alexandria.ui.displays.components.Actionable.Mode.valueOf("Link"));
			_path("/models/:language");
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
		public HelpLink address(java.util.function.Function<String, String> addressFromPathResolver) {
			address(addressFromPathResolver.apply(path()));
			return this;
		}
	}

	public class ExamplesText extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

		public ExamplesText(B box) {
			super(box);
			_value("examples");
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

	public class ExamplesLink extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B> implements io.intino.alexandria.ui.displays.components.addressable.Addressed<ExamplesLink> {

		public ExamplesLink(B box) {
			super(box);
			_title("examples");
			_mode(io.intino.alexandria.ui.displays.components.Actionable.Mode.valueOf("Link"));
			_path("/models/:language");
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
		public ExamplesLink address(java.util.function.Function<String, String> addressFromPathResolver) {
			address(addressFromPathResolver.apply(path()));
			return this;
		}
	}

	public class LanguageLogo extends io.intino.alexandria.ui.displays.components.Image<io.intino.alexandria.ui.displays.notifiers.ImageNotifier, B>  {

		public LanguageLogo(B box) {
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