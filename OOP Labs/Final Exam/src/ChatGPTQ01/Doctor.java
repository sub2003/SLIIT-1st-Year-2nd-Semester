package ChatGPTQ01;

public class Doctor extends MedicalStaff {

    private double consultationFee;

    public Doctor(String staffID, String name, String contactNumber, double consultationFee) {
        super(staffID, name, contactNumber);
        this.consultationFee = consultationFee;
    }

    @Override
    public void performDuty() {
        System.out.println("Doctor is diagnosing the patient.");
    }

    public double getConsultationFee() {
        return consultationFee;
    }
}