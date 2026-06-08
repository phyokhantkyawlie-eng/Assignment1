package hierarchyinheritance;

public class Student extends Person {
	
	String studentID;
	String major;
	
	public Student(String name, int age, String studentID, String major) {
		
		this.name = name;
		this.age = age;
		this.studentID = studentID;
		this.major = major;
		
	}
	
	public void getStudentInfo() {
		
		getPersonInfo();
		
		System.out.println("Student ID : " + studentID);
		System.out.println("Major : " + major);
		
	}
}