package ChatGPTnewQ01;

public class Department {
    private String departmentName;
    private String location;

    public Department(String departmentName, String location) {
        this.departmentName = departmentName;
        this.location = location;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public String getLocation() {
        return location;
    }
}
