package ChatGPTQ01;

public class TreatmentRecord {

    private Patient patient;              // Aggregation
    private MedicalStaff medicalStaff;    // Association / polymorphism
    private MedicalReport medicalReport;  // Composition

    public TreatmentRecord(Patient patient, MedicalStaff medicalStaff,
                           String diagnosis, String reportDate) {

        this.patient = patient;
        this.medicalStaff = medicalStaff;

        // MedicalReport is created inside TreatmentRecord
        // This shows composition
        this.medicalReport = new MedicalReport(diagnosis, reportDate);
    }

    public void displayTreatmentDetails() {

        if (medicalStaff instanceof Doctor) {
            System.out.println("Doctor Treatment Details");
        } else if (medicalStaff instanceof Nurse) {
            System.out.println("Nurse Treatment Details");
        }

        medicalStaff.performDuty();

        System.out.println("Staff Name: " + medicalStaff.getName());
        System.out.println("Contact Number: " + medicalStaff.getContactNumber());
        System.out.println("Patient Name: " + patient.getPatientName());
        System.out.println("Age: " + patient.getAge());
        System.out.println("Diagnosis: " + medicalReport.getDiagnosis());
        System.out.println("Report Date: " + medicalReport.getReportDate());

        if (medicalStaff instanceof Doctor) {
            Doctor doctor = (Doctor) medicalStaff;
            System.out.println("Consultation Fee: Rs. " + doctor.getConsultationFee());
        } else if (medicalStaff instanceof Nurse) {
            Nurse nurse = (Nurse) medicalStaff;
            System.out.println("Ward Number: " + nurse.getWardNumber());
        }
    }
}
