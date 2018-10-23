package csw.java.spring.beans.factory;

import java.util.HashMap;
import java.util.Map;

public class InstanceCarFactory {


	private  Map<String, Car> cars = new HashMap<>();

	public InstanceCarFactory(){
		cars.put("audi", new Car("audi", 30));
		cars.put("ford", new Car("ford", 40));
	}
	

	public Car getCar(String name) {
		return cars.get(name);
	}

}
