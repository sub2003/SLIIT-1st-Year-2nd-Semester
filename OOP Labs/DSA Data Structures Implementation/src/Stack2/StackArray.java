package Stack2;

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

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter a string: ");
        String string=scn.nextLine();

        StackArray sa=new StackArray(string.length());

        for (int i=0;i<string.length();i++){
            sa.push(string.charAt(i));
        }

        System.out.print("Reversed string: ");
        for (int i=0;i<string.length();i++){
            System.out.print(sa.pop());
        }
    }
}
