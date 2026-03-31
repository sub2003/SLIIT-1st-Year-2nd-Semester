package Lab05.Exercise01;

public class LinkedList {
    private Link first;

    public LinkedList(){
        first=null;
    }

    public boolean isEmpty(){
        return (first==null);
    }

    public void InsertFirst(int id,int marks){
        Link newLink1=new Link(id,marks);
        newLink1.next=first;
        first=newLink1;
    }

    public Link DeleteFirst(){
        if(isEmpty()){
            System.out.println("Linked List is empty. nothing deleted.");
            return null;
        }
        Link temp=first;
        first=first.next;
        return temp;
    }

    public boolean InsertAfter
}
