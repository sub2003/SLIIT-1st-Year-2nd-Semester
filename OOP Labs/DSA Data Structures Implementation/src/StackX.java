import java.util.Scanner;

public class StackX {
    private int maxSize; // Size of Array
    private double[] stackArray;
    private int top;    //  Top of the satck

    public StackX(int s){
        maxSize=s;
        stackArray=new double[maxSize];
        top=-1;
    }

    public void push(double j) {
        if (top == maxSize - 1)
            System.out.println("Stack is Full.");
        else {
            top++;
            stackArray[top] = j;
            // increment top. insert item
            //another way--> stackArray[++top] = j;
        }
    }
    public double pop(){
        if(top==-1) {
            System.out.println("Stack is empty.");
            return -1;
        }
        else{
            return stackArray[top--];
        }

    }
    public double peek() {
        if(top==-1) {
            System.out.println("Stack is empty.");
            return -1;
        }
        else
            return stackArray[top];

    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        int size=-1;
        System.out.println("Enter the stack size : ");
        StackX x=new StackX(size=scn.nextInt());


        x.push(300);
        x.push(400);
        System.out.println(x.pop());
        System.out.println(x.peek());

    }



}
