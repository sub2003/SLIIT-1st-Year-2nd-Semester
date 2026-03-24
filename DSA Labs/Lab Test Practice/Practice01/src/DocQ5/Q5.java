package DocQ5;

import java.util.Scanner;

public class Q5 {

    static void main(String[] args) {

        Scanner scn=new Scanner(System.in);


        System.out.print("Enter queue size :");
        int size=scn.nextInt();

        intQueueX q1=new intQueueX(size);

        System.out.print("Queue : ");
        for (int i=0;i<size;i++){
            q1.insert(scn.nextInt());
        }

        System.out.print("Number oof first k elements : ");
        int k=scn.nextInt();

        intStackX s1=new intStackX(size);

        for (int i=0;i<k;i++){
            s1.push(q1.remove());
        }
        while (!s1.isEmpty()){
            q1.insert(s1.pop());
        }
        for (int i=0;i<size-k;i++){
            q1.insert(q1.remove());
        }

        System.out.print("After Reversal: ");
        while (!q1.isEmpty()){
            System.out.print(q1.remove()+" ");
        }



    }
}
