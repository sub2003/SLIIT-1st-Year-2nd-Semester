package Q01;

public class LabSubmissionsAndViva extends Assessment{

    public LabSubmissionsAndViva(String assessmentID, double marks, String title) {
        super(assessmentID, marks, title);
    }

    @Override
    public double calculateWeightageMarks() {
        return marks*0.1;
    }
}
