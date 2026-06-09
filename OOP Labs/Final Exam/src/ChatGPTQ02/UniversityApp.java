package ChatGPTQ02;

public class UniversityApp {

    static void main(String[] args) {

        Student student1 = new Student("S001", "Kasun Perera", "Software Engineering");
        Student student2 = new Student("S002", "Nimal Silva", "Information Technology");

        Lecturer lecturer1 = new Lecturer("L001", "Dr. Fernando", "Computing");

        Course course1 = new Course(
                "IT2030",
                "Object Oriented Programming",
                4,
                "OOP Lecture Notes",
                "PDF",
                lecturer1
        );

        Course course2 = new Course(
                "IT1010",
                "Introduction to Programming",
                3,
                "Java Basics Notes",
                "PDF",
                lecturer1
        );

        Enrollment enrollment1 = new Enrollment("E001", student1, course1, 82.0);
        Enrollment enrollment2 = new Enrollment("E002", student2, course2, 68.0);

        enrollment1.displayEnrollmentDetails();

        System.out.println();

        enrollment2.displayEnrollmentDetails();
    }
}
