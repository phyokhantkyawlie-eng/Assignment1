package hospitalprogram;

public class Doctor {

    String doctorName;
    String specialization;

    public Doctor(String doctorName, String specialization) {
        this.doctorName = doctorName;
        this.specialization = specialization;
    }

    public String getDoctorInfo() {
        return "Doctor Name = " + doctorName +
                "\nSpecialization = " + specialization;
    }
}