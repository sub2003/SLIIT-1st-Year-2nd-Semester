package Tute06Dependencypage15;

public class PaymentSystem {
    static void main(String[] args) {

        PaymentProcessor pp=new PaymentProcessor();

        Bill bill1=new Bill(4500.00,"B102");

        pp.processTheBill(bill1);
    }
}
