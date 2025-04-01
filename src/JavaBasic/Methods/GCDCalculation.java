package JavaBasic.Methods;

import java.util.Scanner;

public class GCDCalculation {
    public static int gcd(int a, int b){
        while (b != 0){
            int temp = b;
            b = a %b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int n = scan.nextInt();
        System.out.println("Enter the second number: ");
        int m = scan.nextInt();

        System.out.println("The GCD of "+n+" and "+m+" is "+gcd(n,m));
    }
}
