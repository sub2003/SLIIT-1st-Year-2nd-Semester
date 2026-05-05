package Q01;

abstract class Transport {
    protected String vehicleNumber;
    protected double distanceTravelled;

    public Transport(double distanceTravelled, String vehicleNumber) {
        this.distanceTravelled = distanceTravelled;
        this.vehicleNumber = vehicleNumber;
    }

    public abstract double calculateFare();

    public void displayDetails(){
        System.out.println("Vehicle Number : "+vehicleNumber);
        System.out.println("Distance Travelled : "+distanceTravelled);
    }
}
