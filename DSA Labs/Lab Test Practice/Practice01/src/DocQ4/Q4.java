package DocQ4;

import java.util.Scanner;

public class Q4 {
    static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter size of queue 1 : ");
        int size1=scn.nextInt();
        System.out.print("Enter size of queue 2 : ");
        int size2=scn.nextInt();

        intQueueX q1=new intQueueX(size1);
        intQueueX q2=new intQueueX(size2);

        System.out.print("Queue 1 values : ");
        for(int i=0;i<size1;i++){
            q1.insert(scn.nextInt());
        }

        System.out.print("Queue 2 values : ");
        for(int i=0;i<size2;i++){
            q2.insert(scn.nextInt());
        }

        intStackX s1=new intStackX(size1+size2);
        intQueueX q3=new intQueueX(size1+size2);

        while (!q3.isFull()) {
            while (!q1.isEmpty()) {
                int temp1 = q1.remove();
                q3.insert(temp1);

            }

            while (!q2.isEmpty()) {
                int temp2 = q2.remove();
                q3.insert(temp2);

            }
        }
        while (!q3.isEmpty()){
            int temp3=q3.remove();

            while (!s1.isEmpty()&&s1.peek()>temp3){
                q3.insert(s1.pop());
            }
            s1.push(temp3);
        }

        while (!s1.isEmpty()){
            q3.insert(s1.pop());
        }
        while (!q3.isEmpty()){
            System.out.print(q3.remove()+" ");
        }

    }
}
