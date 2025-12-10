package io.quassar.editor.box.ui.displays.templates;

import io.intino.alexandria.core.Box;
import io.intino.alexandria.exceptions.*;
import io.intino.alexandria.ui.displays.components.*;
import io.quassar.editor.box.ui.*;

import io.quassar.editor.box.EditorBox;

import io.quassar.editor.box.ui.displays.templates.*;






import io.quassar.editor.box.ui.displays.items.*;

import io.intino.alexandria.ui.displays.notifiers.TemplateNotifier;

public abstract class AbstractLanguageEditor<B extends Box> extends io.intino.alexandria.ui.displays.components.Template<TemplateNotifier, java.lang.Void, B> {
	public Change change;
	public _179_1_11037602426 _179_1_11037602426;
	public LanguageEditor._179_1_11037602426. _180_2_1147200173 _180_2_1147200173;
	public LanguageEditor._179_1_11037602426._180_2_1147200173. _181_3_01249478481 _181_3_01249478481;
	public LanguageEditor._179_1_11037602426._180_2_1147200173._181_3_01249478481. _182_4_1530601168 _182_4_1530601168;
	public LanguageEditor._179_1_11037602426._180_2_1147200173._181_3_01249478481. _183_4_1659900887 _183_4_1659900887;
	public LanguageEditor._179_1_11037602426._180_2_1147200173._181_3_01249478481._183_4_1659900887. _184_5_01865913467 _184_5_01865913467;
	public LanguageEditor._179_1_11037602426._180_2_1147200173._181_3_01249478481._183_4_1659900887._184_5_01865913467. CollectionSelector collectionSelector;
	public LanguageEditor._179_1_11037602426._180_2_1147200173._181_3_01249478481._183_4_1659900887. _185_5_12046938537 _185_5_12046938537;
	public LanguageEditor._179_1_11037602426._180_2_1147200173._181_3_01249478481._183_4_1659900887. CollectionPopover collectionPopover;
	public LanguageEditor._179_1_11037602426._180_2_1147200173._181_3_01249478481._183_4_1659900887.CollectionPopover. _187_6_11079806553 _187_6_11079806553;
	public LanguageEditor._179_1_11037602426._180_2_1147200173._181_3_01249478481. _188_4_01914737377 _188_4_01914737377;
	public CreateCollectionDialog createCollectionDialog;
	public LanguageEditor._179_1_11037602426._180_2_1147200173. _190_3_1454880423 _190_3_1454880423;
	public LanguageEditor._179_1_11037602426._180_2_1147200173._190_3_1454880423. _191_4_11811015619 _191_4_11811015619;
	public LanguageEditor._179_1_11037602426._180_2_1147200173._190_3_1454880423. _192_4_1796748977 _192_4_1796748977;
	public LanguageEditor._179_1_11037602426._180_2_1147200173._190_3_1454880423._192_4_1796748977. _193_5_01702838083 _193_5_01702838083;
	public LanguageEditor._179_1_11037602426._180_2_1147200173._190_3_1454880423._192_4_1796748977._193_5_01702838083. NameField nameField;
	public LanguageEditor._179_1_11037602426._180_2_1147200173._190_3_1454880423._192_4_1796748977._193_5_01702838083. ValidNameIcon validNameIcon;
	public LanguageEditor._179_1_11037602426._180_2_1147200173._190_3_1454880423._192_4_1796748977._193_5_01702838083. InvalidNameIcon invalidNameIcon;
	public LanguageEditor._179_1_11037602426._180_2_1147200173._190_3_1454880423._192_4_1796748977. _197_5_01545824650 _197_5_01545824650;
	public LanguageEditor._179_1_11037602426._180_2_1147200173._190_3_1454880423._192_4_1796748977. NamePopover namePopover;
	public LanguageEditor._179_1_11037602426._180_2_1147200173._190_3_1454880423._192_4_1796748977.NamePopover. _199_6_1590903778 _199_6_1590903778;
	public LanguageEditor._179_1_11037602426._180_2_1147200173. _201_3_01539068345 _201_3_01539068345;
	public LanguageEditor._179_1_11037602426._180_2_1147200173._201_3_01539068345. _202_4_1895138337 _202_4_1895138337;
	public LanguageEditor._179_1_11037602426._180_2_1147200173._201_3_01539068345. _203_4_11044444361 _203_4_11044444361;
	public LanguageEditor._179_1_11037602426._180_2_1147200173._201_3_01539068345._203_4_11044444361. PrivateField privateField;
	public LanguageEditor._179_1_11037602426._180_2_1147200173._201_3_01539068345._203_4_11044444361. _205_5_01981923664 _205_5_01981923664;
	public LanguageEditor._179_1_11037602426._180_2_1147200173._201_3_01539068345._203_4_11044444361. PrivatePopover privatePopover;
	public LanguageEditor._179_1_11037602426._180_2_1147200173._201_3_01539068345._203_4_11044444361.PrivatePopover. _207_6_113558356 _207_6_113558356;
	public LanguageEditor._179_1_11037602426. _209_2_0204546263 _209_2_0204546263;
	public LanguageLogoDialog languageLogoDialog;
	public _212_1_02067479274 _212_1_02067479274;
	public LanguageEditor._212_1_02067479274. Message message;

	public AbstractLanguageEditor(B box) {
		super(box);
		id("languageEditor");
	}

	@Override
	public void init() {
		super.init();
		if (change == null) change = register(new Change(box()).<Change>id("a_99289269").owner(AbstractLanguageEditor.this));
		if (_179_1_11037602426 == null) _179_1_11037602426 = register(new _179_1_11037602426(box()).<_179_1_11037602426>id("a_1696959402").owner(AbstractLanguageEditor.this));
		if (_179_1_11037602426 != null) _180_2_1147200173 = _179_1_11037602426._180_2_1147200173;
		if (_180_2_1147200173 != null) _181_3_01249478481 = _179_1_11037602426._180_2_1147200173._181_3_01249478481;
		if (_181_3_01249478481 != null) _182_4_1530601168 = _179_1_11037602426._180_2_1147200173._181_3_01249478481._182_4_1530601168;
		if (_181_3_01249478481 != null) _183_4_1659900887 = _179_1_11037602426._180_2_1147200173._181_3_01249478481._183_4_1659900887;
		if (_183_4_1659900887 != null) _184_5_01865913467 = _179_1_11037602426._180_2_1147200173._181_3_01249478481._183_4_1659900887._184_5_01865913467;
		if (_184_5_01865913467 != null) collectionSelector = _179_1_11037602426._180_2_1147200173._181_3_01249478481._183_4_1659900887._184_5_01865913467.collectionSelector;
		if (_183_4_1659900887 != null) _185_5_12046938537 = _179_1_11037602426._180_2_1147200173._181_3_01249478481._183_4_1659900887._185_5_12046938537;
		if (_183_4_1659900887 != null) collectionPopover = _179_1_11037602426._180_2_1147200173._181_3_01249478481._183_4_1659900887.collectionPopover;
		if (collectionPopover != null) _187_6_11079806553 = _179_1_11037602426._180_2_1147200173._181_3_01249478481._183_4_1659900887.collectionPopover._187_6_11079806553;
		if (_181_3_01249478481 != null) _188_4_01914737377 = _179_1_11037602426._180_2_1147200173._181_3_01249478481._188_4_01914737377;
		if (_188_4_01914737377 != null) createCollectionDialog = _179_1_11037602426._180_2_1147200173._181_3_01249478481._188_4_01914737377.createCollectionDialog;
		if (_180_2_1147200173 != null) _190_3_1454880423 = _179_1_11037602426._180_2_1147200173._190_3_1454880423;
		if (_190_3_1454880423 != null) _191_4_11811015619 = _179_1_11037602426._180_2_1147200173._190_3_1454880423._191_4_11811015619;
		if (_190_3_1454880423 != null) _192_4_1796748977 = _179_1_11037602426._180_2_1147200173._190_3_1454880423._192_4_1796748977;
		if (_192_4_1796748977 != null) _193_5_01702838083 = _179_1_11037602426._180_2_1147200173._190_3_1454880423._192_4_1796748977._193_5_01702838083;
		if (_193_5_01702838083 != null) nameField = _179_1_11037602426._180_2_1147200173._190_3_1454880423._192_4_1796748977._193_5_01702838083.nameField;
		if (_193_5_01702838083 != null) validNameIcon = _179_1_11037602426._180_2_1147200173._190_3_1454880423._192_4_1796748977._193_5_01702838083.validNameIcon;
		if (_193_5_01702838083 != null) invalidNameIcon = _179_1_11037602426._180_2_1147200173._190_3_1454880423._192_4_1796748977._193_5_01702838083.invalidNameIcon;
		if (_192_4_1796748977 != null) _197_5_01545824650 = _179_1_11037602426._180_2_1147200173._190_3_1454880423._192_4_1796748977._197_5_01545824650;
		if (_192_4_1796748977 != null) namePopover = _179_1_11037602426._180_2_1147200173._190_3_1454880423._192_4_1796748977.namePopover;
		if (namePopover != null) _199_6_1590903778 = _179_1_11037602426._180_2_1147200173._190_3_1454880423._192_4_1796748977.namePopover._199_6_1590903778;
		if (_180_2_1147200173 != null) _201_3_01539068345 = _179_1_11037602426._180_2_1147200173._201_3_01539068345;
		if (_201_3_01539068345 != null) _202_4_1895138337 = _179_1_11037602426._180_2_1147200173._201_3_01539068345._202_4_1895138337;
		if (_201_3_01539068345 != null) _203_4_11044444361 = _179_1_11037602426._180_2_1147200173._201_3_01539068345._203_4_11044444361;
		if (_203_4_11044444361 != null) privateField = _179_1_11037602426._180_2_1147200173._201_3_01539068345._203_4_11044444361.privateField;
		if (_203_4_11044444361 != null) _205_5_01981923664 = _179_1_11037602426._180_2_1147200173._201_3_01539068345._203_4_11044444361._205_5_01981923664;
		if (_203_4_11044444361 != null) privatePopover = _179_1_11037602426._180_2_1147200173._201_3_01539068345._203_4_11044444361.privatePopover;
		if (privatePopover != null) _207_6_113558356 = _179_1_11037602426._180_2_1147200173._201_3_01539068345._203_4_11044444361.privatePopover._207_6_113558356;
		if (_179_1_11037602426 != null) _209_2_0204546263 = _179_1_11037602426._209_2_0204546263;
		if (_209_2_0204546263 != null) languageLogoDialog = _179_1_11037602426._209_2_0204546263.languageLogoDialog;
		if (_212_1_02067479274 == null) _212_1_02067479274 = register(new _212_1_02067479274(box()).<_212_1_02067479274>id("a_1055025334").owner(AbstractLanguageEditor.this));
		if (_212_1_02067479274 != null) message = _212_1_02067479274.message;




		if (_185_5_12046938537 != null) _185_5_12046938537.bindTo(collectionPopover);


		if (_197_5_01545824650 != null) _197_5_01545824650.bindTo(namePopover);


		if (_205_5_01981923664 != null) _205_5_01981923664.bindTo(privatePopover);
	}

	@Override
	public void remove() {
		super.remove();
		if (change != null) change.unregister();
		if (_179_1_11037602426 != null) _179_1_11037602426.unregister();
		if (_212_1_02067479274 != null) _212_1_02067479274.unregister();
	}

	public class Change extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B>  {

		public Change(B box) {
			super(box);
			_title(" ");
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

	public class _179_1_11037602426 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
		public LanguageEditor._179_1_11037602426. _180_2_1147200173 _180_2_1147200173;
		public LanguageEditor._179_1_11037602426. _209_2_0204546263 _209_2_0204546263;

		public _179_1_11037602426(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (_180_2_1147200173 == null) _180_2_1147200173 = register(new _180_2_1147200173(box()).<_180_2_1147200173>id("a186266541").owner(AbstractLanguageEditor.this));
			if (_209_2_0204546263 == null) _209_2_0204546263 = register(new _209_2_0204546263(box()).<_209_2_0204546263>id("a1975129211").owner(AbstractLanguageEditor.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (_180_2_1147200173 != null) _180_2_1147200173.unregister();
			if (_209_2_0204546263 != null) _209_2_0204546263.unregister();
		}

		public class _180_2_1147200173 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public LanguageEditor._179_1_11037602426._180_2_1147200173. _181_3_01249478481 _181_3_01249478481;
			public LanguageEditor._179_1_11037602426._180_2_1147200173. _190_3_1454880423 _190_3_1454880423;
			public LanguageEditor._179_1_11037602426._180_2_1147200173. _201_3_01539068345 _201_3_01539068345;

			public _180_2_1147200173(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (_181_3_01249478481 == null) _181_3_01249478481 = register(new _181_3_01249478481(box()).<_181_3_01249478481>id("a_1675737782").owner(AbstractLanguageEditor.this));
				if (_190_3_1454880423 == null) _190_3_1454880423 = register(new _190_3_1454880423(box()).<_190_3_1454880423>id("a_534749011").owner(AbstractLanguageEditor.this));
				if (_201_3_01539068345 == null) _201_3_01539068345 = register(new _201_3_01539068345(box()).<_201_3_01539068345>id("a776197697").owner(AbstractLanguageEditor.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (_181_3_01249478481 != null) _181_3_01249478481.unregister();
				if (_190_3_1454880423 != null) _190_3_1454880423.unregister();
				if (_201_3_01539068345 != null) _201_3_01539068345.unregister();
			}

			public class _181_3_01249478481 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
				public LanguageEditor._179_1_11037602426._180_2_1147200173._181_3_01249478481. _182_4_1530601168 _182_4_1530601168;
				public LanguageEditor._179_1_11037602426._180_2_1147200173._181_3_01249478481. _183_4_1659900887 _183_4_1659900887;
				public LanguageEditor._179_1_11037602426._180_2_1147200173._181_3_01249478481. _188_4_01914737377 _188_4_01914737377;

				public _181_3_01249478481(B box) {
					super(box);
				}

				@Override
				public void init() {
					super.init();
					if (_182_4_1530601168 == null) _182_4_1530601168 = register(new _182_4_1530601168(box()).<_182_4_1530601168>id("a419736289").owner(AbstractLanguageEditor.this));
					if (_183_4_1659900887 == null) _183_4_1659900887 = register(new _183_4_1659900887(box()).<_183_4_1659900887>id("a1075806858").owner(AbstractLanguageEditor.this));
					if (_188_4_01914737377 == null) _188_4_01914737377 = register(new _188_4_01914737377(box()).<_188_4_01914737377>id("a1080742485").owner(AbstractLanguageEditor.this));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (_182_4_1530601168 != null) _182_4_1530601168.unregister();
					if (_183_4_1659900887 != null) _183_4_1659900887.unregister();
					if (_188_4_01914737377 != null) _188_4_01914737377.unregister();
				}

				public class _182_4_1530601168 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

					public _182_4_1530601168(B box) {
						super(box);
						_value("Collection");
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

				public class _183_4_1659900887 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
					public LanguageEditor._179_1_11037602426._180_2_1147200173._181_3_01249478481._183_4_1659900887. _184_5_01865913467 _184_5_01865913467;
					public LanguageEditor._179_1_11037602426._180_2_1147200173._181_3_01249478481._183_4_1659900887. _185_5_12046938537 _185_5_12046938537;
					public LanguageEditor._179_1_11037602426._180_2_1147200173._181_3_01249478481._183_4_1659900887. CollectionPopover collectionPopover;

					public _183_4_1659900887(B box) {
						super(box);
					}

					@Override
					public void init() {
						super.init();
						if (_184_5_01865913467 == null) _184_5_01865913467 = register(new _184_5_01865913467(box()).<_184_5_01865913467>id("a1736498284").owner(AbstractLanguageEditor.this));
						if (_185_5_12046938537 == null) _185_5_12046938537 = register(new _185_5_12046938537(box()).<_185_5_12046938537>id("a229198921").owner(AbstractLanguageEditor.this));
						if (collectionPopover == null) collectionPopover = register(new CollectionPopover(box()).<CollectionPopover>id("a_2109369264").owner(AbstractLanguageEditor.this));
					}

					@Override
					public void unregister() {
						super.unregister();
						if (_184_5_01865913467 != null) _184_5_01865913467.unregister();
						if (_185_5_12046938537 != null) _185_5_12046938537.unregister();
						if (collectionPopover != null) collectionPopover.unregister();
					}

					public class _184_5_01865913467 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
						public LanguageEditor._179_1_11037602426._180_2_1147200173._181_3_01249478481._183_4_1659900887._184_5_01865913467. CollectionSelector collectionSelector;

						public _184_5_01865913467(B box) {
							super(box);
						}

						@Override
						public void init() {
							super.init();
							if (collectionSelector == null) collectionSelector = register(new CollectionSelector(box()).<CollectionSelector>id("a1406207122").owner(AbstractLanguageEditor.this));
						}

						@Override
						public void unregister() {
							super.unregister();
							if (collectionSelector != null) collectionSelector.unregister();
						}

						public class CollectionSelector extends io.intino.alexandria.ui.displays.components.SelectorComboBox<io.intino.alexandria.ui.displays.notifiers.SelectorComboBoxNotifier, B>  {

							public CollectionSelector(B box) {
								super(box);
								_multipleSelection(false);
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

					public class _185_5_12046938537 extends io.intino.alexandria.ui.displays.components.OpenPopover<io.intino.alexandria.ui.displays.notifiers.OpenPopoverNotifier, B>  {

						public _185_5_12046938537(B box) {
							super(box);
							_title("Help");
							_mode(io.intino.alexandria.ui.displays.components.Actionable.Mode.valueOf("MaterialIconButton"));
							_icon("Help");
							 _triggerEvent(io.intino.alexandria.ui.displays.components.OpenPopover.TriggerEvent.MouseOver);
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

					public class CollectionPopover extends io.intino.alexandria.ui.displays.components.BlockPopover<io.intino.alexandria.ui.displays.notifiers.BlockPopoverNotifier, B>  {
						public LanguageEditor._179_1_11037602426._180_2_1147200173._181_3_01249478481._183_4_1659900887.CollectionPopover. _187_6_11079806553 _187_6_11079806553;

						public CollectionPopover(B box) {
							super(box);
						}

						@Override
						public void init() {
							super.init();
							if (_187_6_11079806553 == null) _187_6_11079806553 = register(new _187_6_11079806553(box()).<_187_6_11079806553>id("a_662557633").owner(AbstractLanguageEditor.this));
						}

						@Override
						public void unregister() {
							super.unregister();
							if (_187_6_11079806553 != null) _187_6_11079806553.unregister();
						}

						public class _187_6_11079806553 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

							public _187_6_11079806553(B box) {
								super(box);
								_value("The collection acts as a namespace for your DSLs. It prevents naming conflicts between users and helps organize DSLs by ownership.");
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

				public class _188_4_01914737377 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
					public CreateCollectionDialog createCollectionDialog;

					public _188_4_01914737377(B box) {
						super(box);
					}

					@Override
					public void init() {
						super.init();
						if (createCollectionDialog == null) createCollectionDialog = AbstractLanguageEditor.this.createCollectionDialog = register(new CreateCollectionDialog((EditorBox)box()).id("a_2044047948"));
					}

					@Override
					public void unregister() {
						super.unregister();
						if (createCollectionDialog != null) createCollectionDialog.unregister();
					}
				}
			}

			public class _190_3_1454880423 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
				public LanguageEditor._179_1_11037602426._180_2_1147200173._190_3_1454880423. _191_4_11811015619 _191_4_11811015619;
				public LanguageEditor._179_1_11037602426._180_2_1147200173._190_3_1454880423. _192_4_1796748977 _192_4_1796748977;

				public _190_3_1454880423(B box) {
					super(box);
				}

				@Override
				public void init() {
					super.init();
					if (_191_4_11811015619 == null) _191_4_11811015619 = register(new _191_4_11811015619(box()).<_191_4_11811015619>id("a_964214914").owner(AbstractLanguageEditor.this));
					if (_192_4_1796748977 == null) _192_4_1796748977 = register(new _192_4_1796748977(box()).<_192_4_1796748977>id("a_1007506332").owner(AbstractLanguageEditor.this));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (_191_4_11811015619 != null) _191_4_11811015619.unregister();
					if (_192_4_1796748977 != null) _192_4_1796748977.unregister();
				}

				public class _191_4_11811015619 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

					public _191_4_11811015619(B box) {
						super(box);
						_value("Name");
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

				public class _192_4_1796748977 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
					public LanguageEditor._179_1_11037602426._180_2_1147200173._190_3_1454880423._192_4_1796748977. _193_5_01702838083 _193_5_01702838083;
					public LanguageEditor._179_1_11037602426._180_2_1147200173._190_3_1454880423._192_4_1796748977. _197_5_01545824650 _197_5_01545824650;
					public LanguageEditor._179_1_11037602426._180_2_1147200173._190_3_1454880423._192_4_1796748977. NamePopover namePopover;

					public _192_4_1796748977(B box) {
						super(box);
					}

					@Override
					public void init() {
						super.init();
						if (_193_5_01702838083 == null) _193_5_01702838083 = register(new _193_5_01702838083(box()).<_193_5_01702838083>id("a252612130").owner(AbstractLanguageEditor.this));
						if (_197_5_01545824650 == null) _197_5_01545824650 = register(new _197_5_01545824650(box()).<_197_5_01545824650>id("a_1944392820").owner(AbstractLanguageEditor.this));
						if (namePopover == null) namePopover = register(new NamePopover(box()).<NamePopover>id("a_1356891615").owner(AbstractLanguageEditor.this));
					}

					@Override
					public void unregister() {
						super.unregister();
						if (_193_5_01702838083 != null) _193_5_01702838083.unregister();
						if (_197_5_01545824650 != null) _197_5_01545824650.unregister();
						if (namePopover != null) namePopover.unregister();
					}

					public class _193_5_01702838083 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
						public LanguageEditor._179_1_11037602426._180_2_1147200173._190_3_1454880423._192_4_1796748977._193_5_01702838083. NameField nameField;
						public LanguageEditor._179_1_11037602426._180_2_1147200173._190_3_1454880423._192_4_1796748977._193_5_01702838083. ValidNameIcon validNameIcon;
						public LanguageEditor._179_1_11037602426._180_2_1147200173._190_3_1454880423._192_4_1796748977._193_5_01702838083. InvalidNameIcon invalidNameIcon;

						public _193_5_01702838083(B box) {
							super(box);
						}

						@Override
						public void init() {
							super.init();
							if (nameField == null) nameField = register(new NameField(box()).<NameField>id("a_233036616").owner(AbstractLanguageEditor.this));
							if (validNameIcon == null) validNameIcon = register(new ValidNameIcon(box()).<ValidNameIcon>id("a_747222839").owner(AbstractLanguageEditor.this));
							if (invalidNameIcon == null) invalidNameIcon = register(new InvalidNameIcon(box()).<InvalidNameIcon>id("a_939204220").owner(AbstractLanguageEditor.this));
						}

						@Override
						public void unregister() {
							super.unregister();
							if (nameField != null) nameField.unregister();
							if (validNameIcon != null) validNameIcon.unregister();
							if (invalidNameIcon != null) invalidNameIcon.unregister();
						}

						public class NameField extends io.intino.alexandria.ui.displays.components.TextEditable<io.intino.alexandria.ui.displays.notifiers.TextEditableNotifier, B>  {

							public NameField(B box) {
								super(box);

								_readonly(true);
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

						public class ValidNameIcon extends io.intino.alexandria.ui.displays.components.MaterialIcon<io.intino.alexandria.ui.displays.notifiers.MaterialIconNotifier, B>  {

							public ValidNameIcon(B box) {
								super(box);

								_color("green");
								_icon("Check");
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

						public class InvalidNameIcon extends io.intino.alexandria.ui.displays.components.MaterialIcon<io.intino.alexandria.ui.displays.notifiers.MaterialIconNotifier, B>  {

							public InvalidNameIcon(B box) {
								super(box);

								_color("red");
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

					public class _197_5_01545824650 extends io.intino.alexandria.ui.displays.components.OpenPopover<io.intino.alexandria.ui.displays.notifiers.OpenPopoverNotifier, B>  {

						public _197_5_01545824650(B box) {
							super(box);
							_title("Help");
							_mode(io.intino.alexandria.ui.displays.components.Actionable.Mode.valueOf("MaterialIconButton"));
							_icon("Help");
							 _triggerEvent(io.intino.alexandria.ui.displays.components.OpenPopover.TriggerEvent.MouseOver);
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

					public class NamePopover extends io.intino.alexandria.ui.displays.components.BlockPopover<io.intino.alexandria.ui.displays.notifiers.BlockPopoverNotifier, B>  {
						public LanguageEditor._179_1_11037602426._180_2_1147200173._190_3_1454880423._192_4_1796748977.NamePopover. _199_6_1590903778 _199_6_1590903778;

						public NamePopover(B box) {
							super(box);
						}

						@Override
						public void init() {
							super.init();
							if (_199_6_1590903778 == null) _199_6_1590903778 = register(new _199_6_1590903778(box()).<_199_6_1590903778>id("a482273711").owner(AbstractLanguageEditor.this));
						}

						@Override
						public void unregister() {
							super.unregister();
							if (_199_6_1590903778 != null) _199_6_1590903778.unregister();
						}

						public class _199_6_1590903778 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

							public _199_6_1590903778(B box) {
								super(box);
								_value("The name identifies your DSL within the selected domain. It must be unique inside that domain.");
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

			public class _201_3_01539068345 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
				public LanguageEditor._179_1_11037602426._180_2_1147200173._201_3_01539068345. _202_4_1895138337 _202_4_1895138337;
				public LanguageEditor._179_1_11037602426._180_2_1147200173._201_3_01539068345. _203_4_11044444361 _203_4_11044444361;

				public _201_3_01539068345(B box) {
					super(box);
				}

				@Override
				public void init() {
					super.init();
					if (_202_4_1895138337 == null) _202_4_1895138337 = register(new _202_4_1895138337(box()).<_202_4_1895138337>id("a1844952744").owner(AbstractLanguageEditor.this));
					if (_203_4_11044444361 == null) _203_4_11044444361 = register(new _203_4_11044444361(box()).<_203_4_11044444361>id("a_20974169").owner(AbstractLanguageEditor.this));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (_202_4_1895138337 != null) _202_4_1895138337.unregister();
					if (_203_4_11044444361 != null) _203_4_11044444361.unregister();
				}

				public class _202_4_1895138337 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

					public _202_4_1895138337(B box) {
						super(box);
						_value("Private");
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

				public class _203_4_11044444361 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
					public LanguageEditor._179_1_11037602426._180_2_1147200173._201_3_01539068345._203_4_11044444361. PrivateField privateField;
					public LanguageEditor._179_1_11037602426._180_2_1147200173._201_3_01539068345._203_4_11044444361. _205_5_01981923664 _205_5_01981923664;
					public LanguageEditor._179_1_11037602426._180_2_1147200173._201_3_01539068345._203_4_11044444361. PrivatePopover privatePopover;

					public _203_4_11044444361(B box) {
						super(box);
					}

					@Override
					public void init() {
						super.init();
						if (privateField == null) privateField = register(new PrivateField(box()).<PrivateField>id("a_665213051").owner(AbstractLanguageEditor.this));
						if (_205_5_01981923664 == null) _205_5_01981923664 = register(new _205_5_01981923664(box()).<_205_5_01981923664>id("a1080554824").owner(AbstractLanguageEditor.this));
						if (privatePopover == null) privatePopover = register(new PrivatePopover(box()).<PrivatePopover>id("a1147530864").owner(AbstractLanguageEditor.this));
					}

					@Override
					public void unregister() {
						super.unregister();
						if (privateField != null) privateField.unregister();
						if (_205_5_01981923664 != null) _205_5_01981923664.unregister();
						if (privatePopover != null) privatePopover.unregister();
					}

					public class PrivateField extends io.intino.alexandria.ui.displays.components.ActionSwitch<io.intino.alexandria.ui.displays.notifiers.ActionSwitchNotifier, B>  {

						public PrivateField(B box) {
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

					public class _205_5_01981923664 extends io.intino.alexandria.ui.displays.components.OpenPopover<io.intino.alexandria.ui.displays.notifiers.OpenPopoverNotifier, B>  {

						public _205_5_01981923664(B box) {
							super(box);
							_title("Help");
							_mode(io.intino.alexandria.ui.displays.components.Actionable.Mode.valueOf("MaterialIconButton"));
							_icon("Help");
							 _triggerEvent(io.intino.alexandria.ui.displays.components.OpenPopover.TriggerEvent.MouseOver);
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

					public class PrivatePopover extends io.intino.alexandria.ui.displays.components.BlockPopover<io.intino.alexandria.ui.displays.notifiers.BlockPopoverNotifier, B>  {
						public LanguageEditor._179_1_11037602426._180_2_1147200173._201_3_01539068345._203_4_11044444361.PrivatePopover. _207_6_113558356 _207_6_113558356;

						public PrivatePopover(B box) {
							super(box);
						}

						@Override
						public void init() {
							super.init();
							if (_207_6_113558356 == null) _207_6_113558356 = register(new _207_6_113558356(box()).<_207_6_113558356>id("a_268824912").owner(AbstractLanguageEditor.this));
						}

						@Override
						public void unregister() {
							super.unregister();
							if (_207_6_113558356 != null) _207_6_113558356.unregister();
						}

						public class _207_6_113558356 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

							public _207_6_113558356(B box) {
								super(box);
								_value("Only users with access to selected collection can use this DSL.");
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

		public class _209_2_0204546263 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public LanguageLogoDialog languageLogoDialog;

			public _209_2_0204546263(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (languageLogoDialog == null) languageLogoDialog = AbstractLanguageEditor.this.languageLogoDialog = register(new LanguageLogoDialog((EditorBox)box()).id("a196216597"));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (languageLogoDialog != null) languageLogoDialog.unregister();
			}
		}
	}

	public class _212_1_02067479274 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
		public LanguageEditor._212_1_02067479274. Message message;

		public _212_1_02067479274(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (message == null) message = register(new Message(box()).<Message>id("a_637482348").owner(AbstractLanguageEditor.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (message != null) message.unregister();
		}

		public class Message extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

			public Message(B box) {
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