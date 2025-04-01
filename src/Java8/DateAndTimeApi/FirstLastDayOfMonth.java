package Java8.DateAndTimeApi;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;

public class FirstLastDayOfMonth {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        YearMonth currentMonth = YearMonth.from(today);

        LocalDate firstDay = currentMonth.atDay(1);
        DayOfWeek dayOfWeek = firstDay.getDayOfWeek();
        LocalDate lastDay = currentMonth.atEndOfMonth();
        DayOfWeek dayOfWeek1 = lastDay.getDayOfWeek();

        System.out.println("First day of the month: "+firstDay+" and day is "+dayOfWeek);
        System.out.println("Last day of the month: "+lastDay+" and day is "+dayOfWeek1);
    }
}
