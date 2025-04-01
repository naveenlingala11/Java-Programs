package Java8.ParallelStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class ParallelCollect {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        System.out.println("Enter the number of elements: ");
        int n = scan.nextInt();
        System.out.println("Enter numbers: ");
        for (int i = 0; i < n; i++){
            numbers.add(scan.nextInt());
        }
        Set<Integer> collectedSet = numbers.parallelStream().collect(Collectors.toSet());
        System.out.println("collected set: "+collectedSet);
    }
}
