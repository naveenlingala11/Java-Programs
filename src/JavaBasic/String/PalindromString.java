package JavaBasic.String;

import java.util.Scanner;

public class PalindromString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = scan.nextLine();
        String reversed = new StringBuilder(str).reverse().toString();
        if (str.equals(reversed)){
            System.out.println(" The string is palindrom ");
        } else {
            System.out.println(" The string is not a palindrom ");
        }
    }
}
