package Q4q2;

import java.util.ArrayList;
import java.util.Scanner;

public class Hospital {

    static void main(String[] args) {

        Scanner scn=new Scanner(System.in);
        ArrayList<Patient> patientList=new ArrayList<Patient>();

        while (true){

            System.out.println("Enter Patient ID : ");
            String ID=scn.nextLine();

            if (ID.equalsIgnoreCase("S")){
                break;
            }
            System.out.println("Enter patient name : ");
            String name =scn.nextLine();

            System.out.println("Enter patient age : ");
            int age= scn.nextInt();
            scn.nextLine();

            Patient p=new Patient(age,name,ID);

            patientList.add(p);

            System.out.println();


        }

        System.out.print("Enter patient ID to refmove patient: ");
        String removeID=scn.nextLine();

        for (int i=0;i<patientList.size();i++){
            if (patientList.get(i).getPatientID().equalsIgnoreCase(removeID)){
                patientList.remove(i);
                System.out.println("Patient record removed successfully.");
                break;
            }
            else {
                System.out.println("Patient ID not found. No record removed.");

            }
        }

        System.out.println("Total number of patients : "+patientList.size());

        for(Patient p:patientList){
            p.displayDetails();
        }
    }
}
