package JavaBasic.String;

import java.util.Scanner;

public class StringSplit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scan.nextLine();

        String[] words = str.split("\\s+");
        System.out.println("Splitted substrings");
        for (String word : words){
            System.out.println(word);
        }
    }
}
