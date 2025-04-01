package Java8.ParallelStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class ParallelMax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        System.out.println("Enter number of elements: ");
        int n = scan.nextInt();
        System.out.println("Enter numbers: ");
        for (int i = 0; i < n; i++){
            numbers.add(scan.nextInt());
        }
        Optional<Integer> maxNumber = numbers.parallelStream().max(Integer::compareTo);
        maxNumber.ifPresent(value -> System.out.println("Maximum value: "+maxNumber));
    }
}
