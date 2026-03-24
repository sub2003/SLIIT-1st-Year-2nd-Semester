package TutorialQ03;

public class Professor {
    private String name;
    private String subject;

    Professor (String n,String s ){
        name=n;
        subject=s;

    }

    public void displayProfessorDetails(){
        System.out.println("Professor's name : "+name);
        System.out.println("Professor's subject : "+subject);
    }



}
