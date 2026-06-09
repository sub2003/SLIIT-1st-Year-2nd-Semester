package ChatGPTnewQ01;

public class Teacher extends Employee{

    private String subject;

    public Teacher(String cardNumber, String name, double salary, Department department, String subject) {
        super(cardNumber, name, salary, department);
        this.subject = subject;
    }

    @Override
    public void work() {
        System.out.println("Teacher is teaching students.");
    }

    public void displayDetails() {
        System.out.println("Teacher Details");
        work();
        System.out.println("Employee name : "+name);
        System.out.println("salary Rs : "+salary);
        System.out.println("ID Card Number : "+getCardNumber().getCardNumber());
        System.out.println("Department Name: "+getDepartment().getDepartmentName());
        System.out.println("Location : "+getDepartment().getLocation());
        System.out.println("Subject : "+subject);
    }
}
