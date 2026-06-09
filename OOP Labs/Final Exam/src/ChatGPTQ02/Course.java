package ChatGPTQ02;

public class Course {

    private String courseCode;
    private String courseName;
    private int creditValue;

    private CourseMaterial courseMaterial; // Composition
    private Lecturer lecturer;             // Aggregation

    public Course(String courseCode, String courseName, int creditValue,
                  String materialTitle, String fileType, Lecturer lecturer) {

        this.courseCode = courseCode;
        this.courseName = courseName;
        this.creditValue = creditValue;

        // CourseMaterial is created inside Course
        // This shows composition
        this.courseMaterial = new CourseMaterial(materialTitle, fileType);

        // Lecturer is created outside and passed into Course
        // This shows aggregation
        this.lecturer = lecturer;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCreditValue() {
        return creditValue;
    }

    public CourseMaterial getCourseMaterial() {
        return courseMaterial;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }
}
