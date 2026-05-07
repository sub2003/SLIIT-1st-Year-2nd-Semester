package chatGPT_Q01;

public class Student {

    private String studentName;
    private Course course;

    public Student(String studentName) {
        this.studentName = studentName;
    }

    public void setCourse(Course course1){
      course=course1;
    }

    public void displayStudentDetails(){
        System.out.println("Student Name : "+studentName);
        System.out.println("Course Name : "+course.getCourseName());
    }
}
