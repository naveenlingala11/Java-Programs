package JavaBasic.String;

import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = scan.nextLine();

        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed String: "+reversed);
    }
}
