package Q4;

import java.util.Scanner;
public class Lab1Q4Part2 {
    public static void main(String[]args){

        Scanner scn = new Scanner (System.in);
        System.out.print("Enter the rows you need ? ");
        int rows= scn.nextInt();


        for (int i=0;i<rows;i++){
            for(int a=rows;a>i;a--){
                System.out.print(" ");

            }
            for (int b=0;b<=i;b++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
