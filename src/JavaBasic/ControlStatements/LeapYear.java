package JavaBasic.ControlStatements;

//Write a Java program to check if a year is a leap year.

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Year: ");
        int year = scan.nextInt();
        if (( year % 4 == 0 && year % 100 != 0) || year % 4 == 0 ){
            System.out.printf("The year "+ year + " is a leap year. ");
        } else {
            System.out.printf("The year "+ year + " is not a leap year. ");
        }
    }
}
