package Q2;

import java.util.Scanner;

public class Product {
    private String productID;
    private String productName;
    private double basePrice;
    private String membershipType;

    public Product(String productID, String productName) {
        this.productID = productID;
        this.productName = productName;
    }

    public Product(String productID, String productName, double basePrice) {
        this.productID = productID;
        this.productName = productName;
        this.basePrice = basePrice;
    }

    public Product(String productID, String productName, double basePrice, String membershipType) {
        this.productID = productID;
        this.productName = productName;
        this.basePrice = basePrice;
        this.membershipType = membershipType;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membershipType) {

        if (membershipType.equalsIgnoreCase("Premium Member") ||
                membershipType.equalsIgnoreCase("Regular Member") ||
                membershipType.equalsIgnoreCase("Non-Member")) {

            this.membershipType = membershipType;
        } else {
            this.membershipType = "Non-Member";
        }
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double calculateFinalPrice() {

        double discount = 0;

        if (membershipType.equalsIgnoreCase("Premium Member"))
            discount = 0.20;
        else if (membershipType.equalsIgnoreCase("Regular Member"))
            discount = 0.10;

        return basePrice - (basePrice * discount);
    }
    public double calculateFinalPrice(double seasonalDiscount) {

        double priceAfterMembership = calculateFinalPrice();
        return priceAfterMembership - seasonalDiscount;
    }
    public void displayProductDetails() {

        System.out.println("Product ID: " + productID);
        System.out.println("Name: " + productName);
        System.out.println("Base Price: $" + basePrice);
        System.out.println("Membership Type: " + membershipType);
        System.out.println("Final Price (after discount): $" + calculateFinalPrice());
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        Product p1 = new Product("P1001", "Laptop");
        p1.setBasePrice(1000);
        p1.setMembershipType("Premium Member");
        p1.displayProductDetails();

        Product p2 = new Product("P1002", "Smartphone", 600);
        p2.setMembershipType("Regular Member");
        p2.displayProductDetails();

        Product p3 = new Product("P1003", "Headphones", 200, "Non-Member");
        p3.displayProductDetails();

        System.out.println("Estimated price for Smartphone with extra 5$ seasonal discount: $"+(p2.calculateFinalPrice(5)));


    }
}
