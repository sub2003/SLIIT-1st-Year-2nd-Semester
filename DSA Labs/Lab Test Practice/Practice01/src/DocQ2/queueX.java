package DocQ2;

public class queueX {
    private int maxSize;
    private int front;
    private int rear;
    private int nItems;
    private char[] queueArray;

    public queueX(int size) {
        maxSize = size;
        queueArray = new char[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(char item) {
        if (rear == maxSize - 1)
            rear = -1;

        queueArray[++rear] = item;
        nItems++;
    }

    public char remove() {
        char temp = queueArray[front++];
        if (front == maxSize)
            front = 0;

        nItems--;
        return temp;
    }

    public char peekFront() {
        return queueArray[front];
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }

    public int size() {
        return nItems;
    }
}
