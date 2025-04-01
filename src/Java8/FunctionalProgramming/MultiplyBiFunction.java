package Java8.FunctionalProgramming;

import java.util.Scanner;
import java.util.function.BiFunction;

public class MultiplyBiFunction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a first number: ");
        int num1 = scan.nextInt();

        System.out.println("Enter a second number: ");
        int num2 = scan.nextInt();

        BiFunction<Integer, Integer, Integer> multiply = (a,b) -> a * b;
        System.out.println("Multiplication Result: "+multiply.apply(num1, num2));
    }
}
