package JavaBasic.String;

import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scan.nextLine().trim();

        if (str.isEmpty()){
            System.out.println("Number of words is: 0");
        } else {
            String[] words = str.split("\\s+");
            System.out.println("Number of words: "+words.length);
        }
    }
}
