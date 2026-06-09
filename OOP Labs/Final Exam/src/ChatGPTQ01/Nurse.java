package ChatGPTQ01;

public class Nurse extends MedicalStaff {

    private String wardNumber;

    public Nurse(String staffID, String name, String contactNumber, String wardNumber) {
        super(staffID, name, contactNumber);
        this.wardNumber = wardNumber;
    }

    @Override
    public void performDuty() {
        System.out.println("Nurse is assisting with patient care.");
    }

    public String getWardNumber() {
        return wardNumber;
    }
}