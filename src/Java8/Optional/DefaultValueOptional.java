package Java8.Optional;

import java.util.Optional;

public class DefaultValueOptional {
    public static void main(String[] args) {
        Optional<String> optionalValue = Optional.empty();
        String result = optionalValue.orElse("Default value.");
        System.out.println("result: "+result);;
    }
}
