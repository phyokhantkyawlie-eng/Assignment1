package constructoroverloading;

public class Square {
	
	public Square() {
		System.out.println("I am Square constructor without any paramenters");
	}
	
	public Square(int age) {
		System.out.println(age + " I am Square constructor with one paramenters");
	}
	
	public Square(String name, int age) {
		System.out.println(name + age +" I am Square constructor with two paramenters");
	}
	
	public Square(int age, String name) {
		System.out.println(age + name + " I am also Square constructor with two parameters");
	}


}
