package JavaBasic.Loops;

//Write a Java program to count the number of digits in a number.

import java.util.Scanner;

public class CountOfDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number to count its digits: ");
        int num = scan.nextInt();
        int count = 0;
        if ( num == 0){
            count = 1;
        }else {
            while (num != 0){
                num /= 10;
                count++;
            }
        }
        System.out.println("The number of digits is: " + count);
    }
}
