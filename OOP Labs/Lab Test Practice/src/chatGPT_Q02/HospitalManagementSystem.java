package chatGPT_Q02;

public class HospitalManagementSystem {

    static void main(String[] args) {


        Doctor doctor1 = new Doctor("Dr. Lalith", 20, "Physician");

        Patient patient1 = new Patient("Amal");
        Patient patient2 = new Patient("Kamal");

        doctor1.addPatient(patient1);
        doctor1.addPatient(patient2);

        doctor1.displayPatients();
    }
}