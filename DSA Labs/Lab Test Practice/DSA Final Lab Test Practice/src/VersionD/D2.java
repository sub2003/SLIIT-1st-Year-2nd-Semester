package VersionD;

import java.util.Scanner;

public class D2 {
    static void main(String[] args) {
        Scanner scn =new Scanner(System.in);

        System.out.print("Enter queue size : ");  //set queue size
        int size= scn.nextInt();

        intQueueX q1=new intQueueX(size);  //first queue
        intQueueX q2=new intQueueX(size);  //second queue

        System.out.print("Sample input:- ");  //get input from user to set elements of queue
        for (int i=0;i<size;i++){
            q1.insert(scn.nextInt());
        }

        int max= q1.remove();  //assume first element is maximum value

        while (!q1.isEmpty()){  //repeat until first is empty

            int temp= q1.remove();

            if(temp>max){
                q2.insert(max);
                max=temp;
            }

            //definitely remove duplicate values of actual maximum value or
            //if current max value is equal to new element , remove it(adjacent values , before actual maximum value)
            //if there are duplicate value sideby side of a max value they want remove
            else if (temp==max) {
                max=temp;
            }
            else{
                q2.insert(temp);
            }
        }

        System.out.print("Sample output available :- ");
        while (!q2.isEmpty()){  //get the sample output
            System.out.print(q2.remove()+" ");
        }
        System.out.println();
        System.out.println("Maximum number :- "+max);  //print maximum number


    }
}
