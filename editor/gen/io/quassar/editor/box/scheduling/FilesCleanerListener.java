package io.quassar.editor.box.scheduling;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import io.quassar.editor.box.EditorBox;
import io.intino.alexandria.scheduler.ScheduledTrigger;

public class FilesCleanerListener implements ScheduledTrigger {

	public void execute(JobExecutionContext context) throws JobExecutionException {
		EditorBox box = (EditorBox) context.getMergedJobDataMap().get("box");
		io.quassar.editor.box.actions.FilesCleanerAction action = new io.quassar.editor.box.actions.FilesCleanerAction();
		action.box = box;
		action.execute();
	}
}