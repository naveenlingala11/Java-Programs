package Java8.ParallelStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class SequentialToParallel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        System.out.println("Enter number of elements: ");
        int n = scan.nextInt();
        System.out.println("Enter numbers: ");
        for (int i = 0; i < n; i++){
            numbers.add(scan.nextInt());
        }
        Stream<Integer> sequentialStream  = numbers.stream();
        Stream<Integer> parallelStream = sequentialStream.parallel();

        parallelStream.forEach(num -> System.out.println("Processing: "+num));
    }
}
