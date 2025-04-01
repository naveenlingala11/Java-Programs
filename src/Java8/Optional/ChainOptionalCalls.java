package Java8.Optional;

import java.util.Optional;
import java.util.Scanner;

public class ChainOptionalCalls {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scan.nextLine();

        Optional<String> optionalValue = Optional.of(str);

        String result = optionalValue
                .map(String::trim)
                .map(String::toUpperCase)
                .orElse("No value.");

        System.out.println("Result: "+result);

    }
}
