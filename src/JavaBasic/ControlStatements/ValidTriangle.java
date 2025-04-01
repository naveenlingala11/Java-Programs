package JavaBasic.ControlStatements;

import java.util.Scanner;

//Write a Java program to check if a triangle is valid based on the sum of angles.
public class ValidTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first angle of the triangle: ");
        int angle1 = scan.nextInt();
        System.out.print("Enter the second angle of the triangle: ");
        int angle2 = scan.nextInt();
        System.out.print("Enter the third angle of the triangle: ");
        int angle3 = scan.nextInt();

        int sumOfAngles = angle1 + angle2 + angle3;

        if (sumOfAngles == 180 && angle1 > 0 && angle2 > 0 && angle3 > 0) {
            System.out.println("The triangle is valid.");
        } else {
            System.out.println("The triangle is not valid.");
        }
    }
}
