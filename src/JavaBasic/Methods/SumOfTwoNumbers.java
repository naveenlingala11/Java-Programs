package JavaBasic.Methods;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static int sum(int a , int b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the first number: ");
        int n = scan.nextInt();
        System.out.println("Enter the second number:");
        int m = scan.nextInt();

        System.out.println(" Sum of two number are : "+sum(n, m));
    }
}
