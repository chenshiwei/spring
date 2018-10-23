package csw.java.spring.quartz.annotation;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class AnnotationTimer {

  @Scheduled(cron="0/10 * * * * ?")
  public void a() {
    System.out.println(new Date(System.currentTimeMillis()));
  }
}
