package Tute06Aggregationpage08;

public class Professor {
    private String name;
    private String subject;

    public Professor(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void displayProfessorDetails(){
        System.out.println("Name of Professor : "+name);
        System.out.println("Attached Subject : "+subject);
    }



}
