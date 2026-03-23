package Q1;

public class stackX {
    private int maxSize; // Size of Array
    private int[] stackArr;
    private int top;    //  Top of the satck

    public stackX(int size) {
        maxSize = size;
        stackArr = new int[maxSize];
        top = -1;
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

    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return -1;
        } else {
            return stackArr[top--];
        }

    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return -1;
        } else
            return stackArr[top];

    }

    public boolean isEmpty() {

        return top==-1;
    }

    public boolean isFull() {

        return top==maxSize-1;
    }
}
