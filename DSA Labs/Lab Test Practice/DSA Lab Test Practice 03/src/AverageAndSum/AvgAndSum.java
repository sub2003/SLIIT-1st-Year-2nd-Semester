package AverageAndSum;

import java.util.Scanner;

public class AvgAndSum {
    static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter stack size : ");
        int size=scn.nextInt();

        intStackX s1=new intStackX(size);

        for(int i=0;i<size;i++){
            s1.push(scn.nextInt());
        }

        int Ncount =0;
        double sum=0.0;
        while (!s1.isEmpty()){
            Ncount+=1;
            int temp= s1.pop();
            sum+=temp;

        }

        double avg=sum/Ncount;

        System.out.println("Sum : "+sum);
        System.out.println("Average : "+avg);




    }
}
