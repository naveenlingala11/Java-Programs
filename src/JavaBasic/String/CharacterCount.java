package JavaBasic.String;

import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String character = scan.nextLine();
        System.out.println("The Length of the string is "+character.length());
    }
}
