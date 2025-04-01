package Java8.LambdasAndFunctionalInterfaces;

import java.util.Scanner;
import java.util.function.Function;

public class SquareLambda {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scan.nextInt();
        Function<Integer, Integer> square = num -> num * num;
        System.out.println("square: "+square.apply(n));
    }
}
