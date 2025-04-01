package Java8.MapAndFlatMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AbsoluteValueMapping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter number of elements: ");
        int n = scan.nextInt();
        System.out.println("Enter numbers: ");
        for (int i = 0; i < n; i++){
            list.add(scan.nextInt());
        }
        List<Integer> absoluteValues = list.stream().map(Math::abs).collect(Collectors.toList());
        System.out.println("Absolute values: "+absoluteValues);
    }

}
