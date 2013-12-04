import com.mycompany.SimpleJob;
import org.junit.Test;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-12-4
 * Time: 下午3:56
 */
public class TestSimpleJob {

    public static void main(String[] args) throws SchedulerException {
        //1.实例化任务
        JobDetail jobDetail = JobBuilder.newJob(SimpleJob.class).build();

        //2.实例化调度器
        CronTrigger cronTrigger = TriggerBuilder.newTrigger()
                .withSchedule(CronScheduleBuilder.cronSchedule("0/3 * * * * ?"))
                .build();

        //3.实例化Scheduler
        SchedulerFactory schedulerFactory = new StdSchedulerFactory();
        Scheduler scheduler = schedulerFactory.getScheduler();
        scheduler.scheduleJob(jobDetail, cronTrigger);
        scheduler.start();
    }

}
