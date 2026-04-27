package Q02;

public class ComboMeal extends Meal{
    private boolean includedDrinksAndDessert;

    public ComboMeal(boolean includedDrinksAndDessert) {
        this.includedDrinksAndDessert = includedDrinksAndDessert;
    }

    public ComboMeal(String customerName, String orderID, int quantity, boolean includedDrinksAndDessert) {
        super(customerName, orderID, quantity);
        this.includedDrinksAndDessert = includedDrinksAndDessert;
    }

    @Override
    public double calculateBill() {
        if (includedDrinksAndDessert==true){
            return 15.00*quantity+5;
        }
        return 15.00*quantity;
    }

    @Override
    public double calculateBill(int couponAmount) {
        return calculateBill()-3*quantity;
    }

    @Override
    public void displayOrderDetails() {
        System.out.println("--- Combo Meal ---");
        super.displayOrderDetails();
        System.out.println("Inludes Drink & Dessert : "+((includedDrinksAndDessert)?"Yes":"No"));
        System.out.println("Total Bill : $"+calculateBill());
        System.out.println("Bill with $3 coupon : $"+calculateBill(3));
    }
}
