package Q01;

public class Course {
    private String courseCode;
    private String courseName;
    private Assessment[] assessments;
    private int assessmentCount;


    public Course(int assessmentSize, String courseCode, String courseName) {
        this.assessments =new Assessment[assessmentSize];
        this.assessmentCount = 0;
        this.courseCode = courseCode;
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void addAssessment(Assessment assessment) {
        if (assessmentCount < assessments.length) {
            assessments[assessmentCount] = assessment;
            assessmentCount++;
        } else {
            System.out.println("Assessment list is full.");
        }
    }

    public void displayCourseDetails(){
        System.out.println("Course Code : "+courseCode);
        System.out.println("Course Name : "+courseName);
        double totalWeightedMarks = 0;
        System.out.println("Assessments : ");
        for(int i=0;i<assessmentCount;i++){
            assessments[i].displayAssessmentDetails();
            System.out.println();
            totalWeightedMarks += assessments[i].calculateWeightageMarks();

            if (assessments[i] instanceof Gradable) {
                Gradable gradable = (Gradable) assessments[i];
                System.out.println("Total Marks : "+totalWeightedMarks);
                gradable.displayGrade(totalWeightedMarks);
            }

            System.out.println();
        }
    }
}
