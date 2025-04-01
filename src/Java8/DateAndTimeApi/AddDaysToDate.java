package Java8.DateAndTimeApi;

import java.time.LocalDate;
import java.util.Scanner;

public class AddDaysToDate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of days: ");
        int n = scan.nextInt();
        LocalDate today = LocalDate.now();
        LocalDate newDate = today.plusDays(n);
        System.out.println("Current date : "+today);
        System.out.println("Date after "+n+" days: "+newDate);
    }
}
