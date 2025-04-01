package Java8.Optional;

import java.util.Optional;
import java.util.Scanner;

public class CombineOptionalValues {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String str1 = scan.nextLine();
        System.out.println("Enter second string: ");
        String str2 = scan.nextLine();

        Optional<String> firstName = Optional.of(str1);
        Optional<String> lastName = Optional.of(str2);

        Optional<String> fullName = firstName.flatMap(fn -> lastName.map(ln -> fn + " " + ln));
        System.out.println("Full name: "+fullName);
    }
}
