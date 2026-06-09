package Q5q1;

public class ServiceRecord {

    private String serviceID;
    private String serviceType;
    private double serviceCharge;
    private Customer customer;

    public ServiceRecord(double serviceCharge, String serviceID, String serviceType,Customer customer) {
        this.serviceCharge = serviceCharge;
        this.serviceID = serviceID;
        this.serviceType = serviceType;
        this.customer=customer;
    }

    public double getServiceCharge() {
        return serviceCharge;
    }

    public String getServiceID() {
        return serviceID;
    }

    public String getServiceType() {
        return serviceType;
    }

    public double calculateFinalCharge(){
        double tax=0;
        if (getServiceCharge()>10000){
            tax=1500;
        }

        return getServiceCharge()+tax;
    }

    public void displayServiceReport(Customer customer){
        System.out.println("Customer name : "+customer.getCustomerName());
        System.out.println("Customer ID : "+customer.getCustomerID());
        System.out.println("Contact number : "+customer.getContactNumber());
        System.out.println("Service ID : "+getServiceID());
        System.out.println("Service Type : "+getServiceType());
        System.out.println("Original Service Charge : "+getServiceCharge());
        System.out.println("Final Service Charge : "+calculateFinalCharge());
    }
}
