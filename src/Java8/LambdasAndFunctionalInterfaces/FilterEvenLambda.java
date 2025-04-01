package Java8.LambdasAndFunctionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenLambda {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> even = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println("List of even: "+even);
    }
}
