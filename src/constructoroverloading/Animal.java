package constructoroverloading;

public class Animal {
	
	public int age;
	public String species;
	public String food;
	
	
	public Animal() {
		
	}
	
	public Animal(String name, String fatherName, String motherName) {
		System.out.println("Name is "+ name);
		System.out.println("Father name is " + fatherName);
		System.out.println("Mother name is " + motherName);
	}
	
	public void getDetails() {
		
		System.out.println("Age ="+age);
		System.out.println("Species="+ species);
		System.out.println("Food eat "+ food);
	}

}
