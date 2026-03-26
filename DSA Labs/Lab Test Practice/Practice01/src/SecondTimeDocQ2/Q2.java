package SecondTimeDocQ2;

import java.util.Scanner;

public class Q2 {

    static void main(String[] args) {

        Scanner scn=new Scanner(System.in);


        System.out.print("Enter Input : ");
        String input=scn.nextLine();

        charQueueX q1=new charQueueX(input.length());
        charStackX s1=new charStackX(input.length());

        for(int i=0;i<input.length();i++){
            q1.insert(input.charAt(i));
            s1.push(input.charAt(i));
        }

        String isit="";
        while (!q1.isEmpty()){
            if(q1.remove()==s1.pop()){
                isit="Palindrome";
            }
            else
                isit="Not a Palindrome";
        }

        System.out.print("Output : "+isit);
    }
}
