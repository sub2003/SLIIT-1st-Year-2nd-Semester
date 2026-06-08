package Q01;

public class MidExam extends Assessment{

    public MidExam(String assessmentID, double marks, String title) {
        super(assessmentID, marks, title);
    }

    @Override
    public double calculateWeightageMarks() {
        return marks*0.2;
    }
}
