package inheritanceandpolymorphism1;

public class Manager extends Employee {
	
	String department;
	
	public Manager(String name, String employeeId, String department) {
		
		super(name, employeeId);
		
		this.department = department;
		
	}
	
	@Override
	public void showInfo() {
		
		System.out.println("=====Manager Information====");
		
		System.out.println("Name : " + name);
		
		System.out.println("Employee ID : " + employeeId);
		
		System.out.println("Department : " + department);
		
	}

}