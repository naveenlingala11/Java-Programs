package Java8.Collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of items: ");
        List<Integer> numbers = new ArrayList<>();
        int n = scan.nextInt();
        System.out.println("Enter numbers: ");
        for (int i = 0; i < n; i++){
            numbers.add(scan.nextInt());
        }
        double sum = numbers.stream().collect(Collectors.summingInt(Integer::intValue));
        System.out.println("Sum: "+sum);
    }
}
