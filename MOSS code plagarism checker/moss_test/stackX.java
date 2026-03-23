package Stack;

import java.util.Scanner;

public class stackX {
    private int maxSize; // Size of Array
    private int[] stackArr;
    private int top;    //  Top of the satck

    public stackX(int size){
        maxSize=size;
        stackArr=new int[maxSize];
        top=-1;
    }

    public void push(int j) {
        if (top == maxSize - 1)
            System.out.println("Stack is Full.");
        else {
            top++;
            stackArr[top] = j;
            // increment top. insert item
            //another way--> stackArray[++top] = j;
        }
    }
    public int pop(){
        if(top==-1) {
            System.out.println("Stack is empty.");
            return -1;
        }
        else{
            return stackArr[top--];
        }

    }
    public int peek() {
        if(top==-1) {
            System.out.println("Stack is empty.");
            return -1;
        }
        else
            return stackArr[top];

    }
    public boolean isEmpty(){
        boolean empty;
        if (top==-1){
            empty=true;
        }
        else
            empty=false;

        return empty;
    }
    public boolean isFull(){
        boolean full;
        if (top!=maxSize-1){
            full=false;
        }
        else
            full=true;

        return full;
    }
    public int getCount(){
        int count=top+1;

        return count;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        int size=-1;
        System.out.println("Enter the stack size : ");
        stackX x=new stackX(size=scn.nextInt());


        x.push(300);
        x.push(400);
        System.out.println("pop : "+x.pop());
        System.out.println("peek : "+x.peek());
        System.out.println("no of items in the stack : "+x.getCount());
        System.out.println("Stack is empty : "+x.isEmpty());
        System.out.println("Stack is full : "+x.isFull());

    }



}

