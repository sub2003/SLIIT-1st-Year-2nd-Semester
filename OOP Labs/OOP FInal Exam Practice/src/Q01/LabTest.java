package Q01;

public class LabTest extends Assessment{

    public LabTest(String assessmentID, double marks, String title) {
        super(assessmentID, marks, title);
    }

    @Override
    public double calculateWeightageMarks() {
        return marks*0.1;
    }
}
