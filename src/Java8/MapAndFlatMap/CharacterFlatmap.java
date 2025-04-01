package Java8.MapAndFlatMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CharacterFlatmap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        System.out.println("Enter number os strings: ");
        int n = scan.nextInt();
        System.out.println("Enter strings: ");
        for (int i = 0; i< n; i++){
            list.add(scan.nextLine());
        }
        List<Character> characters = list.stream().flatMap(word -> word.chars().mapToObj(c -> (char) c)).collect(Collectors.toList());
        System.out.println("Charcters: "+characters);
    }
}
