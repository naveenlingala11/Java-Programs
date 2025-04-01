package JavaBasic.Loops;

//Write a Java program to reverse a number using a while loop.

import java.util.Scanner;

public class ReverseNumberWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = scan.nextInt();
        int reversedNumber = 0;
        while ( num != 0){
            int remainder = num % 10;
            reversedNumber = reversedNumber * 10 +remainder;
            num /= 10;
        }
        System.out.println("The reversed number is: " + reversedNumber);
    }

}
