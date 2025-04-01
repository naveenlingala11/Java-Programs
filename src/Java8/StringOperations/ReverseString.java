package Java8.StringOperations;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scan.nextLine();
        String reversed = IntStream.range(0,str.length())
                .mapToObj(i -> str.charAt(str.length() - i - 1))
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println("Revesed String: "+reversed);
    }
}
