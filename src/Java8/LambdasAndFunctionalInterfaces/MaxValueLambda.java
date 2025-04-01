package Java8.LambdasAndFunctionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class MaxValueLambda {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        Optional<Integer> maxNum = numbers.stream().max(Integer::compareTo);
        maxNum.ifPresent(value -> System.out.println("maximum value: "+value));
    }
}
