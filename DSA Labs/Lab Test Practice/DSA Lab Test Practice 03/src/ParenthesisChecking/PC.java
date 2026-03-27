package ParenthesisChecking;

import java.util.Scanner;

public class PC {
    static void main(String[] args) {
        Scanner scn =new Scanner(System.in);

        System.out.print("Enter String : ");
        String str= scn.nextLine();

        charQueueX q1=new charQueueX(str.length());

        for(int i=0;i<str.length();i++){
            q1.insert(str.charAt(i));
        }


        charStackX s1=new charStackX(str.length());

        boolean balanced=true;
        while(!q1.isEmpty()){
            char temp=q1.remove();

            if(temp=='(' || temp=='{'||temp=='['){
                s1.push(temp);
            }
            else if (temp==')'||temp=='}'||temp==']') {
                if(s1.isEmpty()){
                    balanced=false;
                    break;
                }

                char top= s1.pop();

                if((temp == ')' && top != '(') ||
                        (temp == '}' && top != '{') ||
                        (temp == ']' && top != '[')){
                    balanced = false;
                    break;
                }
            }

        }
        if(!s1.isEmpty()){
            balanced = false;
        }
        if(balanced)
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");
    }
}
