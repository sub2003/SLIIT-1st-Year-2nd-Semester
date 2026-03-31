package Lab6Q01;

public class Course {
    protected String courseID;
    protected String courseName;
    protected int durationWeeks;

    public Course() {
        this.courseID = "N/A";
        this.courseName = "N/A";
        this.durationWeeks = 0;
    }

    public Course(String courseID, String courseName, int durationWeeks) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.durationWeeks = durationWeeks;
    }

    public void displayCourseDetails(){
        System.out.println("Course Name: "+courseName);
        System.out.println("Course ID : "+courseID);
        System.out.println("Course Duration (Weeks) : "+durationWeeks);
        System.out.println("Total Fee : "+calculateTotalFee());
        System.out.println("Basic Fee : "+calculateTotalFee());
    }

    public double calculateTotalFee(){
        return 10000.00;
    }
    public double calculateTotalFee(double discountPercentage){
        double discountedFee=(calculateTotalFee()*discountPercentage/100);
        return calculateTotalFee()-discountedFee;

    }

}
