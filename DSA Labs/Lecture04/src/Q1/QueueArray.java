package Q1;

public class QueueArray {
    private int maxSize;
    private int Queue[];
    private int rear;
    private int front;
    private int nItems;


    public QueueArray(int maxSize) {
        this.maxSize = maxSize;
        Queue = new int[this.maxSize];
        rear = -1;
        front = 0;
        nItems = 0;
    }

    public void insert(int item) {
        if (rear == maxSize - 1) {
            System.out.println("Queue Data Structure is full");
        } else {
            rear++;
            Queue[rear] = item;
            nItems++;
        }
    }

    public int remove() {
        if (nItems==0) {
            System.out.println("Queue is Empty");
            return -99;
        } else {
            nItems--;
            return Queue[front++];
        }
    }

    public int peekFront() {
        if (nItems==0) {
            System.out.println("Queue is Empty");
            return -99;
        } else {
            return Queue[front];
        }
    }

    public boolean isEmpty() {
        if (nItems == 0)
            return true;

        else {
            return false;
        }

        //Or return nItems==0;
    }

    public boolean isFull() {
        if (nItems == maxSize) {
            return true;
        } else
            return false;

        //Or return nItems==maxSize;
    }

    public int getCount() {
        return nItems;
    }
    public void display(){
        System.out.print("Queue elements:");
        for(int i=front;i<=rear;i++) {
            if(i!=rear)
                System.out.print(" "+Queue[i]);
            else
                System.out.println(" "+Queue[i]);
        }
    }

    static void main(String[] args) {
        QueueArray qa = new QueueArray(4);

        qa.insert(10);
        qa.insert(20);
        qa.insert(30);

        qa.display();
        System.out.println("Removed: "+qa.remove());
        qa.display();
        System.out.println("Front Element: "+qa.peekFront());
        System.out.println("Queue count: "+qa.getCount());

    }
}