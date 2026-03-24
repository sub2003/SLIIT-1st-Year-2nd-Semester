package DocQ5;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter queue size : ");
        int size = scn.nextInt();

        intQueueX q1 = new intQueueX(size);

        System.out.print("Before : ");
        for (int i = 0; i < size; i++){
            q1.insert(scn.nextInt());
        }

        int half = size / 2;
        intStackX s1 = new intStackX(size);

        // First push
        if(size % 2 == 0){
            for (int i = 0; i < half; i++) {
                s1.push(q1.remove());
            }
        } else {
            for (int i = 0; i < half + 1; i++) {
                s1.push(q1.remove());
            }
        }

        // Reverse
        while (!s1.isEmpty()){
            q1.insert(s1.pop());
        }

        // Rotate half
        for (int i = 0; i < half; i++) {
            q1.insert(q1.remove());
        }

        // Second push (always half)
        for (int i = 0; i < half; i++) {
            s1.push(q1.remove());
        }

        // Move first half to q2
        intQueueX q2 = new intQueueX(size);
        for (int i = 0; i < half; i++){
            q2.insert(q1.remove());
        }

        // Interleave
        while(!s1.isEmpty()){
            q1.insert(s1.pop());
            if(!q2.isEmpty()){
                q1.insert(q2.remove());
            }
        }

        System.out.print("After : ");
        while (!q1.isEmpty()){
            System.out.print(q1.remove() + " ");
        }
    }
}