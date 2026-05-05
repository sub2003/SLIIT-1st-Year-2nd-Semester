package Q02;

public class Invoice implements Printable{
    private String invoiceID;
    private double amount;


    public Invoice(double amount, String invoiceID) {
        this.amount = amount;
        this.invoiceID = invoiceID;
    }

    @Override
    public void printDetails() {
        System.out.println("==== Invoice Details ====");
        System.out.println("Invoice ID : "+invoiceID);
        System.out.println("Amount : "+amount);
        System.out.println();
    }
}
