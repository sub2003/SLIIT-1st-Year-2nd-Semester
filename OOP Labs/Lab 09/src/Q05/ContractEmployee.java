package Q05;

public class ContractEmployee extends Employee implements Payable{

    private double workingHours;

    public ContractEmployee(String empId, String name,double workingHours) {
        super(empId, name);
        this.workingHours=workingHours;
    }

    @Override
    double calculateSalary() {
        return workingHours*1500;
    }

    @Override
    public void generatePaySlip() {
        System.out.println("----- Contract Employee Payslip -----");
        System.out.println("Employee ID   : " + empId);
        System.out.println("Employee Name : " + name);
        System.out.println("Salary        : Rs. " + calculateSalary());
        System.out.println();
    }
}
