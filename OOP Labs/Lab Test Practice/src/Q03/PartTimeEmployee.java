package Q03;

public class PartTimeEmployee extends  Employee {

    private int OThours;

    public PartTimeEmployee(String name, double salary, int OThours) {
        super(name, salary);
        this.OThours = OThours;


    }

    public void displayEmpInfo() {

        System.out.println("Employee name : "+name);
        System.out.println("Employee salary : "+salary);
        System.out.println("OT hours : "+OThours);
    }
}