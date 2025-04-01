package Java8.FunctionalProgramming;

import java.util.Scanner;
import java.util.function.Function;
import java.util.function.IntFunction;

public class SquareFunction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scan.nextInt();

        Function<Integer, Integer> square = num -> n * n;
        System.out.println("The square of "+n+" is "+square.apply(n));
    }
}
