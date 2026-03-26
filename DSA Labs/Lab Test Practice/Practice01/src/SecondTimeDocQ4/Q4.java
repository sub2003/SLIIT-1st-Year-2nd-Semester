package SecondTimeDocQ4;

import java.util.Scanner;

public class Q4 {
    static void main(String[] args) {

        Scanner scn=new Scanner(System.in);

        System.out.print("Enter q1 size : ");
        int size1= scn.nextInt();

        System.out.print("Enter q2 size : ");
        int size2= scn.nextInt();

        intQueueX q1=new intQueueX(size1);
        intQueueX q2=new intQueueX(size2);

        System.out.print("Enter q1 values in ascending order : ");
        for (int i=0;i<size1;i++) {
            q1.insert(scn.nextInt());
        }

        System.out.print("Enter q2 values in ascending order : ");
        for (int i=0;i<size2;i++) {
            q2.insert(scn.nextInt());
        }

        intQueueX q3=new intQueueX(size1+size2);
        intStackX s1=new intStackX(size1+size2);
        while (!q1.isEmpty()&&!q2.isEmpty()) {
            if (q1.size() >= q2.size()) {
                q3.insert(q1.remove());
                q3.insert(q2.remove());  // 1 2 3 4 5 6
            }
            else{
                q3.insert(q2.remove());
                q3.insert(q1.remove());
            }
        }
        while (!q3.isEmpty()){
            s1.push(q3.remove());  //6 5 4 3 2 1 in stack
        }

        while (!s1.isEmpty()){
            q3.insert(s1.pop()); //6 5 4 3 2 1 in to queue
        }

        System.out.print("Output Queue : ");
        while (!q3.isEmpty()){
            System.out.print(q3.remove()+" "); //6 5 4 3 2 1 remove from queue
        }



    }
}
