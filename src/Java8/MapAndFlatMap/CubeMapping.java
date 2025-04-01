package Java8.MapAndFlatMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CubeMapping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter number of integers; ");
        int n = scan.nextInt();
        System.out.println("Enter numbers: ");
        for (int i = 0; i < n; i++){
            list.add(scan.nextInt());
        }
        List<Integer> cubedNumbers = list.stream().map(num -> num * num * num).distinct().collect(Collectors.toList());
        System.out.println("Cubes of numbers: "+cubedNumbers);
    }
}
