package Q3q1;

import java.util.Scanner;

public class Demo {

    static void main(String[] args) {

        Scanner scn=new Scanner(System.in);
        /*
        try {
            System.out.print("Enter Email Address: ");
            String email = scn.nextLine();

            System.out.print("Enter PIN Code: ");
            String pin = scn.nextLine();

            if(!email.contains("@")){
                throw new InvalidEmailException("Invalid email address. Email must contain '@'.");
            }

            if(pin.length()<4){
                throw new InvalidPinException("PIN code must be at least 4 characters long.");
            }
            System.out.println("Login details accepted successfully.");
        }
        catch(InvalidEmailException ex){
            System.out.println("Error: "+ex.getMessage());
        }
        catch (InvalidPinException ex){
            System.out.println("Error: "+ex.getMessage());
        }

        */

        String a="asdfg";
        String b="asdfg";
        String c="asdfgh";

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));



    }
}
