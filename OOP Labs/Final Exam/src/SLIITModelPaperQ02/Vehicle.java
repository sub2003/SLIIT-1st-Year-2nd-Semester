package SLIITModelPaperQ02;

public class Vehicle {
    protected String brand;
    protected double speed;
    private Engine engine;
    private Driver driver;

    public Vehicle(String brand, double speed,String engineType,Driver driver) {
        engine=new Engine(engineType);
        this.brand = brand;
        this.speed = speed;
        this.driver=driver;
    }

    public void start(){
        System.out.println("Vehicle Details\n" +
                "Vehicle is starting... Passengers are boarding.");
    }

    public Engine getEngine() {
        return engine;
    }

    public Driver getDriver() {
        return driver;
    }
}
