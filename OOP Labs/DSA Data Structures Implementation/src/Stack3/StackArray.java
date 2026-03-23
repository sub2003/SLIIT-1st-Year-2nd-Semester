package Stack3;

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
            if(ch=='('||ch=='['||ch=='{'){
                push(ch);
            }
            else if(ch==')'||ch==']'||ch=='}'){
                if(top == -1){
                    return false;
                }

                char topChar = pop();

                if( (ch == ')' && topChar != '(') ||
                        (ch == '}' && topChar != '{') ||
                        (ch == ']' && topChar != '[') ){
                    return false;  // stops here if mismatch
                }
                // if NO mismatch --> if block is skipped --> loop just continues naturally
            }
        }
        return top==-1;  //returns true if top equals -1. sometimes there are some opened brackets and no closing brackets. and it will loops though string. but it doesn't return anything.
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


    }
}


