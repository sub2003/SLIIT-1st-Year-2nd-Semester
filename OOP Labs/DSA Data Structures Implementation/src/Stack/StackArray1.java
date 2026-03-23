package Stack;

public class StackArray1 {
    private int maxSize; // Size of Array
    private int[] stackArr;
    private int top;    //  Top of the satck

    public StackArray1(int size){
        maxSize=size;
        stackArr=new int[maxSize];
        top=-1;
    }

    public void push(int item) {
        if (top == maxSize - 1)
            System.out.println("Stack is Full.");
        else {
            top++;
            stackArr[top] = item;
            // increment top. insert item
            //another way--> stackArray[++top] = j;
        }
    }
    public int pop(){
        if(top==-1) {
            System.out.println("Stack is empty.");
            return -1;
        }
        else{
            return stackArr[top--];
        }

    }
    public int peek() {
        if(top==-1) {
            System.out.println("Stack is empty.");
            return -1;
        }
        else
            return stackArr[top];

    }
    public boolean isEmpty(){
        boolean empty;
        if (top==-1){
            empty=true;
        }
        else
            empty=false;

        return empty;
    }
    public boolean isFull(){
        boolean full;
        if (top!=maxSize-1){
            full=false;
        }
        else
            full=true;

        return full;
    }
    public int getCount(){
        int count=top+1;

        return count;
    }


    public void display(){
        System.out.print("Stack elements: ");
        for(int i=0;i<=top;i++) {
            if (i < top) {
                System.out.print(stackArr[i] + " ");
            }
            else
                System.out.println(stackArr[i]);
        }
    }
    public static void main(String[] args) {

        StackArray1 x=new StackArray1(4);

        x.push(10);
        x.push(20);
        x.push(30);

        x.display();


        System.out.println("Peek : "+x.peek());
        System.out.println("Popped : "+x.pop());

        x.display();

        System.out.println("Is stack empty? "+x.isEmpty());
        System.out.println("is stack full? "+x.isFull());

    }

}
