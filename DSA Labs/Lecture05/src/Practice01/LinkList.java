package Practice01;

public class LinkList {

    private Link first;

    public LinkList(){
        first=null;
    }

    public void insertFirst(int id){
        Link newLink1=new Link(id);

        newLink1.next=first;
        first=newLink1;
    }

    public boolean isEmpty(){
        return (first==null);
    }

    public Link deleteFirst(int data){
        if(isEmpty()){
            System.out.println("Linked List is empty. nothing is deleted");
            return null;
        }
        Link temp= first;
        first=first.next;
        return temp;
    }

    public Link find(int data){
        Link current=first;
        while (current!=null){
            if(current.iData==data){
                return current;
            }
            current=current.next;
        }
        return null;
    }

    public void displayList(){
        Link current=first;
        while (current!=null){
            current.displayLink();
            current=current.next;
        }
        System.out.println();
    }

    public boolean insertAfter(int key, int newData){
        Link current=first;
        while (current!=null){
            if (current.iData==key){
                break;
            }
            current=current.next;
        }
        if (current==null){
            System.out.println("The key : "+key+" is not found.");
            return false;
        }// we can't use return (current!=null); except this whole block.
        //Because even if its true or false what ever below code won't execute.
        //because it's already returned

        Link newLink2=new Link(newData);
        newLink2.next=current.next;
        current.next=newLink2;
        return true; //OR return current!=null

    }

    public Link deleteAfter(int data){
        if (isEmpty()){
            System.out.println("Link List is empty. nothing deleted. ");
            return null;
        }
        if(data==first.iData){
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
        System.out.println("The data "+data+" is not found . nothing deleted");
        return null; //Or we can use return current
    }
}
