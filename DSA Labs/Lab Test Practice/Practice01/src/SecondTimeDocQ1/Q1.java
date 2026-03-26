package SecondTimeDocQ1;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {

        Scanner scn=new Scanner(System.in);

        System.out.print("Enter queue size : ");
        int size=scn.nextInt();

        charQueueX q1=new charQueueX(size);

        System.out.print("Enter queue elements : ");
        for (int i=0;i<4;i++){
            q1.insert(scn.next().charAt(0));
        }
        charStackX s1=new charStackX(size);

        while (!q1.isEmpty()){
            s1.push(q1.remove());
        }

        while (!s1.isEmpty()){
            q1.insert(s1.pop());
        }

        System.out.print("After : ");
        while (!q1.isEmpty()){
            System.out.print(q1.remove()+" ");
        }

    }
}
