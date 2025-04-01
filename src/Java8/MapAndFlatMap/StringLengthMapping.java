package Java8.MapAndFlatMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StringLengthMapping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        System.out.println("Enter number of elements: ");
        int n = scan.nextInt();
        System.out.println("Enter strings: ");
        for (int i = 0; i < n; i++){
            list.add(scan.nextLine());
        }

        List<Integer> stringLength = list.stream().map(String::length).collect(Collectors.toList());
        System.out.println("Words Length: "+stringLength);

    }
}
