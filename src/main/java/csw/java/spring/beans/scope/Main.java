package csw.java.spring.beans.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import csw.java.spring.beans.autowire.Car;
import csw.java.spring.beans.autowire.Person;

@SuppressWarnings("unused")
public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/META-INF/spring/beans-scope.xml");

		Car/*
				 * a = (Address) ctx.getBean("address"); System.out.println(a);
				 */

		a = (Car) ctx.getBean("car");
		Car b = (Car) ctx.getBean("car");
		System.out.println(a == b);

	}
}
