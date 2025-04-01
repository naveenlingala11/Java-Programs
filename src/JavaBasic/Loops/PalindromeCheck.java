package JavaBasic.Loops;

//Write a Java program to check if a number is a palindrome.

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to check if it's a palindrome: ");
        int num = scan.nextInt();

        int originalNumber = num;
        int reversedNumber = 0;

        while (num != 0){
            int remainder = num % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            num /= 10;
        }
        if (originalNumber == reversedNumber){
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }

    }
}
