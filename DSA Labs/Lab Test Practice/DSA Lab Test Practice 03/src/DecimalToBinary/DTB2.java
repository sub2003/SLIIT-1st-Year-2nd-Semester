package DecimalToBinary;

import java.util.Scanner;

public class DTB2 {
    static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        intStackX s1=new intStackX(50);

        System.out.print("Input the number to get the binary code : ");
        int num= scn.nextInt();

        while (num>0){
            /*if (num%2==0){
                s1.push(0);
            }
            else {
                s1.push(1);
            }
            num/=2;

             */

            int rem=num%2;
            s1.push(rem);
            num/=2;
        }
        int binaryZero;
        if(num==0){
            binaryZero=0;
        }

        System.out.print("Binary value : ");
        while (!s1.isEmpty()){
            System.out.print(s1.pop()+" ");
        }
    }
}
