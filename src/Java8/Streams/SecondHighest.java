package Java8.Streams;

import java.util.*;
import java.util.stream.Collectors;

public class SecondHighest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number of integers: ");
        int n = scan.nextInt();

        List<Integer> list = new ArrayList<>();
        System.out.println("Enter the integers: ");
        for (int i = 0; i < n; i++){
            list.add(scan.nextInt());
        }

        List<Integer> sortedList = list.stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("second highest number: "+(sortedList.size()>1?sortedList.get(1):"Not Available"));
    }
}
