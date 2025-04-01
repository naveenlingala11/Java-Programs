package Java8.LambdasAndFunctionalInterfaces;

import java.util.Scanner;
import java.util.function.BiPredicate;

public class StartsWithLambda {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = scan.nextLine();

        System.out.print("Enter a character: ");
        char ch = scan.next().charAt(0);

        BiPredicate<String, Character> startsWith = (str, c) -> str.charAt(0) == c;

        System.out.println("Does '" + s + "' start with '" + ch + "'? " + startsWith.test(s, ch));
    }
}
