package Q01;

public class Assignment extends Assessment{

    public Assignment(String assessmentID, double marks, String title) {
        super(assessmentID, marks, title);
    }


    @Override
    public double calculateWeightageMarks() {
        return marks*0.1;
    }

}
