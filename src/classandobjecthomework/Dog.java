package classandobjecthomework;

public class Dog {
	
	String name;
	int age;
	String color;
	
	public void showInfo() {
		System.out.println("Name: "+ name);
		System.out.println("Age:"+ age);
		System.out.println("Color: "+ color);
	}
	
	public void eat() {
		System.out.println(name + " is eating.");
	}
	
	public void sleep() {
		System.out.println(name + " is sleeping.");
	}
	
	public void play() {
		System.out.println(name + " is playing.");
	}
	
	public void bark() {
		System.out.println(name + " is barking.");
	}
	
	public void bark(String sound) {
		System.out.println(name + " says: " + sound);
	}

}
