package Q1;

import java.util.Scanner;

public class PizzaOrder {
    private String orderID;
    private String customerName;
    private String size;
    private int toppingCount;
    private boolean isDelivery;

    public PizzaOrder() {        //To assign safe default values. Instead of leaving variables empty or garbage
        //To make code clean and professional

        this.customerName = "";
        this.orderID = "";
        this.size = "";
        this.toppingCount = 0;
        this.isDelivery = true;
    }

    public PizzaOrder(String orderID, String customerName) { //To make code clean and professional
        //To make code clean and professional
        this.orderID = orderID;
        this.customerName = customerName;
    }

    public PizzaOrder(String orderID, String customerName, String size, int toppingCount, boolean isDelivery) {
        //To make code clean and professional. and To make code clean and professional
        this.customerName = customerName;
        this.isDelivery = isDelivery;
        this.orderID = orderID;
        this.size = size;
        this.toppingCount = toppingCount;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if (size.toLowerCase() == "larger" || size.toLowerCase() == "medium") {
            this.size = size;
        } else
            this.size = "small";
    }

    public double getBasePrice() {
        double basePrice = 0.0;
        if (getSize() == "Small")
            basePrice = 8.00;
        else if (getSize() == "Medium") {
            basePrice = 10.00;
        } else
            basePrice = 12.00;


        return basePrice;
    }

    public double calculateTotalPrice() {
        double extraToppingCharges = toppingCount * 1.5;

        if (isDelivery) {
            return extraToppingCharges + 5.0 + getBasePrice();
        } else
            return extraToppingCharges + getBasePrice();
    }

    public double calculateTotalPrice(double discountPercentage) {

        double total = calculateTotalPrice();

        if (discountPercentage > 0) {
            return total = total - (total * discountPercentage/100);
        } else {
            return total;
        }
    }

    public double estimatePreparationTime(int extraToppings) {
        return 15 + (2 * extraToppings);
    }

    public void displayOrderDetails() {
        System.out.println("Customer name : " + customerName);
        System.out.println("Order ID : " + orderID);
        System.out.println("Pizza size : " + getSize());
        System.out.println("Extra Topping count : " + toppingCount);
        System.out.println("Deliver status : " + (isDelivery?"Yes":"No")); //Ternary operator
        System.out.println("Total is : " + calculateTotalPrice());

    }


    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        // First order
        PizzaOrder order1 = new PizzaOrder("C03001", "Olivia Green", "Medium", 3, true);
        order1.displayOrderDetails();

        System.out.println();

        // Second order with discount
        PizzaOrder order2 = new PizzaOrder("C03002", "Noah Smith", "Large", 2, false);
        order2.displayOrderDetails();


        System.out.print("Enter the discount percentage: ");
        double percentage = scn.nextDouble();

        System.out.println("Order 02 - Price after the discount: $"+ order2.calculateTotalPrice(percentage));

        System.out.println();

        // Third order using default constructor
        PizzaOrder order3 = new PizzaOrder();
        order3.displayOrderDetails();

        scn.close();
    }
}

