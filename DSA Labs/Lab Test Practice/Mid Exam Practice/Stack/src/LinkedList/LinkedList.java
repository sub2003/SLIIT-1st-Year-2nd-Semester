package LinkedList;

public class LinkedList {

    public Link first;

    public LinkedList() {
        this.first = null;
    }

    boolean isEmpty(){
        return first==null;
    }

    void insertFirst(int data){
        Link newLink=new Link(data);
        newLink.next=first;
        first=newLink;
    }

    Link deleteFirst(){
        if (isEmpty()){
            System.out.println("Linked List is empty. nothing deleted.");
            return null;
        }
        Link temp=first;
        first=first.next;
        return temp;
    }

    boolean insertAfter(int key,int newData){
        Link current=first;

        while (current!=null){
            if(current.iData==key){
                break;
            }
            current=current.next;
        }

        if (current==null){
            System.out.println("Key "+key+" not found - cannot insert.");
            return false;
        }


        Link newLink2=new Link(newData);
        newLink2.next=current.next;
        current.next=newLink2;
        return true;
    }

    Link delete(int data){
        if (isEmpty()){
            System.out.println("Linked List is empty. nothing is deleted.");
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
        System.out.println("Data "+data+" is not found. nothing is deleted");
        return null;
    }

    Link find(int data){
        Link current=first;

        while (current!=null){
            if (current.iData==data){
                return current;
            }
            current=current.next;
        }
        return null;
    }
}
