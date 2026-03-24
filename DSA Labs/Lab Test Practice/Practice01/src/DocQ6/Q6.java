package DocQ6;

import java.util.Scanner;

public class Q6 {
    static void main(String[] args) {

        Scanner scn =new Scanner(System.in);

        System.out.print("Enter queue size : ");
        int size=scn.nextInt();

        intQueueX q1=new intQueueX(size);

        System.out.print("Before : ");
        for (int i=0;i<size;i++){
            q1.insert(scn.nextInt());
        }

        int half=size/2;

        intStackX s1=new intStackX(size);

        if(size%2==0) {
            for (int i = 0; i < half; i++) {
                s1.push(q1.remove());
            }
        }
        else {
            for (int i = 0; i < half + 1; i++) {   // if size is odd number
                s1.push(q1.remove());
            }
        }

        while (!s1.isEmpty()){
            q1.insert(s1.pop());
        }


        for (int i = 0; i < half; i++) {
            q1.insert(q1.remove());        // if its odd number /even number second half should go back
        }

        if(size%2==0) {
            for (int i = 0; i < half; i++) {  //now iif size is odd . half+1 elements should push to stack. otherwise it doesnt matter
                s1.push(q1.remove());
            }
        }
        else {
            for (int i = 0; i < half + 1; i++) {
                s1.push(q1.remove());
            }
        }


        int i=0;
        intQueueX q2=new intQueueX(size);
        for (int sq=0;sq<half;sq++){
            q2.insert(q1.remove());
        }
        while(!q1.isFull()) {


            q1.insert(s1.pop());

            if(!q1.isFull()) {
                q1.insert(q2.remove());
            }
        }
        System.out.print("After : ");
        while (!q1.isEmpty()){
            System.out.print(q1.remove()+" ");
        }

    }

    /*
DSA Lab Test Implemented Interleave Queue algorithm using Stack and Queue that works for both even and odd sized queues.
Method	                 Structures	                Works For
Stack + 1 Queue	1 stack	                       Even (odd with extra step)
Stack + 2 Queues	1 stack + 1 queue	       Even & Odd
Only Queues	        2 extra queues	       Even & Odd

Logic:

If queue size is even:
Push first half of queue into stack
Pop stack back into queue (reverse first half)
Rotate first half elements to rear
Push first half again into stack
Interleave stack and queue elements alternately
If queue size is odd:
Push first half + middle element into stack
Pop stack back into queue
Rotate first half elements only
Push first half + middle again into stack
Move second half into a temporary queue
Interleave stack and temporary queue into main queue

This implementation ensures interleaving works correctly for both even and odd queue sizes.

Example:
Input: 1 2 3 4 5 6
Output: 1 4 2 5 3 6

Input: 1 2 3 4 5 6 7
Output: 1 5 2 6 3 7 4
    * */
}
