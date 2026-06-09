package ChatGPTQ01;

public class Patient {

    private String patientID;
    private String patientName;
    private int age;

    public Patient(String patientID, String patientName, int age) {
        this.patientID = patientID;
        this.patientName = patientName;
        this.age = age;
    }

    public String getPatientID() {
        return patientID;
    }

    public String getPatientName() {
        return patientName;
    }

    public int getAge() {
        return age;
    }
}
