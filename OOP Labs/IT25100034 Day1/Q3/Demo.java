package Q3;

import java.util.Scanner;
public class Demo {
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        EvenOddNumber eo=new EvenOddNumber();

        while(true) {
            System.out.print("Enter a number : ");
            int i = scn.nextInt();

            System.out.println();

            if (eo.findEvenOdd(i) == true)
                System.out.println("It's an even number.\n");
            else
                System.out.println("It's a odd number.\n");


        }
    }
}
