package csw.java.spring.aop.impl.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/META-INF/spring/beans-aop-xml.xml");
		ArithmeticCalculator ar = ctx.getBean(ArithmeticCalculator.class);
		int re = ar.add(3, 6);
		System.out.println("result : " + re);

		re = ar.div(6, 2);
		System.out.println("result : " + re);
	}
}
