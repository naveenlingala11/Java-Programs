package JavaBasic.ControlStatements;

//Write a Java program to find the greatest of three numbers using a switch statement.

import java.util.Scanner;

public class GreatestOfThreeSwitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter the Second Number: ");
        int num2 = scan.nextInt();
        System.out.println("Enter the Third Number: ");
        int num3 = scan.nextInt();

        int result = (num1 >= num2) ? ((num1 >= num3) ? 1 : 3) : ((num2 >= num3) ? 2 : 3);

        switch (result) {
            case 1:
                System.out.println("The greatest number is: " + num1);
                break;
            case 2:
                System.out.println("The greatest number is: " + num2);
                break;
            case 3:
                System.out.println("The greatest number is: " + num3);
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
