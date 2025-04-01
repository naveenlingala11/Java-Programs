package Java8.LambdasAndFunctionalInterfaces;

import java.util.Scanner;
import java.util.function.Function;

public class ReverseStringLambda {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scan.nextLine();
        Function<String, String> reverse = s -> new StringBuilder(str).reverse().toString();
        System.out.println("Reverse of the string "+str+"   "+reverse.apply(str));

    }
}
