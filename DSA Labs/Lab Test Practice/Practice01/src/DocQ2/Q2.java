package DocQ2;

import java.util.Scanner;

public class Q2 {

    static void main(String[] args) {
        Scanner scn = new Scanner(System.in);


        System.out.print("Enter the string : ");
        String str = scn.nextLine();

        stackX s1 = new stackX(str.length());
        queueX q1 = new queueX(str.length());
        for (int i = 0; i < str.length(); i++) {

            s1.push(str.charAt(i));
            q1.insert(str.charAt(i));
        }

        boolean palindrome = true;
        while (!s1.isEmpty()) {
            if (s1.pop() != q1.remove()) {
                palindrome = false;
            }
        }

        if (palindrome)
            System.out.println("Palindrome");

        else
            System.out.println("Not a Palindrome");


    }

}
