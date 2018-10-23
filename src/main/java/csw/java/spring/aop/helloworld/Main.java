package csw.java.spring.aop.helloworld;

public class Main {
	public static void main(String[] args) {

		// ApplicationContext ctx = new
		// ClassPathXmlApplicationContext("classpath:/META-INF/spring/beans-annotation.xml");

		// ArithmeticCalculator arithmeticCalculator= new
		// ArithmeticCalculatorImpl();
		// int result = arithmeticCalculator.add(1, 2);
		// System.out.println("-->" +result);
		// result = arithmeticCalculator.div(4, 2);
		// System.out.println("-->" +result);

		ArithmeticCalculator target = new ArithmeticCalculatorImpl();
		ArithmeticCalculator proxy = new ArithmeticCalculatorLoggingProxy(target).getLoggingProxy();
		int result = proxy.add(1, 2);
		System.out.println("-->" + result);
		result = proxy.div(4, 2);
		System.out.println("-->" + result);
	}
}
