package io.quassar.editor.box.ui.displays.templates;

import io.intino.alexandria.core.Box;
import io.intino.alexandria.exceptions.*;
import io.intino.alexandria.ui.displays.components.*;
import io.quassar.editor.box.ui.*;

import io.quassar.editor.box.EditorBox;

import io.quassar.editor.box.ui.displays.templates.*;






import io.quassar.editor.box.ui.displays.items.*;

import io.intino.alexandria.ui.displays.notifiers.TemplateNotifier;

public abstract class AbstractLoginSelectorOption<B extends Box> extends io.intino.alexandria.ui.displays.components.Template<TemplateNotifier, java.lang.Void, B> {
	public _115_1_11609682065 _115_1_11609682065;
	public LoginSelectorOption._115_1_11609682065. Username username;
	public _116_1_015388454 _116_1_015388454;
	public LoginSelectorOption._116_1_015388454. RemoveUser removeUser;

	public AbstractLoginSelectorOption(B box) {
		super(box);
		id("loginSelectorOption");
	}

	@Override
	public void init() {
		super.init();
		if (_115_1_11609682065 == null) _115_1_11609682065 = register(new _115_1_11609682065(box()).<_115_1_11609682065>id("a_1792013304").owner(AbstractLoginSelectorOption.this));
		if (_115_1_11609682065 != null) username = _115_1_11609682065.username;
		if (_116_1_015388454 == null) _116_1_015388454 = register(new _116_1_015388454(box()).<_116_1_015388454>id("a691825727").owner(AbstractLoginSelectorOption.this));
		if (_116_1_015388454 != null) removeUser = _116_1_015388454.removeUser;
	}

	@Override
	public void remove() {
		super.remove();
		if (_115_1_11609682065 != null) _115_1_11609682065.unregister();
		if (_116_1_015388454 != null) _116_1_015388454.unregister();
	}

	public class _115_1_11609682065 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
		public LoginSelectorOption._115_1_11609682065. Username username;

		public _115_1_11609682065(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (username == null) username = register(new Username(box()).<Username>id("a_432655719").owner(AbstractLoginSelectorOption.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (username != null) username.unregister();
		}

		public class Username extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

			public Username(B box) {
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

	public class _116_1_015388454 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
		public LoginSelectorOption._116_1_015388454. RemoveUser removeUser;

		public _116_1_015388454(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (removeUser == null) removeUser = register(new RemoveUser(box()).<RemoveUser>id("a_924678895").owner(AbstractLoginSelectorOption.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (removeUser != null) removeUser.unregister();
		}

		public class RemoveUser extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B>  {

			public RemoveUser(B box) {
				super(box);
				_title("Remove");
				_mode(io.intino.alexandria.ui.displays.components.Actionable.Mode.valueOf("MaterialIconButton"));
				_icon("Clear");
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