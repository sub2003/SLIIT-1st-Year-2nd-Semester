package Q03;

public class Student {
    private String studentID;
    private String studentName;
    static String universityName;

    public Student(String studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public void displayStudentInfo(){
        System.out.println("Student ID : "+studentID);
        System.out.println("Student Name : "+studentName);
        System.out.println("University Name : "+universityName);
        System.out.println();

    }


}
