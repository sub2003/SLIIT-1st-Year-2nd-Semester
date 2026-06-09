package ChatGPTQ02;

public class Student extends AcademicUser {

    private String degreeProgram;

    public Student(String userID, String name, String degreeProgram) {
        super(userID, name);
        this.degreeProgram = degreeProgram;
    }

    @Override
    public void displayRole() {
        System.out.println("Student is enrolled in a course.");
    }

    public String getDegreeProgram() {
        return degreeProgram;
    }
}
