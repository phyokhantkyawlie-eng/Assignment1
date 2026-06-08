package inheritanceandpolymorphism1;

public class Main {
	
	public static void main(String[] args) {
		
		Employee[] employees = new Employee[3];
		
		employees[0] = new Manager("Aung Aung", "M-001", "IT Department");
		
		employees[1] = new Developer("Phyo", "D-001", "Java");
		
		employees[2] = new Designer("Su Su", "DS-001", "Figma");
		
		for (Employee employee : employees) {
			
			employee.showInfo();
			
			System.out.println();
			
		}
		
	}

}