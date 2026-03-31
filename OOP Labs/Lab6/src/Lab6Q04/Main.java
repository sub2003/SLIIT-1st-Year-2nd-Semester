package Lab6Q04;

public class Main {
    static void main(String[] args) {

        Car c=new Car();
        Bicycle b=new Bicycle("Bicycle",10,60);

        c.displayVehicleDetails();
        System.out.println();
        b.displayVehicleDetails();
    }
}
