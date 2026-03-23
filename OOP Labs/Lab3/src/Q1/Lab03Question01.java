package Q1;

public class Lab03Question01 {
    private  int accountNumber;
    private String accountHolderName;
    private double balance;

    public Lab03Question01() {
        this.accountNumber=12345678;
        this.accountHolderName="";
        this.balance=0.0;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        if(amount<=0){
            System.out.println("Amount should be positive.");
        }
        else{
            balance+=amount;
            System.out.println("Deposited "+amount);
        }
    }
    public void withdraw(double amount){
        if(amount<balance){
            balance-=amount;
            System.out.println("Withdrawn "+amount);
        }
        else {
            System.out.println("Balance is nt sufficient.");

        }
    }

    public void displayAccountDetails(){
        System.out.println("Final Account Details:");
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Account Holder: "+accountHolderName);
        System.out.println("Balance: "+balance);
    }
}
