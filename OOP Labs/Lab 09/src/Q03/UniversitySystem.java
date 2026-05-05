package Q03;

public class UniversitySystem {
    static void main(String[] args) {

        Student std1=new Student("IT25100034","Aththanayaka A.B.C.S.R");
        Student std2=new Student("IT25100080","Rodrigo Y.K.S");
        Student std3=new Student("IT25100175","Dabare H.K");

        Student.universityName="SLIIT";


        System.out.println("-------Before Changing University Name-------");
        std1.displayStudentInfo();
        std2.displayStudentInfo();
        std3.displayStudentInfo();

        Student.universityName="SCU";

        System.out.println("------After Changing University Name-------");
        std1.displayStudentInfo();
        std2.displayStudentInfo();
        std3.displayStudentInfo();
    }
}
