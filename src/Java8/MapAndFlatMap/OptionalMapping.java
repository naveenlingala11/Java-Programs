package Java8.MapAndFlatMap;

import java.util.Optional;
import java.util.Scanner;

public class OptionalMapping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        Optional<Integer> num = Optional.of(scan.nextInt());
        Optional<Integer> squaredNum = num.map(n -> n * n);
        System.out.println("Squared number: "+squaredNum.orElse(0));
        scan.close();
    }
}
