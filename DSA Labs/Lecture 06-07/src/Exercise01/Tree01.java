package Exercise01;

public class Tree01 {

    private Node root;

    public Tree01() {
        this.root = null;
    }

    public Node find(int emp){
        Node current=root;

        while (current!=null){
            if(emp==current.employeeNumber)
                return current;
            else if (emp<current.employeeNumber) {
                current=current.left;
            }
            else {
                current=current.right;
            }
        }

        return null;
    }

    public  Node insert(int emp,String name){
        Node newNode1=new Node(emp,name);

        if (root==null){
            root=newNode1;
            return newNode1;
        }

        Node current=root;
        Node parent;

        while (true){
            parent=current;
            if (emp<current.employeeNumber) {
                current = current.left;
                if (current == null) {
                    parent.left = newNode1;
                    return newNode1;
                }
            }
            else if (emp>current.employeeNumber) {
                current=current.right;
                if (current==null){
                    parent.left=newNode1;
                    return newNode1;
                }
            }
            else{
                current.employeeName=name;
                return current;
            }
        }
    }

    private void inOrder(Node localRoot){
        if (localRoot!=null){
            inOrder(localRoot.left);
            localRoot.displayNode();
            inOrder(localRoot.right);
        }
    }

    private void preOrder(Node localRoot){
        if (localRoot!=null){
            localRoot.displayNode();
            inOrder(localRoot.left);
            inOrder(localRoot.right);
        }
    }

    public void postOrder(Node localRoot){
        if (localRoot!=null){
            inOrder(localRoot.left);
            inOrder(localRoot.right);
            localRoot.displayNode();
        }
    }

    private Node findRecursive(Node localRoot,int emp){
        if (localRoot==null){
            return null;
        }

        if (emp==localRoot.employeeNumber){
            return  localRoot;
        }
        else if (emp<localRoot.employeeNumber) {
            return findRecursive(localRoot.left, emp);
        }
        else {
            return findRecursive(localRoot.right,emp);
        }
    }

    public void deleteAll(){
        root=null;
        System.out.println("All nodes are deleted.");
    }

}
