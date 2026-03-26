package VersionD;

import java.util.Scanner;

public class D {
    static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter queue size :");
        int size= scn.nextInt();

        intQueueX q1=new intQueueX(size);
        intQueueX q2=new intQueueX(size);

        System.out.print("Sample input :- ");
        for (int i=0;i<size;i++){
            q1.insert(scn.nextInt());
        }
        /*
        while (!q1.isEmpty()){
            int temp= q1.remove();
            while (!q2.isEmpty()&&temp> q2.peekFront()){
                q1.insert(q2.remove());
            }
            q2.insert(temp);
        }

        int max=q2.remove();
        System.out.print("Samples that are available :- ");
        while (!q2.isEmpty()){
            System.out.print(q2.remove()+" ");
        }
        System.out.println();
        System.out.println("Maximum number :- "+max);

    */


        int max= q1.remove();

        while (!q1.isEmpty()){
            int temp= q1.remove();
            if (temp>max){
                q2.insert(max);
                max=temp;
            }
            else if(temp==max){
                max=temp;
            }
            else {
                q2.insert(temp);
            }
        }

        System.out.print("Samples that are available :- ");
        while (!q2.isEmpty()) {
            System.out.print(q2.remove() + " ");
        }

        System.out.println();
        System.out.println("Maximum number :- "+max);
    }

}
