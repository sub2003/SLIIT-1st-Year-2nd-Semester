package DocQ1;

import java.util.Scanner;

public class Q1 {
    static void main(String[] args) {
        Scanner scn =new Scanner(System.in);

        System.out.print("Enter stack size: ");
        int size=scn.nextInt();
        stackX s1=new stackX(size);


        System.out.print("Stack elements : ");
        for (int i=0;i<size;i++) {
            s1.push(scn.next().charAt(0));
        }
        while (!s1.isEmpty()){
            System.out.print(s1.pop()+" ");
        }
    }
}
