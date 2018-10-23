package csw.java.spring.beans.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/META-INF/spring/beans-spel.xml");

		Address p = (Address) ctx.getBean("address");
		System.out.println(p);
		Car car = (Car) ctx.getBean("car");
		System.out.println(car);

		Person ps=ctx.getBean(Person.class);
		System.out.println(ps);
	}
}
