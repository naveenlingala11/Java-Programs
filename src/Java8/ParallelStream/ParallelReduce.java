package Java8.ParallelStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class ParallelReduce {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        System.out.println("Enter the number of integers: ");
        int n = scan.nextInt();
        System.out.println("Enter numbers: ");
        for (int i = 0; i < n; i++){
            numbers.add(scan.nextInt());
        }
        Optional<Integer> sum = numbers.parallelStream().reduce(Integer::sum);
        sum.ifPresent(value -> System.out.println("Reduced Sun: "+sum));
    }
}
