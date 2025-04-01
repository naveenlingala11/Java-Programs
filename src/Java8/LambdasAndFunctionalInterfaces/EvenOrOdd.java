package Java8.LambdasAndFunctionalInterfaces;

import java.util.Scanner;
import java.util.function.Predicate;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");

        Predicate<Integer> isEven = num -> num % 2 == 0;

        int number = scan.nextInt();
        System.out.println(number + " is " + ((isEven.test(number)) ? " Even ": " Odd "));
    }

}
