package Exercise3Q7;

import java.util.ArrayList;
import java.util.Scanner;
public class LabSheet01 {

    public static double averageCalculator(ArrayList<Double>value){
        double average=0.0;
        double sum=0.0;
        for(int i=0; i<value.size();i++){
            sum=sum+ value.get(i);
        }
        average=sum/value.size();


        return average;
    }

    public static  ArrayList<Double> input(){
        Scanner scn=new Scanner(System.in);
        ArrayList<Double> value = new ArrayList<>();
        //double value[];
        int i=0;
        while(true){
            System.out.print("Enter "+(i+1)+" value : " );
            double num=scn.nextDouble();


            if(num==0){
                System.out.print("Do you consider 0 as a value : ");
                char YN=Character.toUpperCase(scn.next().charAt(0));
                if(YN=='N')
                    break;
            }
            value.add(num);
            i++;
        }
        return value;
    }
    public static void main(String[]args){

        ArrayList<Double> value = input();
        double average=averageCalculator(value);

        System.out.printf("Average : %.2f",average);


    }
}


