package SLIITModelPaperQ02;

public class TransportApp {

    static void main(String[] args) {

        Driver driver1=new Driver("John Doe","DL12345");
        Bus b1=new Bus("Volvo",80.0,"Diesel",driver1,50);

        Driver driver2=new Driver("Alice Smith","DL67890");
        Truck t1=new Truck("Mercedes",60.0,"Turbo Diesel",driver2,10.0);

        b1.start();
        t1.start();

    }
}
