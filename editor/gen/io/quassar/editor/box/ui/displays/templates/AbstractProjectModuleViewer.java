package io.quassar.editor.box.ui.displays.templates;

import io.intino.alexandria.core.Box;
import io.intino.alexandria.exceptions.*;
import io.intino.alexandria.ui.displays.components.*;
import io.quassar.editor.box.ui.*;

import io.quassar.editor.box.EditorBox;

import io.quassar.editor.box.ui.displays.templates.*;






import io.quassar.editor.box.ui.displays.items.*;

import io.intino.alexandria.ui.displays.notifiers.TemplateNotifier;

public abstract class AbstractProjectModuleViewer<B extends Box> extends io.intino.alexandria.ui.displays.components.Template<TemplateNotifier, java.lang.Void, B> {
	public TitleBlock titleBlock;
	public ProjectModuleViewer.TitleBlock. Back back;
	public ProjectModuleViewer.TitleBlock. ModuleName moduleName;
	public EntriesBlock entriesBlock;
	public ProjectModuleViewer.EntriesBlock. Entries entries;

	public AbstractProjectModuleViewer(B box) {
		super(box);
		id("projectModuleViewer");
	}

	@Override
	public void init() {
		super.init();
		if (titleBlock == null) titleBlock = register(new TitleBlock(box()).<TitleBlock>id("a_825484004").owner(AbstractProjectModuleViewer.this));
		if (titleBlock != null) back = titleBlock.back;
		if (titleBlock != null) moduleName = titleBlock.moduleName;
		if (entriesBlock == null) entriesBlock = register(new EntriesBlock(box()).<EntriesBlock>id("a526219300").owner(AbstractProjectModuleViewer.this));
		if (entriesBlock != null) entries = entriesBlock.entries;
	}

	@Override
	public void remove() {
		super.remove();
		if (titleBlock != null) titleBlock.unregister();
		if (entriesBlock != null) entriesBlock.unregister();
	}

	public class TitleBlock extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
		public ProjectModuleViewer.TitleBlock. Back back;
		public ProjectModuleViewer.TitleBlock. ModuleName moduleName;

		public TitleBlock(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (back == null) back = register(new Back(box()).<Back>id("a1114534442").owner(AbstractProjectModuleViewer.this));
			if (moduleName == null) moduleName = register(new ModuleName(box()).<ModuleName>id("a1037807130").owner(AbstractProjectModuleViewer.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (back != null) back.unregister();
			if (moduleName != null) moduleName.unregister();
		}

		public class Back extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B>  {

			public Back(B box) {
				super(box);
				_title("Back");
				_mode(io.intino.alexandria.ui.displays.components.Actionable.Mode.valueOf("MaterialIconButton"));
				_icon("ChevronLeft");
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

		public class ModuleName extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

			public ModuleName(B box) {
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

	public class EntriesBlock extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
		public ProjectModuleViewer.EntriesBlock. Entries entries;

		public EntriesBlock(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (entries == null) entries = AbstractProjectModuleViewer.this.entries = register(new Entries((EditorBox)box()).<Entries>id("a_1917370507").owner(AbstractProjectModuleViewer.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (entries != null) entries.unregister();
		}

		public class Entries extends io.intino.alexandria.ui.displays.components.Multiple<EditorBox,ProjectModuleEntryViewer, java.lang.Void> implements io.intino.alexandria.ui.displays.components.multiple.NonCollapsable<EditorBox,ProjectModuleEntryViewer, java.lang.Void> {

			public Entries(EditorBox box) {
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
			public ProjectModuleEntryViewer add(java.lang.Void value) {
				ProjectModuleEntryViewer child = new ProjectModuleEntryViewer(box());
				child.id(java.util.UUID.randomUUID().toString());
				add(child, "entries");
				notifyAdd(child);
				return child;
			}
			@Override
			public void remove(ProjectModuleEntryViewer child) {
				removeChild(child, "entries");
			}
			public void clear() {
				super.clear("entries");
			}
		}
	}
}