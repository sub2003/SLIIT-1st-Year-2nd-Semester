package VersionC;

public class intQueueX {

    private int maxSize;
    private int[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public intQueueX(int s) {
        maxSize = s;
        queArray = new int[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }

        if (rear == maxSize - 1)
            rear = -1;

        queArray[++rear] = item;
        nItems++;
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        int temp = queArray[front++];
        if (front == maxSize)
            front = 0;

        nItems--;
        return temp;
    }

    public int peekFront() {
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