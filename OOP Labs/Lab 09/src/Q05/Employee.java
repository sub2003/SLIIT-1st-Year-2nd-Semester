package Q05;

abstract class Employee {

    protected String empId;
    protected String name;

    abstract double calculateSalary();

    public Employee(String empId, String name) {
        this.empId = empId;
        this.name = name;
    }
}
