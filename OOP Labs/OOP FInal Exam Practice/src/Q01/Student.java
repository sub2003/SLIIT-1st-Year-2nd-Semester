package Q01;

public class Student {
    private String studentID;
    private String name;
    private Course[] courses;
    private int courseCount;

    public Student(int courseSize, String name, String studentID) {
        this.courses = new Course[courseSize];
        this.name = name;
        this.studentID = studentID;
        this.courseCount=0;
    }

    public void enrollCourse(Course course){
        if (courseCount<courses.length){
            courses[courseCount]=course;
            courseCount++;
        }
        else {
            System.out.println("Course list is full.");
        }
    }

    public void displayStudentDetails(){
        System.out.println("Student ID : "+studentID);
        System.out.println("Student name : "+name);
        System.out.println("--------Student courses list --------\n");
        for (int i=0;i<courseCount;i++){
            courses[i].displayCourseDetails();
            System.out.println();
        }
    }
}
