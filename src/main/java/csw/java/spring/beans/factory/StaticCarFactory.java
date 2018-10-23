package csw.java.spring.beans.factory;

import java.util.HashMap;
import java.util.Map;

public class StaticCarFactory {
	private static Map<String, Car> cars = new HashMap<>();

	static {
		cars.put("audi", new Car("audi", 30));
		cars.put("ford", new Car("ford", 40));
	}

	public static Car getCar(String name) {
		return cars.get(name);
	}

}
