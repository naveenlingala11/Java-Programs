package Java8.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DistinctElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of integers: ");
        int n = scan.nextInt();
        scan.nextLine();

        List<Integer> list = new ArrayList<>();
        System.out.println("Enter the integers: ");
        for (int i = 0; i< n; i++){
            list.add(scan.nextInt());
        }
        List<Integer> distinctNumbers = list.stream().distinct().collect(Collectors.toList());
        System.out.println("Distinct elements: "+distinctNumbers);
    }
}
