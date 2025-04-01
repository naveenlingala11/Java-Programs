package Java8.StringOperations;

import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scan.nextLine();

        String uniqueCharacters = str.chars()
                .distinct()
                .mapToObj(c -> String.valueOf((char) c ))
                .collect(Collectors.joining(","));
        System.out.println("Unique Characters: "+uniqueCharacters);
    }
}
