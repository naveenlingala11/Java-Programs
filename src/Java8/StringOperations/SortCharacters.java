package Java8.StringOperations;

import java.util.Scanner;
import java.util.stream.Collectors;

public class SortCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scan.nextLine();
        String sortedString = input.chars()
                .sorted()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining(", "));
        System.out.println("Sorted characters: "+sortedString);
    }
}
