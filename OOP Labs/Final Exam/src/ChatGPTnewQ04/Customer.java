package ChatGPTnewQ04;

public class Customer {
    private String customerName;
    private String contactNumber;

    public Customer(String contactNumber, String customerName) {  //customer constructor
        this.contactNumber = contactNumber;
        this.customerName = customerName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getCustomerName() {
        return customerName;
    }
}
