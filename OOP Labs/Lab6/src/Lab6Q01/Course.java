package Lab6Q01;

public class Course {
    protected String courseID;
    protected String courseName;
    protected int durationWeeks;

    public Course() {
        this.courseID = "";
        this.courseName = "";
        this.durationWeeks = 0;
    }

    public Course(String courseID, String courseName, int durationWeeks) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.durationWeeks = durationWeeks;
    }

    public void displayCourseDetails(){

    }

    public double calculateTotalFee(){
        return 10000.00;
    }
    public double calculateTotalFee(double discountPercentage){
        calculateTotalFee();
        return calculateTotalFee()*discountPercentage;
    }

}
