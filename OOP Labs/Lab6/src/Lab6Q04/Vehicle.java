package Lab6Q04;

public class Vehicle {

    protected String vehicleName;

    public Vehicle() {
        this.vehicleName = "";
    }

    public Vehicle(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public void displayVehicleDetails(){
        System.out.println("Vehicle Name : "+vehicleName);
    }

    public double calculateSpeed(){
        return 0.0;
    }
    public double calculateSpeed(double factor){
        return calculateSpeed()*factor;
    }



}
