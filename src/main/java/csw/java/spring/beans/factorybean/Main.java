package csw.java.spring.beans.factorybean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"classpath:/META-INF/spring/beans-factorybean.xml");
		Car car = (Car) ctx.getBean("car");
		System.out.println(car);
		ctx.close();
	}
}
