package Java8.Optional;

import java.util.Optional;

public class HandleNullPointer {
    public static void main(String[] args) {
        String value = null;

        Optional<String> optionalValue = Optional.ofNullable(value);
        System.out.println("Value: " + optionalValue.orElse("Default Value"));
    }
}
