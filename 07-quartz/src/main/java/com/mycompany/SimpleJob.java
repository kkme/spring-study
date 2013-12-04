package com.mycompany;

import org.quartz.*;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-12-4
 * Time: 下午3:55
 */
public class SimpleJob implements Job {

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        System.out.println("任务运行了...");
        SchedulerContext schedulerContext = null;
        try {
            schedulerContext = context.getScheduler().getContext();
            MyService myService = (MyService)schedulerContext.get("myService");
            if(myService != null){
                myService.work();
            }
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }

}
