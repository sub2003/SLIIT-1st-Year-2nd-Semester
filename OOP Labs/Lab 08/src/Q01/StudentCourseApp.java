package Q01;

public class StudentCourseApp {
    static void main(String[] args) {

        Course course1=new Course("IT1170","Advanced DSA programme");

        Course course2=new Course("SE1020","Advanced OOP certificate course");

        Course course3=new Course("IT1160","Discrete Mathematics certificate course");


        Student student1=new Student("IT25100034","Subhanu Ravisankha");

        System.out.println("==========================Enrolled Courses=============================");
        student1.enrollCourse(course1);
        student1.enrollCourse(course2);
        student1.enrollCourse(course3);

        System.out.println();

        System.out.println("===========================Student Details=============================");
        student1.displayStudentDetails();
    }
}
