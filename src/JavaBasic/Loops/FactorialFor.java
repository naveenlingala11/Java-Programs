package JavaBasic.Loops;

//Write a Java program to find the factorial of a number using a for loop.

import java.util.Scanner;

public class FactorialFor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a non-negative integer to find its factorial:");
        int num = scan.nextInt();

        if (num < 0){
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorial = 1;
            for (int i = 1; i<= num; i++){
                factorial *=i;
            }
            System.out.println("The factorial of " + num + " is: " + factorial);
        }
    }
}
