package JavaBasic.ControlStatements;

//Write a Java program to find whether a character is a vowel or consonant using switch.

import java.util.Scanner;

public class VowelConsonantSwitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = scan.next().toLowerCase().charAt(0);

        String type;

        switch (ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                type = "Vowel";
                break;
            default:
                if (ch >= 'a' && ch <= 'z'){
                    type = "Consonent";
                } else {
                    type = " Not An Alphabat.";
                }
        }
        System.out.println(ch + " is a " + type);
    }
}
