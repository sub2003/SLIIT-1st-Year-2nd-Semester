package Q1;

public class Student {
    private int studentID;
    private String studentName;
    private String degreeProgram;
    private double semesterFee;

    public Student(String degreeProgram, double semesterFee, int studentID, String studentName) {
        this.degreeProgram = degreeProgram;
        this.semesterFee = semesterFee;
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public Student(int studentID, String studentName) {
        this.studentName=studentName;
        this.studentID = studentID;
        this.semesterFee = 0.0;
        this.degreeProgram = "Not Assignned";
    }

    public void displayStudentDetails(){
        System.out.println("Student Name : "+studentName);
        System.out.println("Student ID : "+studentID);
        System.out.println("Student degree program : "+degreeProgram);
        System.out.println("Semester fee : "+semesterFee);
    }

    public  double calculateFee(double registrationCharge){
        double totalCost=0.0;
        totalCost=registrationCharge+semesterFee;

        System.out.println("Semester finalized total cost : "+totalCost);

        return totalCost;
    }
}
