package Java8.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of integers: ");
        int n = scan.nextInt();

        List<Integer> list = new ArrayList<>();
        System.out.println("Enter integers: ");
        for (int i = 0; i< n; i++){
            list.add(scan.nextInt());
        }

        double average = list.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        System.out.println("Average of integers: "+average);
    }
}
