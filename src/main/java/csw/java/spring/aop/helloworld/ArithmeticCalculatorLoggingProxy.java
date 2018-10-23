package csw.java.spring.aop.helloworld;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class ArithmeticCalculatorLoggingProxy {

	private ArithmeticCalculator target;

	public ArithmeticCalculatorLoggingProxy(ArithmeticCalculator target) {
		super();
		this.target = target;
	}

	@SuppressWarnings("rawtypes")
	public ArithmeticCalculator getLoggingProxy() {
		ArithmeticCalculator proxy = null;

		ClassLoader loader = target.getClass().getClassLoader();
		Class[] interfaces = new Class[] { ArithmeticCalculator.class };
		InvocationHandler h = new InvocationHandler() {

			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				String methodName = method.getName();
				System.out.println("The method " + methodName + " begin with " + Arrays.asList(args));
				Object result = method.invoke(target, args);
				System.out.println("The method " + methodName + " end with " + result);
				return result;
			}
		};

		proxy = (ArithmeticCalculator) Proxy.newProxyInstance(loader, interfaces, h);

		return proxy;
	}

}
