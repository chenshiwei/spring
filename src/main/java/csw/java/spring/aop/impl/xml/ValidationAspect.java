package csw.java.spring.aop.impl.xml;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;

//@Order(1)
//@Aspect
//@Component
public class ValidationAspect {

//	@Before("LoggingAspect.declareJointPointExpression()")
	public void validationArgs(JoinPoint jp) {
		System.out.println("validationArgs:" + Arrays.asList(jp.getArgs()));
	}

}
