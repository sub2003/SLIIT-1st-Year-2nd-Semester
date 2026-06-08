package Q01;

public class FinalExam extends Assessment implements Gradable{

    public FinalExam(String assessmentID, double marks, String title) {
        super(assessmentID, marks, title);
    }

    @Override
    public double calculateWeightageMarks() {

        return marks*0.5;
    }

    @Override
    public void displayGrade(double marks) {
        System.out.println("Final Exam Grade : ");
        if (marks>=90){
            System.out.print("A+");
        }
        else if (marks>=80) {
            System.out.println("A");
        }
        else if (marks>=75){
            System.out.println("A-");
        }
        else if (marks>=70) {
            System.out.println("B+");
        }
        else if (marks>=65) {
            System.out.println("B");
        }
        else if (marks>=60){
            System.out.println("B-");
        }
        else if (marks>=55) {
            System.out.println("C+");
        }
        else if (marks>=45) {
            System.out.println("C");
        }
        else if (marks>=40) {
            System.out.println("C-");
        }
        else if (marks>=35) {
            System.out.println("D+");
        }
        else if (marks>=30) {
            System.out.println("D");
        }
        else{
            System.out.println("E");
        }


    }
}
