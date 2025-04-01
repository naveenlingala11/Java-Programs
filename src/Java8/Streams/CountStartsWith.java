package Java8.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountStartsWith {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of strings: ");
        int n = scan.nextInt();
        scan.nextLine();

        List<String> list = new ArrayList<>();
        System.out.println("Enter strings: ");
        for (int i = 0; i < n; i++){
            list.add(scan.nextLine());
        }
        String str = scan.nextLine();
        long count = list.stream().filter(s -> s.startsWith(str)).count();
        System.out.println("Count of the string is "+count);
    }
}
