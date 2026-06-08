package compositionprogram;

public class Student {

    String name;
    int age;

    Address address; // Composition Student has a address

    public Student(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void getStudentInfo() {

        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println(address.getAddressInfo());
        System.out.println("-------------------------");
    }
}