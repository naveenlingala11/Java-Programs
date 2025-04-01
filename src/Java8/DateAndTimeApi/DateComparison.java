package Java8.DateAndTimeApi;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first date (yyyy-MM-dd): ");
        LocalDate date1 = LocalDate.parse(scan.nextLine());
        System.out.println("Enter the second date (yyyy-MM-dd): ");
        LocalDate date2 = LocalDate.parse(scan.nextLine());

        if (date1.isBefore(date2)){
            System.out.println(date1+" is before "+date2);
        } else if (date1.isAfter(date2)){
            System.out.println(date1+" is after "+date2);
        } else {
            System.out.println(" Both are the same dates.");
        }
    }
}
