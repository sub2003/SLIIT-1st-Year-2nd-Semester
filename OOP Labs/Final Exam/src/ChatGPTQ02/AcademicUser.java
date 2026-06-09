package ChatGPTQ02;

public class AcademicUser {

    protected String userID;
    protected String name;

    public AcademicUser(String userID, String name) {
        this.userID = userID;
        this.name = name;
    }

    public void displayRole() {
        System.out.println("Academic user belongs to the university.");
    }

    public String getUserID() {
        return userID;
    }

    public String getName() {
        return name;
    }
}
