package Lab05.Exercise01;

public class LinkedList {

    private Link first;

    public LinkedList() {
        this.first = null;
    }

    public boolean isEmpty(){
        return first==null;
    }

    public void InsertFirst(int id,int marks){
        Link newLink1=new Link(id,marks);
        newLink1.next=first;
        first=newLink1;

    }
    public boolean InsertionAfter(int key,int id,int marks){
        if(isEmpty()){
            System.out.println("Linked List is empty. Nothing Inserted.");
            return false;

        }
        Link current=first;
        while (current!=null){
            if (current.studentId==key){
                Link newLink2=new Link(id,marks);
                newLink2.next=current.next;
                current.next=newLink2;
                return true;
            }
            current=current.next;

        }
        return false;
    }

    public Link Find(int key){
        if (isEmpty()){
            System.out.println("Linked List is empty.");
            return null;
        }
        Link current=first;
        while (current!=null){
            if(current.studentId==key){
                return current;
            }
            current=current.next;
        }
        return null;

    }

    public Link DeleteFirst(){
        if (isEmpty()){
            System.out.println("Linked List is empty.");
            return null;
        }
        Link temp=first;
        first=first.next;
        return temp;
    }

    public Link Delete(int key){
        if(isEmpty()){
            System.out.println("Linked List is empty.");
            return null;
        }
        Link previous=null;
        Link current=first;

        while (current!=null) {
            if(current.studentId == key){
                if(current == first){
                    first = first.next;
                } else {
                    previous.next = current.next;
                }
                System.out.print("List after deleting Id "+key+": ");

                return current;
            }

            previous=current;
            current=current.next;
        }
        return null;
    }

    public void displayLink(){
        if(isEmpty()){
            System.out.println("Linked List is Empty.");
        }
        Link current=first;
        while (current!=null){
            System.out.println("ID: "+current.studentId+", Marks: "+current.marks);
            current=current.next;
        }

    }
}