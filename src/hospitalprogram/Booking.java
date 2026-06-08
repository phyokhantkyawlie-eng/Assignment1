package hospitalprogram;

public class Booking {

    String bookingDate;

    Patient patient;
    Doctor doctor;
    Room room;

    public Booking(String bookingDate, Patient patient, Doctor doctor, Room room) {
        this.bookingDate = bookingDate;
        this.patient = patient;
        this.doctor = doctor;
        this.room = room;
    }

    public String getBookingInfo() {
        return "Booking Date = " + bookingDate +
                "\n\n--- Patient Information ---\n" + patient.getPatientInfo() +
                "\n\n--- Doctor Information ---\n" + doctor.getDoctorInfo() +
                "\n\n--- Room Information ---\n" + room.getRoomInfo() +
                "\n-----------------------------";
    }
}