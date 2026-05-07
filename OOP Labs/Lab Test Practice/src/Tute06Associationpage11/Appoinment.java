package Tute06Associationpage11;

public class Appoinment {
    private String appoinmentID;
    private String patientName;
    private Doctor doctor;

    public Appoinment(String appoinmentID, Doctor doctor, String patientName) {
        this.appoinmentID = appoinmentID;
        this.doctor = doctor;
        this.patientName = patientName;
    }

    public void displayAppoinmentDetails(){
        System.out.println("Appoinmet ID : "+appoinmentID);
        System.out.println("Patient Name : "+patientName);
        doctor.displayDoctorDetails();
    }
}
