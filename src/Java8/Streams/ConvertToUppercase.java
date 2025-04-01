package Java8.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ConvertToUppercase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of strings: ");
        int n = scan.nextInt();

        List<String> list = new ArrayList<>();
        System.out.println("Enter strings: ");
        for (int i = 0; i < n; i++){
            list.add(scan.nextLine());
        }
        List<String> uppercaseList = list.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("upper case list: "+ uppercaseList);

    }
}
