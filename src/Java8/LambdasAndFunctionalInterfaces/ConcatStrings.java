package Java8.LambdasAndFunctionalInterfaces;

import java.util.Scanner;
import java.util.function.BiFunction;

public class ConcatStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String str1 = scan.nextLine();
        System.out.println("Enter second string: ");
        String str2 = scan.nextLine();
        BiFunction<String, String, String> concat = (s1, s2) -> str1 + str2;
        System.out.println("concat: "+ str1 +" "+ str2);
    }
}
