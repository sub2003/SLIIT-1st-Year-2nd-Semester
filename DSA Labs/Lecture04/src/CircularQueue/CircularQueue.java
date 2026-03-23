package CircularQueue;

import Q1.QueueArray;

public class CircularQueue {
    private int maxSize;
    private int rear;
    private int front;
    private int Queue[];
    private int nItems;

    public CircularQueue(int maxSize) {
        this.front = 0;
        this.maxSize = maxSize;
        this.nItems = 0;
        Queue = new int[this.maxSize];
        this.rear = -1;
    }

    public void insert(int item){
        if(nItems==maxSize){
            System.out.println("Circular Queue Data Structure is full.");
        }
        else{
            if(rear==maxSize-1)
                rear=-1;

            Queue[++rear]=item;
            nItems++;
        }
    }


    public int remove(){
        if(nItems==0){
            System.out.println("Circular Queue is empty");
            return -1;
        }
        else {
            int returningValue=Queue[front++];
            if(front==maxSize)
                front=0;

            nItems--;
            return returningValue;
        }
    }

    public int peekFront(){
        if(nItems==0){
            System.out.println("Circular Queue is empty");
            return -1;
        }
        else {
            return Queue[front];
        }
    }

    static void main(String[] args) {
        CircularQueue cq=new CircularQueue(8);

        cq.insert(10);
        cq.insert(10);
        cq.insert(10);
        cq.insert(10);
        cq.insert(10);
        cq.insert(10);
        cq.insert(10);
        cq.insert(10);
        cq.insert(10);
        cq.insert(10); 
    }



}
