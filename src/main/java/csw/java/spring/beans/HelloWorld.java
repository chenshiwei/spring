package csw.java.spring.beans;

public class HelloWorld {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("name"+name);
		this.name = name;
	}

	public void hello() {
		System.out.println("hello: " + name);
	}
	
	private HelloWorld(){
		System.out.println("dhuji");
	}
}
