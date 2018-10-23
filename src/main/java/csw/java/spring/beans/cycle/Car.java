package csw.java.spring.beans.cycle;

public class Car {

	private String brand;
	private int price;
	private double tyrePerimeter;

	public Car(String brand, int price, double tyrePerimeter) {
		super();
		this.brand = brand;
		this.price = price;
		this.tyrePerimeter = tyrePerimeter;

	}

	public Car() {
		super();
		System.out.println("Con");
	}

	public void init() {
		System.out.println("init");
	}

	public void destory() {
		System.out.println("destory");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getTyrePerimeter() {
		return tyrePerimeter;
	}

	public void setTyrePerimeter(double tyrePerimeter) {
		this.tyrePerimeter = tyrePerimeter;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + ", tyrePerimeter=" + tyrePerimeter + "]";
	}

}
