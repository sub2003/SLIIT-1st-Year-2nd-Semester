package Q04;

public class TemperatureConverter {
    private double temperature;

    public TemperatureConverter() {
        this.temperature = 0;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void celsiusToFahrenheit(double temperature){

        double Fahrenheit=(temperature*(9/5.0))+32;

        System.out.println(temperature+" Celsius is equal to "+Fahrenheit+" Fahrenheit");
    }

    public void FahrenheitToCelsius(double temperature){

        double Celsius=(temperature-32)*(5/9.0);

        System.out.println(temperature+" Fahrenheit is equal to "+Celsius+" Celsius.");
    }
}
