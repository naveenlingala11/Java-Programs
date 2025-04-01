package JavaBasic.Methods;

import java.util.Scanner;

public class PowerCalculation {
    public static double power(double base, double exponent){
        return Math.pow(base,exponent);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the base: ");
        int n = scan.nextInt();
        System.out.println("Enter the exponent: ");
        int m = scan.nextInt();

        System.out.println("The power calculation of base "+n+"and exponant "+m+" is "+power(n,m));
    }
}
