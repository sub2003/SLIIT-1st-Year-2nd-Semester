package Q5q1;

import java.util.Scanner;

public class ServiceCenterApp {
    static void main(String[] args) {

        Scanner scn=new Scanner(System.in);

        System.out.println("Enter Customer ID ; ");
        String id=scn.nextLine();

        System.out.println("Enter Customer Name : ");
        String name=scn.nextLine();

        System.out.println("Enter Contact Number : ");
        String number= scn.nextLine();

        System.out.print("Enter Service ID: ");
        String serviceID = scn.nextLine();

        System.out.print("Enter Service Type: ");
        String serviceType = scn.nextLine();

        System.out.print("Enter Service Charge: ");
        double serviceCharge = scn.nextDouble();

        Customer customer=new Customer(number,id,name);
        ServiceRecord record=new ServiceRecord(serviceCharge,serviceID,serviceType,customer);

        record.displayServiceReport(customer);
    }
}
