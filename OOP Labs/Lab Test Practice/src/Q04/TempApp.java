package Q04;

import java.util.Scanner;

public class TempApp {

    static void main(String[] args) {

        Scanner scn=new Scanner(System.in);
        TemperatureConverter tc1 = new TemperatureConverter();


        System.out.print("Enter the temperature in celsius : ");
        double temp1=scn.nextDouble();

        System.out.print("Enter the temperature in fahrenheit : ");
        double temp2=scn.nextDouble();

        tc1.celsiusToFahrenheit(temp1);
        tc1.FahrenheitToCelsius(temp2);

    }
}