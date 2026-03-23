package Q3;

import java.util.Scanner;

public class Employee {
    private int EmployeeID;
    private String EmployeeName;
    private double basicSalary;
    private int performanceRating;

    public Employee() {
        this.EmployeeID=0;
        this.EmployeeName="";
        this.basicSalary=0.0;
        this.performanceRating=0;

    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public int getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(int employeeID) {
        EmployeeID = employeeID;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    public int getPerformanceRating() {
        return performanceRating;
    }

    public void setPerformanceRating(int performanceRating) {
        Scanner scn =new Scanner(System.in);
        this.performanceRating = performanceRating;

        while(this.performanceRating < 1 || this.performanceRating > 5) {
            System.out.print("Enter Performance Rating (1-5): ");
            this.performanceRating = scn.nextInt();
        }


    }

    public double calculateBonus(){
        if(getPerformanceRating()==5)
            return getBasicSalary()*0.20;
        else if (getPerformanceRating()==4)
            return getBasicSalary()*0.15;
        else if (getPerformanceRating()==3)
            return getBasicSalary()*0.10;
        else if (getPerformanceRating()==2)
            return getBasicSalary()*0.05;
        else
            return getBasicSalary()*0;

    }
    public double calculateTotalSalary(){
        return basicSalary+calculateBonus();
    }
    public void displayDetails(){
        System.out.println("\nEmployee Details:");
        System.out.println("Employee ID: " + getEmployeeID());
        System.out.println("Name: " + getEmployeeName());
        System.out.println("Basic Salary: " + getBasicSalary());
        System.out.println("Performance Rating: " + getPerformanceRating());
        System.out.println("Bonus: " + calculateBonus());
        System.out.println("Total Salary: " + calculateTotalSalary());
    }

    public static void main(String[]args){

        Scanner scn = new Scanner(System.in);
        Employee emp=new Employee();

        System.out.print("Enter Employee ID: ");
        emp.setEmployeeID(scn.nextInt());
        scn.nextLine();

        System.out.print("Enter Employee Name: ");
        emp.setEmployeeName(scn.nextLine());

        System.out.print("Enter Basic Salary: ");
        emp.setBasicSalary(scn.nextDouble());

        System.out.print("Enter Performance Rating (1-5): ");
        emp.setPerformanceRating(scn.nextInt());

        System.out.println();

        emp.displayDetails();

    }
}
