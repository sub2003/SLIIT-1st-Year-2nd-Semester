package Q02;

public class ResturantApp {
    static void main(String[] args) {

        RegularMeal rm = new RegularMeal(true);
        rm.displayOrderDetails();

        System.out.println();

        ComboMeal cm=new ComboMeal("Alice Green","C102",2,true);
        cm.displayOrderDetails();

    }
}
