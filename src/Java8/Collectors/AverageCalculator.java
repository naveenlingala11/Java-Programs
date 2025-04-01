package Java8.Collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        System.out.println("Enter number of integers: ");
        int n = scan.nextInt();
        System.out.println("Enter numbers: ");
        for (int i = 0; i < n; i++){
            numbers.add(scan.nextInt());
        }
        double average = numbers.stream().collect(Collectors.averagingDouble(Integer::intValue));
        System.out.println("Average: "+average);
    }
}
