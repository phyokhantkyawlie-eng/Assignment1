package hierarchyinheritance;

public class Main {

	public static void main(String[] args) {
		
		Student s = new Student("Phyo", 19, "CS001", "Computer Science");
		
		Teacher t = new Teacher("Mr. John", 35, "Java Programming", 50000);
		
		System.out.println("Student Information");
		s.getStudentInfo();
		
		System.out.println();
		
		System.out.println("Teacher Information");
		t.getTeacherInfo();
		
	}
}