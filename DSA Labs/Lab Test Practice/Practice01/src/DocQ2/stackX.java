package DocQ2;

public class stackX {
    private int maxSize; // Size of Array
    private char[] stackArr;
    private int top;    //  Top of the satck

    public stackX(int size) {
        maxSize = size;
        stackArr = new char[maxSize];
        top = -1;
    }

    public void push(char j) {
        if (top == maxSize - 1)
            System.out.println("Stack is Full.");
        else {
            top++;
            stackArr[top] = j;
            // increment top. insert item
            //another way--> stackArray[++top] = j;
        }
    }

    public char pop() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return '\0';
        } else {
            return stackArr[top--];
        }

    }

    public char peek() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return '\0';
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
