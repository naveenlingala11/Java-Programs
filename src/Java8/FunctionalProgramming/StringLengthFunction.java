package Java8.FunctionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringLengthFunction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> words = new ArrayList<>();
        System.out.println("Enter number of elements: ");
        int n = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter strings: ");
        for (int i = 0; i < n; i++){
            words.add(scan.nextLine());
        }
        Function<List<String>, List<Integer>> stringLength = list ->
                list.stream().map(String::length).collect(Collectors.toList());
        System.out.println("Words length: "+stringLength.apply(words));

    }
}
