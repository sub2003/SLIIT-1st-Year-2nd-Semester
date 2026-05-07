package Tute06UniAssociationpage13;

public class SchoolManagementSystem {
    static void main(String[] args) {

        Student student1=new Student("Subhanu");
        Student student2=new Student("Yenuka");

        ClassRoom classRoom1=new ClassRoom("12-B",3);
        classRoom1.addStudent(student1);
        classRoom1.addStudent(student2);
        classRoom1.displayClassDetails();

        System.out.println("\nIndividual View");
        student1.displayStudentDetails();
    }
}
