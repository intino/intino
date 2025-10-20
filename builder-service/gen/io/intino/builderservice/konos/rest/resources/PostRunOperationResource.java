package io.intino.builderservice.konos.rest.resources;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import io.intino.alexandria.exceptions.*;
import io.intino.builderservice.konos.*;
import io.intino.alexandria.core.Box;
import io.intino.alexandria.rest.*;
import io.intino.alexandria.http.server.AlexandriaHttpManager;
import io.intino.alexandria.http.pushservice.PushService;

import io.intino.builderservice.konos.schemas.*;

public class PostRunOperationResource implements Resource {

	private BuilderServiceBox box;
	private AlexandriaHttpManager<PushService<?,?>> manager;

	public PostRunOperationResource(BuilderServiceBox box, AlexandriaHttpManager manager) {
		this.box = box;
		this.manager = manager;
	}

	public void execute() throws AlexandriaException {
		write(fill(new io.intino.builderservice.konos.actions.PostRunOperationAction()).execute());
	}

	private io.intino.builderservice.konos.actions.PostRunOperationAction fill(io.intino.builderservice.konos.actions.PostRunOperationAction action) throws AlexandriaException {
		action.box = this.box;
		action.context = context();
		try {
			action.runOperationContext = io.intino.alexandria.rest.RequestAdapter.adapt(manager.fromFormAsString("runOperationContext"), RunOperationContext.class);
			action.filesInTar = manager.fromFormAsResource("filesInTar");
		} catch (Throwable e) {
			action.onMalformedRequest(e);
		}
		return action;
	}

	private void write(String object) {
		manager.write(io.intino.alexandria.rest.ResponseAdapter.adapt(object));
	}

	private io.intino.alexandria.http.server.AlexandriaHttpContext context() {
		io.intino.alexandria.http.server.AlexandriaHttpContext context = new io.intino.alexandria.http.server.AlexandriaHttpContext(manager);

		context.put("ip", manager.ip());
		return context;
	}
}