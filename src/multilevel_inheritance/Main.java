package multilevel_inheritance;

public class Main {

    public static void main(String[] args) {

        UniversityStudent us = new UniversityStudent(
                "Phyo",
                19,
                "6734567",
                "Rangsit University",
                "Computer Science"
        );

        us.showUniversityStudentInfo();
    }
}