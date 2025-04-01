package Java8.ParallelStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedDeque;

public class ThreadSafeParallelStream {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        ConcurrentLinkedDeque<Integer> results = new ConcurrentLinkedDeque<>();
        System.out.println("Enter number of elements: ");
        int n = scan.nextInt();
        System.out.println("Enter numbers: ");
        for (int i = 0; i < n; i++){
            numbers.add(scan.nextInt());
        }
        numbers.parallelStream().forEach(results::add);
        System.out.println("Processed data: "+results);
    }
}
