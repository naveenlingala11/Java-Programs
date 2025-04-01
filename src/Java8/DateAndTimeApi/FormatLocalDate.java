package Java8.DateAndTimeApi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class FormatLocalDate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a date (YYYY-MM-DD): ");
        String inputDate = scan.nextLine();

        LocalDate date = LocalDate.parse(inputDate);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        System.out.println("The Formated Date: "+date.format(formatter));
    }
}
