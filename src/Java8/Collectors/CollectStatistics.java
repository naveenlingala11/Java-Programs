package Java8.Collectors;

import java.util.*;
import java.util.stream.Collectors;

public class CollectStatistics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of items: ");
        List<Integer> numbers = new ArrayList<>();
        int n = scan.nextInt();
        System.out.println("Enter numbers: ");
        for (int i = 0; i < n; i++){
            numbers.add(scan.nextInt());
        }
        IntSummaryStatistics stats = numbers.stream().collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println("Statistics: "+stats);
    }
}
