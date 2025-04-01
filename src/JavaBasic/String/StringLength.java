package JavaBasic.String;

import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = scan.nextLine();
        System.out.println("The length of the string is: "+str.length());


    }
}
