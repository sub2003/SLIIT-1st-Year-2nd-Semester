package VersionA;

import java.util.Scanner;

public class A {
    static void main(String[] args) {

        Scanner scn=new Scanner(System.in);

        System.out.print("Enter queue size: ");
        int size=scn.nextInt();    //set queue size

        intQueueX q1=new intQueueX(size);

        System.out.print("Input Element : ");  //filling the queue with users inputs
        for(int i=0;i<size;i++){
            q1.insert(scn.nextInt());
        }
        intQueueX q2=new intQueueX(size);

        System.out.print("Remove : ");  // set removing element
        int remove= scn.nextInt();

        while(!q1.isEmpty()){
            int temp=q1.remove();  //remove the values from array that user wanted to remove
            if(temp!=remove){
                q2.insert(temp);
            }
        }
        System.out.print("Output : ");  //get the out put
        while (!q2.isEmpty()){
            System.out.print(q2.remove()+" ");
        }
    }
}
