package JavaBasic.Methods;

import java.util.Scanner;

public class Factorial {
    public static int factorial(int num){
        int fact = 1;
        for (int i = 1; i<=num; i++){
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scan.nextInt();

        System.out.println("the factorial of "+n+" is "+ factorial(n));
    }
}
