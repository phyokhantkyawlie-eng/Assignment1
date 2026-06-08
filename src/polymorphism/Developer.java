package polymorphism;

public class Developer extends Employee {
	
	public void code() {
		
		System.out.println(name + " can write Java code.");
		
	}
	
	public static void main(String[] args) {
		
		Developer dev1 = new Developer();
		
		dev1.name = "Phyo";
		
		dev1.work();
		dev1.rest();
		dev1.code();
		
	}

}