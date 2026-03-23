package Q1;


import java.util.Scanner;
public class SavingsAccount {
    private  int accountNumber;
    private String accountHolderName;
    private double balance;

    public SavingsAccount() {
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
            System.out.print("Deposited "+amount+" ");
            System.out.println("New Balance: "+balance);
        }
    }
    public void withdraw(double amount){
        if(amount<balance){
            balance-=amount;
            System.out.print("Withdrawn "+amount+" ");
            System.out.println("New Balance: "+balance);
        }
        else {
            System.out.println("Balance is not sufficient.");

        }
    }

    public void displayAccountDetails(){
        System.out.println("Final Account Details:");
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Account Holder: "+accountHolderName);
        System.out.println("Balance: "+balance);
    }

    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        SavingsAccount sa=new SavingsAccount();

        System.out.print("Enter Account Number: ");
        sa.setAccountNumber(scn.nextInt());
        scn.nextLine();

        System.out.print("Enter Account Holder Name: ");
        sa.setAccountHolderName(scn.nextLine());

        System.out.print("Enter Initial Deposit: ");
        sa.deposit(scn.nextDouble());

        System.out.print("Enter Deposit Amount: ");
        sa.deposit(scn.nextDouble());

        System.out.print("Enter Withdrawal Amount: ");
        sa.withdraw(scn.nextDouble());

        System.out.println();

        sa.displayAccountDetails();
    }
}
