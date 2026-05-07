package Tute06Associationpage11;

public class HospitalManagementSystem {
    static void main(String[] args) {

        Doctor doctor1=new Doctor("Dr.Fernando","Cardiology");

        Appoinment appoinment1=new Appoinment("APT205",doctor1,"Nimal Perera");

        appoinment1.displayAppoinmentDetails();
    }
}
