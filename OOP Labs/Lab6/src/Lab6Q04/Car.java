package Lab6Q04;

public class Car extends Vehicle {

    int engineCapacity;
    double topSpeed;

    public Car() {
        super("Car");
        this.engineCapacity = 0;
        this.topSpeed = 0.0;
    }

    public Car(double topSpeed, int engineCapacity, String vehicleName) {
        this.topSpeed = topSpeed;
        this.engineCapacity = engineCapacity;
        super(vehicleName);
    }

    @Override
    public double calculateSpeed() {
        return topSpeed;
    }

    @Override
    public void displayVehicleDetails() {
        super.displayVehicleDetails();
        System.out.println("Speed : "+calculateSpeed()+" (km/h)");
        System.out.println("Engine Capacity : "+engineCapacity+" (CC)");
    }
}
