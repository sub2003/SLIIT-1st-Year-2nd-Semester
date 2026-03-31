package Lab6Q01;

public class RegularCourse extends Course {
    private boolean hasLiveSessions;

    public RegularCourse() {
        super();
        this.hasLiveSessions = false;
    }

    public RegularCourse(String courseID, String courseName, int durationWeeks,boolean hasLiveSessions) {
        super(courseID, courseName, durationWeeks);
        this.hasLiveSessions=hasLiveSessions;
    }


    @Override
    public double calculateTotalFee() {
        return 100 * durationWeeks;
    }

    @Override
    public void displayCourseDetails() {
        System.out.println("=== Regular Course ===");
        System.out.println("Course ID : "+courseID);
        System.out.println("Course Name: "+courseName);
        System.out.println("Duration : "+durationWeeks+" weeks");
        System.out.println("Live Sessions Included : "+((hasLiveSessions)?"Yes":"No"));
        System.out.println("Total Fee : $"+calculateTotalFee());
        System.out.println("Basic Fee : $"+calculateTotalFee());
        System.out.println("Discounted Fee (10%) : $"+calculateTotalFee(10));
    }
}
