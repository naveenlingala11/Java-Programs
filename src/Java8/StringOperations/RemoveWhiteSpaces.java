package Java8.StringOperations;

import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Before Removing white spaces: ");
        String input = scan.nextLine();

        String withoutWhiteSpaces = input.chars()
                .filter(c -> !Character.isWhitespace(c))
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
        System.out.println("After removing white spaces: "+withoutWhiteSpaces);
    }
}
