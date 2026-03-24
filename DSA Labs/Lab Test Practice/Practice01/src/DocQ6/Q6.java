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
}
