package ParenthesisChecking;

public class intStackX {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public intStackX(int s) {
        maxSize = s;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int n) {
        stackArray[++top] = n;
    }

    public int pop() {
        return stackArray[top--];
    }

    public int peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
}