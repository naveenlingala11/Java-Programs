package Java8.Optional;

import java.util.Optional;

public class ConvertUsingMap {
    public static void main(String[] args) {
        Optional<String> optionalValue = Optional.of("Hello");
        Optional<String> upperCase = optionalValue.map(String::toUpperCase);
        System.out.println("Converted to upper case: "+upperCase);
    }
}
