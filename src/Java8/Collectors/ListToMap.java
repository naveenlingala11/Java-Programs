package Java8.Collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListToMap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<Integer, String > numberMap;
        List<String> words = new ArrayList<>();
        System.out.println("Enter number of numbers: ");
        int n = scan.nextInt();
        System.out.println("Enter numbers: ");
        for (int i = 0; i < n; i++){
            words.add(scan.nextLine());
        }
        numberMap = words.stream()
                .collect(Collectors.toMap(String::length, word -> word, (existing, replacement) -> existing));
        System.out.println("Word Length Map: "+numberMap);


    }
}
