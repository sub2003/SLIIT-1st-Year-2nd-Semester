package Q06;

public class ElectricVehicle extends Vehicle{

    private int batteryCapacity;

    public ElectricVehicle(String brand, double price, int batteryCapacity) {
        super(brand, price);
        this.batteryCapacity = batteryCapacity;
    }

    public void displayEVDetails(){
        super.displayDetails();
        System.out.println("Vehicle Battery Capacity : "+batteryCapacity);
    }
}
