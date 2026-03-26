package SecondTimeDocQ1;

public class charQueueX {

    private int maxSize;
    private char[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public charQueueX(int s) {
        maxSize = s;
        queArray = new char[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(char item) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }

        if (rear == maxSize - 1)
            rear = -1;

        queArray[++rear] = item;
        nItems++;
    }

    public char remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return 0;
        }

        char temp = queArray[front++];
        if (front == maxSize)
            front = 0;

        nItems--;
        return temp;
    }

    public char peekFront() {
        return queArray[front];
    }

    public boolean isEmpty() {
        return nItems == 0;
    }

    public boolean isFull() {
        return nItems == maxSize;
    }

    public int size() {
        return nItems;
    }
}