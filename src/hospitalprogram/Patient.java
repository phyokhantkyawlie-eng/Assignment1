package hospitalprogram;

public class Patient {

    String name;
    int age;
    String gender;
    String phone;

    PatientAddress address;

    public Patient(String name, int age, String gender, String phone, PatientAddress address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
    }

    public String getPatientInfo() {
        return "Patient Name = " + name +
                "\nAge = " + age +
                "\nGender = " + gender +
                "\nPhone = " + phone +
                "\n\nPatient Address\n" + address.getAddressInfo();
    }
}