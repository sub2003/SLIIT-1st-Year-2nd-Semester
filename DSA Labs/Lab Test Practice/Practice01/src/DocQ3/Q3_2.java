package DocQ3;

import java.util.Scanner;

public class Q3_2 {
    static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter queue one : ");
        int size= scn.nextInt();

        intQueueX q1=new intQueueX(size);
        intStackX s1=new intStackX(size);

        System.out.print("Before : ");
        for (int i =0; i<size;i++){
            q1.insert(scn.nextInt());
        }


        while (!q1.isEmpty()){
            int temp=q1.remove();
            while (!s1.isEmpty() && temp>s1.peek()){
                q1.insert(s1.pop());
            }
            s1.push(temp);

        }

        System.out.println();

        System.out.print("After : ");
        while (!s1.isEmpty()){
            System.out.print(s1.pop()+" ");
        }
    }
}
