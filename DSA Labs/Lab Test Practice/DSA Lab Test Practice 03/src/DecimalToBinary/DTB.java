package DecimalToBinary;

import java.util.Scanner;

public class DTB {
    static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter Decimal Number : ");
        int num= scn.nextInt();

        intStackX s1=new intStackX(50);

        while (num>0){
            int rem=num%2;
            s1.push(rem);
            num=num/2;
        }
        System.out.print("Bainary: ");
        while (!s1.isEmpty()){
            System.out.print(s1.pop()+" ");
        }
    }
}
