package SLIITModelPaperQ02;

public class Bus extends Vehicle{

    private int passengerCapacity;

    public Bus(String brand, double speed, String engineType, Driver driver,int passengerCapacity) {
        super(brand, speed, engineType, driver);
        this.passengerCapacity=passengerCapacity;
    }



    @Override
    public void start() {
        System.out.println("Bus Details\n" +
                "Bus is starting... Passengers are boarding.\n");
        System.out.println("Vehicle Brand : "+brand);
        System.out.println("Speed : "+speed+"km/h");
        System.out.println("Engine Type : "+getEngine().getEngineType());
        System.out.println("Driver name : "+getDriver().getName()+", Licence: "+getDriver().getLicenseNumber());
        System.out.println("Passenger Capacity : "+passengerCapacity);
        System.out.println("\n\n");
    }
}
