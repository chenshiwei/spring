package csw.java.spring.quartz;

import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class XmlTimer implements Job {

  public void execute() {
    System.out.println(new Date(System.currentTimeMillis()));
  }

  @Override
  public void execute(JobExecutionContext ctx) throws JobExecutionException {
    ctx.getJobDetail().getJobDataMap();
    ctx.getTrigger().getJobDataMap();
  }
}
