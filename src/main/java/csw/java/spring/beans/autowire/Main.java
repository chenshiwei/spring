package csw.java.spring.beans.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/META-INF/spring/beans-autowire.xml");

		Person p = (Person) ctx.getBean("person");
		System.out.println(p);
		

	}
}
