package JavaBasic.ControlStatements;

//Write a Java program to check if a number is even or odd using if-else.

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scan.nextInt();

        if ( num == 0){
            System.out.println(" The number is neither odd nor even ");
        } else if ( num % 2 == 0){
            System.out.println("The number "+num+" is even ");
        } else if ( num % 2 != 0) {
            System.out.println(" The number "+num+" is odd");
        }
    }
}
