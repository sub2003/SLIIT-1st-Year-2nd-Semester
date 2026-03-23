package Q2;

import java.util.Scanner;

public class Main {

    static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        queueX q1=new queueX(5);

        System.out.print("Queue elements: ");
        for (int i=0;i<5;i++){
            q1.insert(scn.nextInt());
        }

        queueX q2=new queueX(5);

        while(!q1.isEmpty()){
            //int qElement=q1.remove();
            System.out.print((int)Math.pow(q1.remove(),3)+" ");
            //qElement=qElement*qElement*qElement;
            //q2.insert((int)Math.pow(qElement,3)); //
        }



        //System.out.print("Cube array: ");
        //while(q2.isEmpty()){
        //    System.out.print(q2.remove()+" ");
        //}
    }
}
