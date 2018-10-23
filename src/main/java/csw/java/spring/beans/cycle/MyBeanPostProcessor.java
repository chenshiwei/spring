package csw.java.spring.beans.cycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("post Before:" + bean + "," + beanName);
		if ("car".equals(beanName)) {
			//
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("post After:" + bean + "," + beanName);
		Car car = new Car();
		car.setPrice(14849);
		return car;
	}

}
