package multilevel_inheritance;

public class UniversityStudent extends Student {

    String universityName;
    String major;

    public UniversityStudent(String name, int age, String studentID, String universityName, String major) {
        super(name, age, studentID);

        this.universityName = universityName;
        this.major = major;
    }

    public void showUniversityStudentInfo() {
        getStudentInfo();

        System.out.println("University Name: " + universityName);
        System.out.println("Major :" + major);
    }
}