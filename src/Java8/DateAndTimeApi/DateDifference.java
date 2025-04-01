package Java8.DateAndTimeApi;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DateDifference {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first date (yyyy-MM-dd): ");
        LocalDate date1 = LocalDate.parse(scan.nextLine());
        System.out.println("Enter the second date (yyyy-MM-dd): ");
        LocalDate date2 = LocalDate.parse(scan.nextLine());

        long daysBetween = ChronoUnit.DAYS.between(date1, date2);
        System.out.println("Days between "+date1+" and "+date2+" is: "+daysBetween);
    }
}
