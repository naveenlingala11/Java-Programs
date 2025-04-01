package Java8.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of integers: ");
        int n = scan.nextInt();
        scan.nextLine();

        List<Integer> list = new ArrayList<>();
        System.out.println("Enter Integers: ");
        for (int i = 0; i<n; i++){
            list.add(scan.nextInt());
        }

        int sum = list.stream().filter(num -> num % 2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println("Even numbers sum: "+sum);
    }
}
