package Min;

import java.util.Scanner;

public class Min {
    static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter queue size : ");
        int size= scn.nextInt();

        intQueueX q1=new intQueueX(size);
        intQueueX q2=new intQueueX(size);

        System.out.print("Inputs : ");
        for (int i=0;i<size;i++){
            q1.insert(scn.nextInt());
        }

        int min=q1.remove();

        while (!q1.isEmpty()){
            int temp= q1.remove();
            if(temp>min){
                q2.insert(temp);
            }
            else if (temp==min) {
                min=temp;
            }
            else {
                q2.insert(min);
                min=temp;
            }
        }

        System.out.print("Remaining values : ");
        while (!q2.isEmpty()){
            System.out.print(q2.remove()+" ");
        }
        System.out.println();
        System.out.println("Min : "+min);

    }
}
