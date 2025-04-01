package Java8.Optional;

import java.util.Optional;

public class CheckValueInOptional {
    public static void main(String[] args) {
        Optional<String> optionalvalue = Optional.of("Hello World!");

        if (optionalvalue.isPresent()){
            System.out.println("Value is present: "+optionalvalue.get());
        } else {
            System.out.println("No value is present. ");
        }
    }
}
