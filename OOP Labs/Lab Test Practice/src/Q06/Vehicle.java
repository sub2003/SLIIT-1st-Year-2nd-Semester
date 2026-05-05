package Q06;

public class Vehicle {
    protected String brand;
    protected double price;

    public Vehicle(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public void displayDetails(){
        System.out.println("Vehicle Brand : "+brand);
        System.out.println("Vehicle price : "+price);
    }
}
