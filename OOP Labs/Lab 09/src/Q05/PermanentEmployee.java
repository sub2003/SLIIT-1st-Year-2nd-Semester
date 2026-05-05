package Q05;

public class PermanentEmployee extends Employee implements Payable {

    private double monthlySalary;

    public PermanentEmployee(String empId, String name, double monthlySalary) {
        super(empId, name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary;
    }

    @Override
    public void generatePaySlip() {
        System.out.println("----- Permanent Employee Payslip -----");
        System.out.println("Employee ID   : " + empId);
        System.out.println("Employee Name : " + name);
        System.out.println("Salary        : Rs. " + calculateSalary());
        System.out.println();
    }
}
