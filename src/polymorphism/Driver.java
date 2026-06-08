package polymorphism;

public class Driver extends Employee {
	
	
	public void drive() {
		
		System.out.println(name + " can drive a car.");
		
	}
	
	public static void main(String[] args) {
		
		Driver driver1 = new Driver();
		
		driver1.name = "Aung Aung";
		
		driver1.work();
		driver1.rest();
		driver1.drive();
		
	}

}