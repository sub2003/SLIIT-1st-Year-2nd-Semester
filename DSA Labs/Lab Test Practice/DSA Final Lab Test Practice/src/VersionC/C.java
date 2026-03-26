package VersionC;

import java.util.Scanner;

public class C {
    static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter queue size : "); // set the size of queues
        int size = scn.nextInt();

        intQueueX q1 = new intQueueX(size);  // first queue
        intQueueX q2 = new intQueueX(size);  //second queue

        System.out.println("Input Elements: ");  //get inputs from user to enqueue
        for (int i = 0; i < size; i++) {
            q1.insert(scn.nextInt());
        }

        while (!q1.isEmpty()) {
            int temp = q1.remove();  // select odd numbers
            if (temp % 2 == 1) {
                q2.insert(temp);
            }
        }
        int sum = 0;
        System.out.println("Output : ");   //get the output
        while (!q2.isEmpty()) {
            int r = q2.remove();
            sum = sum + r;
            System.out.print(r + " ");   //print od numbers
            q1.insert(r);
        }

        System.out.println();

        System.out.println("Get the summation of odd numbers : " + sum); //get summation of odd numbers
        while (!q1.isEmpty()) {
            System.out.println("Odd numbers : " + q1.remove());   //print odd numbers separately
        }
    }
}