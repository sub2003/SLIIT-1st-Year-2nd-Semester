package Lab6Q01;

public class RegularCourse extends Course {
    private boolean hasLiveSessions;

    public RegularCourse() {
        this.hasLiveSessions = true;
    }

    public RegularCourse(String courseID, String courseName, int durationWeeks) {
        super(courseID, courseName, durationWeeks);
    }

    public double calculateTotalFee(){
        double totalFee=100*super.durationWeeks;
        return totalFee;
    }
}
