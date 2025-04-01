package Java8.FunctionalProgramming;

import java.util.Scanner;
import java.util.function.Predicate;

public class StringEmptyCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String input = scan.nextLine();

        Predicate<String> isEmpty = str -> str.isEmpty();
        System.out.println("Is string empty? "+isEmpty.test(input));


    }
}
