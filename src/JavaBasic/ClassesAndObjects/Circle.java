package JavaBasic.ClassesAndObjects;

import java.util.Scanner;

public class Circle {
    double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double area(){
        return Math.PI * radius *radius;
    }

    public double perimeter(){
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double r = scan.nextDouble();
        Circle c = new Circle(r);
        System.out.println("Area"+c.area());
        System.out.println("Perimeter "+c.perimeter());
    }
}
