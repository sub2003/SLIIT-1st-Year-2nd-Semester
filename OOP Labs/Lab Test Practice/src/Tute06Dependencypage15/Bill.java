package Tute06Dependencypage15;

public class Bill {
    private String billNumber;
    private double Amount;

    public Bill(double amount, String billNumber) {
        Amount = amount;
        this.billNumber = billNumber;
    }

    public boolean displayBill(){
        System.out.println("Bill number : "+billNumber);
        System.out.println("Amount : "+Amount);
        return true;
    }
}
