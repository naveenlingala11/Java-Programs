package JavaBasic.Loops;

//Write a Java program to find the sum of digits of a number.

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to find the sum of its digits: ");
        int num = scan.nextInt();
        int sumOfDigits = 0;
        while (num != 0){
            int digit = num % 10;
            sumOfDigits += digit;
            num /= 10;
        }
        System.out.println("The sum of the digits is: " + sumOfDigits);
    }
}
