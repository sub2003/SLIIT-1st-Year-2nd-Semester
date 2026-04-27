package Q02;

public class Meal {
    protected String orderID;
    protected String customerName;
    protected int quantity;


    public Meal() {
        this.customerName = "Guest";
        this.orderID = "000";
        this.quantity = 0;
    }

    public Meal(String customerName, String orderID, int quantity) {
        this.customerName = customerName;
        this.orderID = orderID;
        this.quantity = quantity;
    }

    public void displayOrderDetails(){
        System.out.println("Order ID : "+orderID);
        System.out.println("Customer Name : "+customerName);
        System.out.println("Quantity : "+quantity);
    }

    public double calculateBill(){
        return 12.00;
    }
    public double calculateBill(int couponAmount){
        return calculateBill()-couponAmount;
    }


}
