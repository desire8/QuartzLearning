package com.js.quartz.test;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;


public class test {

    public static void main(String[] args)throws Exception{

        try {
            JobDetail job = JobBuilder.newJob(JobDone.class).withIdentity("dummy", "group1").build();
            Trigger trigger = TriggerBuilder.newTrigger().withIdentity("dummy", "group1").withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(5).repeatForever()).build();

            // Grab the Scheduler instance from the Factory
            Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();

            // and start it off
            scheduler.start();
            scheduler.scheduleJob(job,trigger);
            //scheduler.shutdown();

        } catch (SchedulerException se) {
            se.printStackTrace();
        }
    }
}