package Java8.Collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PartitionNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        List<Integer> list = new ArrayList<>();
        int n = scan.nextInt();
        System.out.println("Enter numbers: ");
        for (int i = 0; i < n; i++){
            list.add(scan.nextInt());
        }
        Map<Boolean, List<Integer>> partitioned = list.stream().collect(Collectors.partitioningBy(num -> num % 2 == 0));
        System.out.println("Even Numbers: " + partitioned.get(true));
        System.out.println("Odd Numbers: " + partitioned.get(false));
    }
}
