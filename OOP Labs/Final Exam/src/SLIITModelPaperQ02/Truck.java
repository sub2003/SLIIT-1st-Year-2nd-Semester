package SLIITModelPaperQ02;

public class Truck extends Vehicle{
    private double loadCapacity;

    public Truck(String brand, double speed, String engineType, Driver driver, double loadCapacity) {
        super(brand, speed, engineType, driver);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void start() {
        System.out.println("Truck Details\n" +
                "Truck is starting... Loading goods.\n");
        System.out.println("Vehicle Brand : "+brand);
        System.out.println("Speed : "+speed+"km/h");
        System.out.println("Engine Type : "+getEngine().getEngineType());
        System.out.println("Driver name : "+getDriver().getName()+", Licence: "+getDriver().getLicenseNumber());
        System.out.println("Load Capacity: " + loadCapacity + " tons");
        System.out.println("\n\n");

    }
}
