package compositionprogram;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[2];

        int i = 0;

        while (i < students.length) {

            System.out.println("Enter Student " + (i + 1) + " Data");

            System.out.println("Enter Name");
            String name = sc.nextLine();

            System.out.println("Enter Age");
            int age = Integer.parseInt(sc.nextLine());

            System.out.println("Enter City");
            String city = sc.nextLine();

            System.out.println("Enter Country");
            String country = sc.nextLine();

            System.out.println("Enter Postal Code");
            String postalCode = sc.nextLine();

            System.out.println("Enter Address Line One");
            String addressOne = sc.nextLine();

            System.out.println("Enter Address Line Two");
            String addressTwo = sc.nextLine();

            Address address = new Address(city, country, postalCode, addressOne, addressTwo);

            students[i] = new Student(name, age, address);

            i++;
        }

        System.out.println("Student Data Lists");

        for (Student student : students) {
            student.getStudentInfo();
        }

        sc.close();
    }
}