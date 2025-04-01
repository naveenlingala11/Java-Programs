package Java8.FunctionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class PrintListConsumer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        System.out.println("Enter number oof elements: ");
        int n = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the strings: ");
        for (int i = 0; i < n; i++){
            list.add(scan.nextLine());
        }

        Consumer<List<String>> printList = l -> list.forEach(System.out::println);
        System.out.println("List elements: ");
        printList.accept(list);
    }
}
