package Java8.LambdasAndFunctionalInterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCaseLambda {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("Naveen", "Kumar", "Lingala");
        List<String> upperCase = name.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upperCase);
    }
}
