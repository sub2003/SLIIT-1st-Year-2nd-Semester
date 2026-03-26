package SecondTimeDocQ3;

import java.util.Scanner;

public class Q3 {
    static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter queue size : ");
        int size=scn.nextInt();

        intQueueX q1=new intQueueX(size);

        System.out.print("Enter queue values : ");
        for(int i=0;i<size;i++){
            q1.insert(scn.nextInt());
        }

        intStackX s1=new intStackX(size);

        while (!q1.isEmpty()){
            int temp= q1.remove();
            while(!s1.isEmpty() && s1.peek()>temp){
                q1.insert(s1.pop());
            }
            s1.push(temp);
        }


        while (!s1.isEmpty()){
            q1.insert(s1.pop());
        }

        while (!q1.isEmpty()){
            s1.push(q1.remove());
        }

        System.out.print("After : ");
        while (!s1.isEmpty()){
            System.out.print(s1.pop()+" ");
        }
    }
}
