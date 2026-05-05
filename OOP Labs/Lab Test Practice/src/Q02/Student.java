package Q02;

public class Student {

    protected String name;
    protected int age;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void displayIfo(){
        System.out.println("Student name : "+name);
        System.out.println("Student age : "+age);
    }
}
