package Java8.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FilterOddNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of integers: ");
        int n = scan.nextInt();

        List<Integer> list = new ArrayList<>();
        System.out.println("Enter integers: ");
        for (int i = 0; i < n; i++ ){
            list.add(scan.nextInt());
        }

        List<Integer> oddNumbers = list.stream().filter(num -> num % 2 != 0).collect(Collectors.toList());
        System.out.println("Odd numbers list: "+oddNumbers);

    }
}
