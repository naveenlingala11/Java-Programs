package Java8.Optional;

import java.util.Optional;

public class OptionalOrElseThrow {
    public static void main(String[] args) {
        Optional<String> optionalvalue = Optional.empty();

        try {
            String result = optionalvalue.orElseThrow(()-> new RuntimeException("value is missing"));
            System.out.println("Result: "+result);
        } catch (Exception e){
            System.out.println("Exception: "+e.getMessage());
        }
    }
}
