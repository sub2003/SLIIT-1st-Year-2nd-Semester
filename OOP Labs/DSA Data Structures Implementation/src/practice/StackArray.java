package practice;

import java.util.Scanner;


public class StackArray {
    private int maxSize; // Size of Array
    private char[] stackArr;
    private int top;    //  Top of the satck

    public StackArray(int size){
        maxSize=size;
        stackArr=new char[maxSize];
        top=-1;
    }

    public void push(char item) {
        if (top == maxSize - 1)
            System.out.println("Stack is Full.");
        else {
            top++;
            stackArr[top] = item;
            // increment top. insert item
            //another way--> stackArray[++top] = j;
        }
    }
    public char pop(){
        if(top==-1) {
            System.out.println("Stack is empty.");
            return '\0';
        }
        else{
            return stackArr[top--];
        }

    }
    public char peek() {
        if(top==-1) {
            System.out.println("Stack is empty.");
            return '\0';
        }
        else
            return stackArr[top];

    }

    public boolean isBalanced(String str){

        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if (ch == '(' || ch =='{'||ch=='[' ){
                push(ch);
            } else if (ch == ')' || ch =='}'||ch==']') {

                if (top==-1){
                    return false;
                }

                char top=pop();

                if ((ch == ')'&& top=='(') || (ch =='}' && top=='{')||(ch==']'&& top=='[' )) {
                    return true;
                }
                else
                    return false;
            }
            else
                return false;
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter an expression with parentheses: ");
        String input = scn.nextLine();

        StackArray sa = new StackArray(input.length());

        if(sa.isBalanced(input)){
            System.out.println("The expression has balanced parentheses.");
        } else {
            System.out.println("The expression has imbalanced parentheses.");
        }

        scn.close();
    }
}


