package Q06;

public class Instructor implements Enrollable,Teachable {

    private String instructorName;

    public Instructor(String instructorName) {
        this.instructorName = instructorName;
    }

    @Override
    public void enrollCourse(String courseName) {
        System.out.println(instructorName+" enrolled in "+courseName);
    }

    @Override
    public void assignCourse(String courseName) {
        System.out.println(instructorName+" is assigned to teach "+courseName);
    }
}
