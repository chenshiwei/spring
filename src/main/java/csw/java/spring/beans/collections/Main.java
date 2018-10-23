package csw.java.spring.beans.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/META-INF/spring/applicationContext.xml");

		Person p = (Person) ctx.getBean("person5");
		System.out.println(p);

		NewPerson np = (NewPerson) ctx.getBean("newPerson");
		System.out.println(np);

		DataSource ds = ctx.getBean(DataSource.class);
		System.out.println(ds);
	}
}
