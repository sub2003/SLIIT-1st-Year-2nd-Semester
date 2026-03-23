package Q2;

import java.util.Scanner;
public class Lab02Question02 {

    public static void main(String[]args){

        Scanner scn=new Scanner(System.in);
        int values[]=new int[5];
        int sum=0;
        for(int i=0;i<values.length;i++){
            System.out.println("Enter "+(i+1)+" value : ");
            values[i]=scn.nextInt();
            sum+=values[i];
        }
        Lab02Question02 obj=new Lab02Question02();
        int largest=obj.largest(values);

        System.out.println("The largest value = "+largest);
        System.out.println("The sum of vales = "+sum);
    }
    public int largest(int values []){
        int largest=values[0];

        for(int i=0;i<values.length;i++){
            if(largest<values[i]){
                largest=values[i];
            }
        }
        return largest;
    }

}
