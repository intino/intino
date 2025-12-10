package io.quassar.editor.box.ui.displays.templates;

import io.intino.alexandria.core.Box;
import io.intino.alexandria.exceptions.*;
import io.intino.alexandria.ui.displays.components.*;
import io.quassar.editor.box.ui.*;

import io.quassar.editor.box.EditorBox;

import io.quassar.editor.box.ui.displays.templates.*;






import io.quassar.editor.box.ui.displays.items.*;

import io.intino.alexandria.ui.displays.notifiers.TemplateNotifier;

public abstract class AbstractModelsTemplate<B extends Box> extends io.intino.alexandria.ui.displays.components.Template<TemplateNotifier, java.lang.Void, B> {
	public ModelTrigger modelTrigger;
	public Body body;
	public ModelsTemplate.Body. ModelList modelList;
	public EmbeddedModelBlock embeddedModelBlock;
	public ModelsTemplate.EmbeddedModelBlock. _71_2_1227601139 _71_2_1227601139;
	public ModelsTemplate.EmbeddedModelBlock._71_2_1227601139. _72_3_0794451432 _72_3_0794451432;
	public ModelsTemplate.EmbeddedModelBlock._71_2_1227601139._72_3_0794451432. BackExamples backExamples;
	public ModelsTemplate.EmbeddedModelBlock._71_2_1227601139._72_3_0794451432. ModelTitle modelTitle;
	public ModelsTemplate.EmbeddedModelBlock._71_2_1227601139. _75_3_11852795459 _75_3_11852795459;
	public ModelsTemplate.EmbeddedModelBlock. _77_2_1842011258 _77_2_1842011258;
	public ModelsTemplate.EmbeddedModelBlock._77_2_1842011258. _78_3_01087237237 _78_3_01087237237;
	public ModelViewer embeddedModelPreview;

	public AbstractModelsTemplate(B box) {
		super(box);
		id("modelsTemplate");
	}

	@Override
	public void init() {
		super.init();
		if (modelTrigger == null) modelTrigger = register(new ModelTrigger(box()).<ModelTrigger>id("a37166571").owner(AbstractModelsTemplate.this));
		if (body == null) body = register(new Body(box()).<Body>id("a_959385282").owner(AbstractModelsTemplate.this));
		if (body != null) modelList = body.modelList;
		if (embeddedModelBlock == null) embeddedModelBlock = register(new EmbeddedModelBlock(box()).<EmbeddedModelBlock>id("a1543533482").owner(AbstractModelsTemplate.this));
		if (embeddedModelBlock != null) _71_2_1227601139 = embeddedModelBlock._71_2_1227601139;
		if (_71_2_1227601139 != null) _72_3_0794451432 = embeddedModelBlock._71_2_1227601139._72_3_0794451432;
		if (_72_3_0794451432 != null) backExamples = embeddedModelBlock._71_2_1227601139._72_3_0794451432.backExamples;
		if (_72_3_0794451432 != null) modelTitle = embeddedModelBlock._71_2_1227601139._72_3_0794451432.modelTitle;
		if (_71_2_1227601139 != null) _75_3_11852795459 = embeddedModelBlock._71_2_1227601139._75_3_11852795459;
		if (embeddedModelBlock != null) _77_2_1842011258 = embeddedModelBlock._77_2_1842011258;
		if (_77_2_1842011258 != null) _78_3_01087237237 = embeddedModelBlock._77_2_1842011258._78_3_01087237237;
		if (_78_3_01087237237 != null) embeddedModelPreview = embeddedModelBlock._77_2_1842011258._78_3_01087237237.embeddedModelPreview;
	}

	@Override
	public void remove() {
		super.remove();
		if (modelTrigger != null) modelTrigger.unregister();
		if (body != null) body.unregister();
		if (embeddedModelBlock != null) embeddedModelBlock.unregister();
	}

	public class ModelTrigger extends io.intino.alexandria.ui.displays.components.OpenSite<io.intino.alexandria.ui.displays.notifiers.OpenSiteNotifier, B>  {

		public ModelTrigger(B box) {
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

	public class Body extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
		public ModelsTemplate.Body. ModelList modelList;

		public Body(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (modelList == null) modelList = register(new ModelList(box()).<ModelList>id("a232806822").owner(AbstractModelsTemplate.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (modelList != null) modelList.unregister();
		}

		public class ModelList extends io.intino.alexandria.ui.displays.components.List<B, ModelItem, io.quassar.editor.model.Model>  {

			public ModelList(B box) {
				super(box);

				_pageSize(20);
			}

			@Override
			public void init() {
				super.init();
			}

			@Override
			public void unregister() {
				super.unregister();
			}

			public ModelItem create(io.quassar.editor.model.Model element) {
				ModelItem result = new ModelItem((EditorBox)box());
				result.id(java.util.UUID.randomUUID().toString());
				result.item(element);
				result.section(source().section(element));
				return result;
			}
		}
	}

	public class EmbeddedModelBlock extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
		public ModelsTemplate.EmbeddedModelBlock. _71_2_1227601139 _71_2_1227601139;
		public ModelsTemplate.EmbeddedModelBlock. _77_2_1842011258 _77_2_1842011258;

		public EmbeddedModelBlock(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (_71_2_1227601139 == null) _71_2_1227601139 = register(new _71_2_1227601139(box()).<_71_2_1227601139>id("a1696937742").owner(AbstractModelsTemplate.this));
			if (_77_2_1842011258 == null) _77_2_1842011258 = register(new _77_2_1842011258(box()).<_77_2_1842011258>id("a_418986996").owner(AbstractModelsTemplate.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (_71_2_1227601139 != null) _71_2_1227601139.unregister();
			if (_77_2_1842011258 != null) _77_2_1842011258.unregister();
		}

		public class _71_2_1227601139 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public ModelsTemplate.EmbeddedModelBlock._71_2_1227601139. _72_3_0794451432 _72_3_0794451432;
			public ModelsTemplate.EmbeddedModelBlock._71_2_1227601139. _75_3_11852795459 _75_3_11852795459;

			public _71_2_1227601139(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (_72_3_0794451432 == null) _72_3_0794451432 = register(new _72_3_0794451432(box()).<_72_3_0794451432>id("a_1162375725").owner(AbstractModelsTemplate.this));
				if (_75_3_11852795459 == null) _75_3_11852795459 = register(new _75_3_11852795459(box()).<_75_3_11852795459>id("a_224156497").owner(AbstractModelsTemplate.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (_72_3_0794451432 != null) _72_3_0794451432.unregister();
				if (_75_3_11852795459 != null) _75_3_11852795459.unregister();
			}

			public class _72_3_0794451432 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
				public ModelsTemplate.EmbeddedModelBlock._71_2_1227601139._72_3_0794451432. BackExamples backExamples;
				public ModelsTemplate.EmbeddedModelBlock._71_2_1227601139._72_3_0794451432. ModelTitle modelTitle;

				public _72_3_0794451432(B box) {
					super(box);
				}

				@Override
				public void init() {
					super.init();
					if (backExamples == null) backExamples = register(new BackExamples(box()).<BackExamples>id("a213592651").owner(AbstractModelsTemplate.this));
					if (modelTitle == null) modelTitle = register(new ModelTitle(box()).<ModelTitle>id("a_1624832150").owner(AbstractModelsTemplate.this));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (backExamples != null) backExamples.unregister();
					if (modelTitle != null) modelTitle.unregister();
				}

				public class BackExamples extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B>  {

					public BackExamples(B box) {
						super(box);
						_title("Examples");
						_mode(io.intino.alexandria.ui.displays.components.Actionable.Mode.valueOf("MaterialIconButton"));
						_icon("ArrowUpward");
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

				public class ModelTitle extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

					public ModelTitle(B box) {
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

			public class _75_3_11852795459 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {

				public _75_3_11852795459(B box) {
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

		public class _77_2_1842011258 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public ModelsTemplate.EmbeddedModelBlock._77_2_1842011258. _78_3_01087237237 _78_3_01087237237;

			public _77_2_1842011258(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (_78_3_01087237237 == null) _78_3_01087237237 = register(new _78_3_01087237237(box()).<_78_3_01087237237>id("a1275740524").owner(AbstractModelsTemplate.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (_78_3_01087237237 != null) _78_3_01087237237.unregister();
			}

			public class _78_3_01087237237 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
				public ModelViewer embeddedModelPreview;

				public _78_3_01087237237(B box) {
					super(box);
				}

				@Override
				public void init() {
					super.init();
					if (embeddedModelPreview == null) embeddedModelPreview = AbstractModelsTemplate.this.embeddedModelPreview = register(new ModelViewer((EditorBox)box()).id("a_1688540610"));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (embeddedModelPreview != null) embeddedModelPreview.unregister();
				}
			}
		}
	}
}