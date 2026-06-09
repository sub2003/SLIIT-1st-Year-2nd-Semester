package Q3q3;

import java.util.Scanner;

public class StudentAttendenceApp {
    static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        try {
            System.out.print("Enter total lectures : ");
            int lecCount = scn.nextInt();

            System.out.print("Enter attended lectures: ");
            int attLecCount = scn.nextInt();

            if (!(lecCount>0)){
                throw new InvalidLectureCountException("Total lectures must be greater than zero.");
            }
            double attPercentage=(attLecCount/(lecCount*1.0))*100;
            if (attPercentage<75){
                throw new LowAttendenceException("Attendance percentage must be at least 75%.");
            }
            System.out.println("Attendance Percentage :"+attPercentage+"%");
            System.out.println("Attendance requirement satisfied.");


        }
        catch (InvalidLectureCountException ex){
            System.out.println("Error:"+ex.getMessage());
        }
        catch (LowAttendenceException ex){
            System.out.println("Error:"+ex.getMessage());
        }

        scn.close();
    }
}
