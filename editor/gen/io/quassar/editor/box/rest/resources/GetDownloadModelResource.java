package io.quassar.editor.box.rest.resources;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import io.intino.alexandria.exceptions.*;
import io.quassar.editor.box.*;
import io.intino.alexandria.core.Box;
import io.intino.alexandria.rest.*;
import io.intino.alexandria.http.server.AlexandriaHttpManager;
import io.intino.alexandria.http.pushservice.PushService;

import io.quassar.editor.box.schemas.*;

public class GetDownloadModelResource implements Resource {

	private EditorBox box;
	private AlexandriaHttpManager<PushService<?,?>> manager;

	public GetDownloadModelResource(EditorBox box, AlexandriaHttpManager manager) {
		this.box = box;
		this.manager = manager;
	}

	public void execute() throws AlexandriaException {
		write(fill(new io.quassar.editor.box.actions.GetDownloadModelAction()).execute());
	}

	private io.quassar.editor.box.actions.GetDownloadModelAction fill(io.quassar.editor.box.actions.GetDownloadModelAction action) throws AlexandriaException {
		action.box = this.box;
		action.context = context();
		try {
			action.commit = io.intino.alexandria.rest.RequestAdapter.adapt(manager.fromPath("commit"), String.class);
		} catch (Throwable e) {
			action.onMalformedRequest(e);
		}
		return action;
	}

	private void write(io.intino.alexandria.Resource object) {
		manager.write(object);
	}

	private io.intino.alexandria.http.server.AlexandriaHttpContext context() {
		io.intino.alexandria.http.server.AlexandriaHttpContext context = new io.intino.alexandria.http.server.AlexandriaHttpContext(manager);

		context.put("pathInfo", manager.request().raw().getPathInfo());
		context.put("ip", manager.ip());
		return context;
	}
}