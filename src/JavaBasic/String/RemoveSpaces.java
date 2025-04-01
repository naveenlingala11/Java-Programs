package JavaBasic.String;

import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scan.nextLine();

        String noSpaces = str.replaceAll("\\s+","");
        System.out.println("string without spaces "+noSpaces);
    }
}
