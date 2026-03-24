package TutorialQ01;

public class Battery {


    private int capacity;


    public Battery (int c) {
        this.capacity = c;

    }

    public void displayBatteryDetails(){
        System.out.println("Battery capacity is : "+capacity+"mAh");
    }



}
