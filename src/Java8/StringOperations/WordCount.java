package Java8.StringOperations;

import java.util.Scanner;
import java.util.stream.Stream;

public class WordCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scan.nextLine();

        long wordCount = Stream.of(input.split("\\s+"))
                .filter(word -> !word.isEmpty())
                .count();
        System.out.println("Word Count: "+wordCount);
    }
}
