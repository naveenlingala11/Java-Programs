package Java8.Optional;

import java.util.Optional;
import java.util.Scanner;

public class FilterOptionalValue {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scan.nextInt();
        Optional<Integer> optionalValue = Optional.of(n);
        Optional<Integer> filteredValue = optionalValue.filter(num -> num > 20);
        System.out.println("Filtered value: "+ filteredValue);
    }
}
