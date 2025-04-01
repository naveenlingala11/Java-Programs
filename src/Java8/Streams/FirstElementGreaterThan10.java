package Java8.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class FirstElementGreaterThan10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of numbers: ");
        int n = scan.nextInt();

        List<Integer> list = new ArrayList<>();
        System.out.println("Enter the numbers: ");
        for (int i = 0; i<n;i++){
            list.add(scan.nextInt());
        }

        Optional<Integer> number = list.stream().filter(num -> num > 10).findFirst();
        System.out.println("The first element greater than 10: "+number);
    }
}
