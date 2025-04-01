package Java8.FunctionalProgramming;

import java.util.Scanner;
import java.util.function.BinaryOperator;

public class AddBinaryOperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scan.nextInt();

        BinaryOperator<Integer> add = (a,b) -> a + b;
        System.out.println("Sum: "+add.apply(num1, num2));
    }
}
