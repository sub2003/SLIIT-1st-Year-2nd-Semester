package DocQ3;

import java.util.Scanner;

public class Q3 {

    static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter queue size: ");
        int size=scn.nextInt();

        intQueueX q1=new intQueueX(size);

        System.out.print("queue elements: ");
        for (int i=0;i<size;i++){
            q1.insert(scn.nextInt());

        }

        intStackX s1=new intStackX(size);
        while (!q1.isEmpty()){
            int temp= q1.remove();
            while (!s1.isEmpty()&&s1.peek()>temp) {
                q1.insert(s1.pop());
            }
            s1.push(temp);
        }

        intStackX s2=new intStackX(size);
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        while (!s2.isEmpty()) {
            q1.insert(s2.pop());
        }
        // Print sorted queue
        System.out.print("Sorted Queue: ");
        while (!q1.isEmpty()) {
            System.out.print(q1.remove() + " ");
        }
    }
}
