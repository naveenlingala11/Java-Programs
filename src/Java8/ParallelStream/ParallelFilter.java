package Java8.ParallelStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ParallelFilter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> number = new ArrayList<>();
        System.out.println("Enter number of integers: ");
        int n = scan.nextInt();
        System.out.println("Enter numbers: ");
        for (int i = 0; i < n; i++){
            number.add(scan.nextInt());
        }
        List<Integer> filteredList = number.parallelStream().filter(num -> num % 2 == 0).collect(Collectors.toList());
        System.out.println("filtered list: "+filteredList);
    }
}
