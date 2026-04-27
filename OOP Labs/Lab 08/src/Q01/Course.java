package Q01;

public class Course {

    String courseCode;
    String courseTitle;


    public Course(String courseCode, String courseTitle) {
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
    }

    public void displayCourseDetails(){
        System.out.println("Course Code : "+courseCode);
        System.out.println("Course Title : "+courseTitle);
    }



}
