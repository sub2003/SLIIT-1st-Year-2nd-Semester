package Queue01;

import Queue.Queue;

public class CircularQueue02 {

    private int size;
    private int[] QueueArray;
    private int rear;
    private int front;
    private int nItems;

    public CircularQueue02(int size) {
        this.size = size;
        this.nItems = 0;
        QueueArray = new int[this.size];
        this.rear = -1;
        this.front = 0;
    }

    void insert(int item){
        if(nItems==size){
            System.out.println("Circular Queue is full.");
        }
        else{
            if(rear==size-1)
                rear=-1;

            QueueArray[++rear]=item;
            nItems++;
        }
    }

    int remove(){
        if(nItems==0){
            System.out.println("Circular Queue is Empty.");
            return -99;
        }
        else{
            int temp=QueueArray[front++];
            if (front==size){
                front =0;
            }
            nItems--;
            return temp;
        }
    }
    int peekfront(){
        if (nItems==0){
            System.out.println("Circular Queue is Empty.");
            return -99;
        }
        else{
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
