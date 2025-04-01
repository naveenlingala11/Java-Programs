package Java8.DateAndTimeApi;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class DayOfTheWeekFromDate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a date(yyyy-MM-dd): ");
        LocalDate date = LocalDate.parse(scan.nextLine());

        DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.println("Day of the week: "+dayOfWeek);
    }
}
