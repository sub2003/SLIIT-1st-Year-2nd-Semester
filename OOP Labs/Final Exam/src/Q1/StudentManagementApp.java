package Q1;

import java.util.Scanner;

public class StudentManagementApp {
    static void main(String[] args) {

        Scanner scn=new Scanner(System.in);

        System.out.print("Student name : ");
        String name=scn.nextLine();

        System.out.println("Student ID : ");
        int ID= scn.nextInt();
        scn.nextLine();

        System.out.println("Degree program : ");
        String degree= scn.nextLine();

        System.out.println("Semester fee : ");
        double fee=scn.nextDouble();

        Student std1=new Student(degree,fee,ID,name);

        System.out.println("Registration Charge : ");
        double registrationCharge= scn.nextDouble();
        scn.nextLine();

        //-------------------------------------------------

        System.out.print("Student name : ");
        String name2=scn.nextLine();

        System.out.println("Student ID : ");
        int ID2= scn.nextInt();
        scn.nextLine();

        Student std2=new Student(ID2,name2);

        System.out.println("Registration Charge : ");
        double registrationCharge2= scn.nextDouble();

        std1.displayStudentDetails();
        std1.calculateFee(registrationCharge);

        std2.displayStudentDetails();
        std2.calculateFee(registrationCharge2);



    }
}
