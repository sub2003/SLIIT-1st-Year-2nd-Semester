package chatGPT_Q02;

public class Doctor {

    private Patient[] patients;
    private String doctorName;
    private String specilization;
    private int patientsCount;

    public Doctor(String doctorName, int size, String specilization) {
        this.doctorName = doctorName;
        this.patients = new Patient[size];
        this.patientsCount = 0;
        this.specilization = specilization;
    }

    public String getDoctorName(){
        return doctorName;
    }

    public void addPatient(Patient patient){
        if (patientsCount<patients.length){
            patients[patientsCount]=patient;
            patient.setDoctor(this);
            patientsCount++;
        }
        else {
            System.out.println("Today patient count is exceeded.");
        }
    }

    public void displayPatients(){
        System.out.println("Doctor's name : "+doctorName);
        System.out.println("\n\n");
        for (int i=0;i<patientsCount;i++){
            patients[i].displayPatientDetails();
            System.out.println();
        }
        System.out.println();
    }
}
