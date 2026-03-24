package TutorialQ03;

public class UniversityApp {
    static void main(String[] args) {
        Professor p1=new Professor("Subhanu","AI");
        Professor p2=new Professor("Subhanu","DS");
        Professor p3=new Professor("Subhanu","SE");

        Professor[] professorList={p1,p2,p3};
        Univesity u=new Univesity("SLIIT",professorList);

        
        u.displayUniversityDetails();
    }
}
