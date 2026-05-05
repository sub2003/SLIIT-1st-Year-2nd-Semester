package Q02;

public class Course extends Student {

    String courseName;

    public Course(int age, String name, String courseName) {
        super(age, name);
        this.courseName = courseName;
    }

    public void displayCourseInfo() {
        super.displayIfo();
        System.out.println("Course Name ; "+courseName);
    }


}
