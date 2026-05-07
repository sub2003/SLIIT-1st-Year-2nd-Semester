package Tute06Aggregationpage08;

public class University {
    private Professor[] professor;
    private String universityName;
    private String department;

    public University(String department, Professor[] professor, String universityName) {
        this.department = department;
        this.professor = professor;
        this.universityName = universityName;
    }

    public void displayUniversityDetails(){
        System.out.println("University Name : "+universityName);
        System.out.println("Departmet Name : "+department);

        System.out.println();

        for (int i =0;i<professor.length;i++){
            professor[i].displayProfessorDetails();
            System.out.println();
        }
    }
}
