package Q2;

public class queueX {
    private int maxSize;
    private int queArray[];
    private int front;
    private int rear;
    private int nItems;


    public queueX(int s) {
        this.maxSize = s;
        this.queArray = new int[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;


    }

    public void insert(int value) {
        if (rear == maxSize - 1) {
            System.out.println("Queue is full.");  //Actually the array is full.
        } else {
            rear++;
            queArray[rear] = value; //Or  queArray[++rear]=value;
            nItems++;
        }
    }

    public int remove() {
        if (nItems == 0) {
            System.out.println("Queue is empty.");
            return -99;
        } else {
            nItems--;
            return queArray[front++];

        }
    }

    public int frontPeek() {
        if (nItems == 0) {
            System.out.println("Queue is empty.");
            return -99;
        } else
            return queArray[front];
    }

    public boolean isEmpty(){
            return nItems==0;
    }

}