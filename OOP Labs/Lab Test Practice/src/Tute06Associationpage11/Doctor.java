package Tute06Associationpage11;

public class Doctor {

    private String doctorName;
    private String specialization;

    public Doctor(String doctorName, String specialization) {
        this.doctorName = doctorName;
        this.specialization = specialization;
    }

    public void displayDoctorDetails() {
        System.out.println("Doctor : "+doctorName);
        System.out.println("Specialization : "+specialization);
    }
}
