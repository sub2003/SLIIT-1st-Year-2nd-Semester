package chatGPT_Q02;

public class Patient {

    private String patientName;
    private Doctor doctor;

    public Patient(String patientName) {
        this.patientName = patientName;
    }

    public void setDoctor(Doctor doctor1){
        doctor=doctor1;
    }
    public void displayPatientDetails(){
        System.out.println("Patient's name : "+patientName);
        System.out.println("Attaced doctor : "+doctor.getDoctorName());
    }
}
