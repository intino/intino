package io.quassar.editor.box.actions;

import io.intino.alexandria.exceptions.Forbidden;
import io.intino.alexandria.logger.Logger;
import io.quassar.editor.box.util.DisplayHelper;
import io.quassar.editor.model.Model;
import io.quassar.editor.model.ModelRelease;
import org.apache.commons.codec.digest.DigestUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GetDownloadModelHashAction extends QuassarAction {
	public String file;
	public String commit;

	public String execute() throws Forbidden {
		Model model = box.modelManager().find(commit);
		ModelRelease release = box.modelManager().findRelease(commit);

		if (model == null || release == null) {
			Logger.error("Model commit %s not found".formatted(commit));
			return "";
		}

		try {
			File result = box.modelManager().release(model, release.version());
			if (!result.exists()) return "";
			try (InputStream is = new FileInputStream(result)) {
				return DigestUtils.md5Hex(is);
			}
		} catch (Exception e) {
			Logger.error(e);
			return "";
		}
	}

}