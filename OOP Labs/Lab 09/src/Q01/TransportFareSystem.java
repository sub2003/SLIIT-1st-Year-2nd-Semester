package Q01;

public class TransportFareSystem {
    static void main(String[] args) {

        Bus bus1=new Bus(15,"CK-7856");
        Taxi taxi1=new Taxi(15,"KJ-9856");

        bus1.displayDetails();
        taxi1.displayDetails();
    }
}
