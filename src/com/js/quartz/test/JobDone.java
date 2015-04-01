package com.js.quartz.test;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class JobDone implements Job
{
    public void execute(JobExecutionContext context)throws JobExecutionException{
        System.out.print("js");
    }



}