package csw.java.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// HelloWorld helloWorld = new HelloWorld();
		// helloWorld.setName("csw");
		System.out.println("cao2945");
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/META-INF/spring/applicationContext.xml");
		// HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");//id返回
		// HelloWorld helloWorld = ctx.getBean(HelloWorld.class);// 类型返回，需要唯一
		//
		// helloWorld.hello();
		Car car = (Car) ctx.getBean("car");
		System.out.println(car);

		car = (Car) ctx.getBean("car2");
		System.out.println(car);

		Person p = (Person) ctx.getBean("person");
		System.out.println(p);
		
		 p = (Person) ctx.getBean("person2");
			System.out.println(p);
	}
}
