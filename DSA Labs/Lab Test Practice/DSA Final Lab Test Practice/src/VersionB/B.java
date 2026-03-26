package VersionB;

import java.util.Scanner;

public class B {
    static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter queue size : ");
        int size= scn.nextInt();  // set queue size

        intQueueX q1=new intQueueX(size); //first queue
        intQueueX q2=new intQueueX(size); //second queue

        //get inputs from user to set queue elements
        System.out.print("Input Elements : ");
        for(int i=0;i<size;i++){
            q1.insert(scn.nextInt());
        }

        //dequeue the elements of first queue and get the cubic value of each element.
        while (!q1.isEmpty()){
            int temp=(int)Math.pow(q1.remove(),3);
            q2.insert(temp);
        }

        //get the output
        System.out.print("Output : ");
        while (!q2.isEmpty()){
            System.out.print(q2.remove()+" ");
        }

    }
}
