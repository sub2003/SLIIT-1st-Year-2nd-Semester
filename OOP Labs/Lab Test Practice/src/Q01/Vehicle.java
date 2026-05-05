package Q01;

public  class Vehicle {

    protected String model;
    protected double retailPricePerDay;

    public Vehicle(String model, double retailPricePerDay) {
        this.model = model;
        this.retailPricePerDay = retailPricePerDay;
    }

    public double calculateRentalCost(int days){
        return days*retailPricePerDay;
    };
}