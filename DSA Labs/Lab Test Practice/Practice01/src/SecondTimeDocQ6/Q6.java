package SecondTimeDocQ6;

import java.util.Scanner;

public class Q6 {
    static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter queue size : ");
        int size=scn.nextInt();

        intQueueX q1=new intQueueX(size);

        System.out.print("Enter queue elemets :");
        for(int i=0;i<size;i++){
            q1.insert(scn.nextInt());
        }

        int half=0;

        int secondHalf=0;

        intStackX s1=new intStackX(size);
        half=size/2;
        if(size%2==0)
            for (int i =0;i<half;i++){ //if queue size is even number
                s1.push(q1.remove());
            }
        else{
            secondHalf=size-half;       //if queue size is odd number
            for (int i=0;i<secondHalf;i++){
                s1.push(q1.remove());
            }
        }

        while (!s1.isEmpty()){
            q1.insert(s1.pop());
        }

        for (int i = 0; i < half; i++) {
            q1.insert(q1.remove());        // if its odd number /even number second half should go back
        }

        if(size%2==0)
            for (int i =0;i<half;i++){ //if queue size is even number
                s1.push(q1.remove());
            }
        else{
            secondHalf=size-half;       //if queue size is odd number
            for (int i=0;i<secondHalf;i++){
                s1.push(q1.remove());
            }
        }

        intQueueX q2=new intQueueX(size);

        while (!q1.isEmpty()){
            q2.insert(q1.remove());
        }

        while (!q1.isFull()) {

            q1.insert(s1.pop());
            if (!q1.isFull()) {
                q1.insert(q2.remove());
            }

        }

        System.out.print("After : ");
        while (!q1.isEmpty()){
            System.out.print(q1.remove()+" ");  //getting out put
        }
    }
}
