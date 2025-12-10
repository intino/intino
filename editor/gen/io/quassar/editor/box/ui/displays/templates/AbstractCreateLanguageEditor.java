package io.quassar.editor.box.ui.displays.templates;

import io.intino.alexandria.core.Box;
import io.intino.alexandria.exceptions.*;
import io.intino.alexandria.ui.displays.components.*;
import io.quassar.editor.box.ui.*;

import io.quassar.editor.box.EditorBox;

import io.quassar.editor.box.ui.displays.templates.*;






import io.quassar.editor.box.ui.displays.items.*;

import io.intino.alexandria.ui.displays.notifiers.TemplateNotifier;

public abstract class AbstractCreateLanguageEditor<B extends Box> extends io.intino.alexandria.ui.displays.components.Template<TemplateNotifier, java.lang.Void, B> {
	public _169_1_0833159424 _169_1_0833159424;
	public CreateLanguageEditor._169_1_0833159424. MetamodelTitle metamodelTitle;
	public CreateLanguageEditor._169_1_0833159424. _171_2_11516252117 _171_2_11516252117;
	public LanguageEditor editorStamp;
	public _173_1_1219358073 _173_1_1219358073;
	public CreateLanguageEditor._173_1_1219358073. _174_2_11032096255 _174_2_11032096255;
	public CreateLanguageEditor._173_1_1219358073._174_2_11032096255. Create create;

	public AbstractCreateLanguageEditor(B box) {
		super(box);
		id("createLanguageEditor");
	}

	@Override
	public void init() {
		super.init();
		if (_169_1_0833159424 == null) _169_1_0833159424 = register(new _169_1_0833159424(box()).<_169_1_0833159424>id("a1083498850").owner(AbstractCreateLanguageEditor.this));
		if (_169_1_0833159424 != null) metamodelTitle = _169_1_0833159424.metamodelTitle;
		if (_169_1_0833159424 != null) _171_2_11516252117 = _169_1_0833159424._171_2_11516252117;
		if (_169_1_0833159424 != null) editorStamp = _169_1_0833159424.editorStamp;
		if (_173_1_1219358073 == null) _173_1_1219358073 = register(new _173_1_1219358073(box()).<_173_1_1219358073>id("a989372735").owner(AbstractCreateLanguageEditor.this));
		if (_173_1_1219358073 != null) _174_2_11032096255 = _173_1_1219358073._174_2_11032096255;
		if (_174_2_11032096255 != null) create = _173_1_1219358073._174_2_11032096255.create;
	}

	@Override
	public void remove() {
		super.remove();
		if (_169_1_0833159424 != null) _169_1_0833159424.unregister();
		if (_173_1_1219358073 != null) _173_1_1219358073.unregister();
	}

	public class _169_1_0833159424 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
		public CreateLanguageEditor._169_1_0833159424. MetamodelTitle metamodelTitle;
		public CreateLanguageEditor._169_1_0833159424. _171_2_11516252117 _171_2_11516252117;
		public LanguageEditor editorStamp;

		public _169_1_0833159424(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (metamodelTitle == null) metamodelTitle = register(new MetamodelTitle(box()).<MetamodelTitle>id("a_142095738").owner(AbstractCreateLanguageEditor.this));
			if (_171_2_11516252117 == null) _171_2_11516252117 = register(new _171_2_11516252117(box()).<_171_2_11516252117>id("a_2104817548").owner(AbstractCreateLanguageEditor.this));
			if (editorStamp == null) editorStamp = AbstractCreateLanguageEditor.this.editorStamp = register(new LanguageEditor((EditorBox)box()).id("a_2059687548"));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (metamodelTitle != null) metamodelTitle.unregister();
			if (_171_2_11516252117 != null) _171_2_11516252117.unregister();
			if (editorStamp != null) editorStamp.unregister();
		}

		public class MetamodelTitle extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

			public MetamodelTitle(B box) {
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

		public class _171_2_11516252117 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

			public _171_2_11516252117(B box) {
				super(box);
				_value("You are about to create a new DSL associated with %s. To ensure uniqueness and proper organization, please provide the following details.");
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

	public class _173_1_1219358073 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
		public CreateLanguageEditor._173_1_1219358073. _174_2_11032096255 _174_2_11032096255;

		public _173_1_1219358073(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (_174_2_11032096255 == null) _174_2_11032096255 = register(new _174_2_11032096255(box()).<_174_2_11032096255>id("a_959429392").owner(AbstractCreateLanguageEditor.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (_174_2_11032096255 != null) _174_2_11032096255.unregister();
		}

		public class _174_2_11032096255 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public CreateLanguageEditor._173_1_1219358073._174_2_11032096255. Create create;

			public _174_2_11032096255(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (create == null) create = register(new Create(box()).<Create>id("a1920232211").owner(AbstractCreateLanguageEditor.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (create != null) create.unregister();
			}

			public class Create extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B>  {

				public Create(B box) {
					super(box);
					_title("Create");
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
}