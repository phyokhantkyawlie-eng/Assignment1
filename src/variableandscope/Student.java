package variableandscope;

public class Student {
	
	
	
	String name; //global variable 
	
	int age; //global variable 
	
	static String  SCHOOL_NAME = "Rangsit University"; //static variable
	
	
	
	public Student (String name, int age) {
		
		this.name = name;
		
		this.age  = age;
		
	}
	
	
	public void showData() {
		
		System.out.println("Name -"+name);
		System.out.println("Age -"+age);
		
		System.out.println("School -"+SCHOOL_NAME);
	}
	
	
	

}