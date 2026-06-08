package overriding;

public class Developer extends Employee {
	
	@Override
	public void work() {
		
		super.work();
		
		System.out.println(name + " is writing Java code.");
		
	}
	
	public static void main(String[] args) {
		
		Developer dev1 = new Developer();
		
		dev1.name = "Phyo";
		
		dev1.work();
		
	}

}