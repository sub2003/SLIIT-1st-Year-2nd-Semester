package ChatGPTnewQ04;

public class CurrentAccount extends Account{
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String card, double balance, Customer customer, double overdraftLimit) {
        super(accountNumber, card, balance, customer);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    @Override
    public void showAccountType() {   //override methods
        System.out.println("This is a current account.");
    }

    public void displayDetails(){
        System.out.println("Current Account Details");
        showAccountType();
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Balance: Rs. "+balance);
        System.out.println("ATM Card Number: "+getAtmCard().getCardNumber());
        System.out.println("Customer Name: "+getCustomer().getCustomerName());
        System.out.println("Contact Number: "+getCustomer().getContactNumber());
        System.out.println("Overdraft Limit: Rs. "+overdraftLimit);
    }
}
