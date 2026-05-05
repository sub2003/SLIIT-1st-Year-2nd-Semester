package Q01;

public class Taxi extends Transport{

    public Taxi(double distanceTravelled, String vehicleNumber) {
        super(distanceTravelled, vehicleNumber);
    }

    @Override
    public double calculateFare() {
        return 20*distanceTravelled+50;
    }

    @Override
    public void displayDetails() {
        System.out.println("==== Taxi Details ====");
        super.displayDetails();
        System.out.println("Fare : "+calculateFare());
        System.out.println();
    }
}
