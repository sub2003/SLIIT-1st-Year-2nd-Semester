package Lab3Exercises;

public class stack {

    private int maxSize;
    private char[] stackArray;
    private int top;

    public stack(int size){
        this.maxSize=size;
        top=-1;
        this.stackArray=new char[maxSize];
    }
    public void push(char a){
        if(top==(maxSize-1))
            System.out.println("Stack is full.");
        else {
            top++;
            stackArray[top] = a;
        }
    }
    public char pop(){
        if(top==-1){
            System.out.println("Stack is empty.");
            return 1;
        }
        else
            return stackArray[top--];
    }

    public char peek(){
        if(top==-1){
            System.out.println("Stack is empty.");
            return 1;
        }
        else
            return stackArray[top];
    }

    public boolean isEmpty(){
        if(top==-1){
            return true;
        }
        else
            return false;
    }

    public static void main(String[] args) {

        char elements[]={'g','t','o','p'};

        stack myStack=new stack(elements.length);

        /*myStack.push('g');
        myStack.push('t');
        myStack.push('o');
        myStack.push('p');
        */

        for (int i=0;i<elements.length;i++){
            System.out.println("push : "+elements[i]);
            myStack.push(elements[i]);
        }
        System.out.println();

        System.out.println("display all the values in a stack by removing them.");
        while(!myStack.isEmpty()) {
            System.out.println(myStack.pop());
        }

        System.out.println();
        System.out.println(myStack.pop());
        System.out.println(myStack.peek());

    }

}
