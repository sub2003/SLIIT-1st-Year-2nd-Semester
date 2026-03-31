package Lab6Q01;

public class PremiumCourse extends Course{
    boolean includeCertification;

    public PremiumCourse(){
        super();
        this.includeCertification=false;
    }

    public PremiumCourse(String courseID, String courseName, int durationWeeks, boolean includeCertification) {
        super(courseID, courseName, durationWeeks);
        this.includeCertification = includeCertification;
    }

    @Override
    public double calculateTotalFee() {

        return (150*durationWeeks)+((includeCertification)?50:0 );

    }

    @Override
    public void displayCourseDetails() {
        System.out.println("=== Premium Course ===");
        System.out.println("Course ID : "+courseID);
        System.out.println("Course Name: "+courseName);
        System.out.println("Duration : "+durationWeeks+" weeks");
        System.out.println("Certification Included : "+((includeCertification)?"Yes":"No"));
        System.out.println("Total Fee : $"+calculateTotalFee());
        System.out.println("Basic Fee : $"+calculateTotalFee());
        System.out.println("Discounted Fee (20%) : $"+calculateTotalFee(20));

    }
}
