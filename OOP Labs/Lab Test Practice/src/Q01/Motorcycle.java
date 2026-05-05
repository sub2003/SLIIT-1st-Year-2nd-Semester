package Q01;

public class Motorcycle extends Vehicle{

    private int engineCapacity;

    public Motorcycle(String model, double retailPricePerDay, int engineCapacity) {
        super(model, retailPricePerDay);
        this.engineCapacity = engineCapacity;
    }

    @Override
    public double calculateRentalCost(int days) {
        return days*retailPricePerDay;
    }
}
