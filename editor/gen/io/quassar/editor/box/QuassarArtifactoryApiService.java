package io.quassar.editor.box;

import io.intino.alexandria.http.AlexandriaHttpServer;
import io.quassar.editor.box.rest.resources.*;
import io.intino.alexandria.core.Box;

public class QuassarArtifactoryApiService {

	public static AlexandriaHttpServer setup(AlexandriaHttpServer server, EditorBox box) {
		server.route("artifacts/releases/*").get(manager -> new GetArtifactoryFileResource(box, manager).execute());

		return server;
	}
}