package Tute06UniAssociationpage13;

public class Student {
    private String studentName;
    private ClassRoom className;

    public Student(String studentName) {
        this.studentName = studentName;
    }

    public void setClassRoom(ClassRoom className){
        this.className=className;
    }

    public void displayStudentDetails(){
        System.out.println("Student Name : "+studentName+"      Class : "+className.getClassName());
    }
}
