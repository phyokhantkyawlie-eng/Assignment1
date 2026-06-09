package single_inheritance;

public class Employee {
	
	String name;
	
	int age;
	
	String department;
	
	String employeeID;
	
	public Employee() {
		
	}
	
	public void getEmployeeInfo() {
		
		System.out.println("Name is " + name);
		System.out.println("Age is " + age);
		System.out.println("Department is " + department);
		System.out.println("Employee ID is " + employeeID);
		
	}

}