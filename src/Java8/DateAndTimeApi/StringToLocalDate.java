package Java8.DateAndTimeApi;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class StringToLocalDate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a date (yyyy-MM-dd): ");
        String inputDate = scan.nextLine();

        LocalDate date = LocalDate.parse(inputDate);
        System.out.println("Converted Local date: "+date);
    }
}
