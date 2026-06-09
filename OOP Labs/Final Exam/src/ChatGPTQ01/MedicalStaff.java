package ChatGPTQ01;

public class MedicalStaff {
    protected String staffID;
    protected String name;
    protected String contactNumber;

    public MedicalStaff(String contactNumber, String name, String staffID) {
        this.contactNumber = contactNumber;
        this.name = name;
        this.staffID = staffID;

    }

    public void performDuty(){
        System.out.println("");
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getName() {
        return name;
    }

    public String getStaffID() {
        return staffID;
    }
}
