package Java8.StringOperations;

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = scan.nextLine();

        long vowelCount = str.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> "aeiou".indexOf(c) != -1)
                .count();

        System.out.println("Vowels count: "+vowelCount);
    }
}
