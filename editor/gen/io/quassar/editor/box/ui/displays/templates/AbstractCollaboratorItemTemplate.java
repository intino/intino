package io.quassar.editor.box.ui.displays.templates;

import io.intino.alexandria.core.Box;
import io.intino.alexandria.exceptions.*;
import io.intino.alexandria.ui.displays.components.*;
import io.quassar.editor.box.ui.*;

import io.quassar.editor.box.EditorBox;

import io.quassar.editor.box.ui.displays.templates.*;






import io.quassar.editor.box.ui.displays.items.*;

import io.intino.alexandria.ui.displays.notifiers.TemplateNotifier;

public abstract class AbstractCollaboratorItemTemplate<B extends Box> extends io.intino.alexandria.ui.displays.components.Template<TemplateNotifier, java.lang.Void, B> {
	public _28_1_11708786433 _28_1_11708786433;
	public CollaboratorItemTemplate._28_1_11708786433. _29_2_01696051719 _29_2_01696051719;
	public CollaboratorItemTemplate._28_1_11708786433._29_2_01696051719. Name name;
	public CollaboratorItemTemplate._28_1_11708786433._29_2_01696051719. _31_3_1808354983 _31_3_1808354983;
	public CollaboratorItemTemplate._28_1_11708786433._29_2_01696051719._31_3_1808354983. RemoveUser removeUser;

	public AbstractCollaboratorItemTemplate(B box) {
		super(box);
		id("collaboratorItemTemplate");
	}

	@Override
	public void init() {
		super.init();
		if (_28_1_11708786433 == null) _28_1_11708786433 = register(new _28_1_11708786433(box()).<_28_1_11708786433>id("a_1997166487").owner(AbstractCollaboratorItemTemplate.this));
		if (_28_1_11708786433 != null) _29_2_01696051719 = _28_1_11708786433._29_2_01696051719;
		if (_29_2_01696051719 != null) name = _28_1_11708786433._29_2_01696051719.name;
		if (_29_2_01696051719 != null) _31_3_1808354983 = _28_1_11708786433._29_2_01696051719._31_3_1808354983;
		if (_31_3_1808354983 != null) removeUser = _28_1_11708786433._29_2_01696051719._31_3_1808354983.removeUser;
	}

	@Override
	public void remove() {
		super.remove();
		if (_28_1_11708786433 != null) _28_1_11708786433.unregister();
	}

	public class _28_1_11708786433 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
		public CollaboratorItemTemplate._28_1_11708786433. _29_2_01696051719 _29_2_01696051719;

		public _28_1_11708786433(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (_29_2_01696051719 == null) _29_2_01696051719 = register(new _29_2_01696051719(box()).<_29_2_01696051719>id("a700444431").owner(AbstractCollaboratorItemTemplate.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (_29_2_01696051719 != null) _29_2_01696051719.unregister();
		}

		public class _29_2_01696051719 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public CollaboratorItemTemplate._28_1_11708786433._29_2_01696051719. Name name;
			public CollaboratorItemTemplate._28_1_11708786433._29_2_01696051719. _31_3_1808354983 _31_3_1808354983;

			public _29_2_01696051719(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (name == null) name = register(new Name(box()).<Name>id("a1878491609").owner(AbstractCollaboratorItemTemplate.this));
				if (_31_3_1808354983 == null) _31_3_1808354983 = register(new _31_3_1808354983(box()).<_31_3_1808354983>id("a_441376595").owner(AbstractCollaboratorItemTemplate.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (name != null) name.unregister();
				if (_31_3_1808354983 != null) _31_3_1808354983.unregister();
			}

			public class Name extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

				public Name(B box) {
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

			public class _31_3_1808354983 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
				public CollaboratorItemTemplate._28_1_11708786433._29_2_01696051719._31_3_1808354983. RemoveUser removeUser;

				public _31_3_1808354983(B box) {
					super(box);
				}

				@Override
				public void init() {
					super.init();
					if (removeUser == null) removeUser = register(new RemoveUser(box()).<RemoveUser>id("a_1969025563").owner(AbstractCollaboratorItemTemplate.this));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (removeUser != null) removeUser.unregister();
				}

				public class RemoveUser extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B>  {

					public RemoveUser(B box) {
						super(box);
						_title("remove access");
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
		}
	}
}