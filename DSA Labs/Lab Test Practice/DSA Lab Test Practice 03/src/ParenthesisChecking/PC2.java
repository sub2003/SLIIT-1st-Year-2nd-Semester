package ParenthesisChecking;

import java.util.Scanner;

public class PC2 {
    static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the string : ");
        String str = scn.nextLine();

        charStackX s1 = new charStackX(str.length());

        boolean balanced=true;

        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            if (temp == '(' || temp == '{' || temp == '[') {
                s1.push(temp);
            }
            else if (temp==')'||temp=='}'||temp==']') {
                if(s1.isEmpty()){
                    balanced=false;
                    break;
                }
                char poptemp=s1.pop();

                if (temp==')' && poptemp!='('||temp=='}'&&poptemp!='{'||temp==']'&&poptemp!='[') {
                    balanced=false;
                }

            }
        }
        if(!s1.isEmpty()){
            balanced=false;
        }

        if(balanced){
            System.out.println("Balanced.");
        }
        else {
            System.out.println("Not balanced.");
        }
    }
}