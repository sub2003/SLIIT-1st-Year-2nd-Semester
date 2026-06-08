package Q01;

public abstract class Assessment {
    protected String assessmentID;
    protected String title;
    protected double marks;

    public Assessment(String assessmentID, double marks, String title) {
        this.assessmentID = assessmentID;
        this.marks = marks;
        this.title = title;
    }

    public abstract double calculateWeightageMarks();

    public void displayAssessmentDetails() {
        System.out.println("Assessment ID: " + assessmentID);
        System.out.println("Title        : " + title);
        System.out.println("Marks        : " + marks);
        System.out.println("Weighted Mark: " + calculateWeightageMarks());
    }

}
