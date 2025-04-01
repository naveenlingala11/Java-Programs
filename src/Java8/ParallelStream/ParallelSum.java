package Java8.ParallelStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class ParallelSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> number = new ArrayList<>();
        System.out.println("Enter a number of integers: ");
        int n = scan.nextInt();
        System.out.println("Enter numbers: ");
        for (int i = 0; i < n; i++){
            number.add(scan.nextInt());
        }
        int sum = number.parallelStream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum: "+sum);
    }
}
