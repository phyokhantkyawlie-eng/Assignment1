package inheritanceandpolymorphism1;

public class Employee {
	
	String name;
	String employeeId;
	
	public Employee(String name, String employeeId) {
		
		this.name = name;
		this.employeeId = employeeId;
		
	}
	
	public void showInfo() {
		
		System.out.println("Name : " + name);
		System.out.println("Employee ID : " + employeeId);
		
	}

}