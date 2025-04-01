package JavaBasic.ControlStatements;

//Write a Java program to find the largest of three numbers using if-else.

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter the Second Number: ");
        int num2 = scan.nextInt();
        System.out.println("Enter the Third Number: ");
        int num3 = scan.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.println(num1+" is the largest number.");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2+" is the largest number. ");
        }else {
            System.out.println(num3+" is the largest number.");
        }
    }
}
