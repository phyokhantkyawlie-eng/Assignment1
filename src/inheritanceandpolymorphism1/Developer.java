package inheritanceandpolymorphism1;

public class Developer extends Employee {
	
	String programmingLanguage;
	
	public Developer(String name, String employeeId, String programmingLanguage) {
		
		super(name, employeeId);
		
		this.programmingLanguage = programmingLanguage;
		
	}
	
	@Override
	public void showInfo() {
		
		System.out.println("=====Developer Information====");
		
		System.out.println("Name : " + name);
		
		System.out.println("Employee ID : " + employeeId);
		
		System.out.println("Programming Language : " + programmingLanguage);
		
	}

}