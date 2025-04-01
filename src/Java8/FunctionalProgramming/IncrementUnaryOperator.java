package Java8.FunctionalProgramming;

import java.util.Scanner;
import java.util.function.UnaryOperator;

public class IncrementUnaryOperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();

        UnaryOperator<Integer> increment = n -> n + 1;
        System.out.println("Incremented value: "+increment.apply(num));
    }
}
