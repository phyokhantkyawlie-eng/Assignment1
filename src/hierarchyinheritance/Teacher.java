package hierarchyinheritance;

public class Teacher extends Person {
	
	String subject;
	double salary;
	
	public Teacher(String name, int age, String subject, double salary) {
		
		this.name = name;
		this.age = age;
		this.subject = subject;
		this.salary = salary;
		
	}
	
	public void getTeacherInfo() {
		
		getPersonInfo();
		
		System.out.println("Subject : " + subject);
		System.out.println("Salary : " + salary);
		
	}
}