package classworksassignment;

import javax.swing.JOptionPane;

public class Patient {

    String patientID;
    String name;
    int age;
    String gender;
    String disease;
    String doctorName;

    public Patient() {

    }

    public Patient(String patientID, String name, int age, String gender, String disease, String doctorName) {

        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.disease = disease;
        this.doctorName = doctorName;

    }

    public void getStart() {

        Patient[] patients = new Patient[3];

        patients[0] = new Patient("P001", "Mg Mg", 25, "Male", "Fever", "Dr. Aung");
        patients[1] = new Patient("P002", "Su Su", 30, "Female", "Headache", "Dr. Hla");
        patients[2] = new Patient("P003", "Kyaw Kyaw", 40, "Male", "Stomach Pain", "Dr. Win");

        String searchID = JOptionPane.showInputDialog("Enter Patient ID");

        checkPatientID(patients, searchID);

    }

    public void checkPatientID(Patient[] patients, String searchID) {

        boolean found = false;

        int row = 0;

        while (row < patients.length) {

            if (patients[row].patientID.equals(searchID)) {

                showPatientData(patients[row]);
                found = true;
                break;

            }

            row++;

        }

        if (found == false) {

            JOptionPane.showMessageDialog(null, "Patient ID not found.");

        }

    }

    public void showPatientData(Patient p) {

        String output = "Hospital Center Patient Information\n\n";

        output += "Patient ID is " + p.patientID + "\n";
        output += "Name is " + p.name + "\n";
        output += "Age is " + p.age + "\n";
        output += "Gender is " + p.gender + "\n";
        output += "Disease is " + p.disease + "\n";
        output += "Doctor Name is " + p.doctorName + "\n";

        JOptionPane.showMessageDialog(null, output);

    }

}