package Lab6Q01;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        RegularCourse rc=new RegularCourse();
        PremiumCourse pc=new PremiumCourse("PC202","Machine Learning",6,true);

        rc.displayCourseDetails();

        System.out.println();

        pc.displayCourseDetails();


    }
}
