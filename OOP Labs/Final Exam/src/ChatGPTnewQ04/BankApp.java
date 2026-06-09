package ChatGPTnewQ04;

public class BankApp {
    static void main(String[] args) {

        Customer customer1=new Customer("0773334444","Amal Silva");// create customer object
        Customer customer2=new Customer("07111112222","Saman Perera");

        //create objects for accounts
        CurrentAccount ca=new CurrentAccount("CA001","ATM2001",120000.0,customer1,25000.0);
        SavingsAccount sa=new SavingsAccount("SA001","ATM1001",50000.0,customer2,5.5);


        //display acount details
        sa.displayDetails();
        System.out.println();
        ca.displayDetails();
    }
}
