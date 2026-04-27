package Q02;

public class RegularMeal extends Meal{

    private boolean isVegetarian;

    public RegularMeal(boolean isVegetarian) {
        this.isVegetarian = isVegetarian;
    }

    public RegularMeal(String customerName, String orderID, int quantity, boolean isVegetarian) {
        super(customerName, orderID, quantity);
        this.isVegetarian = isVegetarian;
    }

    @Override
    public double calculateBill() {
        return 10.00*quantity;
    }

    @Override
    public double calculateBill(int couponAmount) {
        if (calculateBill() != 0) {
            if (calculateBill() > couponAmount) {
                return calculateBill() - couponAmount;
            }
            else {
                return 0.0;
            }
        }
        else
            return 0.0;
    }
    @Override
    public void displayOrderDetails() {
        System.out.println("--- Regular Meal ---");
        super.displayOrderDetails();
        System.out.println("Meal Type : "+((isVegetarian)?"Vegetarian":"Not Vegetarian"));
        System.out.println("Total Bill : $"+calculateBill());
        System.out.println("Bill with $2 coupon : $"+calculateBill(2));
    }
}
