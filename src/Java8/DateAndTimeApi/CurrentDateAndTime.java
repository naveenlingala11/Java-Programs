package Java8.DateAndTimeApi;

import java.time.LocalDateTime;

public class CurrentDateAndTime {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("The current local date and time is: "+now);
    }
}
