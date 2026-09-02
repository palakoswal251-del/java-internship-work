import java.util.Scanner;

public class TemperatureConvertor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature: ");
        double temperature = sc.nextDouble();

        System.out.print("Enter unit (C/F): ");
        String unit = sc.next();

        if (unit.equalsIgnoreCase("F")) {
            double fahrenheit = (temperature * 9 / 5) + 32;
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        } 
        else if (unit.equalsIgnoreCase("C")) {
            double celsius = (temperature - 32) * 5 / 9;
            System.out.println("Temperature in Celsius: " + celsius);
        } 
        else {
            System.out.println("Invalid unit. Please enter C or F.");
        }

        sc.close();
    }
}