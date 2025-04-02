package Java8.StringOperations;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CapitalizeWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String input = scan.nextLine();

        String capitalized = Stream.of(input.split(" "))
                .map(word -> word.isEmpty() ? word : Character.toUpperCase(word.charAt(0)) + word.substring(1))
                .collect(Collectors.joining(" "));
        System.out.println(" Capitalized words: "+capitalized);

    }
}
