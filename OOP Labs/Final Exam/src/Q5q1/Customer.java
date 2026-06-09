package Q5q1;

public class Customer {

    private String customerID;
    private String customerName;
    private String contactNumber;

    public Customer(String contactNumber, String customerID, String customerName) {
        this.contactNumber = contactNumber;
        this.customerID = customerID;
        this.customerName = customerName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }


}
