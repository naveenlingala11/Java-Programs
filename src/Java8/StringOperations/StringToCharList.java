package Java8.StringOperations;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StringToCharList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = scan.nextLine();
        List<Character> charList = str.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        System.out.println("List of Characters: "+charList);
    }
}
