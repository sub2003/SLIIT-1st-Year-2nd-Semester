package Q4q2;

public class Patient {
    String patientID;
    String name;
    int age;

    public Patient(int age, String name, String patientID) {
        this.age = age;
        this.name = name;
        this.patientID = patientID;
    }

    public String getPatientID(){
        return patientID;
    }

    public void displayDetails(){
        System.out.println("Patient Details");
        System.out.println("Patient name : "+name);
        System.out.println("Patient ID : "+patientID);
        System.out.println("Patient age : "+age);

    }

}
