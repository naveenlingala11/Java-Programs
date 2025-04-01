package Java8.FunctionalProgramming;

import java.util.Scanner;
import java.util.function.Predicate;

public class PrimePredicate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();
        Predicate<Integer> isPrime = n -> {
            if (n < 2) return false;
            for (int i = 2; i<= Math.sqrt(n);i++){
                if (n % i == 0) return false;
            }
            return true;
        };
        System.out.println("Is Prime? "+isPrime.test(num));
    }
}
