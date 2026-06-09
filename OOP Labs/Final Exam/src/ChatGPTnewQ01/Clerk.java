package ChatGPTnewQ01;

public class Clerk extends Employee {

    private String deskNumber;

    public Clerk(String cardNumber, String name, double salary, Department department, String deskNumber) {
        super(cardNumber, name, salary, department);
        this.deskNumber = deskNumber;
    }


    @Override
    public void work() {
        System.out.println("Clerk is managing office documents.");
    }

    public void displayDetails() {
        System.out.println("Clerk Details");
        work();
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: Rs. " + salary);
        System.out.println("ID Card Number: "+getCardNumber().getCardNumber());
        System.out.println("Department Name: "+getDepartment().getDepartmentName());
        System.out.println("Location: "+getDepartment().getLocation());
        System.out.println("Desk Number: "+deskNumber);





    }
}