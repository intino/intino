package io.quassar.editor.box.ui.displays.templates;

import io.intino.alexandria.core.Box;
import io.intino.alexandria.exceptions.*;
import io.intino.alexandria.ui.displays.components.*;
import io.quassar.editor.box.ui.*;

import io.quassar.editor.box.EditorBox;

import io.quassar.editor.box.ui.displays.templates.*;






import io.quassar.editor.box.ui.displays.items.*;

import io.intino.alexandria.ui.displays.notifiers.TemplateNotifier;

public abstract class AbstractCollaboratorsTemplate<B extends Box> extends io.intino.alexandria.ui.displays.components.Template<TemplateNotifier, java.lang.Void, B> {
	public _7_1_065509239 _7_1_065509239;
	public CollaboratorsTemplate._7_1_065509239. _8_2_12042572468 _8_2_12042572468;
	public CollaboratorsTemplate._7_1_065509239. _15_2_1673451239 _15_2_1673451239;
	public CollaboratorsTemplate._7_1_065509239. PeopleField peopleField;
	public CollaboratorsTemplate._7_1_065509239. _17_2_147340341 _17_2_147340341;
	public CollaboratorsTemplate._7_1_065509239._17_2_147340341. Invite invite;
	public _19_1_0410555415 _19_1_0410555415;
	public CollaboratorsTemplate._19_1_0410555415. _20_2_01133423695 _20_2_01133423695;
	public CollaboratorsTemplate._19_1_0410555415. OwnerField ownerField;
	public _23_1_01850518532 _23_1_01850518532;
	public CollaboratorsTemplate._23_1_01850518532. CollaboratorsTitle collaboratorsTitle;
	public CollaboratorsTemplate._23_1_01850518532. Collaborators collaborators;

	public AbstractCollaboratorsTemplate(B box) {
		super(box);
		id("collaboratorsTemplate");
	}

	@Override
	public void init() {
		super.init();
		if (_7_1_065509239 == null) _7_1_065509239 = register(new _7_1_065509239(box()).<_7_1_065509239>id("a1979539147").owner(AbstractCollaboratorsTemplate.this));
		if (_7_1_065509239 != null) _8_2_12042572468 = _7_1_065509239._8_2_12042572468;
		if (_7_1_065509239 != null) _15_2_1673451239 = _7_1_065509239._15_2_1673451239;
		if (_7_1_065509239 != null) peopleField = _7_1_065509239.peopleField;
		if (_7_1_065509239 != null) _17_2_147340341 = _7_1_065509239._17_2_147340341;
		if (_17_2_147340341 != null) invite = _7_1_065509239._17_2_147340341.invite;
		if (_19_1_0410555415 == null) _19_1_0410555415 = register(new _19_1_0410555415(box()).<_19_1_0410555415>id("a629320035").owner(AbstractCollaboratorsTemplate.this));
		if (_19_1_0410555415 != null) _20_2_01133423695 = _19_1_0410555415._20_2_01133423695;
		if (_19_1_0410555415 != null) ownerField = _19_1_0410555415.ownerField;
		if (_23_1_01850518532 == null) _23_1_01850518532 = register(new _23_1_01850518532(box()).<_23_1_01850518532>id("a_2131569786").owner(AbstractCollaboratorsTemplate.this));
		if (_23_1_01850518532 != null) collaboratorsTitle = _23_1_01850518532.collaboratorsTitle;
		if (_23_1_01850518532 != null) collaborators = _23_1_01850518532.collaborators;
	}

	@Override
	public void remove() {
		super.remove();
		if (_7_1_065509239 != null) _7_1_065509239.unregister();
		if (_19_1_0410555415 != null) _19_1_0410555415.unregister();
		if (_23_1_01850518532 != null) _23_1_01850518532.unregister();
	}

	public class _7_1_065509239 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
		public CollaboratorsTemplate._7_1_065509239. _8_2_12042572468 _8_2_12042572468;
		public CollaboratorsTemplate._7_1_065509239. _15_2_1673451239 _15_2_1673451239;
		public CollaboratorsTemplate._7_1_065509239. PeopleField peopleField;
		public CollaboratorsTemplate._7_1_065509239. _17_2_147340341 _17_2_147340341;

		public _7_1_065509239(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (_8_2_12042572468 == null) _8_2_12042572468 = register(new _8_2_12042572468(box()).<_8_2_12042572468>id("a_1551695859").owner(AbstractCollaboratorsTemplate.this));
			if (_15_2_1673451239 == null) _15_2_1673451239 = register(new _15_2_1673451239(box()).<_15_2_1673451239>id("a1678744767").owner(AbstractCollaboratorsTemplate.this));
			if (peopleField == null) peopleField = register(new PeopleField(box()).<PeopleField>id("a_1085528514").owner(AbstractCollaboratorsTemplate.this));
			if (_17_2_147340341 == null) _17_2_147340341 = register(new _17_2_147340341(box()).<_17_2_147340341>id("a_970379295").owner(AbstractCollaboratorsTemplate.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (_8_2_12042572468 != null) _8_2_12042572468.unregister();
			if (_15_2_1673451239 != null) _15_2_1673451239.unregister();
			if (peopleField != null) peopleField.unregister();
			if (_17_2_147340341 != null) _17_2_147340341.unregister();
		}

		public class _8_2_12042572468 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

			public _8_2_12042572468(B box) {
				super(box);
				_value("Add people");
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

		public class _15_2_1673451239 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

			public _15_2_1673451239(B box) {
				super(box);
				_value("Add a list of emails separated by either semicolon or newline");
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

		public class PeopleField extends io.intino.alexandria.ui.displays.components.TextEditable<io.intino.alexandria.ui.displays.notifiers.TextEditableNotifier, B>  {

			public PeopleField(B box) {
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

		public class _17_2_147340341 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public CollaboratorsTemplate._7_1_065509239._17_2_147340341. Invite invite;

			public _17_2_147340341(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (invite == null) invite = register(new Invite(box()).<Invite>id("a_891681320").owner(AbstractCollaboratorsTemplate.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (invite != null) invite.unregister();
			}

			public class Invite extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B>  {

				public Invite(B box) {
					super(box);
					_title("Invite");
					_readonly(true);
					_mode(io.intino.alexandria.ui.displays.components.Actionable.Mode.valueOf("Button"));
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

	public class _19_1_0410555415 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
		public CollaboratorsTemplate._19_1_0410555415. _20_2_01133423695 _20_2_01133423695;
		public CollaboratorsTemplate._19_1_0410555415. OwnerField ownerField;

		public _19_1_0410555415(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (_20_2_01133423695 == null) _20_2_01133423695 = register(new _20_2_01133423695(box()).<_20_2_01133423695>id("a_1703508592").owner(AbstractCollaboratorsTemplate.this));
			if (ownerField == null) ownerField = register(new OwnerField(box()).<OwnerField>id("a_1261552843").owner(AbstractCollaboratorsTemplate.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (_20_2_01133423695 != null) _20_2_01133423695.unregister();
			if (ownerField != null) ownerField.unregister();
		}

		public class _20_2_01133423695 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

			public _20_2_01133423695(B box) {
				super(box);
				_value("Owner");
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

		public class OwnerField extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

			public OwnerField(B box) {
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

	public class _23_1_01850518532 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
		public CollaboratorsTemplate._23_1_01850518532. CollaboratorsTitle collaboratorsTitle;
		public CollaboratorsTemplate._23_1_01850518532. Collaborators collaborators;

		public _23_1_01850518532(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (collaboratorsTitle == null) collaboratorsTitle = register(new CollaboratorsTitle(box()).<CollaboratorsTitle>id("a_1827944992").owner(AbstractCollaboratorsTemplate.this));
			if (collaborators == null) collaborators = AbstractCollaboratorsTemplate.this.collaborators = register(new Collaborators((EditorBox)box()).<Collaborators>id("a1536279384").owner(AbstractCollaboratorsTemplate.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (collaboratorsTitle != null) collaboratorsTitle.unregister();
			if (collaborators != null) collaborators.unregister();
		}

		public class CollaboratorsTitle extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

			public CollaboratorsTitle(B box) {
				super(box);
				_value("Collaborators");
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

		public class Collaborators extends io.intino.alexandria.ui.displays.components.Multiple<EditorBox,CollaboratorItemTemplate, java.lang.Void> implements io.intino.alexandria.ui.displays.components.multiple.NonCollapsable<EditorBox,CollaboratorItemTemplate, java.lang.Void> {

			public Collaborators(EditorBox box) {
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

			@Override
			public CollaboratorItemTemplate add(java.lang.Void value) {
				CollaboratorItemTemplate child = new CollaboratorItemTemplate(box());
				child.id(java.util.UUID.randomUUID().toString());
				add(child, "collaborators");
				notifyAdd(child);
				return child;
			}
			@Override
			public void remove(CollaboratorItemTemplate child) {
				removeChild(child, "collaborators");
			}
			public void clear() {
				super.clear("collaborators");
			}
		}
	}
}