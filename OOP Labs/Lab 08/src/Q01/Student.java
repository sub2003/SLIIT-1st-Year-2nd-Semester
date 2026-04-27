package Q01;

public class Student {

    private String studentID;
    private String studentName;
    private int courseCount;

    private Course[] courses=new Course[3];

    public Student() {
        this.studentName = "";
        this.studentID = "";
        this.courseCount = 0;
    }

    public Student(String studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.courseCount=courseCount;
    }

    public void enrollCourse(Course c){
        if(courseCount<3){
            courses[courseCount]=c;
            courseCount++;
            c.displayCourseDetails();
            System.out.println("Course Added Successfully.");
        }
        else{
            System.out.println("Cannot enroll more than 3 courses.");
        }

    }
    public void displayStudentDetails(){
        System.out.println("Student ID : "+studentID);
        System.out.println("Student Name : "+studentName);
        System.out.println("Enrolled Courses count : "+courseCount);
        System.out.println();
        for (int i = 0; i < courseCount; i++) {
            System.out.println("Course " + (i + 1) + " : ");
            courses[i].displayCourseDetails();
            System.out.println();
        }
    }


}
