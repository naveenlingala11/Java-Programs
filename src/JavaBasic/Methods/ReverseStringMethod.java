package JavaBasic.Methods;

import java.util.Scanner;

public class ReverseStringMethod {
    public static String reverseString(String str){
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = scan.nextLine();
        System.out.println("The reverse of a string "+str+ " is "+reverseString(str));
    }
}
