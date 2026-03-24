package TutorialQ03;

public class Univesity {

    private String universityName;
    private Professor prof[];


    Univesity(String universityName,Professor professors[]){
        this.universityName=universityName;
        prof=professors;
    }

    public void displayUniversityDetails() {
        System.out.println("Professor's university : " + universityName);
        for (int i = 0; i < prof.length; i++) {
            prof[i].displayProfessorDetails();
            System.out.println();
        }
    }
}
