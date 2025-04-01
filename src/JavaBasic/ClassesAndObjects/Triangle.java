package JavaBasic.ClassesAndObjects;

import java.util.Scanner;

public class Triangle {
    int a, b, c;

    public Triangle(int a, int b , int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public boolean isValid(){
        return (( a + b > c ) && (a + b >b) && ( b + c > a));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        Triangle t = new Triangle(a,b,c);
        System.out.println("Triangle is "+((t.isValid())?"valid":"not valid"));
    }
}
