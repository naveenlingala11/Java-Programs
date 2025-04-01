package Java8.Collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GroupByStringLength {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        System.out.println("Enter number of items: ");
        int n = scan.nextInt();
        System.out.println("Enter strings: ");
        for (int i = 0; i < n; i++){
            list.add(scan.nextLine());
        }
        Map<Integer, List<String>> groupByLength = list.stream().collect(Collectors.groupingBy(String::length));
        System.out.println("Grouped words: "+groupByLength);
    }
}
