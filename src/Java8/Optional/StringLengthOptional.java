package Java8.Optional;

import java.util.Optional;
import java.util.Scanner;

public class StringLengthOptional {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scan.nextLine();

        Optional<String> optionalValue = Optional.of(str);
        Optional<Integer> length = optionalValue.map(String::length);
        System.out.println("Length of the string: "+length);

    }
}
