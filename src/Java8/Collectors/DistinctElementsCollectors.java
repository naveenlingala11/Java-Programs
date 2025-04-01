package Java8.Collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DistinctElementsCollectors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter number of elements: ");
        int n = scan.nextInt();
        System.out.println("Enter numbers: ");
        for (int i = 0; i < n; i++){
            list.add(scan.nextInt());
        }
        Set<Integer> distinctNumbers = list.stream().collect(Collectors.toSet());
        //List<Integer> distinctNumbers = list.stream().distinct().collect(Collectors.toList());
        System.out.println("Distinct elements: "+distinctNumbers);
    }
}
