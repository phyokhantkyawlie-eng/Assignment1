package hospitalprogram;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        String hospitalName = JOptionPane.showInputDialog("Enter Hospital Name");

        int totalPatients = Integer.parseInt(
                JOptionPane.showInputDialog("Enter how many patients you want to book")
        );

        Booking[] bookings = new Booking[totalPatients];

        int i = 0;

        while (i < bookings.length) {

            JOptionPane.showMessageDialog(null, "Booking " + (i + 1));

            String patientName = JOptionPane.showInputDialog("Enter Patient Name");
            int patientAge = Integer.parseInt(JOptionPane.showInputDialog("Enter Patient Age"));
            String gender = JOptionPane.showInputDialog("Enter Patient Gender");
            String phone = JOptionPane.showInputDialog("Enter Patient Phone");

            String doctorName = JOptionPane.showInputDialog("Enter Doctor Name");
            String specialization = JOptionPane.showInputDialog("Enter Doctor Specialization");

            String roomNumber = JOptionPane.showInputDialog("Enter Room Number");
            String roomType = JOptionPane.showInputDialog("Enter Room Type");

            String bookingDate = JOptionPane.showInputDialog("Enter Booking Date");

            String city = JOptionPane.showInputDialog("Enter Patient City");
            String country = JOptionPane.showInputDialog("Enter Patient Country");
            String postalCode = JOptionPane.showInputDialog("Enter Patient Postal Code");
            String addressLineOne = JOptionPane.showInputDialog("Enter Patient Address Line One");
            String addressLineTwo = JOptionPane.showInputDialog("Enter Patient Address Line Two");

            PatientAddress address = new PatientAddress(
                    city,
                    country,
                    postalCode,
                    addressLineOne,
                    addressLineTwo
            );

            Patient patient = new Patient(
                    patientName,
                    patientAge,
                    gender,
                    phone,
                    address
            );

            Doctor doctor = new Doctor(
                    doctorName,
                    specialization
            );

            Room room = new Room(
                    roomNumber,
                    roomType
            );

            Booking booking = new Booking(
                    bookingDate,
                    patient,
                    doctor,
                    room
            );

            bookings[i] = booking;

            i++;
        }

        Hospital hospital = new Hospital(hospitalName, bookings);

        JOptionPane.showMessageDialog(null, hospital.getHospitalInfo());
    }
}