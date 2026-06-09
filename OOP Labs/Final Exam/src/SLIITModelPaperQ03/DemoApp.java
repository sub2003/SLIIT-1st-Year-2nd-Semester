package SLIITModelPaperQ03;

import java.util.Scanner;

public class DemoApp {
    static void main(String[] args) {

        Scanner scn=new Scanner(System.in);

        try {
            System.out.println("Enter a username : ");
            String username= scn.nextLine();

            System.out.println("Enter a password : ");
            String password=scn.nextLine();

            if (username.length()<6){
                throw new InvalidUserName("Username must be at least 6 characters long.");
            }
            if(password.length()<8){
                throw new InvalidPasswordLength("Password must be at least 8 characters long.");
            }

        }
        catch (InvalidPasswordLength ex){
            System.out.println("Error: "+ex.getMessage());

        }
        catch (InvalidUserName ex){
            System.out.println("Error: "+ex.getMessage());
        }

    }
}
