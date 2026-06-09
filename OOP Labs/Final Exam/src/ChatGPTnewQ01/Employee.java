package ChatGPTnewQ01;

public class Employee {
    protected String name;
    protected double salary;
    private IDCard cardNumber;
    private Department department;

    public Employee(String cardNumber, String name, double salary,Department department) {
        this.cardNumber = new IDCard(cardNumber);
        this.name = name;
        this.salary = salary;
        this.department=department;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public IDCard getCardNumber() {
        return cardNumber;
    }

    public Department getDepartment() {
        return department;
    }

    public void work(){
        System.out.println("");
    }
}
