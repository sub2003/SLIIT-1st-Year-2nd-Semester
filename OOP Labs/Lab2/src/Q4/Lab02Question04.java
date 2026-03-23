package Q4;
import java.util.Scanner;
public class Lab02Question04 {
    public static void main(String []args){
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter an integer number of seconds : ");
        int seconds=scn.nextInt();

        Lab02Question04 obj=new Lab02Question04();
        obj.time(seconds);

    }
    public void time(int seconds){
        int hours=seconds/3600;
        int remainingSecondsH1=seconds%3600;
        int minutes=remainingSecondsH1/60;
        int remainingSeconds=remainingSecondsH1%60;

        System.out.println(seconds+"="+hours+" hours , "+minutes+" minutes and "+remainingSeconds+" seconds .");
    }
}
