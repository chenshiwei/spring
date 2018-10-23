package csw.java.spring.aop.impl;

import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(2)
@Aspect
@Component
public class LoggingAspect {

	@Pointcut("execution(public int csw.java.spring.aop.impl.ArithmeticCalculatorImpl.*(int, int))")
	public void declareJointPointExpression() {
	}

	@Before("declareJointPointExpression()")
	public void beforeMethod(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName();
		List<Object> args = Arrays.asList(joinPoint.getArgs());
		System.out.println("The method " + methodName + " begins with " + args);
	}

	@After("declareJointPointExpression()")
	public void afterMethod(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName();
		System.out.println("The method " + methodName + " ends");
	}

	@AfterReturning(value = "declareJointPointExpression()", returning = "result")
	public void afterReturning(JoinPoint joinPoint, Object result) {
		String methodName = joinPoint.getSignature().getName();
		System.out.println("The method " + methodName + " ends with " + result);
	}

	@AfterThrowing(value = "declareJointPointExpression()", throwing = "ex")
	public void afterThrowing(JoinPoint joinPoint, Exception ex) {
		String methodName = joinPoint.getSignature().getName();
		System.out.println("The method " + methodName + " exception with " + ex);
	}

	// @Around("execution(public int
	// csw.java.spring.aop.impl.ArithmeticCalculatorImpl.*(..))")
	// public Object around(ProceedingJoinPoint joinPoint) {
	// Object result = null;
	// try {
	// // System.out.println( joinPoint.getSignature().getName());
	// System.out.println("Before");
	// result = joinPoint.proceed();
	// System.out.println("AfterReturn");
	// } catch (Throwable e) {
	// System.out.println("exception");
	// e.printStackTrace();
	// }
	// System.out.println("After");
	// return result;
	// }
}
