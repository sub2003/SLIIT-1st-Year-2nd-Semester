package ChatGPTQ02;

public class Lecturer extends AcademicUser {

    private String department;

    public Lecturer(String userID, String name, String department) {
        super(userID, name);
        this.department = department;
    }

    @Override
    public void displayRole() {
        System.out.println("Lecturer is teaching a course.");
    }

    public String getDepartment() {
        return department;
    }
}
