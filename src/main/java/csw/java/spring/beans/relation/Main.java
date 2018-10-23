package csw.java.spring.beans.relation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import csw.java.spring.beans.autowire.Address;
import csw.java.spring.beans.autowire.Person;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/META-INF/spring/beans-relation.xml");

		Address/* a = (Address) ctx.getBean("address");
		System.out.println(a);*/

		a = (Address) ctx.getBean("address2");
		System.out.println(a);

		Person p = (Person) ctx.getBean("person");
		System.out.println(p);
		
	}
}
