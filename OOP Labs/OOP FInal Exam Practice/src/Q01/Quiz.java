package Q01;

public class Quiz extends Assessment{

    public Quiz(String assessmentID, double marks, String title) {
        super(assessmentID, marks, title);
    }

    @Override
    public double calculateWeightageMarks() {
        return marks*0.10;
    }
}
