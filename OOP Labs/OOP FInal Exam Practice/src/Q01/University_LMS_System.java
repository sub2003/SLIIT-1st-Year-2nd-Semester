package Q01;

import java.util.Scanner;

public class University_LMS_System {
    static void main(String[] args) {

        Student student1 = new Student(10, "Subhanu", "IT25100034");

        Course course1 = new Course(5,"SE1020", "Object Oriented Programming");

        //Assessment quiz1 = new Quiz("Q001",80, "OOP Quiz");
        //Assessment assignment1 = new Assignment("A001", 70, "Java Assignment");
        Assessment labtest1=new LabTest("SE1020",100,"OOP Lab Test");
        Assessment labSubmission1=new LabSubmissionsAndViva("SE1020",100,"Lab Submissions");
        Assessment finalExam1 = new FinalExam("SE1020", 65,"Final Exam");
        Assessment project1=new Project("SE1020",90,"Event Ticket Booking System");
        Assessment midExam1=new MidExam("SE1020",90,"OOP");

        //course1.addAssessment(quiz1);
        //course1.addAssessment(assignment1);
        course1.addAssessment(labtest1);
        course1.addAssessment(labSubmission1);
        course1.addAssessment(project1);
        course1.addAssessment(midExam1);
        course1.addAssessment(finalExam1);


        student1.enrollCourse(course1);

        student1.displayStudentDetails();
    }
}
