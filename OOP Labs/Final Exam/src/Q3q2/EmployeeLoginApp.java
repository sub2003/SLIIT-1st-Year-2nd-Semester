package Q3q2;

import java.util.Scanner;

public class EmployeeLoginApp {

    static void main(String[] args) {

        Scanner scn=new Scanner(System.in);

        try {


            System.out.print("Enter Employee ID: ");
            String ID = scn.nextLine();

            System.out.print("Enter Security Code: ");
            String code = scn.nextLine();

            if (!ID.equals("EMP2025")){
                throw new InvalidEmployeeIDException("Invalid Employee ID! Employee ID does not match.");
            }
            if (!code.equals("SEC@123")){
                throw new InvalidSecurityCodeException("Invalid Security Code! Security Code does not match.");
            }
            System.out.println("Access Granted!");
        } catch (InvalidEmployeeIDException e) {
            System.out.println("Error:"+e.getMessage());
        }
        catch (InvalidSecurityCodeException e){
            System.out.println("Error:"+e.getMessage());
        }



    }
}
