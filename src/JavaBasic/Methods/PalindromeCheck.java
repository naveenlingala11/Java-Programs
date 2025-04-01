package JavaBasic.Methods;

import java.util.Scanner;

public class PalindromeCheck {
    public static boolean palindrome(String str){
        return str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scan.nextLine();
        System.out.println("The string is a "+(palindrome(str)?" palindrome":"not palindrom"));
    }
}
