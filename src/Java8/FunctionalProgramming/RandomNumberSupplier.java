package Java8.FunctionalProgramming;

import java.util.Random;
import java.util.function.Supplier;

public class RandomNumberSupplier {
    public static void main(String[] args) {
        Supplier<Integer> randomNumber = () -> new Random().nextInt(100);
        System.out.println("Random Number: "+randomNumber.get());
    }
}
