package DoublyLinkedList;

public class LinkedList {

    Link first;

    public LinkedList() {
        this.first = null;
    }

    boolean isEmpty(){
        return first==null;
    }

    void displayLinkedList(){
        Link current=first;

        while (current!=null){
            current.displayLink();
            current=current.next;
        }
        System.out.println();
    }

    void insertfirst(int key,int data){
        Link newLink1=new Link(key,data);
        newLink1.next=first;
        newLink1.previous=null;
        if(first!=null){
            first.previous=newLink1; // if new link is not the only link in this linked list
            //current first node is hold null. but now we want to switch that connection to connect with new node.
        }
        first=newLink1;



        //after this process  first.previous holds null. cuz new node is first
        //first is new node. first.next is 2nd node means before insertion first node

    }

    /*
    void insertfirst(int key,int data){
        Link newLink1=new Link(key,data);
        newLink1.next=first;
        first.previous=newLink1; //this logic is incorrect when there is no any nodes in linked list
        first=newLink1;
    }
    */

    void insertAfter(int key,int newKey,int newData) {
        Link current = first;

        while (current != null) {
            if (current.key == key) {
                Link newLink2 = new Link(newKey, newData);
                newLink2.next = current.next;   // right side of new node → forward (next)
                newLink2.previous = current;    // left side of new node → backward (previous)

                if (current.next != null) {
                    current.next.previous = newLink2;  // right side of new node → backward (previous)

                }

                current.next = newLink2; // left side of new node → forward (next)
                return;
            }
            current = current.next;

        }

    }
    Link deleteFirst(){
        if (isEmpty())
            return null;

        Link temp=first;

        if (temp.next==null){
            first=null;

        }
        else {
            first = first.next; // first node left side forward
            first.previous = null;// first node  lest side backward
        }

        return temp;
    }






}
