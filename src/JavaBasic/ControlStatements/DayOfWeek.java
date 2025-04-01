package JavaBasic.ControlStatements;

//Write a Java program to display the day of the week using switch.

import java.time.MonthDay;
import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a day number (1-7): ");
        int dayNumber = scan.nextInt();
        String dayOfWeek;
        switch (dayNumber) {
            case 1:
                dayOfWeek = "Monday";
                break;
            case 2:
                dayOfWeek = "Tuesday";
                break;
            case 3:
                dayOfWeek = "Wednesday";
                break;
            case 4:
                dayOfWeek = "Thursday";
                break;
            case 5:
                dayOfWeek = "Friday";
                break;
            case 6:
                dayOfWeek = "Saturday";
                break;
            case 7:
                dayOfWeek = "Sunday";
                break;
            default:
                dayOfWeek = "Invalid day number";
        }
        System.out.println("The day of the week is: " + dayOfWeek);
    }
}
