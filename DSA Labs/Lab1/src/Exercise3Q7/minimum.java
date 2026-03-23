package Exercise3Q7;

import java.util.Scanner;
public class minimum {

    public static double minimum(double value[]){
        double min=value[0];

        for(int i=0;i<3;i++){

            if(min>value[i]){
                min=value[i];
            }
        }

        return min;
    }

    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);

        double value[]=new double[3];

        for(int i=0;i<3;i++) {
            System.out.print("Enter " + (i+1) + " value : ");
            value[i]=scn.nextDouble();


        }
        double minimumValue=minimum(value);

        System.out.println("Minimum value : "+minimumValue);
    }
}
