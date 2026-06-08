package hierarchyinheritance;

public class Person {
	
	String name;
	int age;
	
	public Person() {
		
	}
	
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
		
	}
	
	public void getPersonInfo() {
		
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		
	}
}