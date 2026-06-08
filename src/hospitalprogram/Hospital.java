package hospitalprogram;

public class Hospital {

    String hospitalName;

    Booking[] bookings;

    public Hospital(String hospitalName, Booking[] bookings) {
        this.hospitalName = hospitalName;
        this.bookings = bookings;
    }

    public String getHospitalInfo() {

        String data = "Hospital Name = " + hospitalName + "\n\n";

        for (Booking booking : bookings) {
            data += booking.getBookingInfo() + "\n\n";
        }

        return data;
    }
}