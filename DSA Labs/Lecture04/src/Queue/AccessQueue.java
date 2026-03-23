package Queue;


import java.util.Queue;
import java.util.Scanner;

public class AccessQueue {
    static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter queue size :");
        int size=scn.nextInt();
        QueueX qx=new QueueX(size);

        qx.insert(50);
        qx.insert(90);

        System.out.println(qx.remove());
        System.out.println(qx.frontPeek());
        System.out.println(qx.remove());
        System.out.println(qx.remove());
        System.out.println(qx.frontPeek());

        qx.displayQueue();
        qx.displayArray();
        /*System.out.print("[");
        for(int i=0;i<size;size++){
            System.out.println(qx.);
        }
        */
    }
}
