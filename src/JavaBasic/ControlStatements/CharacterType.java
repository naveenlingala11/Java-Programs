package JavaBasic.ControlStatements;

//Write a Java program to check whether a character is an alphabet, digit, or special character.

import java.util.Scanner;

public class CharacterType {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a charatcer: ");
        char ch = scan.next().charAt(0);

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is an alphabet.");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a digit.");
        } else {
            System.out.println(ch + " is a special character.");
        }
    }
}
