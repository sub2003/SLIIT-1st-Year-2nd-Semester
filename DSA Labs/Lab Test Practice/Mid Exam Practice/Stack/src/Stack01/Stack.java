package Stack01;

public class Stack {
    private int size;
    private int [] StackArray;
    private int top;

    public Stack(int size) {
        this.size = size;
        StackArray = new int[this.size];
        this.top = -1;
    }

    void push(int item) {
        if (top == size - 1) {
            System.out.println("Stack is full.");
        } else {
            top = top + 1;
            StackArray[top] = item;   //StackArray[++top]=item
        }
    }

    int pop(){
        if (top==-1){
            System.out.println("Stack is empty.");
            return -1;
        }
        else{
            return StackArray[top--];
        }
    }

    int peek(){
        if(top==-1){
            System.out.println("Stack is empty.");
            return -1;
        }
        else {
            return StackArray[top];
        }
    }

    boolean isEmpty(){
        return (top==-1);
    }

    boolean isFull(){
        return (top==size-1);
    }








}
