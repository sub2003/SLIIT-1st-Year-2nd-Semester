package Tute06Dependencypage15;

public class PaymentProcessor {

    public void processTheBill(Bill bill){
        boolean tf=bill.displayBill();
        if (tf){
            System.out.println("Payment completed successfully.");
        }

    }
}
