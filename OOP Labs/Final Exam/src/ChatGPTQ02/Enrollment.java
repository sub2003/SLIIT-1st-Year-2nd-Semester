package ChatGPTQ02;

public class Enrollment {

    private String enrollmentID;
    private Student student;
    private Course course;
    private double marks;

    public Enrollment(String enrollmentID, Student student, Course course, double marks) {
        this.enrollmentID = enrollmentID;
        this.student = student;
        this.course = course;
        this.marks = marks;
    }

    public String calculateFinalGrade() {
        if (marks >= 75) {
            return "A";
        } else if (marks >= 65) {
            return "B";
        } else if (marks >= 50) {
            return "C";
        } else {
            return "F";
        }
    }

    public void displayEnrollmentDetails() {
        System.out.println("Student Enrollment Details");
        student.displayRole();

        System.out.println("Enrollment ID: " + enrollmentID);
        System.out.println("Student Name: " + student.getName());
        System.out.println("Course Name: " + course.getCourseName());
        System.out.println("Lecturer Name: " + course.getLecturer().getName());
        System.out.println("Course Material: " + course.getCourseMaterial().getMaterialTitle());
        System.out.println("File Type: " + course.getCourseMaterial().getFileType());
        System.out.println("Marks: " + marks);
        System.out.println("Final Grade: " + calculateFinalGrade());
    }
}
