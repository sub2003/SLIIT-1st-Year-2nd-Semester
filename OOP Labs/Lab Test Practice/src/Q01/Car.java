package Q01;

public class Car extends Vehicle{

    private int numSeats;

    public Car(String model, double retailPricePerDay, int numSeats) {
        super(model, retailPricePerDay);
        this.numSeats = numSeats;
    }

    @Override
    public double calculateRentalCost(int days) {
        return days*retailPricePerDay;
    }
}
