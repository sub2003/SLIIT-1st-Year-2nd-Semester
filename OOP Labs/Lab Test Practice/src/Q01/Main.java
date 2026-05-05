package Q01;

public class Main {
    static void main(String[] args) {

        Car car1=new Car("BMW Sedan M8",125000,4);
        Motorcycle mc1=new Motorcycle("BMW S 1000 RR",50000,2);

        System.out.println("Total payment for"+car1.model+" : "+car1.calculateRentalCost(2));
        System.out.println("Total payment for"+mc1.model+" : "+mc1.calculateRentalCost(4));
    }
}
