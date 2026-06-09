package ChatGPTnewQ04;

public class Account {
    protected String accountNumber;
    protected double balance;

    private ATMCard atmCard;
    private Customer customer;

    public Account(String accountNumber, String card,double balance,Customer customer) {
        this.accountNumber = accountNumber;
        this.atmCard = new ATMCard(card);  //composition
        this.balance = balance;
        this.customer=customer;//Aggregation
    }

    public void showAccountType(){
        System.out.println("");
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public ATMCard getAtmCard() {
        return atmCard;
    }

    public Customer getCustomer() {
        return customer;
    }
}
