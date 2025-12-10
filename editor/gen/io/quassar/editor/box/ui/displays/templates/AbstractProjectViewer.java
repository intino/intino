package io.quassar.editor.box.ui.displays.templates;

import io.intino.alexandria.core.Box;
import io.intino.alexandria.exceptions.*;
import io.intino.alexandria.ui.displays.components.*;
import io.quassar.editor.box.ui.*;

import io.quassar.editor.box.EditorBox;

import io.quassar.editor.box.ui.displays.templates.*;






import io.quassar.editor.box.ui.displays.items.*;

import io.intino.alexandria.ui.displays.notifiers.TemplateNotifier;

public abstract class AbstractProjectViewer<B extends Box> extends io.intino.alexandria.ui.displays.components.Template<TemplateNotifier, java.lang.Void, B> {
	public _27_1_02001742698 _27_1_02001742698;
	public ProjectViewer._27_1_02001742698. Modules modules;
	public ProjectViewer._27_1_02001742698. CurrentModuleBlock currentModuleBlock;
	public ProjectModuleViewer currentModule;
	public _30_1_1625134448 _30_1_1625134448;
	public ProjectViewer._30_1_1625134448. NewModuleField newModuleField;

	public AbstractProjectViewer(B box) {
		super(box);
		id("projectViewer");
	}

	@Override
	public void init() {
		super.init();
		if (_27_1_02001742698 == null) _27_1_02001742698 = register(new _27_1_02001742698(box()).<_27_1_02001742698>id("a_831182765").owner(AbstractProjectViewer.this));
		if (_27_1_02001742698 != null) modules = _27_1_02001742698.modules;
		if (_27_1_02001742698 != null) currentModuleBlock = _27_1_02001742698.currentModuleBlock;
		if (currentModuleBlock != null) currentModule = _27_1_02001742698.currentModuleBlock.currentModule;
		if (_30_1_1625134448 == null) _30_1_1625134448 = register(new _30_1_1625134448(box()).<_30_1_1625134448>id("a_860411950").owner(AbstractProjectViewer.this));
		if (_30_1_1625134448 != null) newModuleField = _30_1_1625134448.newModuleField;
	}

	@Override
	public void remove() {
		super.remove();
		if (_27_1_02001742698 != null) _27_1_02001742698.unregister();
		if (_30_1_1625134448 != null) _30_1_1625134448.unregister();
	}

	public class _27_1_02001742698 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
		public ProjectViewer._27_1_02001742698. Modules modules;
		public ProjectViewer._27_1_02001742698. CurrentModuleBlock currentModuleBlock;

		public _27_1_02001742698(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (modules == null) modules = AbstractProjectViewer.this.modules = register(new Modules((EditorBox)box()).<Modules>id("a421038872").owner(AbstractProjectViewer.this));
			if (currentModuleBlock == null) currentModuleBlock = register(new CurrentModuleBlock(box()).<CurrentModuleBlock>id("a_874729961").owner(AbstractProjectViewer.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (modules != null) modules.unregister();
			if (currentModuleBlock != null) currentModuleBlock.unregister();
		}

		public class Modules extends io.intino.alexandria.ui.displays.components.Multiple<EditorBox,ProjectModuleLinkViewer, java.lang.Void> implements io.intino.alexandria.ui.displays.components.multiple.NonCollapsable<EditorBox,ProjectModuleLinkViewer, java.lang.Void> {

			public Modules(EditorBox box) {
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
			public ProjectModuleLinkViewer add(java.lang.Void value) {
				ProjectModuleLinkViewer child = new ProjectModuleLinkViewer(box());
				child.id(java.util.UUID.randomUUID().toString());
				add(child, "modules");
				notifyAdd(child);
				return child;
			}
			@Override
			public void remove(ProjectModuleLinkViewer child) {
				removeChild(child, "modules");
			}
			public void clear() {
				super.clear("modules");
			}
		}

		public class CurrentModuleBlock extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public ProjectModuleViewer currentModule;

			public CurrentModuleBlock(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (currentModule == null) currentModule = AbstractProjectViewer.this.currentModule = register(new ProjectModuleViewer((EditorBox)box()).id("a1548033309"));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (currentModule != null) currentModule.unregister();
			}
		}
	}

	public class _30_1_1625134448 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
		public ProjectViewer._30_1_1625134448. NewModuleField newModuleField;

		public _30_1_1625134448(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (newModuleField == null) newModuleField = register(new NewModuleField(box()).<NewModuleField>id("a1663156837").owner(AbstractProjectViewer.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (newModuleField != null) newModuleField.unregister();
		}

		public class NewModuleField extends io.intino.alexandria.ui.displays.components.TextEditable<io.intino.alexandria.ui.displays.notifiers.TextEditableNotifier, B>  {

			public NewModuleField(B box) {
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