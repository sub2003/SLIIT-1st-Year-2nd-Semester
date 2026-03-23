package Queue;

public class QueueX {
    private int maxSize;
    private int queArray[];
    private int front;
    private int rear;
    private int nItems;


    public QueueX(int s) {
        this.maxSize = s;
        this.queArray=new int[maxSize];
        front=0;
        rear=-1;
        nItems=0;


    }

    public void insert(int value){
        if(rear==maxSize-1){
            System.out.println("Queue is full.");  //  Actually the array is full.
        }
        else {
            rear++;
            queArray[rear]=value; //Or  queArray[++rear]=value;
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
    public int frontPeek(){
        if(nItems == 0){
            System.out.println("Queue is empty.");
            return -99;
        }
        else
            return queArray[front];
    }


    public void displayArray(){//to show array stays the same
        System.out.print("[");
        for(int i=0;i<maxSize;i++){
            System.out.print(queArray[i]);
            if(!(i==(maxSize-1))){
                System.out.print(",");
            }


        }
        System.out.println("]");
    }


    public void displayQueue(){
        System.out.print("[");
        for(int i = front; i <= rear; i++){
            System.out.print(queArray[i]);
            if(i != rear){
                System.out.print(",");
            }
        }
        System.out.println("]");
    }

}
