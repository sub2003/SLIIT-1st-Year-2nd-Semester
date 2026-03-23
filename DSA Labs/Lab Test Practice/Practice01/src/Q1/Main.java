package Q1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);

        stackX s1=new stackX(5);

        System.out.print("Stack elements: ");  // 10 5 10 4 10
        //class1.push(scn.nextInt());


        for (int i=0;i<5;i++){
            s1.push(scn.nextInt());
        }

        stackX s2=new stackX(5);

        System.out.print("Element to remove : ");
        int r=scn.nextInt();

        while (!s1.isEmpty()){
            int p=s1.pop();
            if(r!=p){
                s2.push(p);
            }
        }

        stackX s3=new stackX(5);
        while(!s2.isEmpty()){
            s3.push(s2.pop()); //change the order of elements   // 5 4
        }
        System.out.print("Remaining elements: ");
        while (!s3.isEmpty()){
            System.out.print(s3.pop()+" "); //get the ordered output  // 4 5
        }
    }
}
