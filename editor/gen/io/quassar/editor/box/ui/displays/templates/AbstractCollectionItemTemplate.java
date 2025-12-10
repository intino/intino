package io.quassar.editor.box.ui.displays.templates;

import io.intino.alexandria.core.Box;
import io.intino.alexandria.exceptions.*;
import io.intino.alexandria.ui.displays.components.*;
import io.quassar.editor.box.ui.*;

import io.quassar.editor.box.EditorBox;

import io.quassar.editor.box.ui.displays.templates.*;






import io.quassar.editor.box.ui.displays.items.*;

import io.intino.alexandria.ui.displays.notifiers.TemplateNotifier;

public abstract class AbstractCollectionItemTemplate<B extends Box> extends io.intino.alexandria.ui.displays.components.Template<TemplateNotifier, java.lang.Void, B> {
	public CollectionLink collectionLink;

	public AbstractCollectionItemTemplate(B box) {
		super(box);
		id("collectionItemTemplate");
	}

	@Override
	public void init() {
		super.init();
		if (collectionLink == null) collectionLink = register(new CollectionLink(box()).<CollectionLink>id("a_1220677875").owner(AbstractCollectionItemTemplate.this));
	}

	@Override
	public void remove() {
		super.remove();
		if (collectionLink != null) collectionLink.unregister();
	}

	public class CollectionLink extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B> implements io.intino.alexandria.ui.displays.components.addressable.Addressed<CollectionLink> {

		public CollectionLink(B box) {
			super(box);
			_title("");
			_mode(io.intino.alexandria.ui.displays.components.Actionable.Mode.valueOf("Link"));
			_path("/collections/:collection");
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
		public CollectionLink address(java.util.function.Function<String, String> addressFromPathResolver) {
			address(addressFromPathResolver.apply(path()));
			return this;
		}
	}
}