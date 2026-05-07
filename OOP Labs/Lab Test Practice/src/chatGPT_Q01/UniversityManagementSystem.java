package chatGPT_Q01;

public class UniversityManagementSystem {
    static void main(String[] args) {

        Student std1=new Student("Subhanu");
        Student std2=new Student("Kamal");

        Course course1=new Course("OOP",10);

        course1.addStudents(std1);
        course1.addStudents(std2);

        course1.displayCourseStudents();
    }

}
