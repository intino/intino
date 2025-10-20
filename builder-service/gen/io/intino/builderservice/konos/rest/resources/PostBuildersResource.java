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

public class PostBuildersResource implements Resource {

	private BuilderServiceBox box;
	private AlexandriaHttpManager<PushService<?,?>> manager;

	public PostBuildersResource(BuilderServiceBox box, AlexandriaHttpManager manager) {
		this.box = box;
		this.manager = manager;
	}

	public void execute() throws AlexandriaException {fill(new io.intino.builderservice.konos.actions.PostBuildersAction()).execute();
	}

	private io.intino.builderservice.konos.actions.PostBuildersAction fill(io.intino.builderservice.konos.actions.PostBuildersAction action) throws AlexandriaException {
		action.box = this.box;
		action.context = context();
		try {
			action.info = io.intino.alexandria.rest.RequestAdapter.adapt(manager.fromBody(), RegisterBuilder.class);
		} catch (Throwable e) {
			action.onMalformedRequest(e);
		}
		return action;
	}

	private io.intino.alexandria.http.server.AlexandriaHttpContext context() {
		io.intino.alexandria.http.server.AlexandriaHttpContext context = new io.intino.alexandria.http.server.AlexandriaHttpContext(manager);

		context.put("ip", manager.ip());
		return context;
	}
}