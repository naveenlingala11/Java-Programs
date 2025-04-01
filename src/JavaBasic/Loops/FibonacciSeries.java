package JavaBasic.Loops;

//Write a Java program to print Fibonacci series up to n terms.

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of terms for Fibonacci series: ");
        int num = scan.nextInt();
        System.out.println("Fibonacci series up to " + num + " terms:");
        if (num >= 1){
            System.out.print("0");
        }
        if (num >= 2) {
            System.out.print(" 1");
        }
        int a = 0, b = 1;
        for (int i = 3; i<= num; i++){
            int nextTerm = a + b;
            System.out.print(" " + nextTerm);
            a = b;
            b = nextTerm;
        }
        System.out.println();
    }
}
