package DocQ2;

import java.util.Scanner;

public class Q2another1 {

    static void main(String[] args) {
        Scanner scn = new Scanner(System.in);


        System.out.print("Enter the string : ");
        String str = scn.nextLine();

        stackX s1 = new stackX(str.length());
        //queueX q1 = new queueX(str.length());
        for (int i = 0; i < str.length(); i++) {

            s1.push(str.charAt(i));

        }

        stackX s2=new stackX(str.length());
        stackX s3=new stackX(str.length());

        boolean palindrome = true;
        while (!s1.isEmpty()) {
            char temp=s1.pop();
            s2.push(temp);
            s3.push(temp);
        }

        stackX s4=new stackX(str.length());

        while (!s2.isEmpty()) {
            char temp=s2.pop();
            s4.push(temp);
            //s3.push(temp);
        }
        while (!s3.isEmpty()) {
            if(s4.pop()!=s3.pop())
                palindrome=false;
        }

        if (palindrome)
            System.out.println("Palindrome");

        else
            System.out.println("Not a Palindrome");


    }
}
