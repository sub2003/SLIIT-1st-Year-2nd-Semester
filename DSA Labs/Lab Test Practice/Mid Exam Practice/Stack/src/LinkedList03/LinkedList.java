package LinkedList03;

public class LinkedList {
    private Link first;

    public LinkedList() {
        this.first = null;
    }

    public boolean isEmpty(){
        return first==null;
    }

    public void displayList(){
        Link current=first;

        System.out.println("first-> ");
        while (current!=null){
            current.displayLink();
            current=current.next;

        }
    }

    public void insertFirst(int data){
        Link newLink1=new Link(data);
        newLink1.next=first;
        first=newLink1;
    }

    public  boolean insertAfter(int key,int data){
        Link current=first;

        while (current!=null){
            if (current.iData==key){
                break;
            }
            current=current.next;
        }
        if (current==null){
            System.out.println("Key "+key+" is not found. Nothing is inserted.");
            return false;
        }

        Link newLink2=new Link(data);
        newLink2.next=current.next;
        current.next=newLink2;
        return true;
    }

    public Link deleteFirst(){
        if (isEmpty()){
            System.out.println("Linked List is Empty. Nothing is deleted.");
            return null;
        }

        Link temp=first;
        first=first.next;
        return temp;

    }

    public Link delete(int data){
        if (isEmpty()){
            System.out.println("Linked List is Empty.Nothing is deleted.");
            return null;
        }
        if(first.iData==data){
            Link temp=first;
            first=first.next;
            return temp;
        }
        Link previous=first;
        Link current=first.next;
        while (current!=null){
            if (current.iData==data){
                previous.next=current.next;
                return current;
            }
            previous=current;
            current=current.next;
        }

        System.out.println("Data "+data+" is not found. Nothing is deleted.");
        return null;

    }

    public Link find(int data){
        Link current=first;

        while (current!=null){
            if(current.iData==data){
                return current;
            }
            current=current.next;
        }
        System.out.println("Key "+data+" is not found.");
        return null;
    }












}
