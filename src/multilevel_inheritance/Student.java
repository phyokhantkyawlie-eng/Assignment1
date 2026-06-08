package multilevel_inheritance;

public class Student extends Person {

    String studentID;

    public Student(String name, int age, String studentID) {
        super(name, age); // Pretend to Person Class

        this.studentID = studentID;
    }

    public void getStudentInfo() {
        getPersonInfo();
        System.out.println("Student ID: " + studentID);
    }
}