package Java8.ParallelStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class ParallelStreamExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter number of elements: ");
        int n = scan.nextInt();
        System.out.println("Enter numbers: ");
        for (int i = 0; i < n; i++){
            list.add(scan.nextInt());
        }
        Stream<Integer> parallelStream = list.parallelStream();
        parallelStream.forEach(num -> System.out.println("Processing "+num));
    }
}
