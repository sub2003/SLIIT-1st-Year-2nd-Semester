package Stack;

public class Stack {
    int size;
    int top;
    int StackArray[];

    public Stack(int size) {
        this.size = size;
        StackArray = new int[this.size];
        this.top = top;
    }

    public void push(int item) {
        if (top == size - 1) {
            System.out.println("Stack is full.");
        } else {
            top = top + 1;
            StackArray[top] = item;  //StackArray[++top]=item;

        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return -1;
        } else {
            return StackArray[top--];
        }
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return -1;

        } else {
            return StackArray[top];
        }
    }

    public boolean isEmpty(){
        if(top==-1){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isEmpty1(){
        if(top!=-1){
            return false;
        }
        return true;
    }

    public boolean isFull(){
        return (top==size-1);
    }
}
