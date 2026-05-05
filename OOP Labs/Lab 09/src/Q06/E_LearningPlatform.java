package Q06;

public class E_LearningPlatform {

    static void main(String[] args) {

        Student student1=new Student("Subhanu");

        Instructor instructor1=new Instructor("Mr.Perera");

        student1.enrollCourse("Java Programming");

        instructor1.enrollCourse("Advanced Java");

        instructor1.assignCourse("Object oriented Programming");
    }
}
