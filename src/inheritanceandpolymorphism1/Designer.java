package inheritanceandpolymorphism1;

public class Designer extends Employee {
	
	String designTool;
	
	public Designer(String name, String employeeId, String designTool) {
		
		super(name, employeeId);
		
		this.designTool = designTool;
		
	}
	
	@Override
	public void showInfo() {
		
		System.out.println("=====Designer Information====");
		
		System.out.println("Name : " + name);
		
		System.out.println("Employee ID : " + employeeId);
		
		System.out.println("Design Tool : " + designTool);
		
	}

}