package Q5q2;

import java.util.Scanner;

public class HotelApp {
    static void main(String[] args) {

        Scanner scn=new Scanner(System.in);

        System.out.println("Enter name : ");
        String name=scn.nextLine();

        System.out.println("Enter Guest ID : ");
        String id=scn.nextLine();

        System.out.println("Enter number of stays days : ");
        int days=scn.nextInt();
        scn.nextLine();

        Guest guest=new Guest(id,name,days);

        System.out.println("Enter Reservation ID : ");
        String rID=scn.nextLine();

        System.out.println("Enter room type : ");
        String rType= scn.nextLine();

        System.out.println("Room charge : ");
        double rCharge= scn.nextDouble();

        Reservation r=new Reservation(guest,rID,rCharge,rType);

        r.reservationInformation();

    }
}
