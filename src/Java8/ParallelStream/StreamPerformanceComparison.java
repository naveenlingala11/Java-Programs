package Java8.ParallelStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StreamPerformanceComparison {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the list: ");
        int size = scan.nextInt();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < size; i++){
            numbers.add(i);
        }
        long startTime = System.nanoTime();
        int sumSequential = numbers.stream().mapToInt(Integer::intValue).sum();
        long endTime = System.nanoTime();
        System.out.println("Sequential sum: "+sumSequential+ " | Time: "+(endTime - startTime)+" ns");

        startTime = System.nanoTime();
        int sumParallel = numbers.parallelStream().mapToInt(Integer::intValue).sum();
        endTime = System.nanoTime();
        System.out.println("Parallel sum: "+sumParallel+ " | Time: "+(endTime - startTime)+" ns");

    }
}
