package Q06;

public class Student implements Enrollable{

    private String studentName;

    public Student(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public void enrollCourse(String courseName) {
        System.out.println(studentName+" enrolled in "+courseName);
    }
}
