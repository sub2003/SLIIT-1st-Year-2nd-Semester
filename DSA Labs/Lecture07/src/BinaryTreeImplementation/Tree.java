package BinaryTreeImplementation;

public class Tree {
    private Node root;

    public Tree() {
        this.root = null;
    }

    public Node find(int key){
        Node current=root;
        while (current.iData!=key){

            if(key<current.iData){
                current=current.leftChild;
            }
            else {
                current=current.rightChild;
            }
            if (current==null){
                return null;
            }
        }
        return current;
    }

    public void insert(int key,double data){
        Node newNode=new Node();  // we don't create a default constructor. so default constructor is called
        // Assign data
        newNode.iData=key;
        newNode.dData=data;

        if (root==null){ //check tree is empty
            root=newNode; //if its empty
        }
        else{
            Node current=root;
            Node parent;
            while (true){
                parent=current;  //cuz everytime if there are subtrees . current is a parent.
                // At a time check only one level

                if (key<current.iData){
                    current=current.leftChild;
                    if (current==null){
                        parent.leftChild=newNode;
                        return;
                    }

                }
                else {
                    current=current.rightChild;
                    if (current==null){
                        parent.rightChild=newNode;
                        return;
                    }
                }
            }
        }
    }
}
