package JavaBasic.Loops;

//Write a Java program to calculate the sum of the first n natural numbers.

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter the Number: ");
        int num = scan.nextInt();
        int sum = 0;

        for ( int i = 1; i<= num; i++){
            sum += i;
        }
        System.out.println("The sum of the first " + num + " natural numbers is: " + sum);
    }
}
