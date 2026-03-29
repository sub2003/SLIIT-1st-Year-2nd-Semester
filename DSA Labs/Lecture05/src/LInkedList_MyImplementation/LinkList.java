package LInkedList_MyImplementation;

public class LinkList {

    private Link first;

    public boolean isEmpty(){
        if(first==null){
            return true;
        }
        else{
            return false;
        }

        //return (first==null);
    }

    public void displayList(){
        Link current=first;

        System.out.print("first -> ");

        while(current!=null){
            current.displayLink();
            current=current.next;
        }

        System.out.println("null");
    }

    public void insertFirst(int id){
        Link newLink1=new Link(id);
        newLink1.next=first; //null
        first=newLink1;
    }

    public Link deleteFirst(){
        if(isEmpty()){
            System.out.println("Linked lis is empty -nothing to delete.");
            return null;
        }
        Link temp=first;
        first=first.next;  // access first reference to 2nd node reference;
        return temp;   //1nodes next ==null
    }

    public Link find(int key){
        Link current=first;

        while(current!=null){
            if(current.iData==key){
                return current;
            }
            current=current.next;
        }
        return null;
    }


    public boolean insertAfter(int key,int newData){
        Link current=first;

        while (current!=null){
            if(current.iData==key){

                break;
            }
            current=current.next;   //at last if the key is not found through current .next , current become null.
        }

        if(current==null){   //at last if we didnt find the key current is null so we should return false.
            System.out.println("Key "+key+" not found - cannot insert.");
            return false;
        }//if this block is not executed below codes should execute and return true. which means the key is found.
        // even the key is at last node, break stops executing current as null


        Link newLink=new Link(newData);
        newLink.next=current.next; // when we do this. break the link between current and current.next
        current.next=newLink;    // then now current.next= connect with new link's reference
        return true; // after all this happened all this work correctly so we return true;
    }


    public Link delete(int data){
        if(isEmpty()){
            System.out.println("Linked lis is empty");
            return null;

        }
        if(first.iData==data){  //if the input data is similar to first node's value
            Link temp=first;
            first=first.next;
            return temp;
        }


        //after first
        Link previous=first;
        Link current=first.next;

        while (current!=null){
            if(current.iData==data){
                previous.next=current.next;
                return current;
            }

            //to do through list
            previous=current; //=previous.next   cant we use this instead of current? like below one
            //yes we can it's same thing.
            current=current.next;
        }

        System.out.println("Data "+data+" not found - nothing deleted.");
        return null; //cant weu ese return current/? cuz if there is no such data current goes to null no.
    }   //yes we can use return current but the reader has to think twice is it current always null here.
       //so it's a best practice programmers like this way over return current;


}
