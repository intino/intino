package io.quassar.editor.box;

import io.quassar.editor.box.EditorBox;
import io.intino.alexandria.scheduler.AlexandriaScheduler;
import io.quassar.editor.box.actions.*;
import org.quartz.*;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.time.ZoneId;
import java.io.File;
import io.intino.alexandria.logger.Logger;

import static org.quartz.JobBuilder.newJob;
import static org.quartz.CronScheduleBuilder.*;
import static org.quartz.TriggerBuilder.newTrigger;

public class Sentinels {

	private Sentinels() {

	}

	public static void init(AlexandriaScheduler scheduler, java.io.File home, EditorBox box) {
		JobDetail job;
		try {
			job = newJob(io.quassar.editor.box.scheduling.FilesCleanerListener.class).withIdentity("filesCleaner").build();
			job.getJobDataMap().put("box", box);
			scheduler.scheduleJob(job, newSet(newTrigger().withIdentity("Sentinels#filesCleaner").withSchedule(cronSchedule("0 0 4 1/1 * ? *")).build()), true);
			scheduler.startSchedules();
		} catch (Exception e) {
			Logger.error(e.getMessage());
		}
	}



	private static Set<Trigger> newSet(Trigger... triggers) {
		LinkedHashSet<Trigger> set = new LinkedHashSet<>();
		java.util.Collections.addAll(set, triggers);
		return set;
	}
}