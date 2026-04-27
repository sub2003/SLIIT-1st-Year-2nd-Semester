package Exercise01;

public class Node {
    int employeeNumber;
    String employeeName;
    Node left;
    Node right;

    public Node(int employeeNumber,String employeeName) {
        this.employeeName = employeeName;
        this.employeeNumber = employeeNumber;
        this.left = null;
        this.right = null;
    }

    void displayNode(){
        System.out.println("Employee Number : "+employeeNumber+"  ,       Employee Name : "+employeeName);
    }
}
