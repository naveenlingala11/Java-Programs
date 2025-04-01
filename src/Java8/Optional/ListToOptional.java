package Java8.Optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class ListToOptional {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of items: ");
        int n = scan.nextInt();
        scan.nextLine();

        List<String> list = new ArrayList<>();
        System.out.println("Enter the strings: ");
        for (int i = 0; i < n; i++){
            list.add(scan.nextLine());
        }
        Optional<String> optionalFirst = list.stream().findFirst();
        System.out.println("First item: "+optionalFirst.orElse("No Elements"));
    }
}
