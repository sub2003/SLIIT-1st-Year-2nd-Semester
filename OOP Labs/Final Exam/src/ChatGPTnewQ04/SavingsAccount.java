package ChatGPTnewQ04;

public class SavingsAccount extends Account{

    private double interestRate;

    public SavingsAccount(String accountNumber, String card, double balance, Customer customer, double interestRate) {
        super(accountNumber, card, balance, customer);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public void showAccountType() { //override method
        System.out.println("This is a savings account.");
    }

    public void displayDetails() {
        System.out.println("Savings Account Details");
        showAccountType();
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: Rs. " + balance);
        System.out.println("ATM Card Number: " + getAtmCard().getCardNumber());
        System.out.println("Customer Name: " + getCustomer().getCustomerName());
        System.out.println("Contact Number: " + getCustomer().getContactNumber());
        System.out.println("Interest Rate: " + interestRate+"%");
    }
}

