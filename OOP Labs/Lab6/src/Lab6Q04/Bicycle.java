package Lab6Q04;

public class Bicycle extends Vehicle {

    int gearCount;
    double maxPadelSpeed;

    public Bicycle() {
        super("Bicycle");
        this.gearCount = 0;
        this.maxPadelSpeed=0;
    }

    public Bicycle(String vehicleName, int gearCount, double maxPadelSpeed) {
        super(vehicleName);
        this.gearCount = gearCount;
        this.maxPadelSpeed = maxPadelSpeed;
    }

    @Override
    public double calculateSpeed() {
        return maxPadelSpeed;
    }

    @Override
    public void displayVehicleDetails() {
        super.displayVehicleDetails();
        System.out.println("Speed : "+calculateSpeed()+" (km/h)");
        System.out.println("Gear Count : "+gearCount);
    }
}
