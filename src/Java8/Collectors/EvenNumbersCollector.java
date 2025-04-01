package Java8.Collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EvenNumbersCollector {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter number of elements: ");
        int n = scan.nextInt();
        System.out.println("Enter numbers: ");
        for (int i = 0; i < n; i++){
            list.add(scan.nextInt());
        }
        List<Integer> evenNumbers = list.stream().filter(num -> num % 2 ==0).collect(Collectors.toList());
        System.out.println("Even numbers: "+evenNumbers);
    }
}
