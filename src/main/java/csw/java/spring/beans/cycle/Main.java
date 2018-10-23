package csw.java.spring.beans.cycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/META-INF/spring/beans-cycle.xml");
		System.out.println(54565);
		Car car = (Car) ctx.getBean("car");
		System.out.println(car);
		ctx.close();


	}
}
