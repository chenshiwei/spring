package csw.java.spring.beans.generic.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/META-INF/spring/beans-generic-di.xml");

		UserService userService = (UserService) ctx.getBean("userService");
		userService.add();

		// UserRepository userRepository = (UserRepository)
		// ctx.getBean("userRepository");
		// System.out.println(userRepository);

	}
}
