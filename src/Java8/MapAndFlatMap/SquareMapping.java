package Java8.MapAndFlatMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SquareMapping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        System.out.println("Enter the number of elements: ");
        int n = scan.nextInt();
        scan. nextLine();
        System.out.println("Enter numbers: ");
        for (int i = 0; i< n; i++){
            list.add(scan.nextInt());
        }
        List<Integer> squaredNumbers = list.stream().map(num -> num * num).collect(Collectors.toList());
        System.out.println("Squares of numbers: "+squaredNumbers);
    }
}
