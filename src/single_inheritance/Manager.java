package single_inheritance;

public class Manager extends Employee {
	
	String position;
	
	double salary;
	
	public static void main(String[] args) {
		
		Manager manager = new Manager();
		
		manager.name = "Aung Aung";
		manager.age = 30;
		manager.department = "IT";
		manager.employeeID = "EMP001";
		manager.position = "Project Manager";
		manager.salary = 50000;
		
		manager.getEmployeeInfo();
		manager.managerInfo();
		
	}
	
	public void managerInfo() {
		
		System.out.println("Position is " + position);
		System.out.println("Salary is " + salary);
		
	}

}