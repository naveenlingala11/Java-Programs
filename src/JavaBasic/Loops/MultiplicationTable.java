package JavaBasic.Loops;

//Write a Java program to print the multiplication table of a given number.

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to print its multiplication table");
        int num = scan.nextInt();
        System.out.println("Multiplication table of " + num + ":");
        for ( int i = 1; i <=10; i++){
            System.out.println(num + " x "+ i + " = "+ (num * i));
        }
    }
}
