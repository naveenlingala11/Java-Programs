package Java8.Collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class JoiningStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of strings: ");
        List<String> words = new ArrayList<>();
        int n = scan.nextInt();
        System.out.println("Enter strings: ");
        for (int i = 0; i < n; i++){
            words.add(scan.nextLine());
        }
        String joining = words.stream().collect(Collectors.joining(", "));
        System.out.println("Joining Words: "+joining);
    }
}
