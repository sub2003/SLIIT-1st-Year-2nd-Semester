package Q01;

public class Project extends Assessment{

    public Project(String assessmentID, double marks, String title) {
        super(assessmentID, marks, title);
    }

    @Override
    public double calculateWeightageMarks() {
        return marks*0.1;
    }
}
