package Java8.LambdasAndFunctionalInterfaces.Calculator;

import java.util.Scanner;

public class CalculateProduct {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int n = scan.nextInt();
        System.out.println("Enter the second number: ");
        int m = scan.nextInt();
        Calculator add = (a,b) -> n * m;
        System.out.println(" Product: "+add.calculate(n,m));
    }
}
