package chatGPT_Q01;

public class Course {

    private Student[] students;
    private int studentCount;
    private String courseName;

    public Course(String courseName, int size) {
        this.courseName = courseName;
        this.studentCount = 0;
        this.students = new Student[size];
    }

    public String getCourseName(){
        return courseName;
    }

    public void addStudents(Student student){
        if(studentCount<students.length){
            students[studentCount]=student;
            student.setCourse(this);
            studentCount++;
        }
        else {
            System.out.println("Course is Full.");
        }
    }

    public void displayCourseStudents(){
        System.out.println("Course Name : "+getCourseName()+"\n\n");

        for (int i=0;i<studentCount;i++){
            students[i].displayStudentDetails();
        }
        System.out.println();
    }
}
