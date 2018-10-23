package csw.java.spring.beans.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import csw.java.spring.beans.annotation.controller.UserController;
import csw.java.spring.beans.annotation.repository.UserRepository;
import csw.java.spring.beans.annotation.service.UserService;

@SuppressWarnings("unused")
public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/META-INF/spring/beans-annotation.xml");

//		TestObject to = (TestObject) ctx.getBean("testObject");
//		System.out.println(to);
//	
		UserController userController = (UserController) ctx.getBean("userController");
		System.out.println(userController);
		userController.execute();

//		UserService userService = (UserService) ctx.getBean("userService");
//		System.out.println(userService);
		
//		UserRepository userRepository = (UserRepository) ctx.getBean("userRepository");
//		System.out.println(userRepository);
		
		
	}
}
