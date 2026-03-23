package Q2;

import java.util.Scanner;

public class QueueArray {
    private int maxSize;
    private int Queue[];
    private int nIems;
    private int rear;
    private int front;


    public QueueArray(int maxSize) {
        this.front =0;
        this.maxSize = maxSize;
        this.nIems = 0;
        Queue = new int[this.maxSize];
        this.rear = -1;

    }

    public void insert(int item){
        if(nIems==maxSize){
            System.out.println("Circular Queue is full.");
        }
        else{
            if(rear==maxSize-1)
                rear=-1;

            Queue[++rear]=item;
            nIems++;
        }
    }
    public int remove(){
        if(nIems==0){
            System.out.println("Circular Queue is empty");
            return -99;
        }
        else{
            int returningValue=Queue[front++];
            if(front==maxSize)
                front=0;

            nIems--;
            return returningValue;
        }
    }
    public int peekFront(){
        if(nIems==0) {
            System.out.println("Circular Queue is empty");
            return -99;
        }
        else
            return Queue[front];

    }
    public boolean isEmpty(){
        return nIems==0;
    }
    public boolean isFull(){
        return nIems==maxSize;
    }

    public static void display(){
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter the size of the circular queue: ");
        int max=scn.nextInt();

        QueueArray qa=new QueueArray(max);
        int i=0;
        while(qa.maxSize!=i){
            System.out.print("Enter element to insert: ");
            qa.insert(scn.nextInt());
            i++;

        }
        System.out.print("Enter new element to insert: ");
        qa.insert(scn.nextInt());

        if (qa.isFull()){
            System.out.println("Removing: "+qa.remove());
        }
        else{
            System.out.print("Enter new element to insert: ");
            qa.insert(scn.nextInt());
        }

        System.out.print("Enter new element to insert: ");
        qa.insert(scn.nextInt());

        System.out.print("Enter another element to insert: ");
        qa.insert(scn.nextInt());

    }

    public static void main(String[] args) {
        display();
    }
}
