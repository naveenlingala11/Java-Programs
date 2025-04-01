package Java8.DateAndTimeApi;

import java.time.Year;
import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int inputYear = scan.nextInt();

        Year year = Year.of(inputYear);
        if (year.isLeap()){
            System.out.println(year+" is a leap year.");
        }else {
            System.out.println(year+" is not a leap year.");
        }
    }
}
