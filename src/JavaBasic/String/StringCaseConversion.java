package JavaBasic.String;

import java.util.Scanner;

public class StringCaseConversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = scan.nextLine();
        System.out.println(" converting to lower case "+str.toLowerCase());
        System.out.println(" converting to upper case "+str.toUpperCase());

    }
}
