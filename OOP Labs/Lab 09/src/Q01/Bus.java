package Q01;

public class Bus extends Transport {

    public Bus(double distanceTravelled, String vehicleNumber) {
        super(distanceTravelled, vehicleNumber);
    }

    @Override   //we must override the abstract method inside concrete class
    public double calculateFare() {
        return 10*distanceTravelled;
    }

    @Override     //overriding normal methds are not compulsory inside the concrete class
    public void displayDetails() {
        System.out.println("==== Bus Details ====");
        super.displayDetails();
        System.out.println("Fare : " + calculateFare());
        System.out.println();
    }
}
