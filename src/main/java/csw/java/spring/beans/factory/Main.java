package csw.java.spring.beans.factory;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"classpath:/META-INF/spring/beans-factory.xml");
		Car car2 = (Car) ctx.getBean("car2");
		System.out.println(car2);
		ctx.close();

	}
}
