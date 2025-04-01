package JavaBasic.Polymorphism.Calculator;

import java.util.Scanner;

public class Calculator {
    public int add(int a, int b){
        return a + b;
    }
    public int add(int a, int b, int c){
        return a + b + c;
    }
    public int add(int a, int b , int c, int d){
        return a + b + c + d;
    }
    public double add(double a , double b){
        return a + b;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the int elements: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        System.out.println("Enter the double elements: ");
        double e = scan.nextDouble();
        double f = scan.nextDouble();
        Calculator cal = new Calculator();
        System.out.println(" add a and b "+cal.add(a,b));
        System.out.println(" add a , b and c "+cal.add(a,b,c));
        System.out.println(" add a , b , c and d "+cal.add(a,b,c,d));
        System.out.println(" add e and f  "+cal.add(e,f));
    }
}
