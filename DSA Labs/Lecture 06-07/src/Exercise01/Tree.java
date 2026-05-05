package Exercise01;

public class Tree {

    private Node root;

    public Tree() {
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
                    parent.right=newNode1;
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

    public void inOrder() {

        if (root == null) {
            System.out.println("Tree is empty.");
        }
        else {
            inOrder(root);
        }
    }

    private void preOrder(Node localRoot){
        if (localRoot!=null){
            localRoot.displayNode();
            preOrder(localRoot.left);
            preOrder(localRoot.right);
        }
    }

    public void preOrder() {

        if (root == null) {
            System.out.println("Tree is empty.");
        }
        else {
            preOrder(root);
        }
    }

    public void postOrder(Node localRoot){
        if (localRoot!=null){
            postOrder(localRoot.left);
            postOrder(localRoot.right);
            localRoot.displayNode();
        }
    }

    public void postOrder() {

        if (root == null) {
            System.out.println("Tree is empty.");
        }
        else {
            postOrder(root);
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

    public Node findRecursive(int emp) {
        return findRecursive(root, emp);
    }

    public void deleteAll(){
        root=null;
        System.out.println("All nodes are deleted.");
    }

}
