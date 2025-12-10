package io.quassar.editor.box.ui.displays.templates;

import io.intino.alexandria.core.Box;
import io.intino.alexandria.exceptions.*;
import io.intino.alexandria.ui.displays.components.*;
import io.quassar.editor.box.ui.*;

import io.quassar.editor.box.EditorBox;

import io.quassar.editor.box.ui.displays.templates.*;






import io.quassar.editor.box.ui.displays.items.*;

import io.intino.alexandria.ui.displays.notifiers.TemplateNotifier;

public abstract class AbstractModelNameViewer<B extends Box> extends io.intino.alexandria.ui.displays.components.Template<TemplateNotifier, java.lang.Void, B> {
	public SimpleNameBlock simpleNameBlock;
	public ModelNameViewer.SimpleNameBlock. NameField nameField;
	public QualifiedNameBlock qualifiedNameBlock;
	public ModelNameViewer.QualifiedNameBlock. Project project;
	public ModelNameViewer.QualifiedNameBlock. _15_2_01887436387 _15_2_01887436387;
	public ModelNameViewer.QualifiedNameBlock. Module module;
	public ProjectBlock projectBlock;
	public ModelNameViewer.ProjectBlock. ProjectBlockHeader projectBlockHeader;
	public ModelNameViewer.ProjectBlock.ProjectBlockHeader. ProjectBlockTitle projectBlockTitle;
	public ModelNameViewer.ProjectBlock. ProjectBlockContent projectBlockContent;
	public ProjectViewer projectViewer;
	public ModuleBlock moduleBlock;
	public ModelNameViewer.ModuleBlock. ModuleBlockHeader moduleBlockHeader;
	public ModelNameViewer.ModuleBlock.ModuleBlockHeader. ModuleBlockTitle moduleBlockTitle;
	public ModelNameViewer.ModuleBlock. ModuleBlockContent moduleBlockContent;
	public ProjectModuleViewer moduleViewer;

	public AbstractModelNameViewer(B box) {
		super(box);
		id("modelNameViewer");
	}

	@Override
	public void init() {
		super.init();
		if (simpleNameBlock == null) simpleNameBlock = register(new SimpleNameBlock(box()).<SimpleNameBlock>id("a_1385223880").owner(AbstractModelNameViewer.this));
		if (simpleNameBlock != null) nameField = simpleNameBlock.nameField;
		if (qualifiedNameBlock == null) qualifiedNameBlock = register(new QualifiedNameBlock(box()).<QualifiedNameBlock>id("a960856190").owner(AbstractModelNameViewer.this));
		if (qualifiedNameBlock != null) project = qualifiedNameBlock.project;
		if (qualifiedNameBlock != null) _15_2_01887436387 = qualifiedNameBlock._15_2_01887436387;
		if (qualifiedNameBlock != null) module = qualifiedNameBlock.module;
		if (projectBlock == null) projectBlock = register(new ProjectBlock(box()).<ProjectBlock>id("a1650971628").owner(AbstractModelNameViewer.this));
		if (projectBlock != null) projectBlockHeader = projectBlock.projectBlockHeader;
		if (projectBlockHeader != null) projectBlockTitle = projectBlock.projectBlockHeader.projectBlockTitle;
		if (projectBlock != null) projectBlockContent = projectBlock.projectBlockContent;
		if (projectBlockContent != null) projectViewer = projectBlock.projectBlockContent.projectViewer;
		if (moduleBlock == null) moduleBlock = register(new ModuleBlock(box()).<ModuleBlock>id("a1018744713").owner(AbstractModelNameViewer.this));
		if (moduleBlock != null) moduleBlockHeader = moduleBlock.moduleBlockHeader;
		if (moduleBlockHeader != null) moduleBlockTitle = moduleBlock.moduleBlockHeader.moduleBlockTitle;
		if (moduleBlock != null) moduleBlockContent = moduleBlock.moduleBlockContent;
		if (moduleBlockContent != null) moduleViewer = moduleBlock.moduleBlockContent.moduleViewer;

		if (project != null) project.bindTo(projectBlock);
		if (module != null) module.bindTo(moduleBlock);
	}

	@Override
	public void remove() {
		super.remove();
		if (simpleNameBlock != null) simpleNameBlock.unregister();
		if (qualifiedNameBlock != null) qualifiedNameBlock.unregister();
		if (projectBlock != null) projectBlock.unregister();
		if (moduleBlock != null) moduleBlock.unregister();
	}

	public class SimpleNameBlock extends io.intino.alexandria.ui.displays.components.BlockConditional<io.intino.alexandria.ui.displays.notifiers.BlockConditionalNotifier, B>  {
		public ModelNameViewer.SimpleNameBlock. NameField nameField;

		public SimpleNameBlock(B box) {
			super(box);
		}

		@Override
		public void initConditional() {
			super.init();
			if (nameField == null) nameField = register(new NameField(box()).<NameField>id("a280892136").owner(AbstractModelNameViewer.this));
			if (AbstractModelNameViewer.this.nameField == null) AbstractModelNameViewer.this.nameField = simpleNameBlock.nameField;
		}

		@Override
		public void unregister() {
			super.unregister();
			if (nameField != null) nameField.unregister();
		}

		public class NameField extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

			public NameField(B box) {
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

	public class QualifiedNameBlock extends io.intino.alexandria.ui.displays.components.BlockConditional<io.intino.alexandria.ui.displays.notifiers.BlockConditionalNotifier, B>  {
		public ModelNameViewer.QualifiedNameBlock. Project project;
		public ModelNameViewer.QualifiedNameBlock. _15_2_01887436387 _15_2_01887436387;
		public ModelNameViewer.QualifiedNameBlock. Module module;

		public QualifiedNameBlock(B box) {
			super(box);
		}

		@Override
		public void initConditional() {
			super.init();
			if (project == null) project = register(new Project(box()).<Project>id("a_812379048").owner(AbstractModelNameViewer.this));
			if (_15_2_01887436387 == null) _15_2_01887436387 = register(new _15_2_01887436387(box()).<_15_2_01887436387>id("a895276551").owner(AbstractModelNameViewer.this));
			if (module == null) module = register(new Module(box()).<Module>id("a_669370035").owner(AbstractModelNameViewer.this));
			if (AbstractModelNameViewer.this.project == null) AbstractModelNameViewer.this.project = qualifiedNameBlock.project;
			if (project != null) project.bindTo(projectBlock);
			if (AbstractModelNameViewer.this._15_2_01887436387 == null) AbstractModelNameViewer.this._15_2_01887436387 = qualifiedNameBlock._15_2_01887436387;
			if (AbstractModelNameViewer.this.module == null) AbstractModelNameViewer.this.module = qualifiedNameBlock.module;
			if (module != null) module.bindTo(moduleBlock);
		}

		@Override
		public void unregister() {
			super.unregister();
			if (project != null) project.unregister();
			if (_15_2_01887436387 != null) _15_2_01887436387.unregister();
			if (module != null) module.unregister();
		}

		public class Project extends io.intino.alexandria.ui.displays.components.OpenPopover<io.intino.alexandria.ui.displays.notifiers.OpenPopoverNotifier, B>  {

			public Project(B box) {
				super(box);
				_title("");
				_mode(io.intino.alexandria.ui.displays.components.Actionable.Mode.valueOf("Link"));
				 _triggerEvent(io.intino.alexandria.ui.displays.components.OpenPopover.TriggerEvent.MouseClick);
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

		public class _15_2_01887436387 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

			public _15_2_01887436387(B box) {
				super(box);
				_value(":");
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

		public class Module extends io.intino.alexandria.ui.displays.components.OpenPopover<io.intino.alexandria.ui.displays.notifiers.OpenPopoverNotifier, B>  {

			public Module(B box) {
				super(box);
				_title("");
				_mode(io.intino.alexandria.ui.displays.components.Actionable.Mode.valueOf("Link"));
				 _triggerEvent(io.intino.alexandria.ui.displays.components.OpenPopover.TriggerEvent.MouseClick);
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

	public class ProjectBlock extends io.intino.alexandria.ui.displays.components.BlockPopover<io.intino.alexandria.ui.displays.notifiers.BlockPopoverNotifier, B>  {
		public ModelNameViewer.ProjectBlock. ProjectBlockHeader projectBlockHeader;
		public ModelNameViewer.ProjectBlock. ProjectBlockContent projectBlockContent;

		public ProjectBlock(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (projectBlockHeader == null) projectBlockHeader = register(new ProjectBlockHeader(box()).<ProjectBlockHeader>id("a639110100").owner(AbstractModelNameViewer.this));
			if (projectBlockContent == null) projectBlockContent = register(new ProjectBlockContent(box()).<ProjectBlockContent>id("a_1506200558").owner(AbstractModelNameViewer.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (projectBlockHeader != null) projectBlockHeader.unregister();
			if (projectBlockContent != null) projectBlockContent.unregister();
		}

		public class ProjectBlockHeader extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public ModelNameViewer.ProjectBlock.ProjectBlockHeader. ProjectBlockTitle projectBlockTitle;

			public ProjectBlockHeader(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (projectBlockTitle == null) projectBlockTitle = register(new ProjectBlockTitle(box()).<ProjectBlockTitle>id("a_324255207").owner(AbstractModelNameViewer.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (projectBlockTitle != null) projectBlockTitle.unregister();
			}

			public class ProjectBlockTitle extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

				public ProjectBlockTitle(B box) {
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

		public class ProjectBlockContent extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public ProjectViewer projectViewer;

			public ProjectBlockContent(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (projectViewer == null) projectViewer = AbstractModelNameViewer.this.projectViewer = register(new ProjectViewer((EditorBox)box()).id("a988377374"));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (projectViewer != null) projectViewer.unregister();
			}
		}
	}

	public class ModuleBlock extends io.intino.alexandria.ui.displays.components.BlockPopover<io.intino.alexandria.ui.displays.notifiers.BlockPopoverNotifier, B>  {
		public ModelNameViewer.ModuleBlock. ModuleBlockHeader moduleBlockHeader;
		public ModelNameViewer.ModuleBlock. ModuleBlockContent moduleBlockContent;

		public ModuleBlock(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (moduleBlockHeader == null) moduleBlockHeader = register(new ModuleBlockHeader(box()).<ModuleBlockHeader>id("a_308444104").owner(AbstractModelNameViewer.this));
			if (moduleBlockContent == null) moduleBlockContent = register(new ModuleBlockContent(box()).<ModuleBlockContent>id("a_815609810").owner(AbstractModelNameViewer.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (moduleBlockHeader != null) moduleBlockHeader.unregister();
			if (moduleBlockContent != null) moduleBlockContent.unregister();
		}

		public class ModuleBlockHeader extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public ModelNameViewer.ModuleBlock.ModuleBlockHeader. ModuleBlockTitle moduleBlockTitle;

			public ModuleBlockHeader(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (moduleBlockTitle == null) moduleBlockTitle = register(new ModuleBlockTitle(box()).<ModuleBlockTitle>id("a_2057404802").owner(AbstractModelNameViewer.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (moduleBlockTitle != null) moduleBlockTitle.unregister();
			}

			public class ModuleBlockTitle extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

				public ModuleBlockTitle(B box) {
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

		public class ModuleBlockContent extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public ProjectModuleViewer moduleViewer;

			public ModuleBlockContent(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (moduleViewer == null) moduleViewer = AbstractModelNameViewer.this.moduleViewer = register(new ProjectModuleViewer((EditorBox)box()).id("a1848385551"));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (moduleViewer != null) moduleViewer.unregister();
			}
		}
	}
}