package ChatGPTnewQ01;

public class SchoolApp {
    static void main(String[] args) {

        Department science=new Department("Science","Block A");
        Department admin=new Department("Administration","Block B");

        Teacher teacher=new Teacher("ID1001","Mr.Perera",75000.0,science,"Mathematics");
        Clerk clerk=new Clerk("ID1002","Ms.Sliva",45000.0,admin,"D12");

        teacher.displayDetails();
        System.out.println();
        clerk.displayDetails();

    }
}
