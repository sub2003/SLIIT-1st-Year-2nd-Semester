package Queue01;

public class LinearQueue {

    private int size;
    private int []QueueArray;
    private int rear;
    private int front;
    private int nItems;

    public LinearQueue(int size) {
        this.size = size;
        this.rear = -1;
        this.nItems = 0;
        QueueArray = new int[this.size];
        this.front = 0;
    }

    void insert(int item){
        if(rear==size-1){
            System.out.println("Queue is Full.");
        }
        else{
            rear++;
            QueueArray[rear]=item; // QueueArray[++rear]=item;
            nItems++;
        }
    }

    int remove(){
        if (nItems==0){
            System.out.println("Queue is empty.");
            return -99;
        }
        else {
            nItems--;
            return QueueArray[front++];
        }
    }

    int peekfront(){
        if (nItems==0){
            System.out.println("Queue is empty.");
            return -99;
        }
        else {
            return QueueArray[front];
        }
    }

    boolean isEmpty(){
        return nItems==0;
    }

    boolean isFull(){
        return nItems==size;
    }


}
