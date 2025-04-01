package JavaBasic.Methods;

import java.util.Scanner;

public class TemperatureConversion {
    public static double celsiusTofarenheit(double celsius){
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the temperature in celsius: ");
        double n = scan.nextDouble();
        System.out.println("The temperature of farenheit is "+celsiusTofarenheit(n));
    }
}
