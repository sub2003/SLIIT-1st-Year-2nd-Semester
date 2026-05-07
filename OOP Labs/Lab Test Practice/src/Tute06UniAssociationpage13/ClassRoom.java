package Tute06UniAssociationpage13;

public class ClassRoom {
    private Student[] students;
    private String className;
    private int studentCount;

    public ClassRoom(String className,int size) {
        this.students = new Student[size];
        this.className=className;
        this.studentCount=0;
    }

    public String getClassName(){
        return className;
    }

    public void addStudent(Student student){
        if(studentCount<students.length){
            students[studentCount]=student;
            student.setClassRoom(this);
            studentCount++;
        }
        else{
            System.out.println("Class is full. Cannot add more students.");
        }
    }

    public void displayClassDetails(){
        System.out.println("Class : "+className);

        for (int i=0;i<studentCount;i++){
            students[i].displayStudentDetails();
            System.out.println();
        }
    }
}
