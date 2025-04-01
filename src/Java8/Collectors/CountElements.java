package Java8.Collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CountElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        List<String> words = new ArrayList<>();
        int n = scan.nextInt();
        System.out.println("Enter words: ");
        for (int i = 0; i < n; i++){
            words.add(scan.nextLine());
        }
        long count = words.stream().collect(Collectors.counting());
        System.out.println("Total elements: "+count);
    }
}
