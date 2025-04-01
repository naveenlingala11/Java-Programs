package Java8.StringOperations;

import java.util.Scanner;
import java.util.stream.Collectors;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String str1 = scan.nextLine();
        System.out.println("Enter second string: ");
        String str2 = scan.nextLine();

        boolean isAnagram = str1.chars().sorted().mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining())
                .equals(
                        str2.chars().sorted().mapToObj(c -> String.valueOf((char) c))
                                .collect(Collectors.joining())
                );
        System.out.println("Are they Anagram: "+isAnagram);
    }
}
